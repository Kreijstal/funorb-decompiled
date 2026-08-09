/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda extends rqa {
    static int field_q;
    static java.awt.Image field_p;
    static String field_o;

    public static void a(int param0) {
        field_p = null;
        if (param0 != 0) {
            nda.a(48, false);
            field_o = null;
            return;
        }
        field_o = null;
    }

    nda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(124, 62, param0[0].a(93));
              if (param1 <= -119) {
                break L1;
              } else {
                nda.a(-23);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("nda.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1) {
        llb stackIn_9_0 = null;
        llb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        llb stackIn_13_0 = null;
        llb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        llb stackIn_20_0 = null;
        llb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        llb stackIn_24_0 = null;
        llb stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        llb stackIn_29_0 = null;
        llb stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        llb stackIn_33_0 = null;
        llb stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        llb stackIn_42_0 = null;
        llb stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        llb stackIn_46_0 = null;
        llb stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        llb stackIn_51_0 = null;
        llb stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        llb stackIn_55_0 = null;
        llb stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        llb stackIn_66_0 = null;
        llb stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        llb stackIn_70_0 = null;
        llb stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        llb stackIn_79_0 = null;
        llb stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        llb stackIn_83_0 = null;
        llb stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        llb stackIn_88_0 = null;
        llb stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        llb stackIn_92_0 = null;
        llb stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        if (param0 < -111) {
          L0: {
            qca.a(dma.field_g - -640 >> 948054593, dma.field_j, dma.field_g + -640 >> 1408966625, true, 0);
            if (0 < lia.field_b) {
              L1: {
                if (null != kl.field_c) {
                  kl.field_c.c(tb.field_a.field_L, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  stackIn_66_0 = tb.field_a;

                  if (!param1) {
                    break L3;
                  } else {
                    stackIn_66_0 = (llb) ((Object) stackIn_66_0);

                    if (bv.field_d) {
                      break L3;
                    } else {
                      stackIn_67_0 = (llb) ((Object) stackIn_66_0);
                      stackIn_67_1 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_67_0 = (llb) ((Object) stackIn_66_0);
                stackIn_67_1 = 0;
                break L2;
              }
              L4: {
                L5: {
                  ((llb) (Object) stackIn_67_0).b(stackIn_67_1 != 0, -109);
                  stackIn_70_0 = bqa.field_d;

                  if (!param1) {
                    break L5;
                  } else {
                    stackIn_70_0 = (llb) ((Object) stackIn_70_0);

                    if (bv.field_d) {
                      break L5;
                    } else {
                      stackIn_71_0 = (llb) ((Object) stackIn_70_0);
                      stackIn_71_1 = 1;
                      break L4;
                    }
                  }
                }
                stackIn_71_0 = (llb) ((Object) stackIn_70_0);
                stackIn_71_1 = 0;
                break L4;
              }
              ((llb) (Object) stackIn_71_0).b(stackIn_71_1 != 0, 113);
              break L0;
            } else {
              break L0;
            }
          }
          L6: {
            if (nf.field_a > 0) {
              break L6;
            } else {
              if (-1 > (tba.field_p ^ -1)) {
                break L6;
              } else {
                bia.a((byte) 124);
                return;
              }
            }
          }
          if (null != kl.field_c) {
            L7: {
              L8: {
                kl.field_c.c(rga.field_g.field_L, 0);
                stackIn_88_0 = rga.field_g;

                if (!param1) {
                  break L8;
                } else {
                  stackIn_88_0 = (llb) ((Object) stackIn_88_0);

                  if (wo.field_o) {
                    break L8;
                  } else {
                    stackIn_89_0 = (llb) ((Object) stackIn_88_0);
                    stackIn_89_1 = 1;
                    break L7;
                  }
                }
              }
              stackIn_89_0 = (llb) ((Object) stackIn_88_0);
              stackIn_89_1 = 0;
              break L7;
            }
            L9: {
              L10: {
                ((llb) (Object) stackIn_89_0).b(stackIn_89_1 != 0, 101);
                stackIn_92_0 = vva.field_r;

                if (!param1) {
                  break L10;
                } else {
                  stackIn_92_0 = (llb) ((Object) stackIn_92_0);

                  if (wo.field_o) {
                    break L10;
                  } else {
                    stackIn_93_0 = (llb) ((Object) stackIn_92_0);
                    stackIn_93_1 = 1;
                    break L9;
                  }
                }
              }
              stackIn_93_0 = (llb) ((Object) stackIn_92_0);
              stackIn_93_1 = 0;
              break L9;
            }
            ((llb) (Object) stackIn_93_0).b(stackIn_93_1 != 0, 101);
            bia.a((byte) 124);
            return;
          } else {
            L11: {
              L12: {
                stackIn_79_0 = rga.field_g;

                if (!param1) {
                  break L12;
                } else {
                  stackIn_79_0 = (llb) ((Object) stackIn_79_0);

                  if (wo.field_o) {
                    break L12;
                  } else {
                    stackIn_80_0 = (llb) ((Object) stackIn_79_0);
                    stackIn_80_1 = 1;
                    break L11;
                  }
                }
              }
              stackIn_80_0 = (llb) ((Object) stackIn_79_0);
              stackIn_80_1 = 0;
              break L11;
            }
            L13: {
              L14: {
                ((llb) (Object) stackIn_80_0).b(stackIn_80_1 != 0, 101);
                stackIn_83_0 = vva.field_r;

                if (!param1) {
                  break L14;
                } else {
                  stackIn_83_0 = (llb) ((Object) stackIn_83_0);

                  if (wo.field_o) {
                    break L14;
                  } else {
                    stackIn_84_0 = (llb) ((Object) stackIn_83_0);
                    stackIn_84_1 = 1;
                    break L13;
                  }
                }
              }
              stackIn_84_0 = (llb) ((Object) stackIn_83_0);
              stackIn_84_1 = 0;
              break L13;
            }
            ((llb) (Object) stackIn_84_0).b(stackIn_84_1 != 0, 101);
            bia.a((byte) 124);
            return;
          }
        } else {
          L15: {
            field_p = (java.awt.Image) null;
            qca.a(dma.field_g - -640 >> 948054593, dma.field_j, dma.field_g + -640 >> 1408966625, true, 0);
            if (0 < lia.field_b) {
              L16: {
                if (null != kl.field_c) {
                  kl.field_c.c(tb.field_a.field_L, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  stackIn_9_0 = tb.field_a;

                  if (!param1) {
                    break L18;
                  } else {
                    stackIn_9_0 = (llb) ((Object) stackIn_9_0);

                    if (bv.field_d) {
                      break L18;
                    } else {
                      stackIn_10_0 = (llb) ((Object) stackIn_9_0);
                      stackIn_10_1 = 1;
                      break L17;
                    }
                  }
                }
                stackIn_10_0 = (llb) ((Object) stackIn_9_0);
                stackIn_10_1 = 0;
                break L17;
              }
              L19: {
                L20: {
                  ((llb) (Object) stackIn_10_0).b(stackIn_10_1 != 0, -109);
                  stackIn_13_0 = bqa.field_d;

                  if (!param1) {
                    break L20;
                  } else {
                    stackIn_13_0 = (llb) ((Object) stackIn_13_0);

                    if (bv.field_d) {
                      break L20;
                    } else {
                      stackIn_14_0 = (llb) ((Object) stackIn_13_0);
                      stackIn_14_1 = 1;
                      break L19;
                    }
                  }
                }
                stackIn_14_0 = (llb) ((Object) stackIn_13_0);
                stackIn_14_1 = 0;
                break L19;
              }
              ((llb) (Object) stackIn_14_0).b(stackIn_14_1 != 0, 113);
              break L15;
            } else {
              break L15;
            }
          }
          if (nf.field_a <= 0) {
            if (-1 > (tba.field_p ^ -1)) {
              if (null != kl.field_c) {
                L21: {
                  L22: {
                    kl.field_c.c(rga.field_g.field_L, 0);
                    stackIn_51_0 = rga.field_g;

                    if (!param1) {
                      break L22;
                    } else {
                      stackIn_51_0 = (llb) ((Object) stackIn_51_0);

                      if (wo.field_o) {
                        break L22;
                      } else {
                        stackIn_52_0 = (llb) ((Object) stackIn_51_0);
                        stackIn_52_1 = 1;
                        break L21;
                      }
                    }
                  }
                  stackIn_52_0 = (llb) ((Object) stackIn_51_0);
                  stackIn_52_1 = 0;
                  break L21;
                }
                L23: {
                  L24: {
                    ((llb) (Object) stackIn_52_0).b(stackIn_52_1 != 0, 101);
                    stackIn_55_0 = vva.field_r;

                    if (!param1) {
                      break L24;
                    } else {
                      stackIn_55_0 = (llb) ((Object) stackIn_55_0);

                      if (wo.field_o) {
                        break L24;
                      } else {
                        stackIn_56_0 = (llb) ((Object) stackIn_55_0);
                        stackIn_56_1 = 1;
                        break L23;
                      }
                    }
                  }
                  stackIn_56_0 = (llb) ((Object) stackIn_55_0);
                  stackIn_56_1 = 0;
                  break L23;
                }
                ((llb) (Object) stackIn_56_0).b(stackIn_56_1 != 0, 101);
                bia.a((byte) 124);
                return;
              } else {
                L25: {
                  L26: {
                    stackIn_42_0 = rga.field_g;

                    if (!param1) {
                      break L26;
                    } else {
                      stackIn_42_0 = (llb) ((Object) stackIn_42_0);

                      if (wo.field_o) {
                        break L26;
                      } else {
                        stackIn_43_0 = (llb) ((Object) stackIn_42_0);
                        stackIn_43_1 = 1;
                        break L25;
                      }
                    }
                  }
                  stackIn_43_0 = (llb) ((Object) stackIn_42_0);
                  stackIn_43_1 = 0;
                  break L25;
                }
                L27: {
                  L28: {
                    ((llb) (Object) stackIn_43_0).b(stackIn_43_1 != 0, 101);
                    stackIn_46_0 = vva.field_r;

                    if (!param1) {
                      break L28;
                    } else {
                      stackIn_46_0 = (llb) ((Object) stackIn_46_0);

                      if (wo.field_o) {
                        break L28;
                      } else {
                        stackIn_47_0 = (llb) ((Object) stackIn_46_0);
                        stackIn_47_1 = 1;
                        break L27;
                      }
                    }
                  }
                  stackIn_47_0 = (llb) ((Object) stackIn_46_0);
                  stackIn_47_1 = 0;
                  break L27;
                }
                ((llb) (Object) stackIn_47_0).b(stackIn_47_1 != 0, 101);
                bia.a((byte) 124);
                return;
              }
            } else {
              bia.a((byte) 124);
              return;
            }
          } else {
            if (null != kl.field_c) {
              L29: {
                L30: {
                  kl.field_c.c(rga.field_g.field_L, 0);
                  stackIn_29_0 = rga.field_g;

                  if (!param1) {
                    break L30;
                  } else {
                    stackIn_29_0 = (llb) ((Object) stackIn_29_0);

                    if (wo.field_o) {
                      break L30;
                    } else {
                      stackIn_30_0 = (llb) ((Object) stackIn_29_0);
                      stackIn_30_1 = 1;
                      break L29;
                    }
                  }
                }
                stackIn_30_0 = (llb) ((Object) stackIn_29_0);
                stackIn_30_1 = 0;
                break L29;
              }
              L31: {
                L32: {
                  ((llb) (Object) stackIn_30_0).b(stackIn_30_1 != 0, 101);
                  stackIn_33_0 = vva.field_r;

                  if (!param1) {
                    break L32;
                  } else {
                    stackIn_33_0 = (llb) ((Object) stackIn_33_0);

                    if (wo.field_o) {
                      break L32;
                    } else {
                      stackIn_34_0 = (llb) ((Object) stackIn_33_0);
                      stackIn_34_1 = 1;
                      break L31;
                    }
                  }
                }
                stackIn_34_0 = (llb) ((Object) stackIn_33_0);
                stackIn_34_1 = 0;
                break L31;
              }
              ((llb) (Object) stackIn_34_0).b(stackIn_34_1 != 0, 101);
              bia.a((byte) 124);
              return;
            } else {
              L33: {
                L34: {
                  stackIn_20_0 = rga.field_g;

                  if (!param1) {
                    break L34;
                  } else {
                    stackIn_20_0 = (llb) ((Object) stackIn_20_0);

                    if (wo.field_o) {
                      break L34;
                    } else {
                      stackIn_21_0 = (llb) ((Object) stackIn_20_0);
                      stackIn_21_1 = 1;
                      break L33;
                    }
                  }
                }
                stackIn_21_0 = (llb) ((Object) stackIn_20_0);
                stackIn_21_1 = 0;
                break L33;
              }
              L35: {
                L36: {
                  ((llb) (Object) stackIn_21_0).b(stackIn_21_1 != 0, 101);
                  stackIn_24_0 = vva.field_r;

                  if (!param1) {
                    break L36;
                  } else {
                    stackIn_24_0 = (llb) ((Object) stackIn_24_0);

                    if (wo.field_o) {
                      break L36;
                    } else {
                      stackIn_25_0 = (llb) ((Object) stackIn_24_0);
                      stackIn_25_1 = 1;
                      break L35;
                    }
                  }
                }
                stackIn_25_0 = (llb) ((Object) stackIn_24_0);
                stackIn_25_1 = 0;
                break L35;
              }
              ((llb) (Object) stackIn_25_0).b(stackIn_25_1 != 0, 101);
              bia.a((byte) 124);
              return;
            }
          }
        }
    }

    static {
        field_q = 0;
        field_o = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
