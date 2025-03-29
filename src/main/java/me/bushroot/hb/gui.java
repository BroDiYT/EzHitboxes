 private void watermark(MatrixStack stack) {
        Object[] objectArray = new Object[1];
        objectArray[0] = Math.hypot(Minecraft.player.getPosX() - Minecraft.player.prevPosX, Minecraft.player.getPosZ() - Minecraft.player.prevPosZ) * 20.0;
        double speed2 = (Double) objectArray[0];
        String text = speed2 == 0.0 ? "0.0" : String.format(Locale.ENGLISH, "%.2f", speed2).replace(',', '.');
        String user = ClientUtil.me == null ? "null" : ClientUtil.me.getName();
        StringBuilder titleText = new StringBuilder("");
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        titleText.append(time.format(formatter));
        int var10000 = (int)Minecraft.player.getPosX();
        String cord = var10000 + " " + (int)Minecraft.player.getPosY() + " " + (int)Minecraft.player.getPosZ();
        float debugTPS = (int)Sunshine.getInstance().getTpsCalc().getTPS();
        int firstColor = ColorUtil.getColorStyle(0.0f);
        int secondColor = ColorUtil.getColorStyle(90.0f);
        if (this.gradienthud.get()) {
            RenderUtil.Render2D.drawGradientRound(5.0f, 5.2f, 45.0f, 12.0f, 3.4f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
            RenderUtil.Render2D.drawGradientRound(54.5f, 4.8f, Fonts.msSemiBold[13].getWidth(user) + Fonts.msSemiBold[13].getWidth(titleText.toString()) + 78.0f, 12.3f, 3.3f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
            RenderUtil.Render2D.drawGradientRound(5.0f, 20.5f, 22.5f + Fonts.msSemiBold[13].getWidth(cord), 12.0f, 3.0f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
            RenderUtil.Render2D.drawGradientRound(32.0f + Fonts.msSemiBold[13].getWidth(cord), 20.5f, 38.2f + Fonts.msSemiBold[13].getWidth(text), 12.0f, 3.3f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
        }
        RenderUtil.Render2D.drawRoundedCorner(4.0f, 4.0f, 47.0f, 14.0f, 4.0f, new Color(24, 24, 24, 240).getRGB());
        RenderUtil.Render2D.drawRoundedCorner(53.5f, 4.0f, Fonts.msSemiBold[13].getWidth(user) + Fonts.msSemiBold[13].getWidth(titleText.toString()) + 80.0f, 14.0f, 4.0f, new Color(24, 24, 24, 240).getRGB());
        RenderUtil.Render2D.drawRoundedCorner(4.0f, 19.5f, 24.5f + Fonts.msSemiBold[13].getWidth(cord), 14.0f, 4.0f, new Color(24, 24, 24, 240).getRGB());
        RenderUtil.Render2D.drawRoundedCorner(31.0f + Fonts.msSemiBold[13].getWidth(cord), 19.5f, 40.0f + Fonts.msSemiBold[13].getWidth(text), 14.0f, 4.0f, new Color(24, 24, 24, 240).getRGB());
        RenderUtil.Render2D.drawRoundedCorner(74.0f + Fonts.msSemiBold[13].getWidth(cord) + Fonts.msSemiBold[13].getWidth(text), 19.5f, 30.0f + (float)debugTPS, 14.0f, 4.0f, new Color(24, 24, 24, 240).getRGB());
        RenderUtil.Render2D.drawRect(20.5f, 7.5f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        RenderUtil.Render2D.drawRect(70.5f + Fonts.msSemiBold[13].getWidth(user), 7.5f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        RenderUtil.Render2D.drawRect(115.0f + Fonts.msSemiBold[13].getWidth(user), 7.5f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        RenderUtil.Render2D.drawRect(45.0f + Fonts.msSemiBold[13].getWidth(cord), 22.5f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        RenderUtil.Render2D.drawRect(20.0f, 22.5f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        Fonts.Nurik[19].drawString(stack, ClientUtil.gradient("S", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), 8.0, 10.0, -1);
        Fonts.msSemiBold[13].drawString(stack, ClientUtil.gradient("Alpha", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), 25.5, 10.0, -1);
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("W", ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(90.0f)), 58.0, 10.5, -1);
        Fonts.msSemiBold[13].drawString(stack, user, 67.5, 10.0, -1);
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("X", ColorUtil.getColorStyle(150.0f), ColorUtil.getColorStyle(120.0f)), (double)(73.5f + Fonts.msSemiBold[13].getWidth(user)), 10.5, -1);
        StyledFont var10 = Fonts.msSemiBold[13];
        Minecraft var10002 = mc;
        var10.drawString(stack, Minecraft.debugFPS + " Fps", (double)(84.9f + Fonts.msSemiBold[13].getWidth(user)), 10.0, -1);
        Fonts.msSemiBold[13].drawString(stack, titleText.toString(), (double)(128.5f + Fonts.msSemiBold[13].getWidth(user)), 10.0, -1);
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("V", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), (double)(118.0f + Fonts.msSemiBold[13].getWidth(user)), 10.5, -1);
        Fonts.msSemiBold[13].drawString(stack, text, (double)(50.5f + Fonts.msSemiBold[13].getWidth(cord)), 25.0, new Color(255, 255, 255, 255).getRGB());
        Fonts.msSemiBold[13].drawString(stack, "BPS", (double)(53.0f + Fonts.msSemiBold[13].getWidth(cord) + Fonts.msSemiBold[13].getWidth(text)), 25.0, -1);
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("&#35", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), (double)(27.0f + Fonts.msSemiBold[13].getWidth(cord)), 25.5, -1);
        Fonts.msSemiBold[13].drawString(stack, cord, 24.0, 25.0, new Color(255, 255, 255, 255).getRGB());
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("F", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), 9.0, 25.5, -1);
        Fonts.msSemiBold[13].drawString(stack, "Tps " + debugTPS, (double)(87.3f + Fonts.msSemiBold[13].getWidth(cord) + Fonts.msSemiBold[13].getWidth(text)), 25.0, new Color(255, 255, 255, 255).getRGB());
        Fonts.Nurik[14].drawString(stack, ClientUtil.gradient("Q", ColorUtil.getColorStyle(90.0f), ColorUtil.getColorStyle(180.0f)), 77.0 + (double)Fonts.msSemiBold[13].getWidth(cord) + (double)Fonts.msSemiBold[13].getWidth(text), 25.5, -1);
    }


    private void updateFunctions() {
        for (Function function : Managment.FUNCTION_MANAGER.getFunctions()) {
            if (function.category == Type.Render) continue;
            this.functions.add(function);
            this.functions.sort((f1, f2) -> Float.compare(Fonts.msSemiBold[13].getWidth(f2.name), Fonts.msSemiBold[13].getWidth(f1.name)));
        }
    }

    private void onKeyBindsRender(MatrixStack stack) {
        float posX = this.keyBinds.getX();
        float posY = this.keyBinds.getY();
        int headerHeight = 14;
        int padding = 5;
        int firstColor = ColorUtil.getColorStyle(0.0f);
        int secondColor = ColorUtil.getColorStyle(90.0f);
        this.activeModules = 0;
        for (Function f : Managment.FUNCTION_MANAGER.getFunctions()) {
            if (f.bind == 0 || !f.state) continue;
            ++this.activeModules;
        }
        this.keyBinds.setHeight((float)this.activeModules * this.offset + (float)headerHeight);
        float maxWidth = 0.0f;
        float height2 = (float)this.activeModules * this.offset;
        for (Function f : Managment.FUNCTION_MANAGER.getFunctions()) {
            String text;
            if (f.bind == 0 || !f.state || (text = ClientUtil.getKey(f.bind)) == null) continue;
            String bindText = text.toUpperCase();
            float bindWidth = Fonts.msSemiBold[12].getWidth(bindText);
            float nameWidth = Fonts.msSemiBold[12].getWidth(f.name);
            maxWidth = Math.max(maxWidth, bindWidth);
            maxWidth = Math.max(maxWidth, nameWidth);
        }
        float targetWidth = Math.max(60.0f, 15.5f + maxWidth + (float)(padding * 2) + 5.0f);
        this.widthAnime = AnimationMath.lerp(this.widthAnime, targetWidth, 10.5f);
        this.keyBinds.setWidth(this.widthAnime);
        if (this.gradienthud.get()) {
            RenderUtil.Render2D.drawGradientRound(posX + 1.0f, posY + -1.1f, this.keyBinds.getWidth() - 2.0f, 12.3f, 2.7f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
        }
        RenderUtil.Render2D.drawRoundedCorner(posX, posY - 2.0f, this.keyBinds.getWidth(), 14.0f, 3.5f, new Color(24, 24, 24, 236).getRGB());
        RenderUtil.Render2D.drawRect(posX + 16.0f, posY + 1.0f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
        Fonts.babkatv[15].drawString(stack, "Hotkeys", (double)(posX + 19.5f), (double)(posY + 3.5f), new Color(255, 255, 255, 255).getRGB());
        Fonts.nursultan[16].drawString(stack, "C", (double)(posX + 5.0f), (double)(posY + 4.0f), -1);
        SmartScissor.push();
        SmartScissor.setFromComponentCoordinates(posX, posY, this.keyBinds.getWidth(), this.keyBinds.getHeight());
        int index = 0;
        for (Function f : Managment.FUNCTION_MANAGER.getFunctions()) {
            String text;
            if (f.bind == 0 || !f.state || (text = ClientUtil.getKey(f.bind)) == null) continue;
            String bindText = text.toUpperCase();
            float bindWidth = Fonts.babkatv[13].getWidth(bindText);
            StyledFont keyname = Fonts.babkatv[13];
            if (this.gradienthud.get()) {
                RenderUtil.Render2D.drawGradientRound(posX + 0.9f, posY - 5.2f + (float)headerHeight + (float)padding + (float)index * this.offset, this.keyBinds.getWidth() - 2.0f, 8.3f, 2.8f, firstColor, secondColor, ColorUtil.getColorStyle(180.0f), ColorUtil.getColorStyle(270.0f));
            }
            RenderUtil.Render2D.drawRoundedCorner(posX + (float)padding - 5.0f, posY - 6.0f + (float)headerHeight + (float)padding + (float)index * this.offset, this.keyBinds.getWidth(), 10.0f, 3.5f, new Color(24, 24, 24, 236).getRGB());
            keyname.drawString(stack, f.name, (double)(posX + -2.0f + (float)padding), (double)(posY - 2.5f + (float)headerHeight + (float)padding + (float)index * this.offset), -1);
            Fonts.babkatv[13].drawString(stack, bindText, (double)(posX + this.keyBinds.getWidth() - (float)padding - bindWidth + 1.5f), (double)(posY - 2.5f + (float)headerHeight + (float)padding + (float)index * this.offset), -1);
            ++index;
        }
        SmartScissor.unset();
        SmartScissor.pop();
    }

    private void onStaffListRender(MatrixStack matrixStack) {
        float posX = this.staffListt1.getX();
        float posY = this.staffListt1.getY();
        int headerHeight = 14;
        float width2 = Math.max(this.nameWidth + 40.0f, 150.0f);
        int padding = 5;
        float offset = 10.5f;
        float height2 = (float)this.activeStaff * offset;
        this.hDynam = AnimationMath.fast(this.hDynam, height2, 100.0f);
        this.widthDynamic = AnimationMath.fast(this.widthDynamic, width2, 100.0f);
        this.updateMaxWidth();
        RenderUtil.Render2D.drawRoundedCorner(posX, posY - 2.0f, (float)(this.maxWidth + 10 + this.maxWidth1), 14.0f, 4.0f, new Color(30, 30, 30, 255).getRGB());
        Fonts.msSemiBold[14].drawCenteredString(matrixStack, "StaffList", (double)(posX + 35.5f), (double)(posY + 3.0f), -1);
        Fonts.Nurik[16].drawString(matrixStack, "Y", (double)(posX + 5.0f), (double)(posY + 4.0f), -1);
        RenderUtil.Render2D.drawRect(posX + 16.0f, posY + 1.0f, 0.3f, 7.5f, new Color(200, 200, 200, 255).getRGB());
        int index = 0;
        SmartScissor.push();
        SmartScissor.setFromComponentCoordinates(posX, posY, this.widthDynamic, (float)headerHeight + this.hDynam + (float)padding / 2.0f);
        if (!this.staffPlayers.isEmpty()) {
            this.staffStartTimes.keySet().retainAll(this.staffPlayers);
            for (Staff staff : this.staffPlayers) {
                String name = staff.getName();
                ITextComponent prefix = staff.getPrefix();
                String status2 = staff.getStatus().string;
                if (this.gradienthud.get()) {
                    // empty if block
                }
                if (!this.staffStartTimes.containsKey(staff)) {
                    this.staffStartTimes.put(staff, System.currentTimeMillis());
                }
                long timeDifference = (System.currentTimeMillis() - this.staffStartTimes.get(staff)) / 1000L;
                String timeString = this.formatTime(timeDifference);
                RenderUtil.Render2D.drawRoundedCorner(posX + (float)padding - 5.0f, posY + (float)headerHeight + (float)padding + (float)index * offset - 6.0f, (float)(this.maxWidth + 10), 10.0f, 4.0f, new Color(30, 30, 30, 255).getRGB());
                Fonts.msSemiBold[12].drawString(matrixStack, prefix, (double)(posX + (float)padding - 3.0f), (double)(posY + (float)headerHeight + (float)padding + (float)index * offset - 2.0f), -1);
                Fonts.msSemiBold[12].drawString(matrixStack, name + " " + status2, (double)(posX + (float)padding + Fonts.gilroyBold[12].getWidth(prefix.getString() + "3")), (double)(posY + (float)headerHeight + (float)padding + (float)index * offset - 2.0f), -1);
                Fonts.msSemiBold[12].drawString(matrixStack, "    " + timeString + " ", (double)(posX + (float)padding + Fonts.msSemiBold[12].getWidth(prefix.getString() + name + " " + status2)), (double)(posY + (float)headerHeight + (float)padding + (float)index * offset - 2.0f), new Color(255, 255, 255).getRGB());
                this.nameWidth = Fonts.msSemiBold[12].getWidth(prefix.getString() + name + " " + status2 + " (" + timeString + ")");
                ++index;
            }
        } else {
            this.nameWidth = 0.0f;
        }
        SmartScissor.unset();
        SmartScissor.pop();
        this.activeStaff = index;
        this.staffListt1.setWidth(this.widthDynamic);
        this.staffListt1.setHeight(this.hDynam + (float)headerHeight);
    }

    private void updateMaxWidth() {
        this.maxWidth = 60;
        if (!this.staffPlayers.isEmpty()) {
            for (Staff staff : this.staffPlayers) {
                String name = staff.getName();
                ITextComponent prefix = staff.getPrefix();
                String status2 = staff.getStatus().string;
                if (!this.staffStartTimes.containsKey(staff)) {
                    this.staffStartTimes.put(staff, System.currentTimeMillis());
                }
                long timeDifference = (System.currentTimeMillis() - this.staffStartTimes.get(staff)) / 1000L;
                String timeString = this.formatTime(timeDifference);
                int currentWidth = (int)Fonts.msSemiBold[12].getWidth(prefix.getString() + name + " " + status2 + " (" + timeString + ")");
                if (currentWidth <= this.maxWidth) continue;
                this.maxWidth = currentWidth;
            }
        }
    }

    private String formatTime(long timeDifference) {
        if (timeDifference >= 3600L) {
            int minutes = (int)(timeDifference / 3600L);
            int seconds = (int)(timeDifference % 3600L / 60L);
            return minutes + "h " + seconds + "m";
        }
        if (timeDifference >= 60L) {
            int minutes = (int)(timeDifference / 60L);
            int seconds = (int)(timeDifference % 60L);
            return minutes + "m " + seconds + "s";
        }
        return timeDifference + "s";
    }

    public void setStaffPlayers(List<Staff> staffPlayers) {
        this.staffPlayers = staffPlayers;
    }

    private void onSchedules(MatrixStack stack) {
        float posX = this.Schedules.getX();
        float posY = this.Schedules.getY();
        int headerHeight = 14;
        int padding = 5;
        this.Schedules.setHeight(this.SchedulesOffset + (float)headerHeight);
        float maxWidth = 0.0f;
        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
        LocalDateTime now = LocalDateTime.now(moscowZone);
        for (int hour = 9; hour <= 1; hour += 2) {
            LocalDateTime scheduleTime = LocalDateTime.from(LocalTime.now().withHour(hour).withMinute(0).withSecond(0));
            String scheduleText = scheduleTime.format(DateTimeFormatter.ofPattern("HH:mm"));
            float targetWidth = Math.max(60.0f, 15.5f + maxWidth + (float)(padding * 2) + 5.0f);
            this.Schedules.setWidth(targetWidth);
            RenderUtil.Render2D.drawRoundedCorner(posX, posY - 2.0f, 100.0f, 14.0f, 4.0f, new Color(30, 30, 30, 210).getRGB());
            RenderUtil.Render2D.drawRect(posX + 16.0f, posY + 1.0f, 0.3f, 7.5f, new Color(200, 200, 200, 100).getRGB());
            Fonts.msSemiBold[14].drawCenteredString(stack, "Schedules", (double)(this.Schedules.getX() + 35.0f), (double)(posY + 3.5f), -1);
            Fonts.Nurik[16].drawString(stack, "C", (double)(posX + 5.0f), (double)(posY + 4.0f), -1);
            SmartScissor.push();
            SmartScissor.setFromComponentCoordinates(posX, posY, this.Schedules.getWidth(), this.Schedules.getHeight());
            int index = 0;
            RenderUtil.Render2D.drawRoundedCorner(posX + (float)padding - 5.0f, posY - 6.0f + (float)headerHeight + (float)padding + (float)index * this.offset, this.Schedules.getWidth(), 10.0f, 4.0f, new Color(30, 30, 30, 210).getRGB());
            Fonts.msSemiBold[12].drawString(stack, scheduleText, (double)(posX + (float)padding), (double)(posY - 1.8f + (float)headerHeight + (float)padding + (float)index * this.offset), -1);
            float lineX = posX + this.Schedules.getWidth() - (float)padding - 8.0f;
            RenderUtil.Render2D.drawRect(lineX, posY + (float)headerHeight + (float)padding + (float)index * this.offset - 4.0f, 0.3f, 5.5f, new Color(200, 200, 200, 100).getRGB());
            ++index;
            SmartScissor.unset();
            SmartScissor.pop();
        }
    }

    private void onArmorRender(MatrixStack matrixStack) {
        float x = this.Armor.getX();
        float y = this.Armor.getY();
        int width2 = 100;
        int height2 = 79;
        RenderUtil.Render2D.drawRoundedRect(x, y + 45.0f, width2 - 30, height2 - 40, 3.0f, ColorUtil.rgba(30, 21, 39, 90));
        int posY = (int)y + 63;
        int posX = (int)x + 3;
        for (ItemStack itemStack : Minecraft.player.getArmorInventoryList()) {
            if (!itemStack.isEmpty()) {
                mc.getItemRenderer().renderItemAndEffectIntoGUI(itemStack, posX, posY);
                int maxDamage = itemStack.getMaxDamage();
                if (maxDamage > 0) {
                    float damagePercentage = (float)itemStack.getDamage() * 100.0f / (float)maxDamage;
                    int red = (int)(255.0f * (damagePercentage / 100.0f));
                    int green = 255 - red;
                    int roundedPercentage = Math.round(100.0f - damagePercentage);
                    Fonts.gilroyBold[14].drawCenteredString(matrixStack, "" + roundedPercentage, (double)(posX + width2 - 92), (double)(posY - 11), ColorUtil.rgba(red, green, 0, 210));
                    RenderUtil.Render2D.drawRect(posX + width2 - 98, posY - 3, 12.0f, 0.5f, ColorUtil.rgba(200, 200, 200, 100));
                } else {
                    Fonts.gilroyBold[14].drawCenteredString(matrixStack, "null", (double)(posX + width2 - 92), (double)(posY - 11), -1);
                    RenderUtil.Render2D.drawRect(posX + width2 - 98, posY - 3, 12.0f, 0.5f, ColorUtil.rgba(200, 200, 200, 100));
                }
                posX += 16;
            }
            this.Armor.setWidth(width2);
            this.Armor.setHeight(height2);
        }
    }

    private void onPotionElementsRender(MatrixStack matrixStack) {
        float posX = this.potionStatus.getX();
        float posY = this.potionStatus.getY();
        int width2 = Minecraft.player.getActivePotionEffects().isEmpty() ? 80 : 98;

        System.out.println("Central square position: X=" + posX + ", Y=" + (posY - 20.0f));
        System.out.println("Left square position: X=" + (posX - 15.0f) + ", Y=" + posY);
        System.out.println("Right square position: X=" + (posX + width2 + 5.0f) + ", Y=" + posY);

        try {
            // Отображаем центральную полосу
            RenderUtil.Render2D.drawRoundedCorner(posX, posY - 20.0f, width2, 15.0f, 3.5f, new Color(50, 100, 255, 200).getRGB());

            // Отображаем левый квадрат
            RenderUtil.Render2D.drawRect(posX - 15.0f, posY, 10.0f, 10.0f, new Color(255, 0, 0, 255).getRGB());

            // Отображаем правый квадрат
            RenderUtil.Render2D.drawRect(posX + width2 + 5.0f, posY, 10.0f, 10.0f, new Color(0, 255, 0, 255).getRGB());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void onRenderTargetHUD(MatrixStack matrixStack) {
        float posX = this.targetHUD.getX();
        float posY = this.targetHUD.getY();
        this.targetHUD.setWidth(120.0f);
        this.targetHUD.setHeight(36.0f);
        this.target = this.getTarget(this.target);
        this.scale1 = this.targetHudAnimation.getOutput();
        if (this.scale1 == 0.0) {
            this.target = null;
        }
        if (this.target == null) {
            return;
        }
        int hp = (int) target.getHealth();
        if (mc.getCurrentServerData() != null && mc.world != null && mc.world.getScoreboard() != null) {
            Score score = mc.world.getScoreboard().getOrCreateScore(target.getScoreboardName(), mc.world.getScoreboard().getObjectiveInDisplaySlot(2));
            String serverIP = mc.getCurrentServerData().serverIP;
            if ((serverIP.contains("funtime") && target instanceof PlayerEntity) ||
                    serverIP.contains("reallyworld") ||
                    serverIP.contains("skytime") ||
                    serverIP.contains("local") ||
                    serverIP.contains("space-times"))
            {
                int scorePoints = score.getScorePoints();
                hp = scorePoints;
            }
        }
        String targetName = this.target.getName().getString();
        String substring = targetName.substring(0, Math.min(targetName.length(), 10));
        this.health = AnimationMath.fast(this.health, hp / this.target.getMaxHealth(), 5.0f);
        float round_degree = 7.0f;
        GlStateManager.pushMatrix();
        AnimationMath.sizeAnimation(posX + 50.0f, posY + 19.0f, this.scale1);
        int backgroundColor = ColorUtil.rgba(20, 20, 20, 255);
        RenderUtil.Render2D.drawShadow(posX, posY - 4.0f, 100.0f, this.targetHUD.getHeight(), (int)round_degree, ColorUtil.rgba(20, 20, 20, 150), ColorUtil.rgba(20, 20, 0, 190));
        RenderUtil.Render2D.drawRoundedCorner(posX, posY - 4.0f, 100.0f, this.targetHUD.getHeight(), round_degree, backgroundColor);
        SmartScissor.push();
        SmartScissor.setFromComponentCoordinates(posX, posY, 100.0, this.targetHUD.getHeight());
        RenderUtil.Render2D.drawRoundedRect(posX + 4.0f, posY, 28.0f, 28.0f, 6.0f, Color.BLACK.getRGB());
        if (target instanceof AbstractClientPlayerEntity) {
            StencilUtil.initStencilToWrite();
            RenderUtil.Render2D.drawRoundedRect(posX + 4.0f, posY, 28, 28, 3.0F, -1);
            StencilUtil.readStencilBuffer(1);
            RenderUtil.Render2D.drawFace(posX + 4.0f, posY, 8.0F, 8.0F, 8.0F, 8.0F, 28, 28, 64.0F, 64.0F, (AbstractClientPlayerEntity) this.target);
            StencilUtil.uninitStencilBuffer();
        }
        StyledFont medium = Fonts.msMedium[17];
        medium.drawString(matrixStack, substring, posX + 32.0f + 4.0f, posY + 2.0f, -1);
        Fonts.msSemiBold[12].drawString(matrixStack, "HP: " + hp * 5 + "%", posX + 32.0f + 4.0f, posY + 19.0f - 5.0f, -1);
        SmartScissor.unset();
        SmartScissor.pop();
        float currentHP = hp;
        if (currentHP >= 10.0f) {
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f * this.health, 8.0f, 3, ColorUtil.rgba(0, 128, 0, 255), ColorUtil.rgba(32, 32, 32, 250), ColorUtil.rgba(0, 204, 0, 250), ColorUtil.rgba(0, 153, 0, 250));
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f, 8.0f, 3, ColorUtil.rgba(0, 128, 0, 60), ColorUtil.rgba(32, 32, 32, 60), ColorUtil.rgba(0, 204, 0, 60), ColorUtil.rgba(0, 153, 0, 60));
        } else if (currentHP >= 5.0f) {
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f * this.health, 8.0f, 3, ColorUtil.rgba(62, 71, 0, 250), ColorUtil.rgba(32, 32, 32, 250), ColorUtil.rgba(255, 255, 0, 250), ColorUtil.rgba(153, 153, 0, 250));
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f, 8.0f, 3, ColorUtil.rgba(62, 71, 0, 60), ColorUtil.rgba(32, 32, 32, 60), ColorUtil.rgba(255, 255, 0, 60), ColorUtil.rgba(153, 153, 0, 60));
        } else {
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f * this.health, 8.0f, 3, ColorUtil.rgba(71, 0, 0, 250), ColorUtil.rgba(32, 32, 32, 250), ColorUtil.rgba(102, 0, 0, 250), ColorUtil.rgba(204, 0, 0, 250));
            RenderUtil.Render2D.drawGradientRound(posX + 4.0f + 24.0f + 4.0f + 4.0f, posY + 38.0f - 17.0f, 60.0f, 8.0f, 3, ColorUtil.rgba(71, 0, 0, 60), ColorUtil.rgba(32, 32, 32, 60), ColorUtil.rgba(102, 0, 0, 60), ColorUtil.rgba(204, 0, 0, 60));
        }
        this.drawItemStack(posX + 3.0F, posY - 8.0F - 5.5F, 10.0F);

        GlStateManager.popMatrix();
    }
