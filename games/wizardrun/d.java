/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static String field_a;
    static int[] field_c;

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_146_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = wizardrun.field_H;
        if (og.field_O == -1) {
          if ((ee.field_r ^ -1) != 0) {
            L0: {
              L1: {
                gj.field_b = gj.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) vb.field_I)) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (null != vb.field_I) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!ol.field_b) {
                  if (jc.field_I <= gj.field_b) {
                    if (jc.field_I - -ll.field_o > gj.field_b) {
                      stackOut_144_0 = 1;
                      stackIn_146_0 = stackOut_144_0;
                      break L2;
                    } else {
                      stackOut_143_0 = 0;
                      stackIn_146_0 = stackOut_143_0;
                      break L2;
                    }
                  } else {
                    stackOut_141_0 = 0;
                    stackIn_146_0 = stackOut_141_0;
                    break L2;
                  }
                } else {
                  stackOut_139_0 = 0;
                  stackIn_146_0 = stackOut_139_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = stackIn_146_0;
                  if (param0 == null) {
                    break L4;
                  } else {
                    if (ol.field_b) {
                      gj.field_b = jc.field_I;
                      break L3;
                    } else {
                      if (var2 == 0) {
                        break L4;
                      } else {
                        gj.field_b = jc.field_I;
                        break L3;
                      }
                    }
                  }
                }
                gj.field_b = 0;
                break L3;
              }
              L5: {
                uc.field_a = og.field_O;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    ol.field_b = true;
                    ag.field_u = ee.field_r;
                    break L0;
                  }
                } else {
                  ol.field_b = false;
                  break L5;
                }
              }
              ag.field_u = ee.field_r;
              break L0;
            }
            L6: {
              if (ol.field_b) {
                break L6;
              } else {
                if (jc.field_I <= gj.field_b) {
                  break L6;
                } else {
                  if (ih.field_a) {
                    ag.field_u = ee.field_r;
                    uc.field_a = og.field_O;
                    gj.field_b = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              vb.field_I = param0;
              ee.field_r = -1;
              og.field_O = -1;
              if (param1 == 0) {
                break L7;
              } else {
                boolean discarded$6 = d.a(false, 'b');
                break L7;
              }
            }
            L8: {
              if (!ol.field_b) {
                break L8;
              } else {
                if (q.field_b != gj.field_b) {
                  break L8;
                } else {
                  ol.field_b = false;
                  gj.field_b = 0;
                  break L8;
                }
              }
            }
            return;
          } else {
            L9: {
              L10: {
                og.field_O = pg.field_n;
                ee.field_r = fi.field_B;
                gj.field_b = gj.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) vb.field_I)) {
                    break L9;
                  } else {
                    break L10;
                  }
                } else {
                  if (null != vb.field_I) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (!ol.field_b) {
                  if (jc.field_I <= gj.field_b) {
                    if (jc.field_I - -ll.field_o <= gj.field_b) {
                      stackOut_108_0 = 0;
                      stackIn_110_0 = stackOut_108_0;
                      break L11;
                    } else {
                      stackOut_107_0 = 1;
                      stackIn_110_0 = stackOut_107_0;
                      break L11;
                    }
                  } else {
                    stackOut_105_0 = 0;
                    stackIn_110_0 = stackOut_105_0;
                    break L11;
                  }
                } else {
                  stackOut_103_0 = 0;
                  stackIn_110_0 = stackOut_103_0;
                  break L11;
                }
              }
              L12: {
                L13: {
                  var2 = stackIn_110_0;
                  if (param0 == null) {
                    break L13;
                  } else {
                    if (ol.field_b) {
                      gj.field_b = jc.field_I;
                      break L12;
                    } else {
                      if (var2 == 0) {
                        break L13;
                      } else {
                        gj.field_b = jc.field_I;
                        break L12;
                      }
                    }
                  }
                }
                gj.field_b = 0;
                break L12;
              }
              L14: {
                uc.field_a = og.field_O;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L14;
                  } else {
                    ol.field_b = true;
                    break L14;
                  }
                } else {
                  ol.field_b = false;
                  break L14;
                }
              }
              ag.field_u = ee.field_r;
              break L9;
            }
            L15: {
              if (ol.field_b) {
                break L15;
              } else {
                if (jc.field_I <= gj.field_b) {
                  break L15;
                } else {
                  if (ih.field_a) {
                    ag.field_u = ee.field_r;
                    uc.field_a = og.field_O;
                    gj.field_b = 0;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              }
            }
            L16: {
              vb.field_I = param0;
              ee.field_r = -1;
              og.field_O = -1;
              if (param1 == 0) {
                break L16;
              } else {
                boolean discarded$7 = d.a(false, 'b');
                break L16;
              }
            }
            L17: {
              if (!ol.field_b) {
                break L17;
              } else {
                if (q.field_b != gj.field_b) {
                  break L17;
                } else {
                  ol.field_b = false;
                  gj.field_b = 0;
                  break L17;
                }
              }
            }
            return;
          }
        } else {
          gj.field_b = gj.field_b + 1;
          if (param0 != null) {
            if (param0.equals((Object) (Object) vb.field_I)) {
              L18: {
                if (ol.field_b) {
                  break L18;
                } else {
                  if (jc.field_I <= gj.field_b) {
                    break L18;
                  } else {
                    if (ih.field_a) {
                      ag.field_u = ee.field_r;
                      uc.field_a = og.field_O;
                      gj.field_b = 0;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              L19: {
                vb.field_I = param0;
                ee.field_r = -1;
                og.field_O = -1;
                if (param1 == 0) {
                  break L19;
                } else {
                  boolean discarded$8 = d.a(false, 'b');
                  break L19;
                }
              }
              L20: {
                if (!ol.field_b) {
                  break L20;
                } else {
                  if (q.field_b != gj.field_b) {
                    break L20;
                  } else {
                    ol.field_b = false;
                    gj.field_b = 0;
                    break L20;
                  }
                }
              }
              return;
            } else {
              L21: {
                if (!ol.field_b) {
                  if (jc.field_I <= gj.field_b) {
                    if (jc.field_I - -ll.field_o > gj.field_b) {
                      stackOut_56_0 = 1;
                      stackIn_58_0 = stackOut_56_0;
                      break L21;
                    } else {
                      stackOut_55_0 = 0;
                      stackIn_58_0 = stackOut_55_0;
                      break L21;
                    }
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_58_0 = stackOut_53_0;
                    break L21;
                  }
                } else {
                  stackOut_51_0 = 0;
                  stackIn_58_0 = stackOut_51_0;
                  break L21;
                }
              }
              L22: {
                var2 = stackIn_58_0;
                if (param0 != null) {
                  if (ol.field_b) {
                    gj.field_b = jc.field_I;
                    break L22;
                  } else {
                    if (var2 != 0) {
                      gj.field_b = jc.field_I;
                      break L22;
                    } else {
                      gj.field_b = 0;
                      break L22;
                    }
                  }
                } else {
                  gj.field_b = 0;
                  break L22;
                }
              }
              L23: {
                L24: {
                  uc.field_a = og.field_O;
                  if (param0 == null) {
                    if (var2 == 0) {
                      break L24;
                    } else {
                      ol.field_b = true;
                      ag.field_u = ee.field_r;
                      break L23;
                    }
                  } else {
                    ol.field_b = false;
                    break L24;
                  }
                }
                ag.field_u = ee.field_r;
                break L23;
              }
              L25: {
                if (ol.field_b) {
                  break L25;
                } else {
                  if (jc.field_I <= gj.field_b) {
                    break L25;
                  } else {
                    if (ih.field_a) {
                      ag.field_u = ee.field_r;
                      uc.field_a = og.field_O;
                      gj.field_b = 0;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              L26: {
                vb.field_I = param0;
                ee.field_r = -1;
                og.field_O = -1;
                if (param1 == 0) {
                  break L26;
                } else {
                  boolean discarded$9 = d.a(false, 'b');
                  break L26;
                }
              }
              L27: {
                if (!ol.field_b) {
                  break L27;
                } else {
                  if (q.field_b != gj.field_b) {
                    break L27;
                  } else {
                    ol.field_b = false;
                    gj.field_b = 0;
                    break L27;
                  }
                }
              }
              return;
            }
          } else {
            if (null != vb.field_I) {
              L28: {
                if (ol.field_b) {
                  break L28;
                } else {
                  if (jc.field_I <= gj.field_b) {
                    break L28;
                  } else {
                    if (ih.field_a) {
                      ag.field_u = ee.field_r;
                      uc.field_a = og.field_O;
                      gj.field_b = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              L29: {
                vb.field_I = param0;
                ee.field_r = -1;
                og.field_O = -1;
                if (param1 == 0) {
                  break L29;
                } else {
                  boolean discarded$10 = d.a(false, 'b');
                  break L29;
                }
              }
              L30: {
                if (!ol.field_b) {
                  break L30;
                } else {
                  if (q.field_b != gj.field_b) {
                    break L30;
                  } else {
                    ol.field_b = false;
                    gj.field_b = 0;
                    break L30;
                  }
                }
              }
              return;
            } else {
              L31: {
                if (!ol.field_b) {
                  if (jc.field_I <= gj.field_b) {
                    if (jc.field_I - -ll.field_o > gj.field_b) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L31;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L31;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L31;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L31;
                }
              }
              L32: {
                var2 = stackIn_11_0;
                if (param0 != null) {
                  L33: {
                    if (ol.field_b) {
                      break L33;
                    } else {
                      if (var2 != 0) {
                        break L33;
                      } else {
                        gj.field_b = 0;
                        break L32;
                      }
                    }
                  }
                  gj.field_b = jc.field_I;
                  break L32;
                } else {
                  gj.field_b = 0;
                  break L32;
                }
              }
              L34: {
                L35: {
                  uc.field_a = og.field_O;
                  if (param0 == null) {
                    if (var2 == 0) {
                      break L35;
                    } else {
                      ol.field_b = true;
                      ag.field_u = ee.field_r;
                      break L34;
                    }
                  } else {
                    ol.field_b = false;
                    break L35;
                  }
                }
                ag.field_u = ee.field_r;
                break L34;
              }
              L36: {
                if (ol.field_b) {
                  break L36;
                } else {
                  if (jc.field_I <= gj.field_b) {
                    break L36;
                  } else {
                    if (ih.field_a) {
                      ag.field_u = ee.field_r;
                      uc.field_a = og.field_O;
                      gj.field_b = 0;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
              }
              L37: {
                vb.field_I = param0;
                ee.field_r = -1;
                og.field_O = -1;
                if (param1 == 0) {
                  break L37;
                } else {
                  boolean discarded$11 = d.a(false, 'b');
                  break L37;
                }
              }
              L38: {
                if (!ol.field_b) {
                  break L38;
                } else {
                  if (q.field_b != gj.field_b) {
                    break L38;
                  } else {
                    ol.field_b = false;
                    gj.field_b = 0;
                    break L38;
                  }
                }
              }
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -5309) {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final synchronized static long a(byte param0) {
        long var1 = 0L;
        if (param0 >= 16) {
          var1 = System.currentTimeMillis();
          if (var1 < sj.field_k) {
            rb.field_d = rb.field_d + (-var1 + sj.field_k);
            sj.field_k = var1;
            return rb.field_d + var1;
          } else {
            sj.field_k = var1;
            return rb.field_d + var1;
          }
        } else {
          return 0L;
        }
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          d.a(87);
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new int[8192];
    }
}
