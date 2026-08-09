/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static je field_c;
    static boolean field_e;
    static kk[] field_a;
    static wc field_f;
    static String field_d;
    static int field_b;
    static String field_g;

    final static void a(byte param0, float param1, String param2) {
        try {
            if (param0 != -24) {
                field_a = (kk[]) null;
            }
            wa.field_e = param2;
            q.field_C = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param1 != 1) {
          if (param0 >= -7) {
            return 111;
          } else {
            return ce.field_I[param1];
          }
        } else {
          if (!is.a(4, param2)) {
            if (param0 >= -7) {
              return 111;
            } else {
              return ce.field_I[param1];
            }
          } else {
            return 29;
          }
        }
    }

    final static boolean a(boolean param0) {
        if (!hf.field_c) {
            return false;
        }
        if (param0) {
            return true;
        }
        if (rs.field_t != 0) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        if (param0 != 29022) {
          field_d = (String) null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        je stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        je stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        je stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        je stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        je stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        je stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        je stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        je stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        je stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        je stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        je stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bh.d(false);
        if (al.field_g >= 0) {
          L0: {
            L1: {
              t.field_g.field_X = fo.a(4800, ns.field_F, new String[]{Integer.toString(al.field_g)});
              stackIn_56_0 = no.field_T;

              stackIn_56_1 = 1;

              if (!param0) {
                break L1;
              } else {
                stackIn_56_0 = (je) ((Object) stackIn_56_0);

                if (param1) {
                  break L1;
                } else {
                  stackIn_56_0 = (je) ((Object) stackIn_56_0);

                  if (bw.field_g) {
                    break L1;
                  } else {
                    stackIn_56_0 = (je) ((Object) stackIn_56_0);

                    if (vu.field_M != null) {
                      break L1;
                    } else {
                      stackIn_56_0 = (je) ((Object) stackIn_56_0);

                      if (null != no.field_K) {
                        break L1;
                      } else {
                        stackIn_57_0 = (je) ((Object) stackIn_56_0);
                        stackIn_57_1 = stackIn_56_1;
                        stackIn_57_2 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_57_0 = (je) ((Object) stackIn_56_0);
            stackIn_57_1 = stackIn_56_1;
            stackIn_57_2 = 0;
            break L0;
          }
          L2: {
            L3: {
              ((je) (Object) stackIn_57_0).a(stackIn_57_1 != 0, stackIn_57_2 != 0);
              stackIn_63_0 = ov.field_i;

              stackIn_63_1 = 1;

              if (!param0) {
                break L3;
              } else {
                stackIn_63_0 = (je) ((Object) stackIn_63_0);

                if (param1) {
                  break L3;
                } else {
                  stackIn_63_0 = (je) ((Object) stackIn_63_0);

                  if (bw.field_g) {
                    break L3;
                  } else {
                    stackIn_63_0 = (je) ((Object) stackIn_63_0);

                    if (vu.field_M != null) {
                      break L3;
                    } else {
                      stackIn_63_0 = (je) ((Object) stackIn_63_0);

                      if (no.field_K != null) {
                        break L3;
                      } else {
                        stackIn_64_0 = (je) ((Object) stackIn_63_0);
                        stackIn_64_1 = stackIn_63_1;
                        stackIn_64_2 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackIn_64_0 = (je) ((Object) stackIn_63_0);
            stackIn_64_1 = stackIn_63_1;
            stackIn_64_2 = 0;
            break L2;
          }
          L4: {
            L5: {
              ((je) (Object) stackIn_64_0).a(stackIn_64_1 != 0, stackIn_64_2 != 0);
              stackIn_68_0 = qc.field_c;

              stackIn_68_1 = 1;

              if (!param0) {
                break L5;
              } else {
                stackIn_68_0 = (je) ((Object) stackIn_68_0);

                if (param1) {
                  break L5;
                } else {
                  stackIn_68_0 = (je) ((Object) stackIn_68_0);

                  if (!bw.field_g) {
                    break L5;
                  } else {
                    stackIn_69_0 = (je) ((Object) stackIn_68_0);
                    stackIn_69_1 = stackIn_68_1;
                    stackIn_69_2 = 1;
                    break L4;
                  }
                }
              }
            }
            stackIn_69_0 = (je) ((Object) stackIn_68_0);
            stackIn_69_1 = stackIn_68_1;
            stackIn_69_2 = 0;
            break L4;
          }
          L6: {
            ((je) (Object) stackIn_69_0).a(stackIn_69_1 != 0, stackIn_69_2 != 0);
            pj.field_E.field_a.l(10000);
            if (-1 != (cp.field_d.field_yb ^ -1)) {
              cg.field_a = true;
              break L6;
            } else {
              break L6;
            }
          }
          if (param2 < 60) {
            return;
          } else {
            L7: {
              if (fj.field_d.field_yb != 0) {
                if (bj.field_k) {
                  gu.a(-61, param3);
                  break L7;
                } else {
                  if ((df.field_M ^ -1) < -1) {
                    gu.a(-61, param3);
                    break L7;
                  } else {
                    L8: {
                      if (2 > hi.field_j) {
                        break L8;
                      } else {
                        if (!br.field_f[12]) {
                          break L8;
                        } else {
                          gu.a(-61, param3);
                          break L7;
                        }
                      }
                    }
                    mo.field_w = true;
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (-1 == (pe.field_x.field_yb ^ -1)) {
                break L9;
              } else {
                L10: {
                  if (lm.field_e.length != 1) {
                    break L10;
                  } else {
                    if (mt.field_d == lm.field_e[0]) {
                      break L10;
                    } else {
                      mt.field_d = lm.field_e[0];
                      break L10;
                    }
                  }
                }
                qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                break L9;
              }
            }
            L11: {
              if (td.field_g.field_yb != 0) {
                bw.field_g = false;
                break L11;
              } else {
                break L11;
              }
            }
            return;
          }
        } else {
          L12: {
            L13: {
              t.field_g.field_X = null;
              stackIn_7_0 = no.field_T;

              stackIn_7_1 = 1;

              if (!param0) {
                break L13;
              } else {
                stackIn_7_0 = (je) ((Object) stackIn_7_0);

                if (param1) {
                  break L13;
                } else {
                  stackIn_7_0 = (je) ((Object) stackIn_7_0);

                  if (bw.field_g) {
                    break L13;
                  } else {
                    stackIn_7_0 = (je) ((Object) stackIn_7_0);

                    if (vu.field_M != null) {
                      break L13;
                    } else {
                      stackIn_7_0 = (je) ((Object) stackIn_7_0);

                      if (null != no.field_K) {
                        break L13;
                      } else {
                        stackIn_8_0 = (je) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            stackIn_8_0 = (je) ((Object) stackIn_7_0);
            stackIn_8_1 = stackIn_7_1;
            stackIn_8_2 = 0;
            break L12;
          }
          L14: {
            L15: {
              ((je) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2 != 0);
              stackIn_14_0 = ov.field_i;

              stackIn_14_1 = 1;

              if (!param0) {
                break L15;
              } else {
                stackIn_14_0 = (je) ((Object) stackIn_14_0);

                if (param1) {
                  break L15;
                } else {
                  stackIn_14_0 = (je) ((Object) stackIn_14_0);

                  if (bw.field_g) {
                    break L15;
                  } else {
                    stackIn_14_0 = (je) ((Object) stackIn_14_0);

                    if (vu.field_M != null) {
                      break L15;
                    } else {
                      stackIn_14_0 = (je) ((Object) stackIn_14_0);

                      if (no.field_K != null) {
                        break L15;
                      } else {
                        stackIn_15_0 = (je) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = 1;
                        break L14;
                      }
                    }
                  }
                }
              }
            }
            stackIn_15_0 = (je) ((Object) stackIn_14_0);
            stackIn_15_1 = stackIn_14_1;
            stackIn_15_2 = 0;
            break L14;
          }
          L16: {
            L17: {
              ((je) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2 != 0);
              stackIn_19_0 = qc.field_c;

              stackIn_19_1 = 1;

              if (!param0) {
                break L17;
              } else {
                stackIn_19_0 = (je) ((Object) stackIn_19_0);

                if (param1) {
                  break L17;
                } else {
                  stackIn_19_0 = (je) ((Object) stackIn_19_0);

                  if (!bw.field_g) {
                    break L17;
                  } else {
                    stackIn_20_0 = (je) ((Object) stackIn_19_0);
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = 1;
                    break L16;
                  }
                }
              }
            }
            stackIn_20_0 = (je) ((Object) stackIn_19_0);
            stackIn_20_1 = stackIn_19_1;
            stackIn_20_2 = 0;
            break L16;
          }
          L18: {
            ((je) (Object) stackIn_20_0).a(stackIn_20_1 != 0, stackIn_20_2 != 0);
            pj.field_E.field_a.l(10000);
            if (-1 != (cp.field_d.field_yb ^ -1)) {
              cg.field_a = true;
              break L18;
            } else {
              break L18;
            }
          }
          if (param2 < 60) {
            return;
          } else {
            L19: {
              if (fj.field_d.field_yb != 0) {
                if (bj.field_k) {
                  gu.a(-61, param3);
                  break L19;
                } else {
                  if ((df.field_M ^ -1) < -1) {
                    gu.a(-61, param3);
                    break L19;
                  } else {
                    if (2 <= hi.field_j) {
                      if (br.field_f[12]) {
                        gu.a(-61, param3);
                        break L19;
                      } else {
                        mo.field_w = true;
                        break L19;
                      }
                    } else {
                      mo.field_w = true;
                      break L19;
                    }
                  }
                }
              } else {
                break L19;
              }
            }
            L20: {
              if (-1 == (pe.field_x.field_yb ^ -1)) {
                break L20;
              } else {
                if (lm.field_e.length != 1) {
                  qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                  break L20;
                } else {
                  if (mt.field_d == lm.field_e[0]) {
                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                    break L20;
                  } else {
                    mt.field_d = lm.field_e[0];
                    qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                    break L20;
                  }
                }
              }
            }
            L21: {
              if (td.field_g.field_yb != 0) {
                bw.field_g = false;
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        }
    }

    static {
        field_e = true;
        field_d = "Hide chat";
        field_g = "Members only.";
    }
}
