/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends jl {
    static boolean field_y;
    private int field_w;
    static String field_s;
    static String field_u;
    static int field_x;
    cm[] field_t;
    private byte[][] field_v;

    public static void e(byte param0) {
        if (param0 <= 38) {
            field_x = 64;
        }
        field_s = null;
        field_u = null;
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        mn var3 = null;
        int var4 = 0;
        kg var6_ref_kg = null;
        int var6 = 0;
        int var7 = 0;
        kg var8 = null;
        int var9 = 0;
        Object var10 = null;
        ij var11 = null;
        int var12 = 0;
        int var13 = 0;
        int[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        byte[] var29 = null;
        var12 = Confined.field_J ? 1 : 0;
        if (this.field_t != null) {
          return true;
        } else {
          L0: {
            if (this.field_v == null) {
              if (rn.field_f.a(this.field_w, 0)) {
                var26 = rn.field_f.a((byte) -112, this.field_w);
                this.field_v = new byte[var26.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var26.length <= var3_int) {
                    break L0;
                  } else {
                    this.field_v[var3_int] = rn.field_f.a((byte) -2, this.field_w, var26[var3_int]);
                    var3_int++;
                    continue L1;
                  }
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          var2 = 1;
          var4 = -111 / ((-14 - param0) / 63);
          var13 = 0;
          var3_int = var13;
          L2: while (true) {
            if (var13 >= this.field_v.length) {
              if (var2 != 0) {
                var3 = new mn();
                var4 = rn.field_f.d(this.field_w, (byte) -121);
                this.field_t = new cm[var4];
                var28 = rn.field_f.a((byte) -115, this.field_w);
                var6 = 0;
                L3: while (true) {
                  if (var6 >= var28.length) {
                    this.field_v = (byte[][]) null;
                    return true;
                  } else {
                    var29 = this.field_v[var6];
                    var8 = new kg(var29);
                    var8.field_n = 1;
                    var9 = var8.a((byte) 25);
                    var10 = null;
                    var11 = (ij) ((Object) var3.a(47));
                    L4: while (true) {
                      L5: {
                        if (var11 == null) {
                          break L5;
                        } else {
                          if (var9 != var11.field_v) {
                            var11 = (ij) ((Object) var3.d(2123));
                            continue L4;
                          } else {
                            var10 = var11;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var10 == null) {
                          var10 = new ij(var9, un.field_a.c(var9, (byte) 125));
                          var3.a((rk) (var10), (byte) -112);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_t[var28[var6]] = new cm(var29, (ij) (var10));
                      var6++;
                      continue L3;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var27 = this.field_v[var13];
              var6_ref_kg = new kg(var27);
              var6_ref_kg.field_n = 1;
              var7 = var6_ref_kg.a((byte) 25);
              var2 = var2 != 0 & un.field_a.a(var7, (byte) -37) ? 1 : 0;
              var13++;
              continue L2;
            }
          }
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                if (!jc.field_g) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var4 = -38 % ((18 - param0) / 56);
                      var3 = (String) (kf.a(114, "getcookies", param1));
                      var5 = ij.a(0, ';', var3);
                      var6 = 0;
                      L2: while (true) {
                        if (var6 >= var5.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var2)) {
                                break L3;
                              } else {
                                stackOut_8_0 = 1;
                                stackIn_9_0 = stackOut_8_0;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2_ref2);
                stackOut_17_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_9_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(byte param0) {
        if (param0 < 85) {
            field_y = true;
        }
        if (lc.field_J == null) {
            if (qn.field_v.field_h <= 0) {
            } else {
                if (!pa.field_c) {
                    lc.field_J = new bj(0, 65535, qn.field_v.field_B.field_yb + bd.field_h, qn.field_v.field_J.field_o + we.field_g, -qn.field_v.field_h + d.field_a, rc.field_i, new int[]{-1 + (qn.field_v.field_J.field_o + qn.field_v.field_h * 25)});
                } else {
                    lc.field_J = new bj(1, 65534, bd.field_h - -qn.field_v.field_B.field_yb, we.field_g - -qn.field_v.field_J.field_o, -qn.field_v.field_h + d.field_a, rc.field_i, new int[]{qn.field_v.field_J.field_o + (qn.field_v.field_h * 25 - 1)});
                }
                if (!tj.a(true)) {
                    r.a(lc.field_J, -1, 3);
                }
                rg.field_K = true;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_t[param2].a(param3, param0);
        if (param1 != 61) {
            this.a(-114, 7, -56, 63);
        }
    }

    sg(int param0) {
        this.field_w = param0;
    }

    static {
        field_u = "You can <col=FFFFFF>press any arrow key</col> to return to keyboard control.";
        field_s = "Friends can be added in multiplayer<nbsp>games";
    }
}
