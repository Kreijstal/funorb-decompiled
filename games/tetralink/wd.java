/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static int field_i;
    int[] field_g;
    static String field_d;
    int field_h;
    static String field_a;
    static db field_e;
    int field_j;
    static long field_f;
    java.awt.Image field_c;
    static String field_b;
    static int field_k;

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    final static void a(boolean param0) {
        ci.field_y[47] = 73;
        ci.field_y[93] = 43;
        ci.field_y[46] = 72;
        ci.field_y[520] = 59;
        ci.field_y[192] = 28;
        ci.field_y[222] = 58;
        ci.field_y[61] = 27;
        ci.field_y[45] = 26;
        ci.field_y[44] = 71;
        ci.field_y[59] = 57;
        ci.field_y[92] = 74;
        ci.field_y[91] = 42;
        if (param0) {
          byte[] var2 = (byte[]) null;
          wd.a((CharSequence) null, 104, -100, (byte[]) null, -8, (byte) 44);
        }
    }

    final void a(int param0) {
        int var2 = -92 % ((param0 + 69) / 41);
        ra.a(this.field_g, this.field_h, this.field_j);
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        boolean stackIn_11_3 = false;
        boolean stackIn_14_4;
        int stackIn_14_5;
        int stackIn_14_6;
        int stackIn_14_7;
        int stackIn_14_8;
        int stackIn_14_9;
        int stackIn_14_10;
        boolean stackIn_16_11 = false;
        sk.b(-117);
        if (param1 >= -26) {
          wd.a(true, -116);
        }
        if (null != qb.field_N) {
          stackIn_8_0 = (ja.b(false, qb.field_N.field_jc)) ? 1 : 0;
        } else {
          stackIn_8_0 = 0;
        }
        var2 = stackIn_8_0;
        stackIn_10_0 = false;
        stackIn_10_1 = 77;
        stackIn_10_2 = 15;
        stackIn_11_3 = (50 >= bd.field_e) ? false : true;
        stackIn_14_4 = param0;
        stackIn_14_5 = hc.field_p;
        stackIn_14_6 = 0;
        stackIn_14_7 = 14;
        stackIn_14_8 = 13;
        stackIn_14_9 = var2;
        stackIn_14_10 = 11;
        stackIn_16_11 = (ph.field_s) || (sj.field_a);
        dd.a(stackIn_10_0, stackIn_10_1, stackIn_10_2, stackIn_11_3, stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, stackIn_14_8, stackIn_14_9 != 0, stackIn_14_10, stackIn_16_11);
        if (uf.field_b) {
          nd.field_Lb.f(57, (byte) -92);
          uf.field_b = false;
        }
        if (bh.field_p) {
          nd.field_Lb.f(10, (byte) -92);
          bh.field_p = false;
        }
    }

    final static boolean b(byte param0) {
        if (param0 > -39) {
          field_i = -89;
        }
        return qa.field_v;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 > -3) {
          field_d = (String) null;
        }
        field_d = null;
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static int a(CharSequence param0, int param1, int param2, byte[] param3, int param4, byte param5) {
        int var8 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          var6_int = 87 / ((param5 - 63) / 50);
          var7 = -param2 + param1;
          for (var8 = 0; var8 < var7; var8++) {
            {
              var9 = param0.charAt(param2 + var8);
              if ((0 >= var9 ||
                var9 >= 128) && (var9 < 160 ||
                var9 > 255)) {
                switch (var9) {
                  case 8364:
                    param3[param4 + var8] = (byte)-128;
                    break;
                  case 8218:
                    param3[param4 + var8] = (byte)-126;
                    break;
                  case 402:
                    param3[param4 + var8] = (byte)-125;
                    break;
                  case 8222:
                    param3[var8 + param4] = (byte)-124;
                    break;
                  case 8230:
                    param3[var8 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param3[param4 + var8] = (byte)-122;
                    break;
                  case 8225:
                    param3[var8 + param4] = (byte)-121;
                    break;
                  case 710:
                    param3[param4 + var8] = (byte)-120;
                    break;
                  case 8240:
                    param3[param4 + var8] = (byte)-119;
                    break;
                  case 352:
                    param3[var8 + param4] = (byte)-118;
                    break;
                  case 8249:
                    param3[param4 + var8] = (byte)-117;
                    break;
                  case 338:
                    param3[var8 + param4] = (byte)-116;
                    break;
                  case 381:
                    param3[var8 + param4] = (byte)-114;
                    break;
                  case 8216:
                    param3[param4 + var8] = (byte)-111;
                    break;
                  case 8217:
                    param3[var8 + param4] = (byte)-110;
                    break;
                  case 8220:
                    param3[param4 + var8] = (byte)-109;
                    break;
                  case 8221:
                    param3[param4 + var8] = (byte)-108;
                    break;
                  case 8226:
                    param3[var8 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param3[var8 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param3[var8 + param4] = (byte)-105;
                    break;
                  case 732:
                    param3[param4 + var8] = (byte)-104;
                    break;
                  case 8482:
                    param3[param4 + var8] = (byte)-103;
                    break;
                  case 353:
                    param3[param4 + var8] = (byte)-102;
                    break;
                  case 8250:
                    param3[param4 + var8] = (byte)-101;
                    break;
                  case 339:
                    param3[param4 + var8] = (byte)-100;
                    break;
                  case 382:
                    param3[param4 + var8] = (byte)-98;
                    break;
                  default:
                    param3[var8 + param4] = (byte)63;
                    break;
                  case 376:
                    param3[param4 + var8] = (byte)-97;
                    break;
                }
              } else {
                param3[var8 + param4] = (byte)var9;
              }
            }
          }
          stackIn_67_0 = var7;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("wd.D(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_d = "Add friend";
        field_a = "Scamming";
        field_e = new db(15, 0, 1, 0);
        field_b = "Who can join";
    }
}
