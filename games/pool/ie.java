/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_c;
    static int[] field_d;
    static int field_g;
    static String field_i;
    static String field_e;
    static String field_b;
    static int field_h;
    static int[][] field_a;
    static jg field_f;

    final static void a(boolean param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        lk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        lk stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        aa var7 = null;
        lk var8 = null;
        try {
          L0: {
            if (!ne.field_r.c(0)) {
              L1: {
                var3_int = param0 ? 1 : 0;
                var4 = 0;
                var5 = 0;
                var6 = ((lk) ((Object) ne.field_r.c((byte) 63))).field_n;
                if (var6 == null) {
                  break L1;
                } else {
                  L2: {
                    param1 = param1 - (var6.field_A >> 1705922497);
                    if (gg.field_f < param1) {
                      break L2;
                    } else {
                      if (wn.field_i < param2) {
                        break L2;
                      } else {
                        if (230 + param2 < wn.field_i) {
                          break L2;
                        } else {
                          if (gg.field_f <= param1 - -var6.field_A) {
                            L3: {
                              if (eq.field_W != -1) {
                                var5 = -wn.field_i + eq.field_W;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            eq.field_W = wn.field_i;
                            var3_int = 1;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  eq.field_W = -1;
                  break L1;
                }
              }
              var7 = new aa(ne.field_r);
              var8 = (lk) ((Object) var7.b((byte) -92));
              L4: while (true) {
                L5: {
                  L6: {
                    if (var8 == null) {
                      break L6;
                    } else {
                      if (var4 >= 230) {
                        break L6;
                      } else {
                        if (var8.field_n == null) {
                          var8.c(-1);
                          break L5;
                        } else {
                          L7: {
                            stackIn_21_0 = (lk) (var8);

                            stackIn_21_1 = var8.field_p;

                            if (var3_int != 0) {
                              stackIn_22_0 = (lk) ((Object) stackIn_21_0);
                              stackIn_22_1 = stackIn_21_1;
                              stackIn_22_2 = var5;
                              break L7;
                            } else {
                              stackIn_22_0 = (lk) ((Object) stackIn_21_0);
                              stackIn_22_1 = stackIn_21_1;
                              stackIn_22_2 = var8.field_q;
                              break L7;
                            }
                          }
                          L8: {
                            stackIn_22_0.field_p = stackIn_22_1 - stackIn_22_2;
                            if (var8.field_p >= -var8.field_n.field_z) {
                              break L8;
                            } else {
                              fieldTemp$0 = var8.field_l - 1;
                              var8.field_l = var8.field_l - 1;
                              if (-1 == (fieldTemp$0 ^ -1)) {
                                var8.a((byte) -117);
                                break L8;
                              } else {
                                var8.field_p = var8.field_p + (4 + var8.field_n.field_z);
                                break L8;
                              }
                            }
                          }
                          var4 = var8.field_l * (4 + var8.field_n.field_z) + var8.field_p;
                          var8 = (lk) ((Object) var7.b(-86));
                          continue L4;
                        }
                      }
                    }
                  }
                  break L5;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "ie.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int stackIn_2_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                if (!iq.field_j) {
                  try {
                    L1: {
                      L2: {
                        if (param0 == 28) {
                          break L2;
                        } else {
                          ie.a(true, true, -103, -121);
                          break L2;
                        }
                      }
                      var2 = "tuhstatbut";
                      var3 = (String) (mo.a((byte) -88, "getcookies", param1));
                      var4 = jc.a(30634, var3, ';');
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackIn_10_0 = 1;
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
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_17_0 = 0;
                        break L6;
                      } else {
                        stackIn_17_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_2_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2_ref2);

                stackIn_20_1 = new StringBuilder().append("ie.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L7;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L7;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int[] param1, eg param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2656) {
                break L1;
              } else {
                ie.a(true, -83, -119);
                break L1;
              }
            }
            L2: {
              d.a(param2, -23109);
              param1[0] = (int)Math.ceil((double)(param2.field_w + -param2.field_D) / ((double)nc.field_Y.length / 2.5));
              param1[1] = (int)Math.ceil((double)(param2.field_S + -param2.field_y) / ((double)nc.field_Y.length / 2.5));
              param1[2] = (int)Math.ceil((double)(param2.field_x + -param2.field_V) / ((double)nc.field_Y.length / 2.5));
              if (0 == param1[1]) {
                param1[1] = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1[2] == 0) {
                param1[2] = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1[0] == 0) {
                param1[0] = 1;
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ie.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 != -13) {
            return;
        }
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = (int[][]) null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        rg.a(tk.field_i, kj.field_j, param0, param1, param2 + 21166, ad.field_x, param3);
        if (param2 != -17156) {
            field_b = (String) null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        vh stackIn_9_0 = null;
        vh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vh stackIn_16_0 = null;
        vh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vh stackIn_21_0 = null;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        L0: {
          qi.a((byte) -100);
          if (-1 >= (mg.field_d ^ -1)) {
            pm.field_m.field_nb = nr.a(new String[]{Integer.toString(mg.field_d)}, -1, m.field_a);
            break L0;
          } else {
            pm.field_m.field_nb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackIn_9_0 = ir.field_a;

            if (!param1) {
              break L2;
            } else {
              stackIn_9_0 = (vh) ((Object) stackIn_9_0);

              if (param0) {
                break L2;
              } else {
                stackIn_9_0 = (vh) ((Object) stackIn_9_0);

                if (tf.field_d) {
                  break L2;
                } else {
                  stackIn_9_0 = (vh) ((Object) stackIn_9_0);

                  if (em.field_L != null) {
                    break L2;
                  } else {
                    stackIn_9_0 = (vh) ((Object) stackIn_9_0);

                    if (tp.field_e != null) {
                      break L2;
                    } else {
                      stackIn_10_0 = (vh) ((Object) stackIn_9_0);
                      stackIn_10_1 = 1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackIn_10_0 = (vh) ((Object) stackIn_9_0);
          stackIn_10_1 = 0;
          break L1;
        }
        L3: {
          L4: {
            ((vh) (Object) stackIn_10_0).a(stackIn_10_1 != 0, false);
            stackIn_16_0 = oi.field_n;

            if (!param1) {
              break L4;
            } else {
              stackIn_16_0 = (vh) ((Object) stackIn_16_0);

              if (param0) {
                break L4;
              } else {
                stackIn_16_0 = (vh) ((Object) stackIn_16_0);

                if (tf.field_d) {
                  break L4;
                } else {
                  stackIn_16_0 = (vh) ((Object) stackIn_16_0);

                  if (em.field_L != null) {
                    break L4;
                  } else {
                    stackIn_16_0 = (vh) ((Object) stackIn_16_0);

                    if (null != tp.field_e) {
                      break L4;
                    } else {
                      stackIn_17_0 = (vh) ((Object) stackIn_16_0);
                      stackIn_17_1 = 1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackIn_17_0 = (vh) ((Object) stackIn_16_0);
          stackIn_17_1 = 0;
          break L3;
        }
        L5: {
          L6: {
            ((vh) (Object) stackIn_17_0).a(stackIn_17_1 != 0, false);
            stackIn_21_0 = ln.field_q;

            if (!param1) {
              break L6;
            } else {
              stackIn_21_0 = (vh) ((Object) stackIn_21_0);

              if (param0) {
                break L6;
              } else {
                stackIn_21_0 = (vh) ((Object) stackIn_21_0);

                if (!tf.field_d) {
                  break L6;
                } else {
                  stackIn_22_0 = (vh) ((Object) stackIn_21_0);
                  stackIn_22_1 = 1;
                  break L5;
                }
              }
            }
          }
          stackIn_22_0 = (vh) ((Object) stackIn_21_0);
          stackIn_22_1 = 0;
          break L5;
        }
        L7: {
          ((vh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, false);
          kg.field_l.field_i.c(true);
          if (-1 != (gj.field_K.field_R ^ -1)) {
            jo.field_H = true;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (rn.field_f.field_R == 0) {
            break L8;
          } else {
            L9: {
              if (rg.field_s) {
                break L9;
              } else {
                if ((mp.field_V ^ -1) < -1) {
                  break L9;
                } else {
                  L10: {
                    if (-3 < (hq.field_i ^ -1)) {
                      break L10;
                    } else {
                      if (vj.field_c[12]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  gn.field_f = true;
                  break L8;
                }
              }
            }
            rb.c(param3, 100);
            break L8;
          }
        }
        L11: {
          if (uc.field_b.field_R == 0) {
            break L11;
          } else {
            L12: {
              if ((dg.field_T.length ^ -1) != -2) {
                break L12;
              } else {
                if (cr.field_l == dg.field_T[0]) {
                  break L12;
                } else {
                  cr.field_l = dg.field_T[0];
                  break L12;
                }
              }
            }
            je.a(param3, cr.field_l, true, tq.field_u, 0, false);
            break L11;
          }
        }
        L13: {
          if (param2 <= -126) {
            break L13;
          } else {
            ie.a(true, -43, -89);
            break L13;
          }
        }
        L14: {
          if (-1 == (sb.field_a.field_R ^ -1)) {
            break L14;
          } else {
            tf.field_d = false;
            break L14;
          }
        }
    }

    static {
        field_i = "To <u=ffffff>look at</u> a different part of the table: <img=0> <col=99ff99>Click on</col> that <col=99ff99>part of the table</col>, as long as it's not the cue ball.";
        field_d = new int[8192];
        field_h = 0;
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Accept";
    }
}
