/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ji {
    static String field_A;
    static boolean field_z;
    static String field_E;
    private int field_C;
    static cr field_D;
    static fd field_F;
    static ve field_B;
    static String field_y;

    final static void a(int param0, cc param1, cc param2, byte param3) {
        try {
            bc.field_c = param0;
            mf.field_c = param2;
            gb.field_b = param1;
            if (param3 >= -56) {
                field_A = (String) null;
            }
            tn.a(bi.field_j / 2, bi.field_e / 2, 55);
            ar.a(param1.field_M + param1.field_t, (byte) 92, param2.field_M + param2.field_t, param1.field_t, param2.field_t);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "nb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        String discarded$1 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        tn var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (param1 >= 91) {
            break L0;
          } else {
            var9 = (tn) null;
            discarded$1 = nb.a((tn) null, 86);
            break L0;
          }
        }
        L1: {
          var12 = this.field_x.a(param0, (byte) -72);
          var11 = var12;
          var10 = var11;
          var3 = var10;
          if (!this.field_x.field_i) {
            break L1;
          } else {
            var4 = lf.field_y[param0];
            var5 = 0;
            L2: while (true) {
              if (var5 >= we.field_M) {
                break L1;
              } else {
                L3: {
                  var6 = rh.field_O[var5];
                  if (var6 <= this.field_C) {
                    break L3;
                  } else {
                    if (var6 >= -this.field_C + 4096) {
                      break L3;
                    } else {
                      if (2048 - this.field_C >= var4) {
                        break L3;
                      } else {
                        if (2048 - -this.field_C <= var4) {
                          break L3;
                        } else {
                          L4: {
                            var7 = -var6 + 2048;
                            if (var7 < 0) {
                              var10 = var3;
                              stackOut_11_0 = -var7;
                              stackIn_12_0 = stackOut_11_0;
                              break L4;
                            } else {
                              stackOut_10_0 = var7;
                              stackIn_12_0 = stackOut_10_0;
                              break L4;
                            }
                          }
                          var10 = var3;
                          var7 = stackIn_12_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-this.field_C + 2048);
                          var10[var5] = 4096 + -var7;
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var6 <= -this.field_C + 2048) {
                    break L5;
                  } else {
                    if (var6 >= 2048 - -this.field_C) {
                      break L5;
                    } else {
                      L6: {
                        var7 = -2048 + var4;
                        if ((var7 ^ -1) <= -1) {
                          stackOut_17_0 = var7;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = -var7;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      var7 = stackIn_18_0;
                      var7 = var7 - this.field_C;
                      var7 = var7 << 12;
                      var10[var5] = var7 / (-this.field_C + 2048);
                      var5++;
                      continue L2;
                    }
                  }
                }
                L7: {
                  if (var4 < this.field_C) {
                    break L7;
                  } else {
                    if (var4 > -this.field_C + 4096) {
                      break L7;
                    } else {
                      L8: {
                        if (this.field_C > var6) {
                          break L8;
                        } else {
                          if (-this.field_C + 4096 < var6) {
                            break L8;
                          } else {
                            var12[var5] = 0;
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      L9: {
                        var7 = 2048 + -var4;
                        if (-1 < (var7 ^ -1)) {
                          stackOut_31_0 = -var7;
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = var7;
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var7 = stackIn_32_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 + -this.field_C);
                      var10[var5] = -var7 + 4096;
                      var5++;
                      continue L2;
                    }
                  }
                }
                L10: {
                  var7 = -2048 + var6;
                  if ((var7 ^ -1) <= -1) {
                    stackOut_24_0 = var7;
                    stackIn_25_0 = stackOut_24_0;
                    break L10;
                  } else {
                    stackOut_23_0 = -var7;
                    stackIn_25_0 = stackOut_23_0;
                    break L10;
                  }
                }
                var7 = stackIn_25_0;
                var7 = var7 - this.field_C;
                var7 = var7 << 12;
                var10[var5] = var7 / (-this.field_C + 2048);
                var5++;
                continue L2;
              }
            }
          }
        }
        var10 = var3;
        return var10;
    }

    final static tn a(boolean param0, byte param1) {
        mi var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        mi var8 = null;
        q var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (param1 > 32) {
            break L0;
          } else {
            field_A = (String) null;
            break L0;
          }
        }
        L1: {
          var8 = id.field_f;
          var2 = var8;
          var3 = var8.h(-11);
          ln.field_c = 127 & var3;
          if (0 == (var3 & 128)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          cb.field_Ib = stackIn_5_0 != 0;
          rq.field_u = var8.h(-11);
          ug.field_a = var8.i(-31016);
          if ((ln.field_c ^ -1) == -3) {
            ck.field_J = var8.a((byte) -11);
            qf.field_a = var8.m(0);
            break L2;
          } else {
            ck.field_J = 0;
            qf.field_a = 0;
            break L2;
          }
        }
        L3: {
          if ((var8.h(-11) ^ -1) != -2) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          sp.field_U = var8.f(128);
          if (var4 == 0) {
            fd.field_p = sp.field_U;
            break L4;
          } else {
            fd.field_p = var8.f(128);
            break L4;
          }
        }
        L5: {
          if (-2 == (ln.field_c ^ -1)) {
            tj.field_b = var8.a((byte) -11);
            ad.field_a = var8.f(128);
            break L5;
          } else {
            if (-5 == (ln.field_c ^ -1)) {
              tj.field_b = var8.a((byte) -11);
              ad.field_a = var8.f(128);
              break L5;
            } else {
              tj.field_b = 0;
              ad.field_a = null;
              break L5;
            }
          }
        }
        L6: {
          if (!param0) {
            tj.field_a = hh.a((byte) -123, 80, var8);
            sd.field_P = null;
            break L6;
          } else {
            var5 = var8.a((byte) -11);
            try {
              L7: {
                L8: {
                  var9 = wm.field_k.a(1, var5);
                  tj.field_a = var9.h(33);
                  if (fd.field_p.equals(qe.field_V)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) ((Object) stackOut_23_0);
                    break L8;
                  } else {
                    stackOut_22_0 = var9.field_w;
                    stackIn_24_0 = stackOut_22_0;
                    break L8;
                  }
                }
                sd.field_P = stackIn_24_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ke.a((Throwable) ((Object) var6), "CC1", 0);
                sd.field_P = null;
                tj.field_a = null;
                break L9;
              }
            }
            break L6;
          }
        }
        return new tn(param0);
    }

    final static void h(int param0) {
        il discarded$0 = null;
        if (param0 != -14829) {
            discarded$0 = nb.i(-116);
        }
        hh.a(-20, lr.field_H);
    }

    final static il i(int param0) {
        try {
            Throwable var1 = null;
            il stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            il stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    nb.g(127);
                    break L1;
                  }
                }
                stackOut_2_0 = (il) (Class.forName("vk").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(tn param0, int param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_9_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param0.field_l != null) {
                L2: {
                  var5 = param0.field_l;
                  var2 = var5;
                  var2 = var5;
                  var2 = var5;
                  if (1 != param0.field_h) {
                    break L2;
                  } else {
                    var2 = "<img=0>" + var5;
                    break L2;
                  }
                }
                if (2 != param0.field_h) {
                  break L1;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = "";
            if (param1 > 6) {
              L3: {
                if (-3 != (param0.field_s ^ -1)) {
                  L4: {
                    if (param0.field_s != 0) {
                      break L4;
                    } else {
                      if (!fq.field_i) {
                        break L4;
                      } else {
                        var3 = "[" + fb.field_A + "] ";
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-2 != (param0.field_s ^ -1)) {
                      break L5;
                    } else {
                      var3 = "[" + Vertigo2.a(new String[]{param0.field_k}, ie.field_Rb, -117) + "] ";
                      break L5;
                    }
                  }
                  L6: {
                    if (-5 != (param0.field_s ^ -1)) {
                      break L6;
                    } else {
                      if (v.field_a != null) {
                        var3 = "[" + v.field_a + "] ";
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((param0.field_s ^ -1) == -4) {
                      var3 = "[#" + param0.field_k + "] ";
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (!param0.field_n) {
                    var3 = var3 + (String) (var2) + ": ";
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (!param0.field_n) {
                    L8: {
                      if (param0.field_o != 0) {
                        break L8;
                      } else {
                        if (param0.field_m == 0) {
                          var3 = Vertigo2.a(new String[]{(String) (var2)}, di.field_B, 70);
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3 = Vertigo2.a(new String[]{(String) (var2)}, af.field_L, -118);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_33_0 = (String) (var3);
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_8_0 = (String) null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = var2;
            stackOut_35_1 = new StringBuilder().append("nb.E(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = stackIn_37_0;
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_34_0;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (0 != var4_int) {
                break L1;
              } else {
                this.field_C = param2.a((byte) -11);
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                field_A = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("nb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void d(int param0, int param1) {
        tn discarded$2 = null;
        li var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hn var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (hn) ((Object) qo.field_B.a((byte) 100));
            L1: while (true) {
              if (var4 == null) {
                var2 = vf.field_C.a((byte) 100);
                L2: while (true) {
                  if (var2 == null) {
                    L3: {
                      if (param1 == -2) {
                        break L3;
                      } else {
                        discarded$2 = nb.a(false, (byte) 93);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    mp.a(param0, 98);
                    var2 = vf.field_C.b(36);
                    continue L2;
                  }
                }
              } else {
                lh.a(param0, var4, (byte) 81);
                var4 = (hn) ((Object) qo.field_B.b(45));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "nb.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = param4 + param0;
            if (param3 == -92) {
              var8 = param5 - param4;
              var11 = param0;
              L1: while (true) {
                if (var7_int <= var11) {
                  var9 = param4 + param6;
                  var10 = -param4 + param1;
                  var11 = param5;
                  L2: while (true) {
                    if (var8 >= var11) {
                      var11 = var7_int;
                      L3: while (true) {
                        if (var8 < var11) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var17 = vl.field_e[var11];
                          ki.a(-106, param6, var17, var9, param2);
                          ki.a(-128, var10, var17, param1, param2);
                          var11++;
                          continue L3;
                        }
                      }
                    } else {
                      ki.a(-81, param6, vl.field_e[var11], param1, param2);
                      var11--;
                      continue L2;
                    }
                  }
                } else {
                  ki.a(-101, param6, vl.field_e[var11], param1, param2);
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "nb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public nb() {
        super(0, true);
        this.field_C = 585;
    }

    public static void g(int param0) {
        field_F = null;
        field_y = null;
        field_D = null;
        field_A = null;
        field_E = null;
        field_B = null;
        if (param0 != 0) {
            cc var2 = (cc) null;
            nb.a(102, (cc) null, (cc) null, (byte) 77);
        }
    }

    static {
        field_E = "Select mode";
        field_z = true;
        field_F = new fd(0, 0);
        field_B = new ve(15, 0, 1, 0);
    }
}
