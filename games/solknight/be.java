/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends pj {
    static int field_I;
    static int field_K;
    int field_M;
    static String field_J;
    int field_Q;
    int field_P;
    int field_L;
    int field_N;
    int field_O;

    final static void c(boolean param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = SolKnight.field_L ? 1 : 0;
        var1 = -wd.field_c + 320;
        var2 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
        if (ve.field_b >= 0) {
          var3 = -var1 - wd.field_c + ((sk.field_o >> 4) + 320);
          var4 = -var2 - si.field_E + (wg.field_e >> 4);
        } else {
          var4 = -var2 + ad.field_m;
          var3 = gb.field_j - var1;
        }
        L1: {
          var5 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4));
          if ((!(0 > gb.field_j) ||
            wb.field_c != 0) && (!(wb.field_b > 0) ||
            !(kb.field_b >= 7))) {
            if (var5 <= kd.field_b[kb.field_b]) {
              var4 = ea.field_p[kb.field_b] - 720 + ci.field_sb;
              var3 = rj.field_b;
              var5 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4));
            }
            rj.field_b = (32 + kd.field_b[kb.field_b]) * var3 / var5;
            ci.field_sb = -ea.field_p[kb.field_b] + 720 + (32 + kd.field_b[kb.field_b]) * var4 / var5;
            jj.field_t = (int)(Math.atan2((double)(-var3), (double)(-var4)) * 128.0 / 3.141592653589793);
            var3 = rj.field_b;
            var4 = ci.field_sb + (ea.field_p[kb.field_b] - 720);
            break L1;
          }
          var3 = rj.field_b;
          var4 = ci.field_sb + ea.field_p[kb.field_b] - 720;
        }
        var5 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4));
        if (ve.field_b > 250) {
          return;
        }
        if (param0) {
          be.a(-111);
        }
        L7: {
          var6 = kb.field_b;
          if (0 == var6) {
            if (wb.field_b > 0) {
              if (12 == wb.field_b) {
                mb.a(true, 2, 256);
              }
              wb.field_b = wb.field_b - 1;
            } else {
              if (wb.field_c == 1 &&
                jg.field_b == 0 ||
                !(0 > ve.field_b)) {
                if (bi.field_h != 1) {
                  mb.a(!param0, 3, 256);
                } else {
                  mb.a(!param0, 3, 128);
                }
                wb.field_b = 25;
                if (bi.field_h > 0) {
                  wb.field_b = 13;
                }
                if (2 > bi.field_h) {
                  m.a(0, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                } else {
                  var6 = var3 * 128 / var5;
                  var7 = 128 * var4 / var5;
                  m.a(0, (ci.field_sb << 4) + var6, -var7 + (rj.field_b << 4), (byte) -6, var7, var6);
                  m.a(0, -var6 + (ci.field_sb << 4), var7 + (rj.field_b << 4), (byte) -6, var7, var6);
                }
              }
            }
          } else {
            if (var6 == 2) {
              if (wb.field_b > 0) {
                if (wb.field_b == 12) {
                  mb.a(true, 2, 256);
                }
                wb.field_b = wb.field_b - 1;
              } else {
                if (((wb.field_c == 1 &&
                  0 == jg.field_b) ||
                  !(ve.field_b < 0))) {
                  if (bi.field_h != 1) {
                    mb.a(true, 8, 256);
                  } else {
                    mb.a(true, 8, 128);
                  }
                  wb.field_b = 37;
                  if (0 < bi.field_h) {
                    wb.field_b = 18;
                  }
                  if (bi.field_h < 2) {
                    m.a(1, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 32 / var5, 32 * var3 / var5);
                  } else {
                    var6 = 32 * (var4 + var3) / var5;
                    var7 = (-var3 + var4) * 32 / var5;
                    m.a(1, (ci.field_sb << 4) + var6 * 4, -(var7 * 4) + (rj.field_b << 4), (byte) -6, var7, var6);
                    m.a(1, (ci.field_sb << 4) + var7 * 4, (rj.field_b << 4) + 4 * var6, (byte) -6, var6, -var7);
                  }
                }
              }
              break L7;
            }
            switch (var6) {
              case 1:
                if (0 < wb.field_b) {
                  if (wb.field_b == 12) {
                    mb.a(!param0, 2, 256);
                  }
                  wb.field_b = wb.field_b - 1;
                  break;
                }
                if ((wb.field_c != 1 ||
                  jg.field_b != 0) &&
                  0 > ve.field_b) {
                  break;
                }
                mb.a(true, 15, 256);
                wb.field_b = 50;
                if (bi.field_h > 0) {
                  wb.field_b = 25;
                }
                m.a(2, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                break;
              case 3:
                if (wb.field_b > 0) {
                  if (12 == wb.field_b) {
                    mb.a(true, 2, 256);
                  }
                  wb.field_b = wb.field_b - 1;
                  break;
                }
                if ((wb.field_c != 1 ||
                  jg.field_b != 0) &&
                  ve.field_b < 0) {
                  break;
                }
                mb.a(true, 10, 256);
                wb.field_b = 75;
                if (bi.field_h > 0) {
                  wb.field_b = 37;
                }
                m.a(3, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 96 / var5, var3 * 96 / var5);
                break;
              case 4:
                if (wb.field_b > 0) {
                  wb.field_b = wb.field_b - 1;
                } else {
                  if ((wb.field_c != 1 ||
                    jg.field_b != 0) &&
                    ve.field_b < 0) {
                    break;
                  }
                  mb.a(true, 11, 256);
                  wb.field_b = 8;
                  if (bi.field_h >= 0) {
                    m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 256 / var5, var3 * 256 / var5);
                  }
                  if (bi.field_h >= 1) {
                    m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 256 * var4 / var5 - var3 * 32 / var5, 256 * var3 / var5 + var4 * 32 / var5);
                    m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 256 * var4 / var5 + 32 * var3 / var5, -(var4 * 32 / var5) + var3 * 256 / var5);
                  }
                  if (2 <= bi.field_h) {
                    m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 192 * var4 / var5 - 48 * var3 / var5, 192 * var3 / var5 + var4 * 48 / var5);
                    m.a(4, ci.field_sb << 4, rj.field_b << 4, (byte) -6, 192 * var4 / var5 + 48 * var3 / var5, -(48 * var4 / var5) + 192 * var3 / var5);
                  }
                }
                break;
              case 5:
                if (wb.field_b > 0) {
                  wb.field_b = wb.field_b - 1;
                  break;
                }
                if ((wb.field_c != 1 ||
                  jg.field_b != 0) &&
                  ve.field_b < 0) {
                  break;
                }
                mb.a(true, 5, 256);
                wb.field_b = 8;
                m.a(5, ci.field_sb << 4, rj.field_b << 4, (byte) -6, (128 - bi.field_h * 32) * var4 / var5, (128 - 32 * bi.field_h) * var3 / var5);
                break;
              default:
                break;
              case 7:
                if (wb.field_b <= 0) {
                  if (wb.field_c == 1 &&
                    0 == jg.field_b ||
                    !(ve.field_b < 0)) {
                    wb.field_b = 175;
                    mb.a(true, 19, 256);
                  }
                } else {
                  wb.field_b = wb.field_b - 4;
                  if (wb.field_b > 50) {
                    wb.field_b = wb.field_b - 4;
                  }
                }
                if (wb.field_b >= 46 &&
                  wb.field_b < 54) {
                  mb.a(!param0, 20, 256);
                }
                if (wb.field_b > 0) {
                  if (wb.field_b >= 50) {
                    break;
                  }
                  m.a(7, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                }
                break;
              case 6:
                if (wb.field_b > 0) {
                  wb.field_b = wb.field_b - 1;
                  if (0 == wb.field_b ||
                    wb.field_b == 10 ||
                    wb.field_b == 20 ||
                    wb.field_b == 30 ||
                    wb.field_b == 40) {
                    mb.a(!param0, 18, 256);
                  }
                }
                if (wb.field_b <= 0 && (wb.field_c == 1 &&
                  0 == jg.field_b ||
                  !(0 > ve.field_b))) {
                  wb.field_b = 100;
                }
                if (wb.field_b == 90 ||
                  wb.field_b == 70 ||
                  wb.field_b == 50) {
                  mb.a(true, 17, 256);
                  m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5, var3 * 128 / var5);
                }
                if (80 == wb.field_b ||
                  wb.field_b == 60 ||
                  !(bi.field_h < 1) &&
                  (wb.field_b == 55 ||
                  wb.field_b == 70 ||
                  85 == wb.field_b)) {
                  mb.a(true, 17, 256);
                  m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5 + var3 * 64 / var5, var3 * 128 / var5 - var4 * 64 / var5);
                  m.a(6, ci.field_sb << 4, rj.field_b << 4, (byte) -6, var4 * 128 / var5 - var3 * 64 / var5, var4 * 64 / var5 + 128 * var3 / var5);
                }
                if (wb.field_b == 50) {
                  if (bi.field_h != 2) {
                    break;
                  }
                  wb.field_b = 0;
                }
                break;
            }
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (!param2) {
              return false;
            }
            return true;
          }
          var8_int = -this.field_m + (-param1 - this.field_N) + param3;
          var9 = -this.field_P - this.field_j - param5 + param4;
          if (var8_int * var8_int + var9 * var9 < this.field_O * this.field_O) {
            var10 = Math.atan2((double)var9, (double)var8_int) - ic.field_w;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)this.field_L;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_L;
              }
            }
            this.field_Q = (int)((double)this.field_L * var10 / 6.283185307179586);
            while (this.field_Q >= this.field_L) {
              this.field_Q = this.field_Q - this.field_L;
            }
            while (this.field_Q < 0) {
              this.field_Q = this.field_Q + this.field_L;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("be.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static byte[] a(byte param0, byte[] param1, jd param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var4_int = param2.d((byte) 48, param3);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          var5 = param2.d((byte) 48, 3);
          var6 = (byte)param2.d((byte) 48, 8);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(var6 + param2.d((byte) 48, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)var6;
            }
          }
          if (param0 != 63) {
            be.a(-63);
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("be.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void i(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != 4) {
              return;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                bi.field_a = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_J = null;
        if (param0 != -3) {
          jd var2 = (jd) null;
          be.a((byte) -106, (byte[]) null, (jd) null, 51);
        }
    }

    private be() throws Throwable {
        throw new Error();
    }

    static {
        field_J = "Members";
    }
}
