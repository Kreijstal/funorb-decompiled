/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static kl field_f;
    static String field_d;
    java.awt.Image field_h;
    static String field_c;
    int[] field_b;
    int field_a;
    static String field_e;
    int field_g;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static og a(byte param0, TextCursor param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        og stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fieldTemp$2 = param1.position - 1;
          param1.position = param1.position - 1;
          var2_int = fieldTemp$2;
          var3 = new StringBuilder();
          while (!param1.isAtEnd((byte) 16)) {
            var4 = param1.readCharacter(-1);
            if (!Character.isWhitespace((char) var4) &&
              var4 != 44 &&
              var4 != 40 &&
              var4 != 41) {
              discarded$3 = var3.append((char) var4);
              continue;
            }
            param1.position = param1.position - 1;
            break;
          }
          if (param0 >= -106) {
            field_c = (String) null;
          }
          var5 = var3.toString();
          if (!var5.equals("true") &&
            !var5.equals("false")) {
            if (var5.charAt(0) != 45 &&
              !Character.isDigit(var5.charAt(0))) {
              var4Lifetime1 = rn.field_c;
            } else {
              var4Lifetime1 = gg.field_G;
            }
          } else {
            var4Lifetime1 = gb.field_z;
          }
          stackIn_21_0 = new og(var4Lifetime1, var2_int, var5);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bi.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 == 5605) {
          SoftwareRaster.a(this.field_b, this.field_a, this.field_g);
          return;
        }
        field_f = (kl) null;
        SoftwareRaster.a(this.field_b, this.field_a, this.field_g);
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
          field_c = (String) null;
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 != -31000) {
          field_e = (String) null;
          if (param0 < 48) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 57) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (param0 <= 90) {
          return true;
        }
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0) {
          return;
        }
        if (0 > param4) {
          return;
        }
        if (0 > param5) {
          return;
        }
        if (ResourceRequest.field_y <= param4) {
          return;
        }
        if (!(ef.field_c > param5)) {
          return;
        }
        int var6 = param4 + param5 * ResourceRequest.field_y;
        int var7 = RegionAnchor.a(16711680, param5, var6, param4);
        int var8 = 255 - (var7 >>> 24 & 220487423);
        var7 = var7 & 16777215;
        mq.a(param2, var7, var6, param4, param1, var8, -116, param5);
        pk.a(param1, param5, param4, var6, var7, -29403, var8, param2);
        if (param3 > 71) {
          if (Unit.field_L) {
            oh.field_I.g(param2, param1);
          }
          return;
        }
    }

    static {
        field_d = "Playing";
        field_c = "Armies of Gielinor Members' Expansion";
        field_e = "To play through the single-player campaigns, please log in or create a free account.";
    }
}
