/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends am {
    int[] field_n;
    boolean field_t;
    String field_r;
    int[] field_o;
    char[] field_p;
    static boolean field_s;
    char[] field_q;

    private final void a(int param0, boolean param1, iw param2) {
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          if (param0 == 1) {
            this.field_r = param2.a(-118);
          } else {
            if (param0 == 2) {
              var4_int = param2.h((byte) -105);
              this.field_o = new int[var4_int];
              this.field_q = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_o[var5] = param2.a((byte) 81);
                var6 = param2.j((byte) -65);
                stackIn_16_0 = this.field_q;
                stackIn_16_1 = var5;
                if (var6 != 0) {
                  stackIn_17_2 = nl.a(false, (byte) var6);
                } else {
                  stackIn_17_2 = 0;
                }
                stackIn_16_0[stackIn_16_1] = (char) stackIn_17_2;
              }
            } else {
              if (3 == param0) {
                var4_int = param2.h((byte) -109);
                this.field_n = new int[var4_int];
                this.field_p = new char[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  this.field_n[var5] = param2.a((byte) 81);
                  var6 = param2.j((byte) -81);
                  stackIn_10_0 = this.field_p;
                  stackIn_10_1 = var5;
                  if (0 != var6) {
                    stackIn_11_2 = nl.a(false, (byte) var6);
                  } else {
                    stackIn_11_2 = 0;
                  }
                  stackIn_10_0[stackIn_10_1] = (char) stackIn_11_2;
                }
              } else {
                if (param0 == 4) {
                  this.field_t = true;
                }
              }
            }
          }
          if (param1) {
            tc.a(true, 105, -26, -11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_1 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime1Lifetime1;
        var3 = Kickabout.field_G;
        if (param1 != 5464) {
          field_s = false;
          if (ua.field_l != param0) {
            if (param0 > ua.field_l) {
              var2 = (param0 - ua.field_l) / 10;
              stackIn_23_0 = ua.field_l;
              if (1 < var2) {
                stackIn_24_1 = var2;
              } else {
                stackIn_24_1 = 1;
              }
              ua.field_l = stackIn_23_0 + stackIn_24_1;
            } else {
              var2 = (param0 - ua.field_l) / 10;
              stackIn_19_0 = ua.field_l;
              if (var2 >= -1) {
                stackIn_20_1 = -1;
              } else {
                stackIn_20_1 = var2;
              }
              ua.field_l = stackIn_19_0 + stackIn_20_1;
            }
          }
          if (cf.field_Db + dc.field_d != param0) {
            dc.field_d = -cf.field_Db + param0;
          }
          if (dc.field_d == 0) {
            if (wm.field_s > 1) {
              wm.field_s = wm.field_s - 1;
            }
          } else {
            if (wm.field_s < 18) {
              wm.field_s = wm.field_s + 1;
            }
          }
          if (wt.field_x > qj.field_e &&
            vo.field_cb.field_q + qj.field_e > wt.field_x &&
            bi.field_i < us.field_j &&
            nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
            ka.a(dc.field_d, cf.field_Db, (byte) -113);
          }
          return;
        }
        if (ua.field_l != param0) {
          if (param0 <= ua.field_l) {
            var2Lifetime1 = (param0 - ua.field_l) / 10;
            stackIn_54_0 = ua.field_l;
            if (var2Lifetime1 >= -1) {
              stackIn_55_1 = -1;
            } else {
              stackIn_55_1 = var2Lifetime1;
            }
            ua.field_l = stackIn_54_0 + stackIn_55_1;
            if (cf.field_Db + dc.field_d != param0) {
              dc.field_d = -cf.field_Db + param0;
            }
            if (dc.field_d == 0) {
              if (wm.field_s > 1) {
                wm.field_s = wm.field_s - 1;
              }
            } else {
              if (wm.field_s < 18) {
                wm.field_s = wm.field_s + 1;
              }
            }
            if (wt.field_x > qj.field_e &&
              vo.field_cb.field_q + qj.field_e > wt.field_x &&
              bi.field_i < us.field_j &&
              nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
              ka.a(dc.field_d, cf.field_Db, (byte) -113);
            }
            return;
          }
          var2Lifetime1Lifetime1 = (param0 - ua.field_l) / 10;
          stackIn_71_0 = ua.field_l;
          if (1 < var2Lifetime1Lifetime1) {
            stackIn_72_1 = var2Lifetime1Lifetime1;
          } else {
            stackIn_72_1 = 1;
          }
          ua.field_l = stackIn_71_0 + stackIn_72_1;
        }
        if (cf.field_Db + dc.field_d == param0) {
          if (dc.field_d == 0) {
            if (wm.field_s > 1) {
              wm.field_s = wm.field_s - 1;
            }
          } else {
            if (wm.field_s < 18) {
              wm.field_s = wm.field_s + 1;
            }
          }
          if (wt.field_x > qj.field_e &&
            vo.field_cb.field_q + qj.field_e > wt.field_x &&
            bi.field_i < us.field_j &&
            nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
            ka.a(dc.field_d, cf.field_Db, (byte) -113);
            return;
          }
          return;
        }
        dc.field_d = -cf.field_Db + param0;
        if (dc.field_d == 0) {
          if (wm.field_s > 1) {
            wm.field_s = wm.field_s - 1;
            if (wt.field_x > qj.field_e &&
              vo.field_cb.field_q + qj.field_e > wt.field_x &&
              bi.field_i < us.field_j &&
              nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
              ka.a(dc.field_d, cf.field_Db, (byte) -113);
            }
            return;
          }
        } else {
          if (wm.field_s < 18) {
            wm.field_s = wm.field_s + 1;
            if (wt.field_x > qj.field_e &&
              vo.field_cb.field_q + qj.field_e > wt.field_x &&
              bi.field_i < us.field_j &&
              nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
              ka.a(dc.field_d, cf.field_Db, (byte) -113);
            }
            return;
          }
        }
        if (wt.field_x <= qj.field_e) {
          return;
        }
        if (vo.field_cb.field_q + qj.field_e <= wt.field_x) {
          return;
        }
        if (bi.field_i < us.field_j &&
          nn.field_C.field_w * wm.field_s + (bi.field_i + vo.field_cb.field_w + du.field_i.field_w) > us.field_j) {
          ka.a(dc.field_d, cf.field_Db, (byte) -113);
          return;
        }
    }

    final static boolean a(int param0, byte param1, int param2, nl param3, int param4) {
        nl stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if ((param3.field_G & 8) != 0 &&
            param2 < param3.field_M) {
            param3.field_M = param2;
          }
          if ((4 & param3.field_G) != 0 &&
            param3.field_w < param4) {
            param3.field_w = param4;
          }
          if ((2 & param3.field_G) != 0 &&
            param2 > param3.field_M) {
            param3.field_M = param2;
          }
          if ((param3.field_G & 1) != 0 &&
            param3.field_w > param4) {
            param3.field_w = param4;
          }
          if (param1 <= 80) {
            return true;
          }
          if (param2 == param3.field_M &&
            param3.field_w == param4) {
            param3.field_G = 0;
            param3.a(param0, 26214);
            return true;
          }
          stackIn_23_0 = (nl) (param3);
          if (param4 > param3.field_w) {
            stackIn_24_1 = 1;
          } else {
            stackIn_24_1 = 0;
          }
          if (param3.field_M >= param2) {
            stackIn_27_2 = 0;
          } else {
            stackIn_27_2 = 8;
          }
          if (param3.field_M <= param2) {
            stackIn_30_3 = 0;
          } else {
            stackIn_30_3 = 2;
          }
          stackIn_32_1 = stackIn_24_1 | (stackIn_27_2 | stackIn_30_3);
          if (param3.field_w > param4) {
            stackIn_33_2 = 4;
          } else {
            stackIn_33_2 = 0;
          }
          stackIn_23_0.field_G = stackIn_32_1 | stackIn_33_2;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_37_0 = var5;
          stackIn_37_1 = new StringBuilder().append("tc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          param3 = 0;
        }
        ir.a(rv.field_c[param2][param3][2], -88, rv.field_c[param2][param3][5], rv.field_c[param2][param3][4], rv.field_c[param2][param3][1], rv.field_c[param2][param3][0], rv.field_c[param2][param3][3]);
        ic.a(rv.field_c[param2][param3][4], rv.field_c[param2][param3][5], rv.field_c[param2][param3][3], rv.field_c[param2][param3][0], rv.field_c[param2][param3][2], (byte) -113, rv.field_c[param2][param3][1]);
        if (param1 != 8710) {
          nl var5 = (nl) null;
          tc.a(117, (byte) -18, -15, (nl) null, 51);
          return;
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        var3 = Kickabout.field_G;
        if (null == this.field_n) {
          if (param0 >= -81) {
            return;
          }
          if (null == this.field_o) {
            return;
          }
          var4 = 0;
          var2 = var4;
          while (var4 < this.field_o.length) {
            this.field_o[var4] = hf.a(this.field_o[var4], 32768);
            var4++;
          }
          return;
        }
        for (var2Lifetime1 = 0; this.field_n.length > var2Lifetime1; var2Lifetime1++) {
          this.field_n[var2Lifetime1] = hf.a(this.field_n[var2Lifetime1], 32768);
        }
        if (param0 >= -81) {
          return;
        }
        if (null == this.field_o) {
          return;
        }
        var4Lifetime1 = 0;
        var2Lifetime2 = var4Lifetime1;
        while (var4Lifetime1 < this.field_o.length) {
          this.field_o[var4Lifetime1] = hf.a(this.field_o[var4Lifetime1], 32768);
          var4Lifetime1++;
        }
        return;
    }

    final void a(iw param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          while (true) {
            var3_int = param0.h((byte) -125);
            if (var3_int != 0) {
              this.a(var3_int, false, param0);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            this.field_r = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tc.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    tc() {
        this.field_t = false;
    }

    static {
        field_s = false;
    }
}
