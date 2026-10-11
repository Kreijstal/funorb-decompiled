/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends c implements bp {
    static int field_ib;
    static String field_eb;
    static ak field_cb;
    static int field_db;
    static int field_fb;
    static int field_bb;
    static ak field_kb;
    static ak field_lb;
    static String field_jb;
    private ml field_gb;
    private int field_hb;

    gk(String param0, fn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_hb = uf.field_d - (this.field_z + param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final ml a(int param0) {
        if (param0 != 1) {
          field_fb = -57;
        }
        return this.field_gb;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != -128) {
            return;
          }
          var5_int = param3 + param0;
          var6 = param4 + param1;
          if (t.field_e < param0) {
            stackIn_6_0 = param0;
          } else {
            stackIn_6_0 = t.field_e;
          }
          var7 = stackIn_6_0;
          if (param1 > t.field_f) {
            stackIn_9_0 = param1;
          } else {
            stackIn_9_0 = t.field_f;
          }
          var8 = stackIn_9_0;
          if (t.field_h > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = t.field_h;
          }
          var9 = stackIn_12_0;
          if (t.field_a > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = t.field_a;
          }
          var10 = stackIn_15_0;
          if (t.field_e <= param0 &&
            t.field_h > param0) {
            var11 = param0 + var8 * t.field_j;
            var12 = var10 + 1 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              t.field_k[var11] = 16777215;
              var11 = var11 + t.field_j * 2;
            }
          }
          if (param1 >= t.field_f &&
            var6 < t.field_a) {
            var11Lifetime1 = var7 + param1 * t.field_j;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              t.field_k[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (t.field_e <= var5_int &&
            var5_int < t.field_h) {
            var11Lifetime2 = var5_int + ((-param0 + var5_int & 1) + var8) * t.field_j;
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              t.field_k[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * t.field_j;
            }
          }
          if (t.field_f <= param1 &&
            t.field_a > var6) {
            var11Lifetime3 = var7 + (t.field_j * var6 + (-param1 + var6 & 1));
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              t.field_k[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "gk.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(boolean param0) {
        field_eb = null;
        field_kb = null;
        field_jb = null;
        field_lb = null;
        if (param0) {
          field_kb = (ak) null;
        }
        field_cb = null;
    }

    final void a(byte param0, ml param1) {
        try {
          if (param0 <= 16) {
            this.field_hb = 89;
          }
          this.field_gb = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gk.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(byte param0) {
        if (!this.field_D) {
          return null;
        }
        if (null == this.field_l) {
          return null;
        }
        if (param0 <= 16) {
          field_cb = (ak) null;
        }
        nk.a(bg.field_k, this.field_E - this.field_hb + uf.field_d, 5818);
        return this.field_l;
    }

    final static byte[] b(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != 353) {
            field_ib = 30;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (160 > var5 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("gk.CA(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final void n(int param0) {
        super.n(param0 + 0);
        if (this.field_gb != null) {
          this.field_gb.b(2048);
        }
        if (param0 != 1392153825) {
          ng var3 = (ng) null;
          this.a(-125, 48, -57, (ng) null);
        }
    }

    static {
        field_eb = "No";
        field_bb = 0;
        field_jb = "Account created successfully!";
    }
}
