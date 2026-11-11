/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sv extends MenuScreen {
    static String field_q;
    private DropAnimation field_r;

    final static String decodeBase37Name(byte param0, long param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (param1 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param1;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        var6 = new StringBuilder(var3);
        while (0L != param1) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = ConstantEffectBehaviour.field_n[(int)(-(37L * param1) + var7)];
          if (95 == var9) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param0 != -38) {
          field_q = (String) null;
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final int getItemX(byte param0, int param1) {
        if (0 == param1) {
          return 0;
        }
        if (param0 < 111) {
          this.getItemY(19, -86);
          if (param1 == -1 + this.items.length) {
            return aaa.a(false) - this.items[param1].getWidth(-163);
          }
          if (param1 < 3) {
            return 30 + (20 + aaa.a(false) / 2) - this.items[param1].getWidth(-163);
          }
          return aaa.a(false) / 2 + 30;
        }
        if (param1 == -1 + this.items.length) {
          return aaa.a(false) - this.items[param1].getWidth(-163);
        }
        if (param1 < 3) {
          return 30 + (20 + aaa.a(false) / 2) - this.items[param1].getWidth(-163);
        }
        return aaa.a(false) / 2 + 30;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        this.field_r.startDrop(param0 ^ -87);
    }

    final void draw(byte param0, boolean param1) {
        super.draw(param0, param1);
        int var3 = this.items[1].field_i - 70 + this.field_r.getPosition(47) - 150;
        WhiteLightShooterComponent.field_K.draw((aaa.a(false) >> 1) - (WhiteLightShooterComponent.field_K.width() >> 1), var3);
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        if (param0 > -42) {
          field_q = (String) null;
        }
    }

    final int getItemRight(int param0, byte param1) {
        if (param1 == -48) {
          return this.getItemX((byte) 116, param0) + this.items[param0].getWidth(-163);
        }
        this.getItemY(-74, 3);
        return this.getItemX((byte) 116, param0) + this.items[param0].getWidth(-163);
    }

    final void update(boolean param0, boolean param1, int param2) {
        super.update(param0, param1, param2);
        this.field_r.updateFall((byte) -111, param0, !param1 ? true : false);
    }

    final boolean handleKey(int param0, char param1, int param2) {
        if (param0 == 13) {
          return true;
        }
        if (param2 == 1) {
          return super.handleKey(param0, param1, 1);
        }
        this.field_r = (DropAnimation) null;
        return super.handleKey(param0, param1, 1);
    }

    final int getItemY(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        if (param0 == 0) {
          var3 = 60;
          param0 = -1 + this.items.length;
          return -var3 + this.firstItemY - (-(param0 * this.itemSpacing) + this.items[param0].getHeight(11919));
        }
        if (param0 == this.items.length - 1) {
          var3Lifetime1 = 60;
          param0 = -1 + this.items.length;
          return -var3Lifetime1 + this.firstItemY - (-(param0 * this.itemSpacing) + this.items[param0].getHeight(11919));
        }
        if (3 > param0) {
          var3Lifetime2 = 20;
          return var3Lifetime2 + (this.firstItemY + (param0 - 1) * this.items[param0].getHeight(11919) - this.items[0].getHeight(11919));
        }
        if (param1 == 30) {
          return this.firstItemY + ((param0 - 3) * this.itemSpacing - this.items[param0].getHeight(11919));
        }
        field_q = (String) null;
        return this.firstItemY + ((param0 - 3) * this.itemSpacing - this.items[param0].getHeight(11919));
    }

    final static AntialiasedBitmapFont loadAntialiasedFont(ResourceArchive param0, int param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        AntialiasedBitmapFont stackIn_5_0 = null;
        AntialiasedBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!GameApplet.loadSpriteSheet(false, param4, param1, param2)) {
            stackIn_2_0 = null;
            return (AntialiasedBitmapFont) (stackIn_2_0);
          }
          if (param3 == 24876) {
            stackIn_7_0 = TextureOperator.decodeAntialiasedFont(param0.getFile(false, param1, param4), (byte) -123);
            return stackIn_7_0;
          }
          stackIn_5_0 = (AntialiasedBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("sv.CA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    sv(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_r = new DropAnimation();
    }

    static {
        field_q = "Reject";
    }
}
