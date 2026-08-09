/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lk extends oa {
    static int field_W;
    static String field_X;
    private int field_ab;
    static String field_V;
    private tl field_db;
    static int field_eb;
    static String field_bb;
    static String field_Y;
    static wg field_cb;
    static String field_Z;

    final static void a(pn param0, String param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, int param8, long param9, byte param10, int param11, int param12, int param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  rf.field_d = new kj(param8);
                  mm.field_g = new kj(param11);
                  bk.field_Z = param4;
                  kg.field_Wb = param3;
                  ll.field_l = param13;
                  og.field_b = param9;
                  if (!param2) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  cd.field_a = stackIn_3_0 != 0;
                  if (!param5) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  ki.field_ib = stackIn_6_0 != 0;
                  if (param10 >= 112) {
                    break L3;
                  } else {
                    lk.g(-71);
                    break L3;
                  }
                }
                L4: {
                  fe.field_F = param6;
                  e.field_b = param1;
                  vi.field_T = param7;
                  nk.field_A = param0;
                  kk.field_d = param12;
                  if (null != nk.field_A.field_m) {
                    try {
                      L5: {
                        va.field_h = new rj(nk.field_A.field_m, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var15_ref);

                stackIn_16_1 = new StringBuilder().append("lk.A(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vm.b(param0, 75)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!eb.b(param0, 29974)) {
                if (mn.a(-30157, param0)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-1 != (param2.length() ^ -1)) {
                    if (!nj.a(param0, 300, param2)) {
                      if (!fj.a(param2, -7036, param0)) {
                        if (wl.a(param0, true, param2)) {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var3_int = -38 % ((param1 - -50) / 37);
                          stackIn_25_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("lk.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L1;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void h(int param0) {
        field_Z = null;
        if (param0 != -30289) {
            return;
        }
        field_Y = null;
        field_V = null;
        field_X = null;
        field_cb = null;
        field_bb = null;
    }

    final static void a(byte param0, boolean param1) {
        ji.a(param1, (byte) 44);
        if (param0 > -58) {
            return;
        }
        ci.a(param1, (byte) 122);
    }

    final static void g(int param0) {
        jn.field_g = true;
        ib.field_b = param0;
    }

    lk(tl param0) {
        try {
            this.field_db = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            lf.a();
            kf.field_t = new int[260];
            cj.field_j = 11;
            var1_int = 0;
            L1: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= kf.field_t.length) {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        field_V = (String) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    kf.field_t[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                kf.field_t[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lk.Q(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        try {
            this.field_ab = this.field_ab + 1;
            if (param1 <= 56) {
                this.a(71, (byte) 105, -24, 10);
            }
            super.a(param0, 123, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "lk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        vd var8;
        int var9;
        int var10;
        int var11;
        wk var12;
        wk var13;
        wk var14;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param1 <= -99) {
            break L0;
          } else {
            this.field_ab = 58;
            break L0;
          }
        }
        super.a(param0, (byte) -124, param2, param3);
        if (-1 == (param3 ^ -1)) {
          L1: {
            L2: {
              var5 = param2 - (-this.field_o + -(this.field_x >> -1950049055));
              var6 = param0 + (this.field_z - -(this.field_E >> 186470657));
              var8 = this.field_db.a((byte) 21);
              if (nh.field_J == var8) {
                break L2;
              } else {
                if (ma.field_Y != var8) {
                  if (var8 == fa.field_d) {
                    var14 = t.field_i[2];
                    var14.a(var5 + -(var14.field_A >> 259455585), -(var14.field_F >> 1320354081) + var6, 256);
                    break L1;
                  } else {
                    if (vf.field_b == var8) {
                      var13 = t.field_i[1];
                      var13.a(var5 - (var13.field_A >> -1188893599), var6 + -(var13.field_F >> 1579588897), 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                var12 = t.field_i[0];
                var9 = var12.field_z << 1471493217;
                var10 = var12.field_B << -2026876799;
                if (null == qf.field_f) {
                  break L4;
                } else {
                  if (var9 > qf.field_f.field_A) {
                    break L4;
                  } else {
                    if (var10 > qf.field_f.field_F) {
                      break L4;
                    } else {
                      q.a(qf.field_f, (byte) -71);
                      pb.b();
                      break L3;
                    }
                  }
                }
              }
              qf.field_f = new wk(var9, var10);
              q.a(qf.field_f, (byte) -108);
              break L3;
            }
            var12.a(112, 144, var12.field_z << 1507260388, var12.field_B << 1286368356, -this.field_ab << 1735451114, 4096);
            tk.f((byte) 106);
            qf.field_f.a(-var12.field_z + var5, -var12.field_B + var6, 256);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final String e(int param0) {
        if (this.field_C) {
            return this.field_db.a(true);
        }
        if (param0 == 0) {
            return null;
        }
        field_eb = 95;
        return null;
    }

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_V = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_V = "Hide lobby chat";
        field_Y = "Names should contain a maximum of 12 characters";
        field_X = "D";
        field_Z = "Account created successfully!";
        field_eb = 0;
        field_bb = "Please log in as a subscribing member to access this feature.";
    }
}
