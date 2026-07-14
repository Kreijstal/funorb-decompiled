/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends RuntimeException {
    static int field_c;
    static dl field_b;
    static String[] field_a;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_226_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if ((rl.field_m ^ -1) == 0) {
          if (ln.field_J == -1) {
            rl.field_m = an.field_g;
            ln.field_J = me.field_I;
            jh.field_f = jh.field_f + 1;
            if (param1 != null) {
              if (!param1.equals((Object) (Object) cb.field_c)) {
                L0: {
                  if (!oh.field_i) {
                    if (jh.field_f >= oa.field_e) {
                      if (jh.field_f >= qc.field_e + oa.field_e) {
                        stackOut_225_0 = 0;
                        stackIn_226_0 = stackOut_225_0;
                        break L0;
                      } else {
                        stackOut_224_0 = 1;
                        stackIn_226_0 = stackOut_224_0;
                        break L0;
                      }
                    } else {
                      stackOut_222_0 = 0;
                      stackIn_226_0 = stackOut_222_0;
                      break L0;
                    }
                  } else {
                    stackOut_220_0 = 0;
                    stackIn_226_0 = stackOut_220_0;
                    break L0;
                  }
                }
                L1: {
                  L2: {
                    var2 = stackIn_226_0;
                    if (param1 == null) {
                      break L2;
                    } else {
                      if (oh.field_i) {
                        jh.field_f = oa.field_e;
                        break L1;
                      } else {
                        if (var2 == 0) {
                          break L2;
                        } else {
                          jh.field_f = oa.field_e;
                          break L1;
                        }
                      }
                    }
                  }
                  jh.field_f = 0;
                  break L1;
                }
                L3: {
                  if (param1 != null) {
                    oh.field_i = false;
                    break L3;
                  } else {
                    if (var2 != 0) {
                      oh.field_i = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  mo.field_p = rl.field_m;
                  ka.field_p = ln.field_J;
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L4;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L4;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L5;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                return;
              } else {
                L6: {
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L6;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L6;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L7;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              }
            } else {
              if (cb.field_c != null) {
                L8: {
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L8;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L8;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L9;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                return;
              } else {
                L10: {
                  if (!oh.field_i) {
                    if (jh.field_f >= oa.field_e) {
                      if (jh.field_f >= qc.field_e + oa.field_e) {
                        stackOut_170_0 = 0;
                        stackIn_171_0 = stackOut_170_0;
                        break L10;
                      } else {
                        stackOut_169_0 = 1;
                        stackIn_171_0 = stackOut_169_0;
                        break L10;
                      }
                    } else {
                      stackOut_167_0 = 0;
                      stackIn_171_0 = stackOut_167_0;
                      break L10;
                    }
                  } else {
                    stackOut_165_0 = 0;
                    stackIn_171_0 = stackOut_165_0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var2 = stackIn_171_0;
                    if (param1 == null) {
                      break L12;
                    } else {
                      if (oh.field_i) {
                        jh.field_f = oa.field_e;
                        break L11;
                      } else {
                        if (var2 == 0) {
                          break L12;
                        } else {
                          jh.field_f = oa.field_e;
                          break L11;
                        }
                      }
                    }
                  }
                  jh.field_f = 0;
                  break L11;
                }
                L13: {
                  if (param1 != null) {
                    oh.field_i = false;
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    break L13;
                  } else {
                    if (var2 != 0) {
                      oh.field_i = true;
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      break L13;
                    } else {
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      break L13;
                    }
                  }
                }
                L14: {
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L14;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L14;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                L15: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L15;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                return;
              }
            }
          } else {
            jh.field_f = jh.field_f + 1;
            if (param1 == null) {
              if (cb.field_c == null) {
                L16: {
                  if (!oh.field_i) {
                    if (jh.field_f >= oa.field_e) {
                      if (jh.field_f >= qc.field_e + oa.field_e) {
                        stackOut_136_0 = 0;
                        stackIn_138_0 = stackOut_136_0;
                        break L16;
                      } else {
                        stackOut_135_0 = 1;
                        stackIn_138_0 = stackOut_135_0;
                        break L16;
                      }
                    } else {
                      stackOut_133_0 = 0;
                      stackIn_138_0 = stackOut_133_0;
                      break L16;
                    }
                  } else {
                    stackOut_131_0 = 0;
                    stackIn_138_0 = stackOut_131_0;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    var2 = stackIn_138_0;
                    if (param1 == null) {
                      break L18;
                    } else {
                      if (oh.field_i) {
                        jh.field_f = oa.field_e;
                        break L17;
                      } else {
                        if (var2 == 0) {
                          break L18;
                        } else {
                          jh.field_f = oa.field_e;
                          break L17;
                        }
                      }
                    }
                  }
                  jh.field_f = 0;
                  break L17;
                }
                L19: {
                  if (param1 != null) {
                    oh.field_i = false;
                    break L19;
                  } else {
                    if (var2 != 0) {
                      oh.field_i = true;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  mo.field_p = rl.field_m;
                  ka.field_p = ln.field_J;
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L20;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L20;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                L21: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L21;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                return;
              } else {
                L22: {
                  var2 = -49 / ((param0 - -45) / 60);
                  cb.field_c = param1;
                  if (oh.field_i) {
                    break L22;
                  } else {
                    if (oa.field_e <= jh.field_f) {
                      break L22;
                    } else {
                      if (tl.field_d) {
                        mo.field_p = rl.field_m;
                        ka.field_p = ln.field_J;
                        jh.field_f = 0;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                L23: {
                  rl.field_m = -1;
                  ln.field_J = -1;
                  if (!oh.field_i) {
                    break L23;
                  } else {
                    if (mk.field_Q == jh.field_f) {
                      jh.field_f = 0;
                      oh.field_i = false;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                return;
              }
            } else {
              L24: {
                if (!param1.equals((Object) (Object) cb.field_c)) {
                  L25: {
                    if (!oh.field_i) {
                      if (jh.field_f >= oa.field_e) {
                        if (jh.field_f >= qc.field_e + oa.field_e) {
                          stackOut_92_0 = 0;
                          stackIn_93_0 = stackOut_92_0;
                          break L25;
                        } else {
                          stackOut_91_0 = 1;
                          stackIn_93_0 = stackOut_91_0;
                          break L25;
                        }
                      } else {
                        stackOut_89_0 = 0;
                        stackIn_93_0 = stackOut_89_0;
                        break L25;
                      }
                    } else {
                      stackOut_87_0 = 0;
                      stackIn_93_0 = stackOut_87_0;
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      var2 = stackIn_93_0;
                      if (param1 == null) {
                        break L27;
                      } else {
                        if (oh.field_i) {
                          jh.field_f = oa.field_e;
                          break L26;
                        } else {
                          if (var2 == 0) {
                            break L27;
                          } else {
                            jh.field_f = oa.field_e;
                            break L26;
                          }
                        }
                      }
                    }
                    jh.field_f = 0;
                    break L26;
                  }
                  if (param1 != null) {
                    oh.field_i = false;
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    break L24;
                  } else {
                    if (var2 != 0) {
                      oh.field_i = true;
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      break L24;
                    } else {
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      break L24;
                    }
                  }
                } else {
                  break L24;
                }
              }
              L28: {
                var2 = -49 / ((param0 - -45) / 60);
                cb.field_c = param1;
                if (oh.field_i) {
                  break L28;
                } else {
                  if (oa.field_e <= jh.field_f) {
                    break L28;
                  } else {
                    if (tl.field_d) {
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      jh.field_f = 0;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              L29: {
                rl.field_m = -1;
                ln.field_J = -1;
                if (!oh.field_i) {
                  break L29;
                } else {
                  if (mk.field_Q == jh.field_f) {
                    jh.field_f = 0;
                    oh.field_i = false;
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              return;
            }
          }
        } else {
          jh.field_f = jh.field_f + 1;
          if (param1 == null) {
            if (cb.field_c == null) {
              L30: {
                if (!oh.field_i) {
                  if (jh.field_f >= oa.field_e) {
                    if (jh.field_f < qc.field_e + oa.field_e) {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L30;
                    } else {
                      stackOut_54_0 = 0;
                      stackIn_57_0 = stackOut_54_0;
                      break L30;
                    }
                  } else {
                    stackOut_52_0 = 0;
                    stackIn_57_0 = stackOut_52_0;
                    break L30;
                  }
                } else {
                  stackOut_50_0 = 0;
                  stackIn_57_0 = stackOut_50_0;
                  break L30;
                }
              }
              L31: {
                var2 = stackIn_57_0;
                if (param1 != null) {
                  if (oh.field_i) {
                    jh.field_f = oa.field_e;
                    break L31;
                  } else {
                    if (var2 != 0) {
                      jh.field_f = oa.field_e;
                      break L31;
                    } else {
                      jh.field_f = 0;
                      break L31;
                    }
                  }
                } else {
                  jh.field_f = 0;
                  break L31;
                }
              }
              L32: {
                if (param1 != null) {
                  oh.field_i = false;
                  break L32;
                } else {
                  if (var2 != 0) {
                    oh.field_i = true;
                    break L32;
                  } else {
                    break L32;
                  }
                }
              }
              L33: {
                mo.field_p = rl.field_m;
                ka.field_p = ln.field_J;
                var2 = -49 / ((param0 - -45) / 60);
                cb.field_c = param1;
                if (oh.field_i) {
                  break L33;
                } else {
                  if (oa.field_e <= jh.field_f) {
                    break L33;
                  } else {
                    if (tl.field_d) {
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      jh.field_f = 0;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
              }
              L34: {
                rl.field_m = -1;
                ln.field_J = -1;
                if (!oh.field_i) {
                  break L34;
                } else {
                  if (mk.field_Q == jh.field_f) {
                    jh.field_f = 0;
                    oh.field_i = false;
                    break L34;
                  } else {
                    break L34;
                  }
                }
              }
              return;
            } else {
              L35: {
                var2 = -49 / ((param0 - -45) / 60);
                cb.field_c = param1;
                if (oh.field_i) {
                  break L35;
                } else {
                  if (oa.field_e <= jh.field_f) {
                    break L35;
                  } else {
                    if (tl.field_d) {
                      mo.field_p = rl.field_m;
                      ka.field_p = ln.field_J;
                      jh.field_f = 0;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                }
              }
              L36: {
                rl.field_m = -1;
                ln.field_J = -1;
                if (!oh.field_i) {
                  break L36;
                } else {
                  if (mk.field_Q == jh.field_f) {
                    jh.field_f = 0;
                    oh.field_i = false;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              return;
            }
          } else {
            L37: {
              if (!param1.equals((Object) (Object) cb.field_c)) {
                L38: {
                  if (!oh.field_i) {
                    if (jh.field_f >= oa.field_e) {
                      if (jh.field_f < qc.field_e + oa.field_e) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L38;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L38;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L38;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_12_0 = stackOut_5_0;
                    break L38;
                  }
                }
                L39: {
                  var2 = stackIn_12_0;
                  if (param1 != null) {
                    L40: {
                      if (oh.field_i) {
                        break L40;
                      } else {
                        if (var2 != 0) {
                          break L40;
                        } else {
                          jh.field_f = 0;
                          break L39;
                        }
                      }
                    }
                    jh.field_f = oa.field_e;
                    break L39;
                  } else {
                    jh.field_f = 0;
                    break L39;
                  }
                }
                if (param1 != null) {
                  oh.field_i = false;
                  mo.field_p = rl.field_m;
                  ka.field_p = ln.field_J;
                  break L37;
                } else {
                  if (var2 != 0) {
                    oh.field_i = true;
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    break L37;
                  } else {
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    break L37;
                  }
                }
              } else {
                break L37;
              }
            }
            L41: {
              var2 = -49 / ((param0 - -45) / 60);
              cb.field_c = param1;
              if (oh.field_i) {
                break L41;
              } else {
                if (oa.field_e <= jh.field_f) {
                  break L41;
                } else {
                  if (tl.field_d) {
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    jh.field_f = 0;
                    break L41;
                  } else {
                    break L41;
                  }
                }
              }
            }
            L42: {
              rl.field_m = -1;
              ln.field_J = -1;
              if (!oh.field_i) {
                break L42;
              } else {
                if (mk.field_Q == jh.field_f) {
                  jh.field_f = 0;
                  oh.field_i = false;
                  break L42;
                } else {
                  break L42;
                }
              }
            }
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 <= 49) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    qg() {
    }

    final static boolean a(int param0) {
        if (param0 > -61) {
            return true;
        }
        return (mj.field_p ^ -1) != 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_a = new String[16];
    }
}
