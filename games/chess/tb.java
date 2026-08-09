/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static tk field_f;
    static km field_c;
    static km field_a;
    static String field_e;
    static String field_b;
    static int field_d;

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 62) {
                break L1;
              } else {
                field_f = (tk) null;
                break L1;
              }
            }
            stackIn_3_0 = da.a(param1, -2, 0, param1.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("tb.A(").append(param0).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 >= -85) {
            return;
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(byte param0) {
        int var1 = 11 % ((param0 - 1) / 44);
        return true;
    }

    final static void a(int param0, boolean param1, boolean param2, byte param3) {
        ci stackIn_7_0 = null;
        ci stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ci stackIn_14_0 = null;
        ci stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ci stackIn_19_0 = null;
        ci stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ci stackIn_46_0 = null;
        ci stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        ci stackIn_53_0 = null;
        ci stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        ci stackIn_58_0 = null;
        ci stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int var4;
        var4 = 48 % ((param3 - -48) / 44);
        tf.a(90);
        if (0 <= fm.field_W) {
          L0: {
            L1: {
              fe.field_h.field_db = oc.a(hh.field_m, new String[]{Integer.toString(fm.field_W)}, (byte) -108);
              stackIn_46_0 = ql.field_d;

              if (!param2) {
                break L1;
              } else {
                stackIn_46_0 = (ci) ((Object) stackIn_46_0);

                if (param1) {
                  break L1;
                } else {
                  stackIn_46_0 = (ci) ((Object) stackIn_46_0);

                  if (fm.field_V) {
                    break L1;
                  } else {
                    stackIn_46_0 = (ci) ((Object) stackIn_46_0);

                    if (pd.field_Rb != null) {
                      break L1;
                    } else {
                      stackIn_46_0 = (ci) ((Object) stackIn_46_0);

                      if (ib.field_d != null) {
                        break L1;
                      } else {
                        stackIn_47_0 = (ci) ((Object) stackIn_46_0);
                        stackIn_47_1 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_47_0 = (ci) ((Object) stackIn_46_0);
            stackIn_47_1 = 0;
            break L0;
          }
          L2: {
            L3: {
              ((ci) (Object) stackIn_47_0).a(stackIn_47_1 != 0, (byte) 88);
              stackIn_53_0 = rb.field_c;

              if (!param2) {
                break L3;
              } else {
                stackIn_53_0 = (ci) ((Object) stackIn_53_0);

                if (param1) {
                  break L3;
                } else {
                  stackIn_53_0 = (ci) ((Object) stackIn_53_0);

                  if (fm.field_V) {
                    break L3;
                  } else {
                    stackIn_53_0 = (ci) ((Object) stackIn_53_0);

                    if (pd.field_Rb != null) {
                      break L3;
                    } else {
                      stackIn_53_0 = (ci) ((Object) stackIn_53_0);

                      if (null != ib.field_d) {
                        break L3;
                      } else {
                        stackIn_54_0 = (ci) ((Object) stackIn_53_0);
                        stackIn_54_1 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackIn_54_0 = (ci) ((Object) stackIn_53_0);
            stackIn_54_1 = 0;
            break L2;
          }
          L4: {
            L5: {
              ((ci) (Object) stackIn_54_0).a(stackIn_54_1 != 0, (byte) 88);
              stackIn_58_0 = la.field_c;

              if (!param2) {
                break L5;
              } else {
                stackIn_58_0 = (ci) ((Object) stackIn_58_0);

                if (param1) {
                  break L5;
                } else {
                  stackIn_58_0 = (ci) ((Object) stackIn_58_0);

                  if (!fm.field_V) {
                    break L5;
                  } else {
                    stackIn_59_0 = (ci) ((Object) stackIn_58_0);
                    stackIn_59_1 = 1;
                    break L4;
                  }
                }
              }
            }
            stackIn_59_0 = (ci) ((Object) stackIn_58_0);
            stackIn_59_1 = 0;
            break L4;
          }
          L6: {
            ((ci) (Object) stackIn_59_0).a(stackIn_59_1 != 0, (byte) 88);
            wf.field_W.field_a.f((byte) 109);
            if (-1 != (ln.field_cc.field_L ^ -1)) {
              tg.field_p = true;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (0 != si.field_l.field_L) {
              if (lf.field_U) {
                rh.a(0, param0);
                break L7;
              } else {
                if (0 < cl.field_d) {
                  rh.a(0, param0);
                  break L7;
                } else {
                  if (sk.field_t < 2) {
                    break L7;
                  } else {
                    if (ok.field_Jb[12]) {
                      rh.a(0, param0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            } else {
              break L7;
            }
          }
          L8: {
            if (-1 != (wj.field_g.field_L ^ -1)) {
              L9: {
                if (1 != wn.field_d.length) {
                  break L9;
                } else {
                  if (mk.field_c == wn.field_d[0]) {
                    break L9;
                  } else {
                    L10: {
                      mk.field_c = wn.field_d[0];
                      cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
                      if (-1 == (of.field_i.field_L ^ -1)) {
                        break L10;
                      } else {
                        fm.field_V = false;
                        break L10;
                      }
                    }
                    return;
                  }
                }
              }
              cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
              break L8;
            } else {
              break L8;
            }
          }
          if (-1 != (of.field_i.field_L ^ -1)) {
            fm.field_V = false;
            return;
          } else {
            return;
          }
        } else {
          L11: {
            L12: {
              fe.field_h.field_db = null;
              stackIn_7_0 = ql.field_d;

              if (!param2) {
                break L12;
              } else {
                stackIn_7_0 = (ci) ((Object) stackIn_7_0);

                if (param1) {
                  break L12;
                } else {
                  stackIn_7_0 = (ci) ((Object) stackIn_7_0);

                  if (fm.field_V) {
                    break L12;
                  } else {
                    stackIn_7_0 = (ci) ((Object) stackIn_7_0);

                    if (pd.field_Rb != null) {
                      break L12;
                    } else {
                      stackIn_7_0 = (ci) ((Object) stackIn_7_0);

                      if (ib.field_d != null) {
                        break L12;
                      } else {
                        stackIn_8_0 = (ci) ((Object) stackIn_7_0);
                        stackIn_8_1 = 1;
                        break L11;
                      }
                    }
                  }
                }
              }
            }
            stackIn_8_0 = (ci) ((Object) stackIn_7_0);
            stackIn_8_1 = 0;
            break L11;
          }
          L13: {
            L14: {
              ((ci) (Object) stackIn_8_0).a(stackIn_8_1 != 0, (byte) 88);
              stackIn_14_0 = rb.field_c;

              if (!param2) {
                break L14;
              } else {
                stackIn_14_0 = (ci) ((Object) stackIn_14_0);

                if (param1) {
                  break L14;
                } else {
                  stackIn_14_0 = (ci) ((Object) stackIn_14_0);

                  if (fm.field_V) {
                    break L14;
                  } else {
                    stackIn_14_0 = (ci) ((Object) stackIn_14_0);

                    if (pd.field_Rb != null) {
                      break L14;
                    } else {
                      stackIn_14_0 = (ci) ((Object) stackIn_14_0);

                      if (null != ib.field_d) {
                        break L14;
                      } else {
                        stackIn_15_0 = (ci) ((Object) stackIn_14_0);
                        stackIn_15_1 = 1;
                        break L13;
                      }
                    }
                  }
                }
              }
            }
            stackIn_15_0 = (ci) ((Object) stackIn_14_0);
            stackIn_15_1 = 0;
            break L13;
          }
          L15: {
            L16: {
              ((ci) (Object) stackIn_15_0).a(stackIn_15_1 != 0, (byte) 88);
              stackIn_19_0 = la.field_c;

              if (!param2) {
                break L16;
              } else {
                stackIn_19_0 = (ci) ((Object) stackIn_19_0);

                if (param1) {
                  break L16;
                } else {
                  stackIn_19_0 = (ci) ((Object) stackIn_19_0);

                  if (!fm.field_V) {
                    break L16;
                  } else {
                    stackIn_20_0 = (ci) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L15;
                  }
                }
              }
            }
            stackIn_20_0 = (ci) ((Object) stackIn_19_0);
            stackIn_20_1 = 0;
            break L15;
          }
          L17: {
            ((ci) (Object) stackIn_20_0).a(stackIn_20_1 != 0, (byte) 88);
            wf.field_W.field_a.f((byte) 109);
            if (-1 != (ln.field_cc.field_L ^ -1)) {
              tg.field_p = true;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (0 != si.field_l.field_L) {
              L19: {
                if (lf.field_U) {
                  break L19;
                } else {
                  if (0 < cl.field_d) {
                    break L19;
                  } else {
                    if (sk.field_t < 2) {
                      break L18;
                    } else {
                      if (ok.field_Jb[12]) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              }
              rh.a(0, param0);
              break L18;
            } else {
              break L18;
            }
          }
          L20: {
            if (-1 != (wj.field_g.field_L ^ -1)) {
              L21: {
                if (1 != wn.field_d.length) {
                  break L21;
                } else {
                  if (mk.field_c == wn.field_d[0]) {
                    break L21;
                  } else {
                    mk.field_c = wn.field_d[0];
                    break L21;
                  }
                }
              }
              cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
              break L20;
            } else {
              break L20;
            }
          }
          L22: {
            if (-1 == (of.field_i.field_L ^ -1)) {
              break L22;
            } else {
              fm.field_V = false;
              break L22;
            }
          }
          return;
        }
    }

    final static void a(int param0, lh param1, int param2, km[] param3, lh param4, int param5, km[] param6, int param7, int param8, int param9, int param10, km[] param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            if (param2 == -26472) {
              wj.a(new le(param11), param13, param17, new le(param6), param18, param8, param7, param15, param14, param10, param5, param4, param9, new le(param3), param2 ^ 26425, param19, param0, param12, param1, param20, param16);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("tb.E(").append(param0).append(',');

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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_b = "Remove <%0> from ignore list";
        field_d = 0;
    }
}
