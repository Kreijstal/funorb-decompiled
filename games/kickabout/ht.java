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
        gn var6 = null;
        gn var7 = null;
        gn var8 = null;
        gn var9 = null;
        if (null == param0.field_b) {
          if (param1 >= -14) {
            field_a = null;
            var8 = ((ht) this).field_e[(int)((long)(((ht) this).field_d + -1) & param2)];
            var5 = var8;
            param0.field_d = var5;
            param0.field_b = var8.field_b;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
            return;
          } else {
            var9 = ((ht) this).field_e[(int)((long)(((ht) this).field_d + -1) & param2)];
            var5 = var9;
            param0.field_d = var5;
            param0.field_b = var9.field_b;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
            return;
          }
        } else {
          param0.c((byte) -109);
          if (param1 < -14) {
            var6 = ((ht) this).field_e[(int)((long)(((ht) this).field_d + -1) & param2)];
            var5 = var6;
            param0.field_d = var5;
            param0.field_b = var6.field_b;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
            return;
          } else {
            field_a = null;
            var7 = ((ht) this).field_e[(int)((long)(((ht) this).field_d + -1) & param2)];
            var5 = var7;
            param0.field_d = var5;
            param0.field_b = var7.field_b;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            param0.field_a = param2;
            return;
          }
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
        double stackIn_5_0 = 0.0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_285_0 = 0;
        double stackOut_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_241_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          if (848.0 <= la.field_d) {
            break L0;
          } else {
            la.field_d = 848.0;
            break L0;
          }
        }
        L1: {
          if (param0) {
            stackOut_4_0 = 1.4;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0.013999999999999999;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_5_0;
          if (2048.0 < la.field_d) {
            la.field_d = 2048.0;
            break L2;
          } else {
            break L2;
          }
        }
        var4 = wm.field_C - hd.field_K;
        var6 = -jr.field_Gb + cq.field_f;
        if (param1 == 89) {
          L3: {
            var8 = la.field_d - hw.field_f;
            var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            if (var10 <= 0.0001) {
              break L3;
            } else {
              L4: {
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
                  break L4;
                } else {
                  break L4;
                }
              }
              up.field_f = up.field_f + var20;
              o.field_e = o.field_e + var24;
              tf.field_a = tf.field_a + var22;
              break L3;
            }
          }
          L5: {
            if (hd.field_K >= wm.field_C) {
              stackOut_58_0 = 0;
              stackIn_59_0 = stackOut_58_0;
              break L5;
            } else {
              stackOut_57_0 = 1;
              stackIn_59_0 = stackOut_57_0;
              break L5;
            }
          }
          var12 = stackIn_59_0;
          hd.field_K = hd.field_K + up.field_f;
          if (var12 == 0) {
            if (var12 == 0) {
              if (hd.field_K >= wm.field_C) {
                L6: {
                  if (cq.field_f <= jr.field_Gb) {
                    stackOut_241_0 = 0;
                    stackIn_242_0 = stackOut_241_0;
                    break L6;
                  } else {
                    stackOut_240_0 = 1;
                    stackIn_242_0 = stackOut_240_0;
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var12 = stackIn_242_0;
                    jr.field_Gb = jr.field_Gb + tf.field_a;
                    if (var12 == 0) {
                      if (var12 != 0) {
                        break L7;
                      } else {
                        if (cq.field_f > jr.field_Gb) {
                          break L8;
                        } else {
                          L9: {
                            if (la.field_d <= hw.field_f) {
                              stackOut_266_0 = 0;
                              stackIn_267_0 = stackOut_266_0;
                              break L9;
                            } else {
                              stackOut_265_0 = 1;
                              stackIn_267_0 = stackOut_265_0;
                              break L9;
                            }
                          }
                          L10: {
                            L11: {
                              var12 = stackIn_267_0;
                              hw.field_f = hw.field_f + o.field_e;
                              if (var12 == 0) {
                                break L11;
                              } else {
                                if (hw.field_f > la.field_d) {
                                  hw.field_f = la.field_d;
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var12 != 0) {
                              break L10;
                            } else {
                              if (la.field_d <= hw.field_f) {
                                break L10;
                              } else {
                                L12: {
                                  hw.field_f = la.field_d;
                                  sp.i(-320);
                                  if (0.0 == fw.field_G) {
                                    break L12;
                                  } else {
                                    fw.field_G = fw.field_G * -0.9;
                                    break L12;
                                  }
                                }
                                hw.field_i = (int)hw.field_f >> -291727741;
                                return;
                              }
                            }
                          }
                          sp.i(-320);
                          if (0.0 != fw.field_G) {
                            fw.field_G = fw.field_G * -0.9;
                            hw.field_i = (int)hw.field_f >> -291727741;
                            return;
                          } else {
                            hw.field_i = (int)hw.field_f >> -291727741;
                            return;
                          }
                        }
                      }
                    } else {
                      if (jr.field_Gb > cq.field_f) {
                        break L8;
                      } else {
                        L13: {
                          if (var12 != 0) {
                            break L13;
                          } else {
                            if (cq.field_f > jr.field_Gb) {
                              jr.field_Gb = cq.field_f;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (la.field_d <= hw.field_f) {
                            stackOut_250_0 = 0;
                            stackIn_251_0 = stackOut_250_0;
                            break L14;
                          } else {
                            stackOut_249_0 = 1;
                            stackIn_251_0 = stackOut_249_0;
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var12 = stackIn_251_0;
                            hw.field_f = hw.field_f + o.field_e;
                            if (var12 == 0) {
                              break L16;
                            } else {
                              if (hw.field_f > la.field_d) {
                                hw.field_f = la.field_d;
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (var12 != 0) {
                            break L15;
                          } else {
                            if (la.field_d <= hw.field_f) {
                              break L15;
                            } else {
                              hw.field_f = la.field_d;
                              break L15;
                            }
                          }
                        }
                        L17: {
                          sp.i(-320);
                          if (0.0 == fw.field_G) {
                            break L17;
                          } else {
                            fw.field_G = fw.field_G * -0.9;
                            break L17;
                          }
                        }
                        hw.field_i = (int)hw.field_f >> -291727741;
                        return;
                      }
                    }
                  }
                  jr.field_Gb = cq.field_f;
                  break L7;
                }
                L18: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_284_0 = 0;
                    stackIn_285_0 = stackOut_284_0;
                    break L18;
                  } else {
                    stackOut_283_0 = 1;
                    stackIn_285_0 = stackOut_283_0;
                    break L18;
                  }
                }
                var12 = stackIn_285_0;
                hw.field_f = hw.field_f + o.field_e;
                if (var12 == 0) {
                  L19: {
                    if (var12 != 0) {
                      break L19;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L19;
                      } else {
                        L20: {
                          hw.field_f = la.field_d;
                          sp.i(-320);
                          if (0.0 == fw.field_G) {
                            break L20;
                          } else {
                            fw.field_G = fw.field_G * -0.9;
                            break L20;
                          }
                        }
                        hw.field_i = (int)hw.field_f >> -291727741;
                        return;
                      }
                    }
                  }
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    hw.field_i = (int)hw.field_f >> -291727741;
                    return;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    hw.field_i = (int)hw.field_f >> -291727741;
                    return;
                  }
                } else {
                  if (hw.field_f <= la.field_d) {
                    L21: {
                      if (var12 != 0) {
                        break L21;
                      } else {
                        if (la.field_d <= hw.field_f) {
                          break L21;
                        } else {
                          hw.field_f = la.field_d;
                          break L21;
                        }
                      }
                    }
                    L22: {
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L22;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L22;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> -291727741;
                    return;
                  } else {
                    L23: {
                      hw.field_f = la.field_d;
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L23;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L23;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> -291727741;
                    return;
                  }
                }
              } else {
                L24: {
                  hd.field_K = wm.field_C;
                  if (cq.field_f <= jr.field_Gb) {
                    stackOut_217_0 = 0;
                    stackIn_218_0 = stackOut_217_0;
                    break L24;
                  } else {
                    stackOut_216_0 = 1;
                    stackIn_218_0 = stackOut_216_0;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    L27: {
                      var12 = stackIn_218_0;
                      jr.field_Gb = jr.field_Gb + tf.field_a;
                      if (var12 == 0) {
                        break L27;
                      } else {
                        if (jr.field_Gb > cq.field_f) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L25;
                    } else {
                      if (cq.field_f > jr.field_Gb) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                  jr.field_Gb = cq.field_f;
                  break L25;
                }
                L28: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_227_0 = 0;
                    stackIn_228_0 = stackOut_227_0;
                    break L28;
                  } else {
                    stackOut_226_0 = 1;
                    stackIn_228_0 = stackOut_226_0;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    var12 = stackIn_228_0;
                    hw.field_f = hw.field_f + o.field_e;
                    if (var12 == 0) {
                      break L30;
                    } else {
                      if (hw.field_f > la.field_d) {
                        hw.field_f = la.field_d;
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L29;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L29;
                    } else {
                      hw.field_f = la.field_d;
                      break L29;
                    }
                  }
                }
                L31: {
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    break L31;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    break L31;
                  }
                }
                hw.field_i = (int)hw.field_f >> -291727741;
                return;
              }
            } else {
              L32: {
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_146_0 = 0;
                  stackIn_147_0 = stackOut_146_0;
                  break L32;
                } else {
                  stackOut_145_0 = 1;
                  stackIn_147_0 = stackOut_145_0;
                  break L32;
                }
              }
              L33: {
                var12 = stackIn_147_0;
                jr.field_Gb = jr.field_Gb + tf.field_a;
                if (var12 == 0) {
                  if (var12 != 0) {
                    break L33;
                  } else {
                    if (cq.field_f <= jr.field_Gb) {
                      L34: {
                        if (la.field_d <= hw.field_f) {
                          stackOut_173_0 = 0;
                          stackIn_174_0 = stackOut_173_0;
                          break L34;
                        } else {
                          stackOut_172_0 = 1;
                          stackIn_174_0 = stackOut_172_0;
                          break L34;
                        }
                      }
                      L35: {
                        L36: {
                          var12 = stackIn_174_0;
                          hw.field_f = hw.field_f + o.field_e;
                          if (var12 == 0) {
                            break L36;
                          } else {
                            if (hw.field_f > la.field_d) {
                              hw.field_f = la.field_d;
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        if (var12 != 0) {
                          break L35;
                        } else {
                          if (la.field_d <= hw.field_f) {
                            break L35;
                          } else {
                            L37: {
                              hw.field_f = la.field_d;
                              sp.i(-320);
                              if (0.0 == fw.field_G) {
                                break L37;
                              } else {
                                fw.field_G = fw.field_G * -0.9;
                                break L37;
                              }
                            }
                            hw.field_i = (int)hw.field_f >> -291727741;
                            return;
                          }
                        }
                      }
                      sp.i(-320);
                      if (0.0 != fw.field_G) {
                        fw.field_G = fw.field_G * -0.9;
                        hw.field_i = (int)hw.field_f >> -291727741;
                        return;
                      } else {
                        hw.field_i = (int)hw.field_f >> -291727741;
                        return;
                      }
                    } else {
                      jr.field_Gb = cq.field_f;
                      break L33;
                    }
                  }
                } else {
                  if (jr.field_Gb <= cq.field_f) {
                    L38: {
                      if (var12 != 0) {
                        break L38;
                      } else {
                        if (cq.field_f > jr.field_Gb) {
                          jr.field_Gb = cq.field_f;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (la.field_d <= hw.field_f) {
                        stackOut_156_0 = 0;
                        stackIn_157_0 = stackOut_156_0;
                        break L39;
                      } else {
                        stackOut_155_0 = 1;
                        stackIn_157_0 = stackOut_155_0;
                        break L39;
                      }
                    }
                    L40: {
                      L41: {
                        var12 = stackIn_157_0;
                        hw.field_f = hw.field_f + o.field_e;
                        if (var12 == 0) {
                          break L41;
                        } else {
                          if (hw.field_f > la.field_d) {
                            hw.field_f = la.field_d;
                            break L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                      if (var12 != 0) {
                        break L40;
                      } else {
                        if (la.field_d <= hw.field_f) {
                          break L40;
                        } else {
                          hw.field_f = la.field_d;
                          break L40;
                        }
                      }
                    }
                    L42: {
                      sp.i(-320);
                      if (0.0 == fw.field_G) {
                        break L42;
                      } else {
                        fw.field_G = fw.field_G * -0.9;
                        break L42;
                      }
                    }
                    hw.field_i = (int)hw.field_f >> -291727741;
                    return;
                  } else {
                    jr.field_Gb = cq.field_f;
                    break L33;
                  }
                }
              }
              L43: {
                if (la.field_d <= hw.field_f) {
                  stackOut_190_0 = 0;
                  stackIn_191_0 = stackOut_190_0;
                  break L43;
                } else {
                  stackOut_189_0 = 1;
                  stackIn_191_0 = stackOut_189_0;
                  break L43;
                }
              }
              var12 = stackIn_191_0;
              hw.field_f = hw.field_f + o.field_e;
              if (var12 == 0) {
                L44: {
                  if (var12 != 0) {
                    break L44;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L44;
                    } else {
                      L45: {
                        hw.field_f = la.field_d;
                        sp.i(-320);
                        if (0.0 == fw.field_G) {
                          break L45;
                        } else {
                          fw.field_G = fw.field_G * -0.9;
                          break L45;
                        }
                      }
                      hw.field_i = (int)hw.field_f >> -291727741;
                      return;
                    }
                  }
                }
                sp.i(-320);
                if (0.0 != fw.field_G) {
                  fw.field_G = fw.field_G * -0.9;
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                } else {
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                }
              } else {
                if (hw.field_f <= la.field_d) {
                  L46: {
                    if (var12 != 0) {
                      break L46;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L46;
                      } else {
                        hw.field_f = la.field_d;
                        break L46;
                      }
                    }
                  }
                  L47: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L47;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L47;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                } else {
                  L48: {
                    hw.field_f = la.field_d;
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L48;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L48;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                }
              }
            }
          } else {
            if (hd.field_K <= wm.field_C) {
              L49: {
                if (var12 != 0) {
                  break L49;
                } else {
                  if (hd.field_K >= wm.field_C) {
                    break L49;
                  } else {
                    hd.field_K = wm.field_C;
                    break L49;
                  }
                }
              }
              L50: {
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_90_0 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  break L50;
                } else {
                  stackOut_89_0 = 1;
                  stackIn_91_0 = stackOut_89_0;
                  break L50;
                }
              }
              var12 = stackIn_91_0;
              jr.field_Gb = jr.field_Gb + tf.field_a;
              if (var12 != 0) {
                if (jr.field_Gb > cq.field_f) {
                  L51: {
                    jr.field_Gb = cq.field_f;
                    if (la.field_d <= hw.field_f) {
                      stackOut_130_0 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      break L51;
                    } else {
                      stackOut_129_0 = 1;
                      stackIn_131_0 = stackOut_129_0;
                      break L51;
                    }
                  }
                  L52: {
                    L53: {
                      var12 = stackIn_131_0;
                      hw.field_f = hw.field_f + o.field_e;
                      if (var12 == 0) {
                        break L53;
                      } else {
                        if (hw.field_f > la.field_d) {
                          hw.field_f = la.field_d;
                          break L52;
                        } else {
                          break L53;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L52;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L52;
                      } else {
                        hw.field_f = la.field_d;
                        break L52;
                      }
                    }
                  }
                  L54: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L54;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L54;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                } else {
                  L55: {
                    if (var12 != 0) {
                      break L55;
                    } else {
                      if (cq.field_f > jr.field_Gb) {
                        jr.field_Gb = cq.field_f;
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                  }
                  L56: {
                    if (la.field_d <= hw.field_f) {
                      stackOut_116_0 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      break L56;
                    } else {
                      stackOut_115_0 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      break L56;
                    }
                  }
                  L57: {
                    L58: {
                      var12 = stackIn_117_0;
                      hw.field_f = hw.field_f + o.field_e;
                      if (var12 == 0) {
                        break L58;
                      } else {
                        if (hw.field_f > la.field_d) {
                          hw.field_f = la.field_d;
                          break L57;
                        } else {
                          break L58;
                        }
                      }
                    }
                    if (var12 != 0) {
                      break L57;
                    } else {
                      if (la.field_d <= hw.field_f) {
                        break L57;
                      } else {
                        hw.field_f = la.field_d;
                        break L57;
                      }
                    }
                  }
                  L59: {
                    sp.i(-320);
                    if (0.0 == fw.field_G) {
                      break L59;
                    } else {
                      fw.field_G = fw.field_G * -0.9;
                      break L59;
                    }
                  }
                  hw.field_i = (int)hw.field_f >> -291727741;
                  return;
                }
              } else {
                L60: {
                  if (cq.field_f > jr.field_Gb) {
                    jr.field_Gb = cq.field_f;
                    break L60;
                  } else {
                    break L60;
                  }
                }
                L61: {
                  if (la.field_d <= hw.field_f) {
                    stackOut_97_0 = 0;
                    stackIn_98_0 = stackOut_97_0;
                    break L61;
                  } else {
                    stackOut_96_0 = 1;
                    stackIn_98_0 = stackOut_96_0;
                    break L61;
                  }
                }
                L62: {
                  L63: {
                    var12 = stackIn_98_0;
                    hw.field_f = hw.field_f + o.field_e;
                    if (var12 == 0) {
                      break L63;
                    } else {
                      if (hw.field_f > la.field_d) {
                        hw.field_f = la.field_d;
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L62;
                  } else {
                    if (la.field_d <= hw.field_f) {
                      break L62;
                    } else {
                      hw.field_f = la.field_d;
                      break L62;
                    }
                  }
                }
                L64: {
                  sp.i(-320);
                  if (0.0 == fw.field_G) {
                    break L64;
                  } else {
                    fw.field_G = fw.field_G * -0.9;
                    break L64;
                  }
                }
                hw.field_i = (int)hw.field_f >> -291727741;
                return;
              }
            } else {
              L65: {
                hd.field_K = wm.field_C;
                if (cq.field_f <= jr.field_Gb) {
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L65;
                } else {
                  stackOut_62_0 = 1;
                  stackIn_64_0 = stackOut_62_0;
                  break L65;
                }
              }
              L66: {
                L67: {
                  L68: {
                    var12 = stackIn_64_0;
                    jr.field_Gb = jr.field_Gb + tf.field_a;
                    if (var12 == 0) {
                      break L68;
                    } else {
                      if (jr.field_Gb > cq.field_f) {
                        break L67;
                      } else {
                        break L68;
                      }
                    }
                  }
                  if (var12 != 0) {
                    break L66;
                  } else {
                    if (cq.field_f > jr.field_Gb) {
                      break L67;
                    } else {
                      break L66;
                    }
                  }
                }
                jr.field_Gb = cq.field_f;
                break L66;
              }
              L69: {
                if (la.field_d <= hw.field_f) {
                  stackOut_73_0 = 0;
                  stackIn_74_0 = stackOut_73_0;
                  break L69;
                } else {
                  stackOut_72_0 = 1;
                  stackIn_74_0 = stackOut_72_0;
                  break L69;
                }
              }
              L70: {
                L71: {
                  var12 = stackIn_74_0;
                  hw.field_f = hw.field_f + o.field_e;
                  if (var12 == 0) {
                    break L71;
                  } else {
                    if (hw.field_f > la.field_d) {
                      hw.field_f = la.field_d;
                      break L70;
                    } else {
                      break L71;
                    }
                  }
                }
                if (var12 != 0) {
                  break L70;
                } else {
                  if (la.field_d <= hw.field_f) {
                    break L70;
                  } else {
                    hw.field_f = la.field_d;
                    break L70;
                  }
                }
              }
              L72: {
                sp.i(-320);
                if (0.0 == fw.field_G) {
                  break L72;
                } else {
                  fw.field_G = fw.field_G * -0.9;
                  break L72;
                }
              }
              hw.field_i = (int)hw.field_f >> -291727741;
              return;
            }
          }
        } else {
          L73: {
            field_c = null;
            var8 = la.field_d - hw.field_f;
            var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
            if (var10 <= 0.0001) {
              break L73;
            } else {
              L74: {
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
                  break L74;
                } else {
                  break L74;
                }
              }
              up.field_f = up.field_f + var20;
              o.field_e = o.field_e + var24;
              tf.field_a = tf.field_a + var22;
              break L73;
            }
          }
          L75: {
            if (hd.field_K >= wm.field_C) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L75;
            } else {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L75;
            }
          }
          L76: {
            L77: {
              var12 = stackIn_17_0;
              hd.field_K = hd.field_K + up.field_f;
              if (var12 == 0) {
                break L77;
              } else {
                if (hd.field_K > wm.field_C) {
                  hd.field_K = wm.field_C;
                  break L76;
                } else {
                  break L77;
                }
              }
            }
            if (var12 != 0) {
              break L76;
            } else {
              if (hd.field_K >= wm.field_C) {
                break L76;
              } else {
                hd.field_K = wm.field_C;
                break L76;
              }
            }
          }
          L78: {
            if (cq.field_f <= jr.field_Gb) {
              stackOut_27_0 = 0;
              stackIn_28_0 = stackOut_27_0;
              break L78;
            } else {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              break L78;
            }
          }
          L79: {
            var12 = stackIn_28_0;
            jr.field_Gb = jr.field_Gb + tf.field_a;
            if (var12 != 0) {
              L80: {
                if (jr.field_Gb > cq.field_f) {
                  break L80;
                } else {
                  if (var12 != 0) {
                    break L79;
                  } else {
                    if (cq.field_f <= jr.field_Gb) {
                      break L79;
                    } else {
                      break L80;
                    }
                  }
                }
              }
              jr.field_Gb = cq.field_f;
              break L79;
            } else {
              if (var12 != 0) {
                break L79;
              } else {
                if (cq.field_f <= jr.field_Gb) {
                  break L79;
                } else {
                  jr.field_Gb = cq.field_f;
                  break L79;
                }
              }
            }
          }
          L81: {
            if (la.field_d <= hw.field_f) {
              stackOut_39_0 = 0;
              stackIn_40_0 = stackOut_39_0;
              break L81;
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              break L81;
            }
          }
          L82: {
            L83: {
              var12 = stackIn_40_0;
              hw.field_f = hw.field_f + o.field_e;
              if (var12 == 0) {
                break L83;
              } else {
                if (hw.field_f > la.field_d) {
                  hw.field_f = la.field_d;
                  break L82;
                } else {
                  break L83;
                }
              }
            }
            if (var12 != 0) {
              break L82;
            } else {
              if (la.field_d <= hw.field_f) {
                break L82;
              } else {
                hw.field_f = la.field_d;
                break L82;
              }
            }
          }
          L84: {
            sp.i(-320);
            if (0.0 == fw.field_G) {
              break L84;
            } else {
              fw.field_G = fw.field_G * -0.9;
              break L84;
            }
          }
          hw.field_i = (int)hw.field_f >> -291727741;
          return;
        }
    }

    ht(int param0) {
        int var2 = 0;
        gn var3 = null;
        ((ht) this).field_e = new gn[param0];
        ((ht) this).field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new gn();
            ((ht) this).field_e[var2] = new gn();
            var3.field_d = var3;
            var3.field_b = var3;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_c = null;
            field_c = null;
            field_a = null;
            return;
        }
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
