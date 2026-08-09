/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aj extends nt {
    static String field_t;
    static int field_B;
    private int field_E;
    private int field_w;
    private int field_s;
    private double field_z;
    private int field_v;
    static volatile boolean field_A;
    private double field_F;
    static Calendar field_y;
    static String field_x;
    static br[] field_D;
    private int field_u;
    static boolean field_C;

    aj(int param0, int param1, int param2, int param3, double param4, double param5, int param6, int param7, int param8, int param9, int param10) {
        super(param0, param1, param2, param3);
        this.field_E = param9;
        this.field_s = param8;
        this.field_F = param4;
        this.field_v = param7;
        this.field_u = param6;
        this.field_w = param10;
        this.field_z = param5;
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -121) {
                break L1;
              } else {
                field_A = false;
                break L1;
              }
            }
            L2: {
              if (this.field_s == 0) {
                ht.field_e[2 - -this.field_E].a((float)(this.field_k >> -2011203288), (float)(this.field_o >> -1863521784), (int)((double)this.field_w / 14.0 * 3072.0), (int)(65535.0 * this.field_F), 1, 0, 2);
                break L2;
              } else {
                if (this.field_s == 1) {
                  dc.field_ab[this.field_E + 2].a((float)(this.field_k >> 684504456), (float)(this.field_o >> -2119019480), (int)((double)this.field_w / 14.0 * 3072.0), (int)(this.field_F * 65535.0), 1, 0, 2);
                  break L2;
                } else {
                  if ((this.field_s ^ -1) != -3) {
                    if (this.field_s != 3) {
                      if (this.field_s == 4) {
                        ak.field_a[2 + this.field_E].a((float)(this.field_k >> 986141064), (float)(this.field_o >> 735597512), (int)((double)this.field_w / 14.0 * 3072.0), (int)(this.field_F * 65535.0), 1, 0, 2);
                        break L2;
                      } else {
                        if ((this.field_s ^ -1) == -6) {
                          mr.field_e[2 - -this.field_E].a((float)(this.field_k >> 734499336), (float)(this.field_o >> 1618885192), (int)(3072.0 * ((double)this.field_w / 14.0)), (int)(this.field_F * 65535.0), 1, 0, 2);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      s.field_n[2 + this.field_E].a((float)(this.field_k >> 2038387944), (float)(this.field_o >> 1389537992), (int)((double)this.field_w / 14.0 * 3072.0), (int)(65535.0 * this.field_F), 1, 0, 2);
                      break L2;
                    }
                  } else {
                    hv.field_d[2 - -this.field_E].a((float)(this.field_k >> 296199080), (float)(this.field_o >> 1134444584), (int)((double)this.field_w / 14.0 * 3072.0), (int)(65535.0 * this.field_F), 1, 0, 2);
                    break L2;
                  }
                }
              }
            }
            if (90 > this.field_p) {
              break L0;
            } else {
              th.field_B.a((float)(this.field_k >> -425504280), (float)(this.field_o >> -234107544), (int)((double)this.field_w / 14.0 * 3072.0), (int)(65535.0 * this.field_F), 1, 0, 2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("aj.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final static bj a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        bj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var3 = (String) null;
                aj.a(true, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = new bj(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("aj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        si var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        si stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (136 >= param1.length) {
                if (param0 < -116) {
                  if (!param2) {
                    stackIn_13_0 = (byte[]) (param1);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_11_0 = cp.a(param1, 0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = (Object) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = new si();
                ((nn) ((Object) var3)).a(param1, -112);
                stackIn_5_0 = (si) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("aj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_13_0;
              }
            }
          }
        }
    }

    final boolean a(int param0) {
        L0: {
          if (90 > this.field_p) {
            this.field_o = this.field_o + this.field_v;
            this.field_k = this.field_k + this.field_u;
            this.field_F = this.field_F + this.field_z;
            this.field_u = 251 * this.field_u / 256;
            this.field_v = 251 * this.field_v / 256;
            this.field_v = this.field_v + 1;
            this.field_u = this.field_u + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -2567) {
          field_A = false;
          return super.a(-2567);
        } else {
          return super.a(-2567);
        }
    }

    final static hr[] a(ri[] param0, ha param1, int param2) {
        hr[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        hr[] var6 = null;
        hr[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new hr[param0.length];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (param0.length <= var4) {
                L2: {
                  if (param2 == 28513) {
                    break L2;
                  } else {
                    field_B = 75;
                    break L2;
                  }
                }
                stackIn_7_0 = (hr[]) (var3);
                break L0;
              } else {
                var6[var4] = param1.a(param0[var4], false);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("aj.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void e(int param0) {
        ha var2;
        field_y = null;
        if (param0 != 2) {
          var2 = (ha) null;
          aj.a((ri[]) null, (ha) null, -61);
          field_x = null;
          field_t = null;
          field_D = null;
          return;
        } else {
          field_x = null;
          field_t = null;
          field_D = null;
          return;
        }
    }

    static {
        field_t = "Please check if address is correct";
        field_B = 0;
        field_x = "Create your own free Jagex account";
        field_A = false;
        field_y = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
