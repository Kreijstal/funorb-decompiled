/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ht implements Iterable {
    static sj field_c;
    gn[] field_e;
    static String field_a;
    private gn field_f;
    static sj field_b;
    int field_d;

    final void a(gn param0, int param1, long param2) {
        gn var5 = null;
        try {
            if (null != param0.field_b) {
                param0.c((byte) -109);
            }
            if (param1 >= -14) {
                field_a = null;
            }
            var5 = ((ht) this).field_e[(int)((long)(((ht) this).field_d + -1) & param2)];
            param0.field_d = var5;
            param0.field_b = var5.field_b;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ht.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final gn a(long param0, byte param1) {
        gn var4 = null;
        gn var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (param1 >= 1) {
          var4 = ((ht) this).field_e[(int)(param0 & (long)(-1 + ((ht) this).field_d))];
          ((ht) this).field_f = var4.field_d;
          L0: while (true) {
            if (var4 != ((ht) this).field_f) {
              if (param0 == ((ht) this).field_f.field_a) {
                var5 = ((ht) this).field_f;
                ((ht) this).field_f = ((ht) this).field_f.field_d;
                return var5;
              } else {
                ((ht) this).field_f = ((ht) this).field_f.field_d;
                continue L0;
              }
            } else {
              ((ht) this).field_f = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ov((ht) this);
    }

    final static void a(boolean param0, byte param1) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12_double = 0.0;
        int var12 = 0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double stackIn_4_0 = 0.0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        double stackIn_52_0 = 0.0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_271_0 = 0;
        int stackIn_289_0 = 0;
        double stackOut_51_0 = 0.0;
        double stackOut_50_0 = 0.0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_270_0 = 0;
        int stackOut_269_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        double stackOut_3_0 = 0.0;
        double stackOut_2_0 = 0.0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        if (848.0 <= la.field_d) {
          L0: {
            if (param0) {
              stackOut_51_0 = 1.4;
              stackIn_52_0 = stackOut_51_0;
              break L0;
            } else {
              stackOut_50_0 = 0.013999999999999999;
              stackIn_52_0 = stackOut_50_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_52_0;
            if (2048.0 < la.field_d) {
              la.field_d = 2048.0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var4 = wm.field_C - hd.field_K;
            var6 = -jr.field_Gb + cq.field_f;
            var8 = la.field_d - hw.field_f;
            var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            if (var10 <= 0.0001) {
              break L2;
            } else {
              L3: {
                var12_double = mc.a(var10, var2, false) / var10;
                var14 = var12_double * var4;
                var16 = var12_double * var6;
                var18 = var12_double * var8;
                var20 = var14 - up.field_f;
                var22 = -tf.field_a + var16;
                var24 = -o.field_e + var18;
                var26 = Math.sqrt(var24 * var24 + (var22 * var22 + var20 * var20));
                if (var2 < var26) {
                  var22 = var2 * var22 / var26;
                  var24 = var24 * var2 / var26;
                  var20 = var20 * var2 / var26;
                  break L3;
                } else {
                  break L3;
                }
              }
              up.field_f = up.field_f + var20;
              o.field_e = o.field_e + var24;
              tf.field_a = tf.field_a + var22;
              break L2;
            }
          }
          L4: {
            if (hd.field_K >= wm.field_C) {
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              break L4;
            } else {
              stackOut_61_0 = 1;
              stackIn_63_0 = stackOut_61_0;
              break L4;
            }
          }
          var12 = stackIn_63_0;
          hd.field_K = hd.field_K + up.field_f;
          if (var12 == 0) {
            if (var12 == 0) {
              if (hd.field_K >= wm.field_C) {
                L5: {
                  if (cq.field_f <= jr.field_Gb) {
                    stackOut_245_0 = 0;
                    stackIn_246_0 = stackOut_245_0;
                    break L5;
                  } else {
                    stackOut_244_0 = 1;
                    stackIn_246_0 = stackOut_244_0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var12 = stackIn_246_0;
                    jr.field_Gb = jr.field_Gb + tf.field_a;
                    if (var12 == 0) {
                      if (var12 != 0) {
                        break L6;
                      } else {
                        if (cq.field_f > jr.field_Gb) {
                          break L7;
                        } else {
                          L8: {
                            if (la.field_d <= hw.field_f) {
                              stackOut_270_0 = 0;
                              stackIn_271_0 = stackOut_270_0;
                              break L8;
                            } else {
                              stackOut_269_0 = 1;
                              stackIn_271_0 = stackOut_269_0;
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var12 = stackIn_271_0;
                              hw.field_f = hw.field_f + o.field_e;
                              if (var12 == 0) {
                                break L10;
                              } else {
                                if (hw.field_f > la.field_d) {
                                  hw.field_f = la.field_d;
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var12 != 0) {
                              break L9;
                            } else {
                              if (la.field_d <= hw.field_f) {
                                break L9;
                              } else {
                                L11: {
                                  hw.field_f = la.field_d;
                                  sp.i(-320);
                                  if (0.0 == fw.field_G) {
                                    break L11;
                                  } else {
                                    fw.field_G = fw.field_G * -0.9;
                                    break L11;
                                  }
                                }
                                hw.field_i = (int)hw.field_f >> 3;
                                return;
                              }
                            }
                          }
                          sp.i(-320);
                          if (0.0 != fw.field_G) {
                            fw.field_G = fw.field_G * -0.9;
                            hw.field_i = (int)hw.field_f >> 3;
                            return;
                          } else {
                            hw.field_i = (int)hw.field_f >> 3;
                            return;
                          }
                        }
                      }
                    } else {
                      if (jr.field_Gb > cq.field_f) {
                        break L7;
                      } else {
                        L12: {
                          if (var12 != 0) {
                            break L12;
                          } else {
                            if (cq.field_f > jr.field_Gb) {
                              jr.field_Gb = cq.field_f;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (la.field_d <= hw.field_f) {
                            stackOut_254_0 = 0;
                            stackIn_255_0 = stackOut_254_0;
                            break L13;
                          } else {
                            stackOut_253_0 = 1;
                            stackIn_255_0 = stackOut_253_0;
                            break L13;
                          }
                        }
                        L14: {
                          L15: {
                            var12 = stackIn_255_0;
                            hw.field_f = hw.field_f + o.field_e;
                            if (var12 == 0) {
                              break L15;
                            } else {
                              if (hw.field_f > la.field_d) {
                                hw.field_f = la.field_d;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if (var12 != 0) {
                            break L14;
                          } else {
                            if (la.field_d <= hw.field_f) {
                              break L14;
                            } else {
                              hw.field_f = la.field_d;
                              break L14;
                            }
                          }
                        }
                        L16: {
                          sp.i(-320);
                          if (0.0 == fw.field_G) {
                            break L16;
                          } else {
                            fw.field_G = fw.field_G * -0.9;
                            break L16;
                          }
                        }
                        hw.field_i = (int)hw.field_f >> 3;
                        return;
                      }
                    }
                  }
                  jr.field_Gb = cq.field_f;
                  break L6;
                }
                L17: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_288_0 = 0;
                    stackIn_289_0 = stackOut_288_0;
                    break L17;
                  } else {
                    stackOut_287_0 = 1;
                    stackIn_289_0 = stackOut_287_0;
                    break L17;
                  }
                }
                var12 = stackIn_289_0;
                hw.field_f = hw.field_f + o.field_e;
                if (var12 == 0) {
                  L18: {
                    if (var12 != 0) {
                      break L18;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L18;
                      } else {
                        L19: {
                          hw.field_f = la.field_d;
                          sp.i(-320);
                          if (0.0 == fw.field_G) {
                            break L19;
                          } else {
                            fw.field_G = fw.field_G * -0.9;
                            break L19;
                          }
                        }
                        hw.field_i = (int)hw.field_f >> 3;
                        return;
                      }
                    }
                  }
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    hw.field_i = (int)hw.field_f >> 3;
                    return;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    hw.field_i = (int)hw.field_f >> 3;
                    return;
                  }
                } else {
                  if (hw.field_f <= la.field_d) {
                    L20: {
                      if (var12 != 0) {
                        break L20;
                      } else {
                        if (la.field_d <= hw.field_f) {
                          break L20;
                        } else {
                          hw.field_f = la.field_d;
                          break L20;
                        }
                      }
                    }
                    L21: {
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L21;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L21;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> 3;
                    return;
                  } else {
                    L22: {
                      hw.field_f = la.field_d;
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L22;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L22;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> 3;
                    return;
                  }
                }
              } else {
                L23: {
                  hd.field_K = wm.field_C;
                  if (cq.field_f <= jr.field_Gb) {
                    stackOut_221_0 = 0;
                    stackIn_222_0 = stackOut_221_0;
                    break L23;
                  } else {
                    stackOut_220_0 = 1;
                    stackIn_222_0 = stackOut_220_0;
                    break L23;
                  }
                }
                L24: {
                  L25: {
                    L26: {
                      var12 = stackIn_222_0;
                      jr.field_Gb = jr.field_Gb + tf.field_a;
                      if (var12 == 0) {
                        break L26;
                      } else {
                        if (jr.field_Gb > cq.field_f) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L24;
                    } else {
                      if (cq.field_f > jr.field_Gb) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  jr.field_Gb = cq.field_f;
                  break L24;
                }
                L27: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_231_0 = 0;
                    stackIn_232_0 = stackOut_231_0;
                    break L27;
                  } else {
                    stackOut_230_0 = 1;
                    stackIn_232_0 = stackOut_230_0;
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    var12 = stackIn_232_0;
                    hw.field_f = hw.field_f + o.field_e;
                    if (var12 == 0) {
                      break L29;
                    } else {
                      if (hw.field_f > la.field_d) {
                        hw.field_f = la.field_d;
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L28;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L28;
                    } else {
                      hw.field_f = la.field_d;
                      break L28;
                    }
                  }
                }
                L30: {
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    break L30;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    break L30;
                  }
                }
                hw.field_i = (int)hw.field_f >> 3;
                return;
              }
            } else {
              L31: {
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_150_0 = 0;
                  stackIn_151_0 = stackOut_150_0;
                  break L31;
                } else {
                  stackOut_149_0 = 1;
                  stackIn_151_0 = stackOut_149_0;
                  break L31;
                }
              }
              L32: {
                var12 = stackIn_151_0;
                jr.field_Gb = jr.field_Gb + tf.field_a;
                if (var12 == 0) {
                  if (var12 != 0) {
                    break L32;
                  } else {
                    if (cq.field_f <= jr.field_Gb) {
                      L33: {
                        if (la.field_d <= hw.field_f) {
                          stackOut_177_0 = 0;
                          stackIn_178_0 = stackOut_177_0;
                          break L33;
                        } else {
                          stackOut_176_0 = 1;
                          stackIn_178_0 = stackOut_176_0;
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          var12 = stackIn_178_0;
                          hw.field_f = hw.field_f + o.field_e;
                          if (var12 == 0) {
                            break L35;
                          } else {
                            if (hw.field_f > la.field_d) {
                              hw.field_f = la.field_d;
                              break L34;
                            } else {
                              break L35;
                            }
                          }
                        }
                        if (var12 != 0) {
                          break L34;
                        } else {
                          if (la.field_d <= hw.field_f) {
                            break L34;
                          } else {
                            L36: {
                              hw.field_f = la.field_d;
                              sp.i(-320);
                              if (0.0 == fw.field_G) {
                                break L36;
                              } else {
                                fw.field_G = fw.field_G * -0.9;
                                break L36;
                              }
                            }
                            hw.field_i = (int)hw.field_f >> 3;
                            return;
                          }
                        }
                      }
                      sp.i(-320);
                      if (0.0 != fw.field_G) {
                        fw.field_G = fw.field_G * -0.9;
                        hw.field_i = (int)hw.field_f >> 3;
                        return;
                      } else {
                        hw.field_i = (int)hw.field_f >> 3;
                        return;
                      }
                    } else {
                      jr.field_Gb = cq.field_f;
                      break L32;
                    }
                  }
                } else {
                  if (jr.field_Gb <= cq.field_f) {
                    L37: {
                      if (var12 != 0) {
                        break L37;
                      } else {
                        if (cq.field_f > jr.field_Gb) {
                          jr.field_Gb = cq.field_f;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (la.field_d <= hw.field_f) {
                        stackOut_160_0 = 0;
                        stackIn_161_0 = stackOut_160_0;
                        break L38;
                      } else {
                        stackOut_159_0 = 1;
                        stackIn_161_0 = stackOut_159_0;
                        break L38;
                      }
                    }
                    L39: {
                      L40: {
                        var12 = stackIn_161_0;
                        hw.field_f = hw.field_f + o.field_e;
                        if (var12 == 0) {
                          break L40;
                        } else {
                          if (hw.field_f > la.field_d) {
                            hw.field_f = la.field_d;
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      if (var12 != 0) {
                        break L39;
                      } else {
                        if (la.field_d <= hw.field_f) {
                          break L39;
                        } else {
                          hw.field_f = la.field_d;
                          break L39;
                        }
                      }
                    }
                    L41: {
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L41;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L41;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> 3;
                    return;
                  } else {
                    jr.field_Gb = cq.field_f;
                    break L32;
                  }
                }
              }
              L42: {
                if (la.field_d <= hw.field_f) {
                  stackOut_194_0 = 0;
                  stackIn_195_0 = stackOut_194_0;
                  break L42;
                } else {
                  stackOut_193_0 = 1;
                  stackIn_195_0 = stackOut_193_0;
                  break L42;
                }
              }
              var12 = stackIn_195_0;
              hw.field_f = hw.field_f + o.field_e;
              if (var12 == 0) {
                L43: {
                  if (var12 != 0) {
                    break L43;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L43;
                    } else {
                      L44: {
                        hw.field_f = la.field_d;
                        sp.i(-320);
                        if (0.0 == fw.field_G) {
                          break L44;
                        } else {
                          fw.field_G = fw.field_G * -0.9;
                          break L44;
                        }
                      }
                      hw.field_i = (int)hw.field_f >> 3;
                      return;
                    }
                  }
                }
                sp.i(-320);
                if (0.0 != fw.field_G) {
                  fw.field_G = fw.field_G * -0.9;
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                } else {
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                }
              } else {
                if (hw.field_f <= la.field_d) {
                  L45: {
                    if (var12 != 0) {
                      break L45;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L45;
                      } else {
                        hw.field_f = la.field_d;
                        break L45;
                      }
                    }
                  }
                  L46: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L46;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L46;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                } else {
                  L47: {
                    hw.field_f = la.field_d;
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L47;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L47;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                }
              }
            }
          } else {
            if (hd.field_K <= wm.field_C) {
              L48: {
                if (var12 != 0) {
                  break L48;
                } else {
                  if (hd.field_K >= wm.field_C) {
                    break L48;
                  } else {
                    hd.field_K = wm.field_C;
                    break L48;
                  }
                }
              }
              L49: {
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_94_0 = 0;
                  stackIn_95_0 = stackOut_94_0;
                  break L49;
                } else {
                  stackOut_93_0 = 1;
                  stackIn_95_0 = stackOut_93_0;
                  break L49;
                }
              }
              var12 = stackIn_95_0;
              jr.field_Gb = jr.field_Gb + tf.field_a;
              if (var12 != 0) {
                if (jr.field_Gb > cq.field_f) {
                  L50: {
                    jr.field_Gb = cq.field_f;
                    if (la.field_d <= hw.field_f) {
                      stackOut_134_0 = 0;
                      stackIn_135_0 = stackOut_134_0;
                      break L50;
                    } else {
                      stackOut_133_0 = 1;
                      stackIn_135_0 = stackOut_133_0;
                      break L50;
                    }
                  }
                  L51: {
                    L52: {
                      var12 = stackIn_135_0;
                      hw.field_f = hw.field_f + o.field_e;
                      if (var12 == 0) {
                        break L52;
                      } else {
                        if (hw.field_f > la.field_d) {
                          hw.field_f = la.field_d;
                          break L51;
                        } else {
                          break L52;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L51;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L51;
                      } else {
                        hw.field_f = la.field_d;
                        break L51;
                      }
                    }
                  }
                  L53: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L53;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L53;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                } else {
                  L54: {
                    if (var12 != 0) {
                      break L54;
                    } else {
                      if (cq.field_f > jr.field_Gb) {
                        jr.field_Gb = cq.field_f;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                  }
                  L55: {
                    if (la.field_d <= hw.field_f) {
                      stackOut_120_0 = 0;
                      stackIn_121_0 = stackOut_120_0;
                      break L55;
                    } else {
                      stackOut_119_0 = 1;
                      stackIn_121_0 = stackOut_119_0;
                      break L55;
                    }
                  }
                  L56: {
                    L57: {
                      var12 = stackIn_121_0;
                      hw.field_f = hw.field_f + o.field_e;
                      if (var12 == 0) {
                        break L57;
                      } else {
                        if (hw.field_f > la.field_d) {
                          hw.field_f = la.field_d;
                          break L56;
                        } else {
                          break L57;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L56;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L56;
                      } else {
                        hw.field_f = la.field_d;
                        break L56;
                      }
                    }
                  }
                  L58: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L58;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L58;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> 3;
                  return;
                }
              } else {
                L59: {
                  if (cq.field_f > jr.field_Gb) {
                    jr.field_Gb = cq.field_f;
                    break L59;
                  } else {
                    break L59;
                  }
                }
                L60: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_101_0 = 0;
                    stackIn_102_0 = stackOut_101_0;
                    break L60;
                  } else {
                    stackOut_100_0 = 1;
                    stackIn_102_0 = stackOut_100_0;
                    break L60;
                  }
                }
                L61: {
                  L62: {
                    var12 = stackIn_102_0;
                    hw.field_f = hw.field_f + o.field_e;
                    if (var12 == 0) {
                      break L62;
                    } else {
                      if (hw.field_f > la.field_d) {
                        hw.field_f = la.field_d;
                        break L61;
                      } else {
                        break L62;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L61;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L61;
                    } else {
                      hw.field_f = la.field_d;
                      break L61;
                    }
                  }
                }
                L63: {
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    break L63;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    break L63;
                  }
                }
                hw.field_i = (int)hw.field_f >> 3;
                return;
              }
            } else {
              L64: {
                hd.field_K = wm.field_C;
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_67_0 = 0;
                  stackIn_68_0 = stackOut_67_0;
                  break L64;
                } else {
                  stackOut_66_0 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  break L64;
                }
              }
              L65: {
                L66: {
                  L67: {
                    var12 = stackIn_68_0;
                    jr.field_Gb = jr.field_Gb + tf.field_a;
                    if (var12 == 0) {
                      break L67;
                    } else {
                      if (jr.field_Gb > cq.field_f) {
                        break L66;
                      } else {
                        break L67;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L65;
                  } else {
                    if (cq.field_f > jr.field_Gb) {
                      break L66;
                    } else {
                      break L65;
                    }
                  }
                }
                jr.field_Gb = cq.field_f;
                break L65;
              }
              L68: {
                if (la.field_d <= hw.field_f) {
                  stackOut_77_0 = 0;
                  stackIn_78_0 = stackOut_77_0;
                  break L68;
                } else {
                  stackOut_76_0 = 1;
                  stackIn_78_0 = stackOut_76_0;
                  break L68;
                }
              }
              L69: {
                L70: {
                  var12 = stackIn_78_0;
                  hw.field_f = hw.field_f + o.field_e;
                  if (var12 == 0) {
                    break L70;
                  } else {
                    if (hw.field_f > la.field_d) {
                      hw.field_f = la.field_d;
                      break L69;
                    } else {
                      break L70;
                    }
                  }
                }
                if (var12 != 0) {
                  break L69;
                } else {
                  if (la.field_d <= hw.field_f) {
                    break L69;
                  } else {
                    hw.field_f = la.field_d;
                    break L69;
                  }
                }
              }
              L71: {
                sp.i(-320);
                if (0.0 == fw.field_G) {
                  break L71;
                } else {
                  fw.field_G = fw.field_G * -0.9;
                  break L71;
                }
              }
              hw.field_i = (int)hw.field_f >> 3;
              return;
            }
          }
        } else {
          L72: {
            la.field_d = 848.0;
            if (param0) {
              stackOut_3_0 = 1.4;
              stackIn_4_0 = stackOut_3_0;
              break L72;
            } else {
              stackOut_2_0 = 0.013999999999999999;
              stackIn_4_0 = stackOut_2_0;
              break L72;
            }
          }
          L73: {
            var2 = stackIn_4_0;
            if (2048.0 < la.field_d) {
              la.field_d = 2048.0;
              break L73;
            } else {
              break L73;
            }
          }
          L74: {
            var4 = wm.field_C - hd.field_K;
            var6 = -jr.field_Gb + cq.field_f;
            var8 = la.field_d - hw.field_f;
            var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            if (var10 <= 0.0001) {
              break L74;
            } else {
              L75: {
                var12_double = mc.a(var10, var2, false) / var10;
                var14 = var12_double * var4;
                var16 = var12_double * var6;
                var18 = var12_double * var8;
                var20 = var14 - up.field_f;
                var22 = -tf.field_a + var16;
                var24 = -o.field_e + var18;
                var26 = Math.sqrt(var24 * var24 + (var22 * var22 + var20 * var20));
                if (var2 < var26) {
                  var22 = var2 * var22 / var26;
                  var24 = var24 * var2 / var26;
                  var20 = var20 * var2 / var26;
                  break L75;
                } else {
                  break L75;
                }
              }
              up.field_f = up.field_f + var20;
              o.field_e = o.field_e + var24;
              tf.field_a = tf.field_a + var22;
              break L74;
            }
          }
          L76: {
            if (hd.field_K >= wm.field_C) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L76;
            } else {
              stackOut_13_0 = 1;
              stackIn_15_0 = stackOut_13_0;
              break L76;
            }
          }
          L77: {
            L78: {
              var12 = stackIn_15_0;
              hd.field_K = hd.field_K + up.field_f;
              if (var12 == 0) {
                break L78;
              } else {
                if (hd.field_K > wm.field_C) {
                  hd.field_K = wm.field_C;
                  break L77;
                } else {
                  break L78;
                }
              }
            }
            if (var12 != 0) {
              break L77;
            } else {
              if (hd.field_K >= wm.field_C) {
                break L77;
              } else {
                hd.field_K = wm.field_C;
                break L77;
              }
            }
          }
          L79: {
            if (cq.field_f <= jr.field_Gb) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L79;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L79;
            }
          }
          L80: {
            var12 = stackIn_26_0;
            jr.field_Gb = jr.field_Gb + tf.field_a;
            if (var12 != 0) {
              L81: {
                if (jr.field_Gb > cq.field_f) {
                  break L81;
                } else {
                  if (var12 != 0) {
                    break L80;
                  } else {
                    if (cq.field_f <= jr.field_Gb) {
                      break L80;
                    } else {
                      break L81;
                    }
                  }
                }
              }
              jr.field_Gb = cq.field_f;
              break L80;
            } else {
              if (var12 != 0) {
                break L80;
              } else {
                if (cq.field_f <= jr.field_Gb) {
                  break L80;
                } else {
                  jr.field_Gb = cq.field_f;
                  break L80;
                }
              }
            }
          }
          L82: {
            if (la.field_d <= hw.field_f) {
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L82;
            } else {
              stackOut_36_0 = 1;
              stackIn_38_0 = stackOut_36_0;
              break L82;
            }
          }
          L83: {
            L84: {
              var12 = stackIn_38_0;
              hw.field_f = hw.field_f + o.field_e;
              if (var12 == 0) {
                break L84;
              } else {
                if (hw.field_f > la.field_d) {
                  hw.field_f = la.field_d;
                  break L83;
                } else {
                  break L84;
                }
              }
            }
            if (var12 != 0) {
              break L83;
            } else {
              if (la.field_d <= hw.field_f) {
                break L83;
              } else {
                hw.field_f = la.field_d;
                break L83;
              }
            }
          }
          L85: {
            sp.i(-320);
            if (0.0 == fw.field_G) {
              break L85;
            } else {
              fw.field_G = fw.field_G * -0.9;
              break L85;
            }
          }
          hw.field_i = (int)hw.field_f >> 3;
          return;
        }
    }

    ht(int param0) {
        int var2 = 0;
        gn var3 = null;
        ((ht) this).field_e = new gn[param0];
        ((ht) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            gn dupTemp$0 = new gn();
            var3 = dupTemp$0;
            ((ht) this).field_e[var2] = dupTemp$0;
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "type in name and press 'Enter' to search for team";
    }
}
