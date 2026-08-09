/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends k implements mj {
    static hj field_fb;
    static String field_db;
    private fb field_gb;
    static int field_bb;
    static String field_cb;
    static int[] field_eb;

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_gb != param0) {
                break L1;
              } else {
                this.c(true);
                break L1;
              }
            }
            L2: {
              if (param4 == -24221) {
                break L2;
              } else {
                ge.a(true, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ge.DA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var3;
        var3 = Chess.field_G;
        if (param0) {
          field_db = (String) null;
          if (param1) {
            jh.field_a = false;
            if (param1) {
              if (an.field_e > 0) {
                an.field_e = an.field_e - 1;
                return;
              } else {
                if (aj.field_c > 0) {
                  aj.field_c = aj.field_c - 1;
                  return;
                } else {
                  if (ed.field_c > 0) {
                    ed.field_c = ed.field_c - 1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L0: {
                if (pd.field_Rb != null) {
                  if (-1 <= (an.field_e ^ -1)) {
                    if (-1 <= (aj.field_c ^ -1)) {
                      if (ug.field_b <= ed.field_c) {
                        break L0;
                      } else {
                        L1: {
                          if (0 == ed.field_c) {
                            aj.a(false, true);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        ed.field_c = ed.field_c + 1;
                        return;
                      }
                    } else {
                      aj.field_c = aj.field_c - 1;
                      return;
                    }
                  } else {
                    an.field_e = an.field_e - 1;
                    return;
                  }
                } else {
                  if (null != ib.field_d) {
                    if ((an.field_e ^ -1) < -1) {
                      an.field_e = an.field_e - 1;
                      return;
                    } else {
                      if (0 < ed.field_c) {
                        ed.field_c = ed.field_c - 1;
                        return;
                      } else {
                        if (aj.field_c >= ug.field_b) {
                          break L0;
                        } else {
                          L2: {
                            if (aj.field_c == 0) {
                              aj.a(true, true);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          aj.field_c = aj.field_c + 1;
                          return;
                        }
                      }
                    }
                  } else {
                    jh.field_a = false;
                    if (-1 <= (aj.field_c ^ -1)) {
                      if (0 >= ed.field_c) {
                        if (ug.field_b <= an.field_e) {
                          break L0;
                        } else {
                          L3: {
                            if (-1 == (an.field_e ^ -1)) {
                              tj.b((byte) -126);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          an.field_e = an.field_e + 1;
                          return;
                        }
                      } else {
                        ed.field_c = ed.field_c - 1;
                        return;
                      }
                    } else {
                      aj.field_c = aj.field_c - 1;
                      break L0;
                    }
                  }
                }
              }
              return;
            }
          } else {
            if (null == pd.field_Rb) {
              jh.field_a = false;
              if (param1) {
                if (an.field_e > 0) {
                  an.field_e = an.field_e - 1;
                  return;
                } else {
                  if (aj.field_c > 0) {
                    aj.field_c = aj.field_c - 1;
                    return;
                  } else {
                    if (ed.field_c > 0) {
                      ed.field_c = ed.field_c - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  if (pd.field_Rb != null) {
                    if (-1 <= (an.field_e ^ -1)) {
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (ug.field_b <= ed.field_c) {
                          break L4;
                        } else {
                          L5: {
                            if (0 == ed.field_c) {
                              aj.a(false, true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ed.field_c = ed.field_c + 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        return;
                      }
                    } else {
                      an.field_e = an.field_e - 1;
                      return;
                    }
                  } else {
                    if (null != ib.field_d) {
                      if ((an.field_e ^ -1) < -1) {
                        an.field_e = an.field_e - 1;
                        return;
                      } else {
                        if (0 < ed.field_c) {
                          ed.field_c = ed.field_c - 1;
                          return;
                        } else {
                          if (aj.field_c >= ug.field_b) {
                            break L4;
                          } else {
                            L6: {
                              if (aj.field_c == 0) {
                                aj.a(true, true);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            aj.field_c = aj.field_c + 1;
                            return;
                          }
                        }
                      }
                    } else {
                      jh.field_a = false;
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (0 >= ed.field_c) {
                          if (ug.field_b <= an.field_e) {
                            break L4;
                          } else {
                            L7: {
                              if (-1 == (an.field_e ^ -1)) {
                                tj.b((byte) -126);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            an.field_e = an.field_e + 1;
                            return;
                          }
                        } else {
                          ed.field_c = ed.field_c - 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        break L4;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              if (param1) {
                if (an.field_e > 0) {
                  an.field_e = an.field_e - 1;
                  return;
                } else {
                  if (aj.field_c > 0) {
                    aj.field_c = aj.field_c - 1;
                    return;
                  } else {
                    if (ed.field_c > 0) {
                      ed.field_c = ed.field_c - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L8: {
                  if (pd.field_Rb != null) {
                    if (-1 <= (an.field_e ^ -1)) {
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (ug.field_b <= ed.field_c) {
                          break L8;
                        } else {
                          L9: {
                            if (0 == ed.field_c) {
                              aj.a(false, true);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ed.field_c = ed.field_c + 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        return;
                      }
                    } else {
                      an.field_e = an.field_e - 1;
                      return;
                    }
                  } else {
                    if (null != ib.field_d) {
                      if ((an.field_e ^ -1) < -1) {
                        an.field_e = an.field_e - 1;
                        return;
                      } else {
                        if (0 < ed.field_c) {
                          ed.field_c = ed.field_c - 1;
                          return;
                        } else {
                          if (aj.field_c < ug.field_b) {
                            L10: {
                              if (aj.field_c == 0) {
                                aj.a(true, true);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            aj.field_c = aj.field_c + 1;
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      jh.field_a = false;
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (0 >= ed.field_c) {
                          if (ug.field_b > an.field_e) {
                            L11: {
                              if (-1 == (an.field_e ^ -1)) {
                                tj.b((byte) -126);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            an.field_e = an.field_e + 1;
                            break L8;
                          } else {
                            return;
                          }
                        } else {
                          ed.field_c = ed.field_c - 1;
                          break L8;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        break L8;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          L12: {
            if (param1) {
              jh.field_a = false;
              break L12;
            } else {
              if (null == pd.field_Rb) {
                jh.field_a = false;
                break L12;
              } else {
                if (param1) {
                  if (an.field_e > 0) {
                    an.field_e = an.field_e - 1;
                    return;
                  } else {
                    if (aj.field_c > 0) {
                      aj.field_c = aj.field_c - 1;
                      return;
                    } else {
                      if (ed.field_c > 0) {
                        ed.field_c = ed.field_c - 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L13: {
                    if (pd.field_Rb != null) {
                      if (-1 <= (an.field_e ^ -1)) {
                        if (-1 <= (aj.field_c ^ -1)) {
                          if (ug.field_b <= ed.field_c) {
                            break L13;
                          } else {
                            L14: {
                              if (0 == ed.field_c) {
                                aj.a(false, true);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            ed.field_c = ed.field_c + 1;
                            return;
                          }
                        } else {
                          aj.field_c = aj.field_c - 1;
                          return;
                        }
                      } else {
                        an.field_e = an.field_e - 1;
                        break L13;
                      }
                    } else {
                      if (null != ib.field_d) {
                        if ((an.field_e ^ -1) < -1) {
                          an.field_e = an.field_e - 1;
                          break L13;
                        } else {
                          if (0 < ed.field_c) {
                            ed.field_c = ed.field_c - 1;
                            break L13;
                          } else {
                            if (aj.field_c >= ug.field_b) {
                              break L13;
                            } else {
                              L15: {
                                if (aj.field_c == 0) {
                                  aj.a(true, true);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              aj.field_c = aj.field_c + 1;
                              break L13;
                            }
                          }
                        }
                      } else {
                        jh.field_a = false;
                        if (-1 <= (aj.field_c ^ -1)) {
                          if (0 >= ed.field_c) {
                            if (ug.field_b <= an.field_e) {
                              break L13;
                            } else {
                              L16: {
                                if (-1 == (an.field_e ^ -1)) {
                                  tj.b((byte) -126);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              an.field_e = an.field_e + 1;
                              break L13;
                            }
                          } else {
                            ed.field_c = ed.field_c - 1;
                            break L13;
                          }
                        } else {
                          aj.field_c = aj.field_c - 1;
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param1) {
            if (an.field_e > 0) {
              an.field_e = an.field_e - 1;
              return;
            } else {
              if (aj.field_c > 0) {
                aj.field_c = aj.field_c - 1;
                return;
              } else {
                if (ed.field_c > 0) {
                  ed.field_c = ed.field_c - 1;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L17: {
              if (pd.field_Rb != null) {
                if (-1 <= (an.field_e ^ -1)) {
                  if (-1 <= (aj.field_c ^ -1)) {
                    if (ug.field_b <= ed.field_c) {
                      break L17;
                    } else {
                      L18: {
                        if (0 == ed.field_c) {
                          aj.a(false, true);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      ed.field_c = ed.field_c + 1;
                      return;
                    }
                  } else {
                    aj.field_c = aj.field_c - 1;
                    return;
                  }
                } else {
                  an.field_e = an.field_e - 1;
                  break L17;
                }
              } else {
                if (null != ib.field_d) {
                  if ((an.field_e ^ -1) < -1) {
                    an.field_e = an.field_e - 1;
                    break L17;
                  } else {
                    if (0 < ed.field_c) {
                      ed.field_c = ed.field_c - 1;
                      break L17;
                    } else {
                      if (aj.field_c >= ug.field_b) {
                        break L17;
                      } else {
                        L19: {
                          if (aj.field_c == 0) {
                            aj.a(true, true);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        aj.field_c = aj.field_c + 1;
                        break L17;
                      }
                    }
                  }
                } else {
                  jh.field_a = false;
                  if (-1 <= (aj.field_c ^ -1)) {
                    if (0 >= ed.field_c) {
                      if (ug.field_b > an.field_e) {
                        L20: {
                          if (-1 == (an.field_e ^ -1)) {
                            tj.b((byte) -126);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        an.field_e = an.field_e + 1;
                        break L17;
                      } else {
                        return;
                      }
                    } else {
                      ed.field_c = ed.field_c - 1;
                      break L17;
                    }
                  } else {
                    aj.field_c = aj.field_c - 1;
                    break L17;
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void k(int param0) {
        field_db = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 0) {
            return;
        }
        field_eb = null;
    }

    final static pg a(boolean param0, int param1, int param2, int param3) {
        pg var4;
        int var5;
        pg var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        var5 = Chess.field_G;
        var4 = (pg) ((Object) nd.field_h.g(-18110));
        L0: while (true) {
          if (var4 == null) {
            var6 = new pg();
            var4 = var6;
            var6.field_u = param3;
            if (param0) {
              var4.field_q = param2;
              nd.field_h.a((o) (var4), (byte) 102);
              tm.a(false, var4, param1);
              return var4;
            } else {
              return (pg) null;
            }
          } else {
            stackIn_5_0 = var4.field_q;

            stackIn_5_1 = param2;

            if (stackIn_5_0 == stackIn_5_1) {
              return var4;
            } else {
              var4 = (pg) ((Object) nd.field_h.a((byte) -111));
              continue L0;
            }
          }
        }
    }

    private final fb a(String param0, rg param1, int param2) {
        fb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fb(param0, param1);
            var4.field_n = (jm) ((Object) new sf());
            var5 = this.field_C - 6;
            this.field_C = this.field_C + 38;
            var4.a(var5, 34, param2, -30 + this.field_y, 15);
            this.b(var4, 95);
            this.c((byte) 112);
            stackIn_1_0 = (fb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ge.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final void c(boolean param0) {
        if (!(this.field_P)) {
            return;
        }
        this.field_P = false;
        if (!param0) {
            ge.a(false, true);
        }
    }

    ge(fm param0, ij param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (gi.field_a == param1) {
                var3 = Chess.field_D;
                break L1;
              } else {
                if (kh.field_k == param1) {
                  this.field_C = this.field_C + 10;
                  var3 = le.field_c;
                  if (!jj.d(124)) {
                    break L1;
                  } else {
                    var3 = le.field_d;
                    this.field_C = this.field_C + 20;
                    break L1;
                  }
                } else {
                  if (cm.field_t != param1) {
                    break L1;
                  } else {
                    this.field_C = this.field_C + 30;
                    var3 = vd.field_Gb;
                    break L1;
                  }
                }
              }
            }
            var4 = new mf((String) (var3), (rg) null);
            var4.field_C = 80;
            var4.field_y = this.field_y;
            var4.field_r = 50;
            var4.field_u = 0;
            var4.field_n = (jm) ((Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(var4, 95);
            this.field_gb = this.a(sj.field_m, (rg) (this), 30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("ge.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        try {
            if (param1 <= 25) {
                ge.k(15);
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ge.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_cb = "Your game";
        field_eb = new int[1024];
        field_db = "Account created successfully!";
    }
}
