/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    int field_f;
    static String field_b;
    private int field_d;
    static int field_g;
    private int field_l;
    private int field_a;
    int field_h;
    static int field_k;
    private int field_j;
    private int field_c;
    static ci field_i;
    boolean field_e;

    final void b(byte param0) {
        this.field_a = 0;
        if (param0 > -2) {
            return;
        }
        this.field_l = 0;
        this.field_j = 0;
        if (!(0 != this.field_c)) {
            this.field_j = vg.field_a;
        }
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            this.a(61, -108, 32);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_l ^ -1) == -2) {
              break L2;
            } else {
              if ((this.field_j ^ -1) == -98) {
                break L2;
              } else {
                if (this.field_j == 84) {
                  break L2;
                } else {
                  if (-84 != (this.field_j ^ -1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        if (param2 < this.field_f) {
          if (this.field_f <= param0) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              if (param1 == 99) {
                break L0;
              } else {
                discarded$1 = this.b(false);
                break L0;
              }
            }
            L1: {
              this.field_l = 0;
              this.field_a = 0;
              this.field_j = 0;
              if (-1 == (th.field_d ^ -1)) {
                break L1;
              } else {
                this.field_e = true;
                this.field_d = ji.field_R;
                this.field_l = th.field_d;
                this.field_a = th.field_d;
                this.field_h = param0;
                this.field_c = th.field_d;
                break L1;
              }
            }
            L2: {
              if (this.field_c == 0) {
                if (-1 != (th.field_d ^ -1)) {
                  break L2;
                } else {
                  if (0 != wh.field_f) {
                    break L2;
                  } else {
                    this.field_c = 0;
                    break L2;
                  }
                }
              } else {
                if (-1 != (th.field_d ^ -1)) {
                  break L2;
                } else {
                  if (0 != wh.field_f) {
                    break L2;
                  } else {
                    this.field_c = 0;
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (this.field_c != 0) {
                break L3;
              } else {
                L4: {
                  if (this.field_e) {
                    break L4;
                  } else {
                    if (lf.field_O) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((param2 ^ -1) > -1) {
                  if (this.field_e) {
                    this.field_h = -1;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  L5: {
                    if (param2 == this.field_h) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  this.field_h = param2;
                  this.field_e = true;
                  break L3;
                }
              }
            }
            return;
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.a(-1, param4, param2, param1, rf.field_b, hn.field_k, param3);
        int var7 = this.a(param0 + -62, param4, param2, param1, ag.field_f, re.field_m, param3);
        if (param0 != 61) {
            this.a(-57, 37, false, 100);
        }
        this.a(var7, 99, var6);
    }

    final boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if ((this.field_l ^ -1) == -3) {
                break L1;
              } else {
                if (this.field_j != 96) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 97) {
            this.field_e = false;
        }
        return this.field_j == 97 ? true : false;
    }

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        nk var5 = null;
        int var6 = 0;
        ve var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var8 = (CharSequence) ((Object) param2);
            if (ed.a(var8, 21257)) {
              if (2 != ld.field_g) {
                stackOut_5_0 = vf.field_e;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var7 = hh.a(param3 + -15023, param0);
                if (var7 == null) {
                  stackOut_9_0 = oc.a(tl.field_Ib, new String[]{param0}, (byte) -90);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var7.c(-2193);
                  var7.d(param3);
                  wc.field_v = wc.field_v - 1;
                  var5 = qn.field_U;
                  var5.f(param1, -123);
                  var5.field_l = var5.field_l + 1;
                  var6 = var5.field_l;
                  var5.c(3, (byte) -112);
                  var5.a(-120, param2);
                  var5.a(var5.field_l + -var6, -1);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = qj.field_a;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("of.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_12_0);
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$0 = false;
        if (param0 != -1) {
            discarded$0 = this.c(-39);
        }
        if (param3 <= param5) {
            if (param5 < param2) {
                if (param4 >= param1) {
                    if (!(param6 * this.field_f + param1 <= param4)) {
                        return (-param1 + param4) / param6;
                    }
                }
            }
        }
        return -1;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_c = param3;
        this.field_e = param2 ? true : false;
        if (!this.field_e) {
            this.field_h = param0;
        } else {
            this.field_h = param1;
        }
    }

    final void c(byte param0) {
        int var2 = -119 % ((param0 - 78) / 32);
        this.field_l = 0;
        this.field_j = 0;
        this.field_a = 0;
        if (-1 == (this.field_c ^ -1)) {
            if (vg.field_a == 98) {
                if (this.field_h <= 0) {
                    this.field_h = this.field_f;
                }
                this.field_e = false;
                this.field_h = this.field_h - 1;
            }
        }
        if (!(-1 != (this.field_c ^ -1))) {
            this.field_j = vg.field_a;
        }
        if (this.field_c == 0) {
            if (!(99 != vg.field_a)) {
                this.field_h = this.field_h + 1;
                if (!(this.field_h < this.field_f)) {
                    this.field_h = 0;
                }
                this.field_e = false;
            }
        }
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String discarded$2 = null;
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var7 = Chess.field_G;
            try {
              L0: {
                if (ih.field_U) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        if (param1 > 61) {
                          break L2;
                        } else {
                          var8 = (String) null;
                          discarded$2 = of.a((String) null, 68, (String) null, 35);
                          break L2;
                        }
                      }
                      var2 = "tuhstatbut";
                      var3 = (String) (u.a(true, "getcookies", param0));
                      var4 = gl.a((byte) -118, ';', var3);
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackOut_11_0 = 1;
                                stackIn_12_0 = stackOut_11_0;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L6;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) (var2_ref2);
                stackOut_20_1 = new StringBuilder().append("of.S(");
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param0 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        if (param0 != 94) {
            return false;
        }
        return -103 == (this.field_j ^ -1) ? true : false;
    }

    final static void d(int param0) {
        uk.field_e = false;
        ei.field_u = 0;
        eg.field_j = null;
        if (param0 != -103) {
            return;
        }
        vn.field_Db = -1;
        fm.field_S = -1;
    }

    final boolean b(boolean param0) {
        if (param0) {
            return true;
        }
        return (this.field_c ^ -1) != -1 ? true : false;
    }

    final boolean d(byte param0) {
        boolean discarded$2 = false;
        java.applet.Applet var3 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 > 31) {
            break L0;
          } else {
            var3 = (java.applet.Applet) null;
            discarded$2 = of.a((java.applet.Applet) null, (byte) -89);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_a) {
              break L2;
            } else {
              if (-85 == (this.field_j ^ -1)) {
                break L2;
              } else {
                if (83 != this.field_j) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public static void c(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_i = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = -11 % ((-59 - param1) / 63);
        cf.a(83, true, param0);
    }

    final boolean a(int param0) {
        if (param0 != -97) {
            this.field_e = false;
        }
        return (this.field_j ^ -1) == -97 ? true : false;
    }

    final static String a(int param0, int param1, String param2) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        java.applet.Applet var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_17_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_35_0 = null;
        String stackOut_39_0 = null;
        String stackOut_27_0 = null;
        String stackOut_20_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (1 == param0) {
              stackOut_2_0 = oc.a(ch.field_eb, new String[]{param2}, (byte) -93);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) != -3) {
                if (param0 != 3) {
                  L1: {
                    if (param1 == -26564) {
                      break L1;
                    } else {
                      var4 = (java.applet.Applet) null;
                      discarded$1 = of.a((java.applet.Applet) null, (byte) 31);
                      break L1;
                    }
                  }
                  if ((param0 ^ -1) != -5) {
                    if (5 == param0) {
                      stackOut_17_0 = oc.a(dl.field_h, new String[]{param2}, (byte) -56);
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param0 ^ -1) != -7) {
                        if (7 == param0) {
                          stackOut_24_0 = oc.a(ih.field_V, new String[]{param2}, (byte) -64);
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((param0 ^ -1) != -9) {
                            if (11 == param0) {
                              stackOut_31_0 = oc.a(sk.field_o, new String[]{param2}, (byte) -64);
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (param0 == 12) {
                                stackOut_35_0 = oc.a(he.field_Lb, new String[]{param2}, (byte) -85);
                                stackIn_36_0 = stackOut_35_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (param0 == 13) {
                                  stackOut_39_0 = oc.a(gf.field_c, new String[]{param2}, (byte) -121);
                                  stackIn_40_0 = stackOut_39_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              }
                            }
                          } else {
                            stackOut_27_0 = oc.a(n.field_a, new String[]{param2}, (byte) -47);
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackOut_20_0 = oc.a(wc.field_y, new String[]{param2}, (byte) -93);
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_13_0 = oc.a(bl.field_b, new String[]{param2}, (byte) -79);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = oc.a(ng.field_a, new String[]{param2}, (byte) -121);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = oc.a(ii.field_S, new String[]{param2}, (byte) -83);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("of.M(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L2;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_36_0;
                          } else {
                            return stackIn_40_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return 103 == this.field_j ? true : false;
    }

    of(int param0) {
        this.field_h = 0;
        this.field_e = false;
        this.field_f = param0;
    }

    static {
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
