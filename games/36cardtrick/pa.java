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
                    int discarded$2 = -1;
                    var3 = fh.a(param0, var3);
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
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("pa.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            ((pa) this).field_R = ((pa) this).field_R + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pa.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static int a(String param0, jk param1, jk param2, int param3, int param4, int param5, boolean param6) {
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
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
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
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
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
                  return stackIn_5_0;
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
                      var15 = (CharSequence) (Object) param0;
                      gh.field_h.a(744825352, sh.a(var15, (byte) -128));
                      gh.field_h.e(param3, 26040);
                      gh.field_h.b(-9469, param4);
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
                    lf.a(wd.field_c, (pb) (Object) na.field_r, id.field_c, (byte) -75, gh.field_h);
                    na.field_r.d(na.field_r.field_i + -var10, -27308);
                    break L3;
                  } else {
                    L6: {
                      gh.field_h.field_i = 0;
                      gh.field_h.a(-246, pg.field_a.nextInt());
                      gh.field_h.a(-246, pg.field_a.nextInt());
                      stackOut_8_0 = gh.field_h;
                      stackOut_8_1 = 744825352;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (!param1.b(true)) {
                        stackOut_10_0 = (pb) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = "";
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L6;
                      } else {
                        stackOut_9_0 = (pb) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = (String) var14;
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
                        stackOut_13_0 = (pb) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) var8;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L7;
                      } else {
                        stackOut_12_0 = (pb) (Object) stackIn_12_0;
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
                    lf.a(wd.field_c, (pb) (Object) na.field_r, id.field_c, (byte) -75, gh.field_h);
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
                    if (var9 < 100) {
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
                  if (var9 == 248) {
                    wf.a((byte) -83, mk.g(-126));
                    e.field_a = qk.field_i;
                    mc.a((byte) -127);
                    lk.field_w = false;
                    stackOut_33_0 = var9;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  } else {
                    if (var9 != 99) {
                      ra.field_b = kb.field_a;
                      al.field_a = -1;
                      pd.field_l = var9;
                      break L8;
                    } else {
                      int discarded$3 = -5;
                      boolean discarded$4 = r.a(ia.b(), (byte) 119);
                      ni.field_f = new Boolean(tg.a(-2, (pb) (Object) rd.field_j));
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
                        return stackIn_43_0;
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
                        lk.a(mk.g(-128), 0, var9_ref_String);
                        break L13;
                      }
                    }
                  }
                  mc.a((byte) -128);
                  lk.field_w = false;
                  stackOut_51_0 = pd.field_l;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
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
                    int discarded$5 = 79;
                    if (we.a() > 30000L) {
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
                  return stackIn_60_0;
                } else {
                  var9 = ag.field_e;
                  ag.field_e = hj.field_l;
                  hj.field_l = var9;
                  lk.field_w = true;
                  break L14;
                }
              }
            }
            stackOut_61_0 = -1;
            stackIn_62_0 = stackOut_61_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("pa.F(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L16;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L16;
            }
          }
          L17: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L17;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L17;
            }
          }
          L18: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param3 + 44 + param4 + 44 + 18 + 44 + param6 + 41);
        }
        return stackIn_62_0;
    }

    final static ic a(byte[] param0) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ic stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              var2 = new ic(param0, kb.field_c, ml.field_b, na.field_q, hb.field_a, jf.field_i, rd.field_k);
              rh.d(-41);
              stackOut_3_0 = (ic) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ic) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("pa.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -1 + 41);
        }
        return stackIn_4_0;
    }

    pa(ba param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ci) (Object) dj.b());
        int discarded$0 = 31959;
        try {
            ((pa) this).field_O = param0;
            ((pa) this).field_P = param1;
            ((pa) this).a(param5, param3, param4, param2, true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final String b(byte param0) {
        if (param0 == -79) {
            return null;
        }
        return null;
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
              ((pa) this).field_O = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pa.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void i() {
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
        dh var11 = null;
        w var12 = null;
        int[] var13 = null;
        rc var14 = null;
        rc var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Main.field_T;
        try {
          L0: {
            L1: {
              var12 = rd.field_j;
              var2 = var12.f(-121);
              if (var2 != 0) {
                if (var2 == 1) {
                  var11 = (dh) (Object) vb.field_c.a((byte) 74);
                  if (var11 == null) {
                    mc.a((byte) -128);
                    return;
                  } else {
                    var11.c(121);
                    break L1;
                  }
                } else {
                  if (var2 != 2) {
                    int discarded$1 = 92;
                    k.a((Throwable) null, (byte) 70, "A1: " + aj.a());
                    mc.a((byte) -128);
                    break L1;
                  } else {
                    var15 = (rc) (Object) ue.field_b.a((byte) 74);
                    if (var15 != null) {
                      var15.field_p = eg.a(85);
                      var15.field_h = var15.field_p[0];
                      var15.field_j = true;
                      var15.c(118);
                      break L1;
                    } else {
                      mc.a((byte) -126);
                      return;
                    }
                  }
                }
              } else {
                var10 = eg.a(-60);
                var18 = var10;
                var17 = var18;
                var16 = var17;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((pb) (Object) var5).f(-124);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var14 = (rc) (Object) ue.field_b.a((byte) 74);
                    if (var14 == null) {
                      mc.a((byte) -127);
                      return;
                    } else {
                      var14.field_p = var3;
                      var14.field_j = true;
                      var14.field_h = var18[0];
                      var14.c(87);
                      break L1;
                    }
                  } else {
                    var9[var7] = ((pb) (Object) var5).e((byte) 127);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "pa.C(" + 0 + 41);
        }
    }

    public static void f(byte param0) {
        if (param0 >= -47) {
            return;
        }
        field_N = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        sg var6 = null;
        ne var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        L0: {
          L1: {
            var13 = Main.field_T;
            var6 = ((pa) this).field_O.a(true);
            if (var6 == tb.field_b) {
              break L1;
            } else {
              if (var6 != a.field_n) {
                var5 = ((pa) this).field_O.b(param2 ^ -26767);
                if (var5 == null) {
                  var5 = ((pa) this).field_P;
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
          if (var5.equals((Object) (Object) ((pa) this).field_r)) {
            break L2;
          } else {
            ((pa) this).field_r = var5;
            ((pa) this).e((byte) 5);
            break L2;
          }
        }
        L3: {
          super.a(param0, param1, param2, param3);
          var6 = ((pa) this).field_O.a(true);
          var8 = (ne) (Object) ((pa) this).field_v;
          var9 = ((pa) this).field_o + param0;
          var10 = var8.a((lk) this, -1815612287, param1) - -(var8.a((byte) 92, (lk) this).b(0) >> 1);
          if (param2 == -1) {
            break L3;
          } else {
            var14 = null;
            boolean discarded$1 = ((pa) this).a(-10, (lk) null);
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
                  var16.b(var9, -(var16.field_o >> 1) + var10, 256);
                  break L4;
                } else {
                  if (ii.field_e != var6) {
                    break L4;
                  } else {
                    var15 = gh.field_n[1];
                    var15.b(var9, -(var15.field_o >> 1) + var10, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L6: {
            L7: {
              var17 = gh.field_n[0];
              var11 = var17.field_l << 1;
              var12 = var17.field_k << 1;
              if (((pa) this).field_Q == null) {
                break L7;
              } else {
                if (var11 > ((pa) this).field_Q.field_p) {
                  break L7;
                } else {
                  if (var12 > ((pa) this).field_Q.field_o) {
                    break L7;
                  } else {
                    dl.a(-60, ((pa) this).field_Q);
                    vj.d();
                    break L6;
                  }
                }
              }
            }
            ((pa) this).field_Q = new kc(var11, var12);
            dl.a(-33, ((pa) this).field_Q);
            break L6;
          }
          var17.a(112, 144, var17.field_l << 4, var17.field_k << 4, -((pa) this).field_R << 10, 4096);
          gg.a(14756);
          ((pa) this).field_Q.b(var9 + -(var17.field_l >> 1), var10 + -var17.field_k, 256);
          break L4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Unfortunately you are not eligible to create an account.";
    }
}
