/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ep {
    static int field_m;
    static String field_s;
    private String field_w;
    private int field_n;
    private int field_l;
    static java.awt.Image field_r;
    static vm field_q;
    static String field_o;
    private boolean field_x;
    static long field_t;
    private int field_p;
    private dh field_u;
    private int field_v;
    private int field_y;

    final void a(String param0, int param1, dh param2, int param3, int param4) {
        ml var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_u && this.field_x && this.field_l == 1 && this.field_w != null && this.field_w.equals(param0)) {
            return;
        }
        try {
            this.field_x = true;
            this.field_u = param2;
            this.field_l = param4;
            var8 = this.a(param0, param2, (byte) -72, param1);
            var7 = param2.c(param0);
            var8.field_g[0] = param3 + -(var7 >> 1513741441);
            var8.field_g[param0.length()] = param3 + (var7 >> 864306305);
            dn.a(25293, param0, var8, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        mh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        mh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        mh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        mh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        mh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        mh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        mh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        mh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        mh stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        mh stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        mh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        mh stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        mh stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        mh stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mh stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        mh stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        mh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        mh stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        mh stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        mh stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        mh stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        mh stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        mh stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        mh stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        mh stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        mh stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        mh stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        mh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        mh stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        mh stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        mh stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        mh stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        mh stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        mh stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        mh stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int var2;
        vi.a((byte) 74, 640 + lb.field_c >> 1926271233, -640 + lb.field_c >> 947342433, 0, lb.field_d);
        if ((ml.field_b ^ -1) < -1) {
          L0: {
            if (null == c.field_e) {
              break L0;
            } else {
              c.field_e.d(fe.field_gb.field_P, 0);
              break L0;
            }
          }
          L1: {
            L2: {
              stackIn_7_0 = fe.field_gb;

              stackIn_7_1 = 1;

              if (!param0) {
                break L2;
              } else {
                stackIn_7_0 = (mh) ((Object) stackIn_7_0);

                if (sc.field_c) {
                  break L2;
                } else {
                  stackIn_8_0 = (mh) ((Object) stackIn_7_0);
                  stackIn_8_1 = stackIn_7_1;
                  stackIn_8_2 = 1;
                  break L1;
                }
              }
            }
            stackIn_8_0 = (mh) ((Object) stackIn_7_0);
            stackIn_8_1 = stackIn_7_1;
            stackIn_8_2 = 0;
            break L1;
          }
          L3: {
            L4: {
              ((mh) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2 != 0);
              stackIn_11_0 = rm.field_a;

              stackIn_11_1 = 1;

              if (!param0) {
                break L4;
              } else {
                stackIn_11_0 = (mh) ((Object) stackIn_11_0);

                if (sc.field_c) {
                  break L4;
                } else {
                  stackIn_12_0 = (mh) ((Object) stackIn_11_0);
                  stackIn_12_1 = stackIn_11_1;
                  stackIn_12_2 = 1;
                  break L3;
                }
              }
            }
            stackIn_12_0 = (mh) ((Object) stackIn_11_0);
            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = 0;
            break L3;
          }
          ((mh) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2 != 0);
          if ((pe.field_j ^ -1) >= -1) {
            if (eg.field_m > 0) {
              if (null != c.field_e) {
                L5: {
                  L6: {
                    c.field_e.d(qa.field_w.field_P, 0);
                    stackIn_48_0 = qa.field_w;

                    stackIn_48_1 = 1;

                    if (!param0) {
                      break L6;
                    } else {
                      stackIn_48_0 = (mh) ((Object) stackIn_48_0);

                      if (hc.field_c) {
                        break L6;
                      } else {
                        stackIn_49_0 = (mh) ((Object) stackIn_48_0);
                        stackIn_49_1 = stackIn_48_1;
                        stackIn_49_2 = 1;
                        break L5;
                      }
                    }
                  }
                  stackIn_49_0 = (mh) ((Object) stackIn_48_0);
                  stackIn_49_1 = stackIn_48_1;
                  stackIn_49_2 = 0;
                  break L5;
                }
                L7: {
                  L8: {
                    ((mh) (Object) stackIn_49_0).a(stackIn_49_1 != 0, stackIn_49_2 != 0);
                    stackIn_52_0 = ak.field_d;

                    stackIn_52_1 = 1;

                    if (!param0) {
                      break L8;
                    } else {
                      stackIn_52_0 = (mh) ((Object) stackIn_52_0);

                      if (hc.field_c) {
                        break L8;
                      } else {
                        stackIn_53_0 = (mh) ((Object) stackIn_52_0);
                        stackIn_53_1 = stackIn_52_1;
                        stackIn_53_2 = 1;
                        break L7;
                      }
                    }
                  }
                  stackIn_53_0 = (mh) ((Object) stackIn_52_0);
                  stackIn_53_1 = stackIn_52_1;
                  stackIn_53_2 = 0;
                  break L7;
                }
                ((mh) (Object) stackIn_53_0).a(stackIn_53_1 != 0, stackIn_53_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              } else {
                L9: {
                  L10: {
                    stackIn_39_0 = qa.field_w;

                    stackIn_39_1 = 1;

                    if (!param0) {
                      break L10;
                    } else {
                      stackIn_39_0 = (mh) ((Object) stackIn_39_0);

                      if (hc.field_c) {
                        break L10;
                      } else {
                        stackIn_40_0 = (mh) ((Object) stackIn_39_0);
                        stackIn_40_1 = stackIn_39_1;
                        stackIn_40_2 = 1;
                        break L9;
                      }
                    }
                  }
                  stackIn_40_0 = (mh) ((Object) stackIn_39_0);
                  stackIn_40_1 = stackIn_39_1;
                  stackIn_40_2 = 0;
                  break L9;
                }
                L11: {
                  L12: {
                    ((mh) (Object) stackIn_40_0).a(stackIn_40_1 != 0, stackIn_40_2 != 0);
                    stackIn_43_0 = ak.field_d;

                    stackIn_43_1 = 1;

                    if (!param0) {
                      break L12;
                    } else {
                      stackIn_43_0 = (mh) ((Object) stackIn_43_0);

                      if (hc.field_c) {
                        break L12;
                      } else {
                        stackIn_44_0 = (mh) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = 1;
                        break L11;
                      }
                    }
                  }
                  stackIn_44_0 = (mh) ((Object) stackIn_43_0);
                  stackIn_44_1 = stackIn_43_1;
                  stackIn_44_2 = 0;
                  break L11;
                }
                ((mh) (Object) stackIn_44_0).a(stackIn_44_1 != 0, stackIn_44_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              }
            } else {
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          } else {
            if (null != c.field_e) {
              L13: {
                L14: {
                  c.field_e.d(qa.field_w.field_P, 0);
                  stackIn_26_0 = qa.field_w;

                  stackIn_26_1 = 1;

                  if (!param0) {
                    break L14;
                  } else {
                    stackIn_26_0 = (mh) ((Object) stackIn_26_0);

                    if (hc.field_c) {
                      break L14;
                    } else {
                      stackIn_27_0 = (mh) ((Object) stackIn_26_0);
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = 1;
                      break L13;
                    }
                  }
                }
                stackIn_27_0 = (mh) ((Object) stackIn_26_0);
                stackIn_27_1 = stackIn_26_1;
                stackIn_27_2 = 0;
                break L13;
              }
              L15: {
                L16: {
                  ((mh) (Object) stackIn_27_0).a(stackIn_27_1 != 0, stackIn_27_2 != 0);
                  stackIn_30_0 = ak.field_d;

                  stackIn_30_1 = 1;

                  if (!param0) {
                    break L16;
                  } else {
                    stackIn_30_0 = (mh) ((Object) stackIn_30_0);

                    if (hc.field_c) {
                      break L16;
                    } else {
                      stackIn_31_0 = (mh) ((Object) stackIn_30_0);
                      stackIn_31_1 = stackIn_30_1;
                      stackIn_31_2 = 1;
                      break L15;
                    }
                  }
                }
                stackIn_31_0 = (mh) ((Object) stackIn_30_0);
                stackIn_31_1 = stackIn_30_1;
                stackIn_31_2 = 0;
                break L15;
              }
              ((mh) (Object) stackIn_31_0).a(stackIn_31_1 != 0, stackIn_31_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            } else {
              L17: {
                L18: {
                  stackIn_17_0 = qa.field_w;

                  stackIn_17_1 = 1;

                  if (!param0) {
                    break L18;
                  } else {
                    stackIn_17_0 = (mh) ((Object) stackIn_17_0);

                    if (hc.field_c) {
                      break L18;
                    } else {
                      stackIn_18_0 = (mh) ((Object) stackIn_17_0);
                      stackIn_18_1 = stackIn_17_1;
                      stackIn_18_2 = 1;
                      break L17;
                    }
                  }
                }
                stackIn_18_0 = (mh) ((Object) stackIn_17_0);
                stackIn_18_1 = stackIn_17_1;
                stackIn_18_2 = 0;
                break L17;
              }
              L19: {
                L20: {
                  ((mh) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2 != 0);
                  stackIn_21_0 = ak.field_d;

                  stackIn_21_1 = 1;

                  if (!param0) {
                    break L20;
                  } else {
                    stackIn_21_0 = (mh) ((Object) stackIn_21_0);

                    if (hc.field_c) {
                      break L20;
                    } else {
                      stackIn_22_0 = (mh) ((Object) stackIn_21_0);
                      stackIn_22_1 = stackIn_21_1;
                      stackIn_22_2 = 1;
                      break L19;
                    }
                  }
                }
                stackIn_22_0 = (mh) ((Object) stackIn_21_0);
                stackIn_22_1 = stackIn_21_1;
                stackIn_22_2 = 0;
                break L19;
              }
              ((mh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, stackIn_22_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          }
        } else {
          if ((pe.field_j ^ -1) >= -1) {
            if (eg.field_m > 0) {
              if (null != c.field_e) {
                L21: {
                  L22: {
                    c.field_e.d(qa.field_w.field_P, 0);
                    stackIn_91_0 = qa.field_w;

                    stackIn_91_1 = 1;

                    if (!param0) {
                      break L22;
                    } else {
                      stackIn_91_0 = (mh) ((Object) stackIn_91_0);

                      if (hc.field_c) {
                        break L22;
                      } else {
                        stackIn_92_0 = (mh) ((Object) stackIn_91_0);
                        stackIn_92_1 = stackIn_91_1;
                        stackIn_92_2 = 1;
                        break L21;
                      }
                    }
                  }
                  stackIn_92_0 = (mh) ((Object) stackIn_91_0);
                  stackIn_92_1 = stackIn_91_1;
                  stackIn_92_2 = 0;
                  break L21;
                }
                L23: {
                  L24: {
                    ((mh) (Object) stackIn_92_0).a(stackIn_92_1 != 0, stackIn_92_2 != 0);
                    stackIn_95_0 = ak.field_d;

                    stackIn_95_1 = 1;

                    if (!param0) {
                      break L24;
                    } else {
                      stackIn_95_0 = (mh) ((Object) stackIn_95_0);

                      if (hc.field_c) {
                        break L24;
                      } else {
                        stackIn_96_0 = (mh) ((Object) stackIn_95_0);
                        stackIn_96_1 = stackIn_95_1;
                        stackIn_96_2 = 1;
                        break L23;
                      }
                    }
                  }
                  stackIn_96_0 = (mh) ((Object) stackIn_95_0);
                  stackIn_96_1 = stackIn_95_1;
                  stackIn_96_2 = 0;
                  break L23;
                }
                ((mh) (Object) stackIn_96_0).a(stackIn_96_1 != 0, stackIn_96_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              } else {
                L25: {
                  L26: {
                    stackIn_82_0 = qa.field_w;

                    stackIn_82_1 = 1;

                    if (!param0) {
                      break L26;
                    } else {
                      stackIn_82_0 = (mh) ((Object) stackIn_82_0);

                      if (hc.field_c) {
                        break L26;
                      } else {
                        stackIn_83_0 = (mh) ((Object) stackIn_82_0);
                        stackIn_83_1 = stackIn_82_1;
                        stackIn_83_2 = 1;
                        break L25;
                      }
                    }
                  }
                  stackIn_83_0 = (mh) ((Object) stackIn_82_0);
                  stackIn_83_1 = stackIn_82_1;
                  stackIn_83_2 = 0;
                  break L25;
                }
                L27: {
                  L28: {
                    ((mh) (Object) stackIn_83_0).a(stackIn_83_1 != 0, stackIn_83_2 != 0);
                    stackIn_86_0 = ak.field_d;

                    stackIn_86_1 = 1;

                    if (!param0) {
                      break L28;
                    } else {
                      stackIn_86_0 = (mh) ((Object) stackIn_86_0);

                      if (hc.field_c) {
                        break L28;
                      } else {
                        stackIn_87_0 = (mh) ((Object) stackIn_86_0);
                        stackIn_87_1 = stackIn_86_1;
                        stackIn_87_2 = 1;
                        break L27;
                      }
                    }
                  }
                  stackIn_87_0 = (mh) ((Object) stackIn_86_0);
                  stackIn_87_1 = stackIn_86_1;
                  stackIn_87_2 = 0;
                  break L27;
                }
                ((mh) (Object) stackIn_87_0).a(stackIn_87_1 != 0, stackIn_87_2 != 0);
                sc.b(-123);
                var2 = -63 / ((70 - param1) / 49);
                return;
              }
            } else {
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          } else {
            if (null != c.field_e) {
              L29: {
                L30: {
                  c.field_e.d(qa.field_w.field_P, 0);
                  stackIn_69_0 = qa.field_w;

                  stackIn_69_1 = 1;

                  if (!param0) {
                    break L30;
                  } else {
                    stackIn_69_0 = (mh) ((Object) stackIn_69_0);

                    if (hc.field_c) {
                      break L30;
                    } else {
                      stackIn_70_0 = (mh) ((Object) stackIn_69_0);
                      stackIn_70_1 = stackIn_69_1;
                      stackIn_70_2 = 1;
                      break L29;
                    }
                  }
                }
                stackIn_70_0 = (mh) ((Object) stackIn_69_0);
                stackIn_70_1 = stackIn_69_1;
                stackIn_70_2 = 0;
                break L29;
              }
              L31: {
                L32: {
                  ((mh) (Object) stackIn_70_0).a(stackIn_70_1 != 0, stackIn_70_2 != 0);
                  stackIn_73_0 = ak.field_d;

                  stackIn_73_1 = 1;

                  if (!param0) {
                    break L32;
                  } else {
                    stackIn_73_0 = (mh) ((Object) stackIn_73_0);

                    if (hc.field_c) {
                      break L32;
                    } else {
                      stackIn_74_0 = (mh) ((Object) stackIn_73_0);
                      stackIn_74_1 = stackIn_73_1;
                      stackIn_74_2 = 1;
                      break L31;
                    }
                  }
                }
                stackIn_74_0 = (mh) ((Object) stackIn_73_0);
                stackIn_74_1 = stackIn_73_1;
                stackIn_74_2 = 0;
                break L31;
              }
              ((mh) (Object) stackIn_74_0).a(stackIn_74_1 != 0, stackIn_74_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            } else {
              L33: {
                L34: {
                  stackIn_60_0 = qa.field_w;

                  stackIn_60_1 = 1;

                  if (!param0) {
                    break L34;
                  } else {
                    stackIn_60_0 = (mh) ((Object) stackIn_60_0);

                    if (hc.field_c) {
                      break L34;
                    } else {
                      stackIn_61_0 = (mh) ((Object) stackIn_60_0);
                      stackIn_61_1 = stackIn_60_1;
                      stackIn_61_2 = 1;
                      break L33;
                    }
                  }
                }
                stackIn_61_0 = (mh) ((Object) stackIn_60_0);
                stackIn_61_1 = stackIn_60_1;
                stackIn_61_2 = 0;
                break L33;
              }
              L35: {
                L36: {
                  ((mh) (Object) stackIn_61_0).a(stackIn_61_1 != 0, stackIn_61_2 != 0);
                  stackIn_64_0 = ak.field_d;

                  stackIn_64_1 = 1;

                  if (!param0) {
                    break L36;
                  } else {
                    stackIn_64_0 = (mh) ((Object) stackIn_64_0);

                    if (hc.field_c) {
                      break L36;
                    } else {
                      stackIn_65_0 = (mh) ((Object) stackIn_64_0);
                      stackIn_65_1 = stackIn_64_1;
                      stackIn_65_2 = 1;
                      break L35;
                    }
                  }
                }
                stackIn_65_0 = (mh) ((Object) stackIn_64_0);
                stackIn_65_1 = stackIn_64_1;
                stackIn_65_2 = 0;
                break L35;
              }
              ((mh) (Object) stackIn_65_0).a(stackIn_65_1 != 0, stackIn_65_2 != 0);
              sc.b(-123);
              var2 = -63 / ((70 - param1) / 49);
              return;
            }
          }
        }
    }

    final void a(dh param0, int param1, int param2, String param3, int param4) {
        ml var7 = null;
        ml var8 = null;
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_u == param0 && this.field_x && -1 == (this.field_l ^ -1) && this.field_w != null) {
            if (!(!this.field_w.equals(param3))) {
                return;
            }
        }
        try {
            this.field_u = param0;
            this.field_x = true;
            this.field_w = param3;
            this.field_l = param4;
            var7 = this.a(param3, param0, (byte) -109, param1);
            var8 = var7;
            var7.field_g[0] = param2;
            var8.field_g[param3.length()] = param0.c(param3) + param2;
            dn.a(param4 ^ 25293, param3, var8, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "oj.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, vo param1, int param2, int param3, byte param4, j param5, int param6) {
        jp[] stackIn_4_0 = null;
        jp[] stackIn_7_0 = null;
        jp stackIn_10_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jp[] var7 = null;
        RuntimeException var7_ref = null;
        jp[] var8 = null;
        jp var9 = null;
        int var10 = 0;
        int var11 = 0;
        jp var12 = null;
        int var12_int = 0;
        int var13 = 0;
        jp[] var14 = null;
        jp var15 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (oa.field_Sb != null) {
                stackIn_4_0 = oa.field_Sb.a((byte) -89, param2);
                break L1;
              } else {
                stackIn_4_0 = null;
                break L1;
              }
            }
            L2: {
              var14 = stackIn_4_0;
              var7 = var14;
              if (oa.field_Sb != null) {
                stackIn_7_0 = oa.field_Sb.a(param2, true);
                break L2;
              } else {
                stackIn_7_0 = null;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (oa.field_Sb == null) {
                stackIn_10_0 = null;
                break L3;
              } else {
                stackIn_10_0 = oa.field_Sb.a(true, param2);
                break L3;
              }
            }
            var9 = stackIn_10_0;
            if (param4 >= 54) {
              L4: {
                var10 = param1.field_m >> 474266472;
                var11 = param1.field_j >> 1311999656;
                if (-3 != (param0 ^ -1)) {
                  break L4;
                } else {
                  var15 = bq.field_e[1][oo.field_w.a(-37880252, bq.field_e[1].length)];
                  var12 = var15;
                  var12.f((var11 + param6 * param2 + -(var15.field_x * param2) - -3) / param2, (3 + (param2 * param3 + var10)) / param2, 196);
                  break L4;
                }
              }
              L5: {
                tf.field_c[0].c(var11 / param2 + param6, var10 / param2 + param3);
                if (var7 != null) {
                  var14[0].c(param6 - -(var11 / param2), param3 - -(var10 / param2));
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 += 16;
              var12_int = 0;
              L6: while (true) {
                if (param1.field_F / 2 <= var12_int) {
                  L7: {
                    gg.field_o.c(param6 + var11 / param2, var10 / param2 + param3);
                    if (var9 != null) {
                      var9.c(param6 + var11 / param2, var10 / param2 + param3);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var11 += 8;
                  var12_int = 0;
                  L8: while (true) {
                    if (param1.field_F / 2 <= var12_int) {
                      L9: {
                        if (0 != param0) {
                          break L9;
                        } else {
                          var12 = bq.field_e[0][oo.field_w.a(-37880252, bq.field_e[0].length)];
                          var12.f((var11 + (16 + param6 * param2) - 3) / param2, (3 + param2 * param3 - -var10) / param2, 196);
                          break L9;
                        }
                      }
                      tf.field_c[1].c(param6 - -(var11 / param2), var10 / param2 + param3);
                      if (var7 != null) {
                        var14[1].c(param6 - -(var11 / param2), param3 + var10 / param2);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      L10: {
                        fq.field_d[1].c(var11 / param2 + param6, var10 / param2 + param3);
                        if (null == var8) {
                          break L10;
                        } else {
                          var8[1].c(var11 / param2 + param6, param3 + var10 / param2);
                          break L10;
                        }
                      }
                      var11 += 6;
                      var12_int++;
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    fq.field_d[0].c(var11 / param2 + param6, param3 - -(var10 / param2));
                    if (null == var8) {
                      break L11;
                    } else {
                      var8[0].c(var11 / param2 + param6, var10 / param2 + param3);
                      break L11;
                    }
                  }
                  var11 += 6;
                  var12_int++;
                  continue L6;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7_ref = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var7_ref);

            stackIn_44_1 = new StringBuilder().append("oj.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L12;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L13;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_45_0), stackIn_48_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ml a(String param0, dh param1, byte param2, int param3) {
        ml var5 = null;
        RuntimeException var5_ref = null;
        ml var6 = null;
        ml stackIn_2_0 = null;
        ml stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new ml(-param1.field_F + param3, param3 - -param1.field_P, param0.length());
            var5 = var6;
            this.field_c = new ml[]{var6};
            if (param2 < -71) {
              stackIn_4_0 = (ml) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ml) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("oj.I(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -51) {
          field_t = -70L;
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
    }

    final void a(String param0, dh param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        dh var7 = null;
        ml var9 = null;
        ml var10 = null;
        try {
          L0: {
            if (param0 == null) {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 != this.field_u) {
                  break L1;
                } else {
                  if (!this.field_x) {
                    break L1;
                  } else {
                    if (2 != this.field_l) {
                      break L1;
                    } else {
                      if (null == this.field_w) {
                        break L1;
                      } else {
                        if (this.field_w.equals(param0)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                if (param3 <= -90) {
                  break L2;
                } else {
                  var7 = (dh) null;
                  this.a((String) null, -87, (dh) null, 2, -3);
                  break L2;
                }
              }
              this.field_u = param1;
              this.field_w = param0;
              this.field_x = true;
              this.field_l = 2;
              var9 = this.a(param0, param1, (byte) -108, param4);
              var10 = var9;
              var10.field_g[0] = param2 - param1.c(param0);
              var10.field_g[param0.length()] = param2;
              dn.a(25293, param0, var10, 0, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("oj.L(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static int b(boolean param0) {
        if ((qg.field_A ^ -1) > -3) {
          return 0;
        } else {
          if (-1 == (cd.field_e ^ -1)) {
            if (!ma.field_P.a((byte) -127)) {
              return 20;
            } else {
              if (!ma.field_P.a("commonui", -28138)) {
                return 40;
              } else {
                if (!vh.field_S.a((byte) -127)) {
                  return 50;
                } else {
                  if (!vh.field_S.a("commonui", -28138)) {
                    return 60;
                  } else {
                    if (!ja.field_c.a((byte) -127)) {
                      return 70;
                    } else {
                      if (ja.field_c.a(117)) {
                        if (param0) {
                          return 71;
                        } else {
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (wl.field_K != null) {
              if (!wl.field_K.a((byte) -127)) {
                return 14;
              } else {
                if (!wl.field_K.a(-104, "")) {
                  return 29;
                } else {
                  if (wl.field_K.a("", -28138)) {
                    if (!ma.field_P.a((byte) -127)) {
                      return 43;
                    } else {
                      if (ma.field_P.a("commonui", -28138)) {
                        if (vh.field_S.a((byte) -127)) {
                          if (vh.field_S.a("commonui", -28138)) {
                            if (ja.field_c.a((byte) -127)) {
                              if (ja.field_c.a(110)) {
                                if (param0) {
                                  return 71;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            } else {
                              return 82;
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      } else {
                        return 57;
                      }
                    }
                  } else {
                    return 29;
                  }
                }
              }
            } else {
              if (!ma.field_P.a((byte) -127)) {
                return 43;
              } else {
                if (ma.field_P.a("commonui", -28138)) {
                  if (vh.field_S.a((byte) -127)) {
                    if (vh.field_S.a("commonui", -28138)) {
                      if (ja.field_c.a((byte) -127)) {
                        if (ja.field_c.a(110)) {
                          if (param0) {
                            return 71;
                          } else {
                            return 100;
                          }
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, dh param7) {
        ml stackIn_34_0;
        ml stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        ml stackIn_35_0 = null;
        ml stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        ml stackIn_39_2 = null;
        int stackIn_40_0;
        String stackIn_40_1;
        ml stackIn_40_2;
        int stackIn_40_3;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        String[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ml var15 = null;
        int var16 = 0;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param4) {
                break L1;
              } else {
                param4 = param7.field_N;
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (param7 != this.field_u) {
                  break L2;
                } else {
                  if (this.field_x) {
                    break L2;
                  } else {
                    if (param1 != this.field_l) {
                      break L2;
                    } else {
                      if (param6 != this.field_v) {
                        break L2;
                      } else {
                        if (this.field_p != param4) {
                          break L2;
                        } else {
                          if (this.field_y != param3) {
                            break L2;
                          } else {
                            if (param5 != this.field_n) {
                              break L2;
                            } else {
                              if (this.field_w == null) {
                                break L2;
                              } else {
                                if (this.field_w.equals(param0)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
              L3: {
                var9_int = -125 % ((26 - param2) / 49);
                this.field_l = param1;
                this.field_x = false;
                this.field_w = param0;
                this.field_y = param3;
                this.field_v = param6;
                this.field_p = param4;
                this.field_n = param5;
                this.field_u = param7;
                var10 = new String[1 + param7.a(param0, param5)];
                var11 = Math.max(1, param7.a(param0, new int[]{param5}, var10));
                if (this.field_v != 3) {
                  break L3;
                } else {
                  if (var11 == 1) {
                    this.field_v = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                this.field_c = new ml[var11];
                if (-1 == (this.field_v ^ -1)) {
                  var12 = param7.field_F;
                  break L4;
                } else {
                  if (-2 == (this.field_v ^ -1)) {
                    var12 = (-(var11 * this.field_p) + this.field_y >> -107612191) + param7.field_F;
                    break L4;
                  } else {
                    if (2 != this.field_v) {
                      L5: {
                        var13 = (this.field_y - this.field_p * var11) / (var11 - -1);
                        if ((var13 ^ -1) <= -1) {
                          break L5;
                        } else {
                          var13 = 0;
                          break L5;
                        }
                      }
                      var12 = var13 + param7.field_F;
                      this.field_p = this.field_p + var13;
                      break L4;
                    } else {
                      var12 = this.field_y - param7.field_P - var11 * this.field_p;
                      break L4;
                    }
                  }
                }
              }
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var14 = var10[var13];
                    stackIn_34_0 = null;

                    stackIn_34_1 = null;

                    stackIn_34_2 = var12 + -param7.field_F;

                    stackIn_34_3 = param7.field_P + var12;

                    if (var14 != null) {
                      stackIn_35_0 = null;
                      stackIn_35_1 = null;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = stackIn_34_3;
                      stackIn_35_4 = var14.length();
                      break L7;
                    } else {
                      stackIn_35_0 = null;
                      stackIn_35_1 = null;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = stackIn_34_3;
                      stackIn_35_4 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new ml(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var15.field_g[0] = 0;
                    if (var14 != null) {
                      L9: {
                        var15.field_g[var14.length()] = param7.c(var14);
                        stackIn_39_0 = 25293;

                        stackIn_39_1 = (String) (var14);

                        stackIn_39_2 = (ml) (var15);

                        if (param1 != 3) {
                          stackIn_40_0 = stackIn_39_0;
                          stackIn_40_1 = (String) ((Object) stackIn_39_1);
                          stackIn_40_2 = (ml) ((Object) stackIn_39_2);
                          stackIn_40_3 = 0;
                          break L9;
                        } else {
                          stackIn_40_0 = stackIn_39_0;
                          stackIn_40_1 = (String) ((Object) stackIn_39_1);
                          stackIn_40_2 = (ml) ((Object) stackIn_39_2);
                          stackIn_40_3 = this.a(param5, param7.c(var14), var14, true);
                          break L9;
                        }
                      }
                      dn.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, param7);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_c[var13] = var15;
                  var12 = var12 + param4;
                  var13++;
                  continue L6;
                }
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var9);

            stackIn_45_1 = new StringBuilder().append("oj.O(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public oj() {
    }

    static {
        field_o = "Seriously offensive language";
        field_s = "Please select a level.";
    }
}
