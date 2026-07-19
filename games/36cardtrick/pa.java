/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends dg {
    static String field_N;
    private int field_R;
    private ba field_O;
    private kc field_Q;
    private String field_P;

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param0.getCodeBase(), param1);
                    var3 = fh.a(param0, var3, -1);
                    bk.a(param0, -25573, var3.toString(), true);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param2 < -5) {
                    break L3;
                  } else {
                    pa.f((byte) -124);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("pa.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            this.field_R = this.field_R + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pa.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(String param0, jk param1, jk param2, int param3, int param4, int param5, boolean param6) {
        boolean discarded$1 = false;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_5_0 = 0;
        pb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        pb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        pb stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        pb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        pb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        pb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        pb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        pb stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        int stackOut_33_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var13 = Main.field_T;
        try {
          L0: {
            L1: {
              var14 = param1.a(0);
              var8 = param2.a(0);
              if (null == cb.field_j) {
                if (md.a(100, false)) {
                  break L1;
                } else {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (vf.field_a != ra.field_b) {
                break L2;
              } else {
                L3: {
                  ni.field_f = null;
                  na.field_r.field_i = 0;
                  if (param0 != null) {
                    L4: {
                      var9 = 0;
                      gh.field_h.field_i = 0;
                      if (param6) {
                        var9 = var9 | 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      gh.field_h.a(-246, pg.field_a.nextInt());
                      gh.field_h.a(-246, pg.field_a.nextInt());
                      gh.field_h.a(744825352, var14);
                      gh.field_h.a(744825352, var8);
                      var15 = (CharSequence) ((Object) param0);
                      gh.field_h.a(744825352, sh.a(var15, (byte) -128));
                      gh.field_h.e(param3, 26040);
                      gh.field_h.b(param5 ^ -9455, param4);
                      gh.field_h.b(-9469, var9);
                      na.field_r.b(-9469, 18);
                      na.field_r.field_i = na.field_r.field_i + 2;
                      var10 = na.field_r.field_i;
                      var11_ref_String = bi.a((byte) -27, mk.g(-119));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    na.field_r.a(var11_ref_String, 19235);
                    lf.a(wd.field_c, na.field_r, id.field_c, (byte) -75, gh.field_h);
                    na.field_r.d(na.field_r.field_i + -var10, -27308);
                    break L3;
                  } else {
                    L6: {
                      gh.field_h.field_i = 0;
                      gh.field_h.a(-246, pg.field_a.nextInt());
                      gh.field_h.a(param5 + -264, pg.field_a.nextInt());
                      stackOut_8_0 = gh.field_h;
                      stackOut_8_1 = 744825352;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!param1.b(true)) {
                        stackOut_10_0 = (pb) ((Object) stackIn_10_0);
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = "";
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L6;
                      } else {
                        stackOut_9_0 = (pb) ((Object) stackIn_9_0);
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (String) (var14);
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((pb) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                      stackOut_11_0 = gh.field_h;
                      stackOut_11_1 = 744825352;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (param2.b(true)) {
                        stackOut_13_0 = (pb) ((Object) stackIn_13_0);
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) (var8);
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L7;
                      } else {
                        stackOut_12_0 = (pb) ((Object) stackIn_12_0);
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = "";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L7;
                      }
                    }
                    ((pb) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2);
                    na.field_r.b(-9469, 16);
                    na.field_r.field_i = na.field_r.field_i + 1;
                    var9 = na.field_r.field_i;
                    lf.a(wd.field_c, na.field_r, id.field_c, (byte) -75, gh.field_h);
                    na.field_r.f(na.field_r.field_i - var9, 8049);
                    break L3;
                  }
                }
                fe.a((byte) -97, -1);
                ra.field_b = kg.field_c;
                break L2;
              }
            }
            L8: {
              if (kg.field_c == ra.field_b) {
                if (!r.a(1, (byte) 122)) {
                  break L8;
                } else {
                  L9: {
                    var9 = rd.field_j.f(72);
                    rd.field_j.field_i = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L9;
                    } else {
                      if (105 < var9) {
                        break L9;
                      } else {
                        ll.field_f = new String[var9 - 100];
                        ra.field_b = ta.field_eb;
                        break L8;
                      }
                    }
                  }
                  if (-249 == (var9 ^ -1)) {
                    wf.a((byte) -83, mk.g(-126));
                    e.field_a = qk.field_i;
                    mc.a((byte) -127);
                    lk.field_w = false;
                    stackOut_33_0 = var9;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var9 != 99) {
                      ra.field_b = kb.field_a;
                      al.field_a = -1;
                      pd.field_l = var9;
                      break L8;
                    } else {
                      discarded$1 = r.a(ia.b(param5 + -23), (byte) 119);
                      ni.field_f = new Boolean(tg.a(-2, rd.field_j));
                      rd.field_j.field_i = 0;
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (ta.field_eb != ra.field_b) {
                break L10;
              } else {
                var9 = 2;
                if (r.a(var9, (byte) 120)) {
                  var10 = rd.field_j.d((byte) 72);
                  rd.field_j.field_i = 0;
                  if (!r.a(var10, (byte) 124)) {
                    break L10;
                  } else {
                    var11 = ll.field_f.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        mc.a((byte) -125);
                        lk.field_w = false;
                        stackOut_42_0 = 100 - -var11;
                        stackIn_43_0 = stackOut_42_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        ll.field_f[var12] = rd.field_j.d(-74);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (kb.field_a != ra.field_b) {
                break L12;
              } else {
                if (gl.a(false)) {
                  L13: {
                    if (255 != pd.field_l) {
                      e.field_a = rd.field_j.c(false);
                      break L13;
                    } else {
                      var9_ref_String = rd.field_j.f((byte) 29);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        lk.a(mk.g(param5 + -146), 0, var9_ref_String);
                        break L13;
                      }
                    }
                  }
                  mc.a((byte) -128);
                  lk.field_w = false;
                  stackOut_51_0 = pd.field_l;
                  stackIn_52_0 = stackOut_51_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L12;
                }
              }
            }
            L14: {
              if (cb.field_j != null) {
                break L14;
              } else {
                if (lk.field_w) {
                  L15: {
                    if ((we.a((byte) 79) ^ -1L) < -30001L) {
                      e.field_a = jf.field_k;
                      break L15;
                    } else {
                      e.field_a = e.field_f;
                      break L15;
                    }
                  }
                  lk.field_w = false;
                  stackOut_59_0 = 249;
                  stackIn_60_0 = stackOut_59_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = ag.field_e;
                  ag.field_e = hj.field_l;
                  hj.field_l = var9;
                  lk.field_w = true;
                  break L14;
                }
              }
            }
            L16: {
              if (param5 == 18) {
                break L16;
              } else {
                field_N = (String) null;
                break L16;
              }
            }
            stackOut_63_0 = -1;
            stackIn_64_0 = stackOut_63_0;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var7);
            stackOut_65_1 = new StringBuilder().append("pa.F(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_52_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_60_0;
                } else {
                  return stackIn_64_0;
                }
              }
            }
          }
        }
    }

    final static ic a(byte[] param0, int param1) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ic stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  field_N = (String) null;
                  break L1;
                }
              }
              var2 = new ic(param0, kb.field_c, ml.field_b, na.field_q, hb.field_a, jf.field_i, rd.field_k);
              rh.d(-41);
              stackOut_5_0 = (ic) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("pa.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ic) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    pa(ba param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, dj.b(31959));
        try {
            this.field_O = param0;
            this.field_P = param1;
            this.a(param5, param3, param4, param2, true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(byte param0) {
        if (param0 == -79) {
            return null;
        }
        return (String) null;
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 > 71) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_O = (ba) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pa.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void i(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        w var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        w var11 = null;
        int[] var12 = null;
        rc var13 = null;
        rc var14 = null;
        dh var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          L0: {
            L1: {
              var11 = rd.field_j;
              var2 = var11.f(param0 ^ -121);
              if (var2 != param0) {
                if (-2 == (var2 ^ -1)) {
                  var15 = (dh) ((Object) vb.field_c.a((byte) 74));
                  if (var15 == null) {
                    mc.a((byte) -128);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var15.c(param0 ^ 121);
                    break L1;
                  }
                } else {
                  if ((var2 ^ -1) != -3) {
                    k.a((Throwable) null, (byte) 70, "A1: " + aj.a((byte) 92));
                    mc.a((byte) -128);
                    break L1;
                  } else {
                    var14 = (rc) ((Object) ue.field_b.a((byte) 74));
                    if (var14 != null) {
                      var14.field_p = eg.a(85);
                      var14.field_h = var14.field_p[0];
                      var14.field_j = true;
                      var14.c(118);
                      break L1;
                    } else {
                      mc.a((byte) -126);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                var10 = eg.a(-60);
                var16 = var10;
                var12 = var16;
                var3 = var12;
                var9 = var10;
                var4 = var9;
                var5 = var11;
                var6 = ((pb) ((Object) var5)).f(-124);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var13 = (rc) ((Object) ue.field_b.a((byte) 74));
                    if (var13 == null) {
                      mc.a((byte) -127);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var13.field_p = var3;
                      var13.field_j = true;
                      var13.field_h = var16[0];
                      var13.c(87);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((pb) ((Object) var5)).e((byte) 127);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "pa.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void f(byte param0) {
        if (param0 >= -47) {
            return;
        }
        field_N = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        String var5 = null;
        sg var6 = null;
        ne var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        lk var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        L0: {
          L1: {
            var13 = Main.field_T;
            var6 = this.field_O.a(true);
            if (var6 == tb.field_b) {
              break L1;
            } else {
              if (var6 != a.field_n) {
                var5 = this.field_O.b(param2 ^ -26767);
                if (var5 == null) {
                  var5 = this.field_P;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = n.field_C;
          break L0;
        }
        L2: {
          if (var5.equals(this.field_r)) {
            break L2;
          } else {
            this.field_r = var5;
            this.e((byte) 5);
            break L2;
          }
        }
        L3: {
          super.a(param0, param1, param2 ^ 0, param3);
          var6 = this.field_O.a(true);
          var8 = (ne) ((Object) this.field_v);
          var9 = this.field_o + param0;
          var10 = var8.a((lk) (this), -1815612287, param1) - -(var8.a((byte) 92, (lk) (this)).b(0) >> -1542173183);
          if (param2 == -1) {
            break L3;
          } else {
            var14 = (lk) null;
            discarded$1 = this.a(-10, (lk) null);
            break L3;
          }
        }
        L4: {
          L5: {
            if (tb.field_b == var6) {
              break L5;
            } else {
              if (a.field_n == var6) {
                break L5;
              } else {
                if (pe.field_b == var6) {
                  var16 = gh.field_n[2];
                  var16.b(var9, -(var16.field_o >> -820729919) + var10, 256);
                  break L4;
                } else {
                  if (ii.field_e != var6) {
                    break L4;
                  } else {
                    var15 = gh.field_n[1];
                    var15.b(var9, -(var15.field_o >> 286077697) + var10, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L6: {
            L7: {
              var17 = gh.field_n[0];
              var11 = var17.field_l << 694707649;
              var12 = var17.field_k << 235294849;
              if (this.field_Q == null) {
                break L7;
              } else {
                if (var11 > this.field_Q.field_p) {
                  break L7;
                } else {
                  if (var12 > this.field_Q.field_o) {
                    break L7;
                  } else {
                    dl.a(-60, this.field_Q);
                    vj.d();
                    break L6;
                  }
                }
              }
            }
            this.field_Q = new kc(var11, var12);
            dl.a(-33, this.field_Q);
            break L6;
          }
          var17.a(112, 144, var17.field_l << 2055347236, var17.field_k << -331014396, -this.field_R << 1030662410, 4096);
          gg.a(14756);
          this.field_Q.b(var9 + -(var17.field_l >> -2022163295), var10 + -var17.field_k, 256);
          break L4;
        }
    }

    static {
        field_N = "Unfortunately you are not eligible to create an account.";
    }
}
