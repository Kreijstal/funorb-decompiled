/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jo extends ob {
    static boolean field_H;
    static String field_L;
    static int field_J;
    private dd field_K;
    static String[] field_I;

    final void c(int param0) {
        L0: {
          super.c(92);
          if (((jo) this).field_K != null) {
            ((jo) this).field_K.c(qh.field_l + -((jo) this).field_K.field_z >> 1, 80);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 36) {
          field_J = 74;
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        if (param0 >= -11) {
          L0: {
            ((jo) this).field_K = null;
            stackOut_5_0 = -3405;
            stackOut_5_1 = -1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!mg.a(true)) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 21;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          fq.a(stackIn_8_0, stackIn_8_1, stackIn_8_2, false);
          return;
        } else {
          L1: {
            stackOut_1_0 = -3405;
            stackOut_1_1 = -1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!mg.a(true)) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 21;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          fq.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, false);
          return;
        }
    }

    final static wc a(String[] args, int param1) {
        wc var2 = null;
        RuntimeException var2_ref = null;
        wc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        wc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new wc(false);
            var2.field_c = args;
            stackOut_0_0 = (wc) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("jo.EA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 57 + ')');
        }
        return stackIn_1_0;
    }

    final static void f(byte param0) {
        ob var1 = s.field_c[0];
        var1.field_s = 26;
        var1.field_x = 153;
        var1.field_l = true;
        var1.field_q = false;
        ob var4 = s.field_c[13];
        var4.a(20, 100, -10);
        var4.field_q = true;
        var4.field_x = 370;
        var4.field_p = true;
        ob var5 = s.field_c[1];
        var5.a(120, 100, -10);
        var5.field_q = true;
        var5.field_s = 60;
        var1 = s.field_c[6];
        var1.field_q = true;
        var1.field_p = true;
        var1.field_x = 365;
        int var2 = 240;
        var1.field_C = -20 + (qh.field_l >> 1);
        var1.field_t = (qh.field_l >> 1) + -var2 + -20;
        ob var6 = s.field_c[7];
        var6.a(40, 85, -10);
        var6.field_q = true;
        ob var7 = s.field_c[18];
        var7.a(20, 80, -10);
        var7.field_t = 80;
        var7.field_q = true;
        var7.field_x = 390;
        ob var8 = s.field_c[17];
        var8.a(20, 80, -10);
        var8.field_x = 390;
        var8.field_t = 80;
        var8.field_q = true;
        ob var9 = s.field_c[15];
        var9.a(20, 85, -10);
        var9.field_q = true;
        var9.field_x = 120;
        var9.field_s = 45;
        ob var10 = s.field_c[16];
        var10.a(20, 85, -10);
        var10.field_q = true;
        var10.field_s = 45;
        var10.field_x = 120;
        ob var11 = s.field_c[14];
        var11.field_p = true;
        var11.a(-320 + qh.field_l, 140, 160, 300, 0);
        var11.field_s = 30;
        var11.field_C = 240 + qh.field_l >> 1;
        var11.field_x = 200;
        var11.field_t = -240 + qh.field_l >> 1;
        var11.field_q = false;
        ob var12 = s.field_c[2];
        var12.a(-320 + qh.field_l, 140, 160, 280, 0);
        var12.field_C = qh.field_l - -240 >> 1;
        var12.field_t = qh.field_l - 240 >> 1;
        var12.field_p = true;
        var12.field_q = true;
        var12.field_s = 50;
        var12.field_x = 205;
        var1 = s.field_c[9];
        var1.field_l = false;
        var1 = s.field_c[10];
        var1.field_l = false;
        var1 = s.field_c[11];
        var1.field_l = false;
        var1 = s.field_c[12];
        var1.field_l = false;
        var1 = s.field_c[8];
        var1.field_l = false;
        var1 = s.field_c[9];
        var1.field_l = false;
        var1 = s.field_c[3];
        var1.field_l = false;
        var1 = s.field_c[22];
        var1.field_l = false;
        var1 = s.field_c[24];
        var1.field_l = false;
        var1 = s.field_c[23];
        var1.field_l = false;
        var1 = s.field_c[21];
        int var3 = -122;
        var1.field_l = true;
        ob var13 = s.field_c[19];
        var13.field_q = true;
        var13.field_s = 40;
        var13.field_x = 260;
        var13.a(80, 80, -10);
    }

    final static void a(float param0, float param1, float param2, float param3, int param4) {
        if (param4 != -31792) {
          jo.a(0.2009153664112091f, 0.45015275478363037f, 2.6406524181365967f, -0.13969022035598755f, 60);
          pq.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
          return;
        } else {
          pq.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
          return;
        }
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != -54264319) {
            field_I = null;
            return param2 << param0;
        }
        return param2 << param0;
    }

    final static void g(int param0, int param1) {
        int var2 = 0;
        int stackIn_53_0 = 0;
        int stackIn_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        hh.field_a = hh.field_a + 1;
        if (param0 == 0) {
          if (ac.field_m == param1) {
            L0: {
              if (oa.field_j) {
                break L0;
              } else {
                if (hh.field_a >= se.field_l) {
                  break L0;
                } else {
                  if (!re.field_c) {
                    break L0;
                  } else {
                    L1: {
                      pm.field_p = gg.field_f;
                      pa.field_H = wn.field_i;
                      hh.field_a = 0;
                      ac.field_m = param1;
                      if (!oa.field_j) {
                        break L1;
                      } else {
                        if (eo.field_Vb != hh.field_a) {
                          break L1;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L2: {
              ac.field_m = param1;
              if (!oa.field_j) {
                break L2;
              } else {
                if (eo.field_Vb != hh.field_a) {
                  break L2;
                } else {
                  hh.field_a = 0;
                  oa.field_j = false;
                  return;
                }
              }
            }
            return;
          } else {
            L3: {
              if (!oa.field_j) {
                if (hh.field_a >= se.field_l) {
                  if (oe.field_Q + se.field_l > hh.field_a) {
                    stackOut_120_0 = 1;
                    stackIn_122_0 = stackOut_120_0;
                    break L3;
                  } else {
                    stackOut_119_0 = 0;
                    stackIn_122_0 = stackOut_119_0;
                    break L3;
                  }
                } else {
                  stackOut_117_0 = 0;
                  stackIn_122_0 = stackOut_117_0;
                  break L3;
                }
              } else {
                stackOut_115_0 = 0;
                stackIn_122_0 = stackOut_115_0;
                break L3;
              }
            }
            var2 = stackIn_122_0;
            if (param1 != -1) {
              L4: {
                if (oa.field_j) {
                  L5: {
                    hh.field_a = se.field_l;
                    pa.field_H = wn.field_i;
                    if (param1 == -1) {
                      if (var2 == 0) {
                        break L5;
                      } else {
                        oa.field_j = true;
                        break L5;
                      }
                    } else {
                      oa.field_j = false;
                      break L5;
                    }
                  }
                  pm.field_p = gg.field_f;
                  if (!oa.field_j) {
                    L6: {
                      if (hh.field_a >= se.field_l) {
                        break L6;
                      } else {
                        if (re.field_c) {
                          pm.field_p = gg.field_f;
                          pa.field_H = wn.field_i;
                          hh.field_a = 0;
                          break L6;
                        } else {
                          pm.field_p = gg.field_f;
                          if (oa.field_j) {
                            break L4;
                          } else {
                            if (hh.field_a >= se.field_l) {
                              break L4;
                            } else {
                              if (!re.field_c) {
                                break L4;
                              } else {
                                pm.field_p = gg.field_f;
                                pa.field_H = wn.field_i;
                                hh.field_a = 0;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      ac.field_m = param1;
                      if (!oa.field_j) {
                        break L7;
                      } else {
                        if (eo.field_Vb != hh.field_a) {
                          break L7;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          break L7;
                        }
                      }
                    }
                    return;
                  } else {
                    pm.field_p = gg.field_f;
                    if (oa.field_j) {
                      break L4;
                    } else {
                      if (hh.field_a >= se.field_l) {
                        break L4;
                      } else {
                        if (!re.field_c) {
                          break L4;
                        } else {
                          pm.field_p = gg.field_f;
                          pa.field_H = wn.field_i;
                          hh.field_a = 0;
                          break L4;
                        }
                      }
                    }
                  }
                } else {
                  if (var2 != 0) {
                    L8: {
                      hh.field_a = se.field_l;
                      pa.field_H = wn.field_i;
                      if (param1 == -1) {
                        if (var2 == 0) {
                          break L8;
                        } else {
                          oa.field_j = true;
                          break L8;
                        }
                      } else {
                        oa.field_j = false;
                        break L8;
                      }
                    }
                    pm.field_p = gg.field_f;
                    if (oa.field_j) {
                      break L4;
                    } else {
                      if (hh.field_a >= se.field_l) {
                        break L4;
                      } else {
                        if (!re.field_c) {
                          break L4;
                        } else {
                          pm.field_p = gg.field_f;
                          pa.field_H = wn.field_i;
                          hh.field_a = 0;
                          break L4;
                        }
                      }
                    }
                  } else {
                    hh.field_a = 0;
                    pa.field_H = wn.field_i;
                    if (param1 == -1) {
                      if (var2 == 0) {
                        L9: {
                          pm.field_p = gg.field_f;
                          if (oa.field_j) {
                            break L9;
                          } else {
                            if (hh.field_a >= se.field_l) {
                              break L9;
                            } else {
                              if (!re.field_c) {
                                break L9;
                              } else {
                                L10: {
                                  pm.field_p = gg.field_f;
                                  pa.field_H = wn.field_i;
                                  hh.field_a = 0;
                                  ac.field_m = param1;
                                  if (!oa.field_j) {
                                    break L10;
                                  } else {
                                    if (eo.field_Vb != hh.field_a) {
                                      break L10;
                                    } else {
                                      hh.field_a = 0;
                                      oa.field_j = false;
                                      return;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        L11: {
                          ac.field_m = param1;
                          if (!oa.field_j) {
                            break L11;
                          } else {
                            if (eo.field_Vb != hh.field_a) {
                              break L11;
                            } else {
                              hh.field_a = 0;
                              oa.field_j = false;
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        L12: {
                          oa.field_j = true;
                          pm.field_p = gg.field_f;
                          if (oa.field_j) {
                            break L12;
                          } else {
                            if (hh.field_a >= se.field_l) {
                              break L12;
                            } else {
                              if (!re.field_c) {
                                break L12;
                              } else {
                                L13: {
                                  pm.field_p = gg.field_f;
                                  pa.field_H = wn.field_i;
                                  hh.field_a = 0;
                                  ac.field_m = param1;
                                  if (!oa.field_j) {
                                    break L13;
                                  } else {
                                    if (eo.field_Vb != hh.field_a) {
                                      break L13;
                                    } else {
                                      hh.field_a = 0;
                                      oa.field_j = false;
                                      break L13;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        ac.field_m = param1;
                        if (oa.field_j) {
                          if (eo.field_Vb == hh.field_a) {
                            hh.field_a = 0;
                            oa.field_j = false;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      L14: {
                        oa.field_j = false;
                        pm.field_p = gg.field_f;
                        if (oa.field_j) {
                          break L14;
                        } else {
                          if (hh.field_a >= se.field_l) {
                            break L14;
                          } else {
                            if (!re.field_c) {
                              break L14;
                            } else {
                              L15: {
                                pm.field_p = gg.field_f;
                                pa.field_H = wn.field_i;
                                hh.field_a = 0;
                                ac.field_m = param1;
                                if (!oa.field_j) {
                                  break L15;
                                } else {
                                  if (eo.field_Vb != hh.field_a) {
                                    break L15;
                                  } else {
                                    hh.field_a = 0;
                                    oa.field_j = false;
                                    break L15;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      ac.field_m = param1;
                      if (oa.field_j) {
                        if (eo.field_Vb != hh.field_a) {
                          return;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L16: {
                ac.field_m = param1;
                if (!oa.field_j) {
                  break L16;
                } else {
                  if (eo.field_Vb != hh.field_a) {
                    break L16;
                  } else {
                    hh.field_a = 0;
                    oa.field_j = false;
                    return;
                  }
                }
              }
              return;
            } else {
              hh.field_a = 0;
              pa.field_H = wn.field_i;
              if (param1 == -1) {
                if (var2 == 0) {
                  L17: {
                    pm.field_p = gg.field_f;
                    if (oa.field_j) {
                      break L17;
                    } else {
                      if (hh.field_a >= se.field_l) {
                        break L17;
                      } else {
                        if (!re.field_c) {
                          break L17;
                        } else {
                          pm.field_p = gg.field_f;
                          pa.field_H = wn.field_i;
                          hh.field_a = 0;
                          ac.field_m = param1;
                          if (oa.field_j) {
                            if (eo.field_Vb == hh.field_a) {
                              hh.field_a = 0;
                              oa.field_j = false;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  ac.field_m = param1;
                  if (oa.field_j) {
                    if (eo.field_Vb != hh.field_a) {
                      return;
                    } else {
                      hh.field_a = 0;
                      oa.field_j = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L18: {
                    oa.field_j = true;
                    pm.field_p = gg.field_f;
                    if (oa.field_j) {
                      break L18;
                    } else {
                      if (hh.field_a >= se.field_l) {
                        break L18;
                      } else {
                        if (!re.field_c) {
                          break L18;
                        } else {
                          L19: {
                            pm.field_p = gg.field_f;
                            pa.field_H = wn.field_i;
                            hh.field_a = 0;
                            ac.field_m = param1;
                            if (!oa.field_j) {
                              break L19;
                            } else {
                              if (eo.field_Vb != hh.field_a) {
                                break L19;
                              } else {
                                hh.field_a = 0;
                                oa.field_j = false;
                                break L19;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  ac.field_m = param1;
                  if (oa.field_j) {
                    if (eo.field_Vb == hh.field_a) {
                      hh.field_a = 0;
                      oa.field_j = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L20: {
                  oa.field_j = false;
                  pm.field_p = gg.field_f;
                  if (oa.field_j) {
                    break L20;
                  } else {
                    if (hh.field_a >= se.field_l) {
                      break L20;
                    } else {
                      if (!re.field_c) {
                        break L20;
                      } else {
                        L21: {
                          pm.field_p = gg.field_f;
                          pa.field_H = wn.field_i;
                          hh.field_a = 0;
                          ac.field_m = param1;
                          if (!oa.field_j) {
                            break L21;
                          } else {
                            if (eo.field_Vb != hh.field_a) {
                              break L21;
                            } else {
                              hh.field_a = 0;
                              oa.field_j = false;
                              break L21;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                ac.field_m = param1;
                if (oa.field_j) {
                  if (eo.field_Vb == hh.field_a) {
                    hh.field_a = 0;
                    oa.field_j = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          field_I = null;
          if (ac.field_m != param1) {
            if (!oa.field_j) {
              if (hh.field_a < se.field_l) {
                L22: {
                  L23: {
                    var2 = 0;
                    if (param1 == -1) {
                      hh.field_a = 0;
                      break L23;
                    } else {
                      if (!oa.field_j) {
                        if (var2 != 0) {
                          hh.field_a = se.field_l;
                          break L23;
                        } else {
                          ac.field_m = param1;
                          if (!oa.field_j) {
                            break L22;
                          } else {
                            if (eo.field_Vb != hh.field_a) {
                              break L22;
                            } else {
                              hh.field_a = 0;
                              oa.field_j = false;
                              break L22;
                            }
                          }
                        }
                      } else {
                        ac.field_m = param1;
                        if (!oa.field_j) {
                          break L22;
                        } else {
                          if (eo.field_Vb != hh.field_a) {
                            break L22;
                          } else {
                            hh.field_a = 0;
                            oa.field_j = false;
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    pa.field_H = wn.field_i;
                    if (param1 == -1) {
                      if (var2 == 0) {
                        break L24;
                      } else {
                        oa.field_j = true;
                        break L24;
                      }
                    } else {
                      oa.field_j = false;
                      break L24;
                    }
                  }
                  pm.field_p = gg.field_f;
                  if (!oa.field_j) {
                    if (hh.field_a < se.field_l) {
                      if (re.field_c) {
                        pm.field_p = gg.field_f;
                        pa.field_H = wn.field_i;
                        hh.field_a = 0;
                        ac.field_m = param1;
                        if (!oa.field_j) {
                          break L22;
                        } else {
                          if (eo.field_Vb != hh.field_a) {
                            break L22;
                          } else {
                            hh.field_a = 0;
                            oa.field_j = false;
                            break L22;
                          }
                        }
                      } else {
                        ac.field_m = param1;
                        if (!oa.field_j) {
                          break L22;
                        } else {
                          if (eo.field_Vb != hh.field_a) {
                            break L22;
                          } else {
                            hh.field_a = 0;
                            oa.field_j = false;
                            break L22;
                          }
                        }
                      }
                    } else {
                      ac.field_m = param1;
                      if (!oa.field_j) {
                        break L22;
                      } else {
                        if (eo.field_Vb != hh.field_a) {
                          break L22;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          break L22;
                        }
                      }
                    }
                  } else {
                    ac.field_m = param1;
                    if (!oa.field_j) {
                      break L22;
                    } else {
                      if (eo.field_Vb != hh.field_a) {
                        break L22;
                      } else {
                        hh.field_a = 0;
                        oa.field_j = false;
                        break L22;
                      }
                    }
                  }
                }
                return;
              } else {
                L25: {
                  if (oe.field_Q + se.field_l <= hh.field_a) {
                    stackOut_52_0 = 0;
                    stackIn_53_0 = stackOut_52_0;
                    break L25;
                  } else {
                    stackOut_51_0 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    break L25;
                  }
                }
                L26: {
                  var2 = stackIn_53_0;
                  if (param1 != -1) {
                    if (oa.field_j) {
                      hh.field_a = se.field_l;
                      break L26;
                    } else {
                      if (var2 != 0) {
                        hh.field_a = se.field_l;
                        break L26;
                      } else {
                        hh.field_a = 0;
                        break L26;
                      }
                    }
                  } else {
                    hh.field_a = 0;
                    break L26;
                  }
                }
                L27: {
                  L28: {
                    pa.field_H = wn.field_i;
                    if (param1 == -1) {
                      if (var2 == 0) {
                        break L28;
                      } else {
                        oa.field_j = true;
                        pm.field_p = gg.field_f;
                        break L27;
                      }
                    } else {
                      oa.field_j = false;
                      break L28;
                    }
                  }
                  pm.field_p = gg.field_f;
                  break L27;
                }
                L29: {
                  if (oa.field_j) {
                    break L29;
                  } else {
                    if (hh.field_a >= se.field_l) {
                      break L29;
                    } else {
                      if (!re.field_c) {
                        break L29;
                      } else {
                        pm.field_p = gg.field_f;
                        pa.field_H = wn.field_i;
                        hh.field_a = 0;
                        break L29;
                      }
                    }
                  }
                }
                L30: {
                  ac.field_m = param1;
                  if (!oa.field_j) {
                    break L30;
                  } else {
                    if (eo.field_Vb != hh.field_a) {
                      break L30;
                    } else {
                      hh.field_a = 0;
                      oa.field_j = false;
                      break L30;
                    }
                  }
                }
                return;
              }
            } else {
              L31: {
                var2 = 0;
                if (param1 != -1) {
                  L32: {
                    if (oa.field_j) {
                      break L32;
                    } else {
                      if (var2 != 0) {
                        break L32;
                      } else {
                        hh.field_a = 0;
                        break L31;
                      }
                    }
                  }
                  hh.field_a = se.field_l;
                  break L31;
                } else {
                  hh.field_a = 0;
                  break L31;
                }
              }
              L33: {
                pa.field_H = wn.field_i;
                if (param1 == -1) {
                  if (var2 == 0) {
                    break L33;
                  } else {
                    oa.field_j = true;
                    break L33;
                  }
                } else {
                  oa.field_j = false;
                  break L33;
                }
              }
              L34: {
                pm.field_p = gg.field_f;
                if (!oa.field_j) {
                  if (hh.field_a < se.field_l) {
                    if (re.field_c) {
                      pm.field_p = gg.field_f;
                      pa.field_H = wn.field_i;
                      hh.field_a = 0;
                      ac.field_m = param1;
                      if (!oa.field_j) {
                        break L34;
                      } else {
                        if (eo.field_Vb != hh.field_a) {
                          break L34;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          break L34;
                        }
                      }
                    } else {
                      ac.field_m = param1;
                      if (!oa.field_j) {
                        break L34;
                      } else {
                        if (eo.field_Vb != hh.field_a) {
                          break L34;
                        } else {
                          hh.field_a = 0;
                          oa.field_j = false;
                          break L34;
                        }
                      }
                    }
                  } else {
                    ac.field_m = param1;
                    if (!oa.field_j) {
                      break L34;
                    } else {
                      if (eo.field_Vb != hh.field_a) {
                        break L34;
                      } else {
                        hh.field_a = 0;
                        oa.field_j = false;
                        break L34;
                      }
                    }
                  }
                } else {
                  ac.field_m = param1;
                  if (!oa.field_j) {
                    break L34;
                  } else {
                    if (eo.field_Vb != hh.field_a) {
                      break L34;
                    } else {
                      hh.field_a = 0;
                      oa.field_j = false;
                      break L34;
                    }
                  }
                }
              }
              return;
            }
          } else {
            L35: {
              if (!oa.field_j) {
                if (hh.field_a < se.field_l) {
                  if (re.field_c) {
                    pm.field_p = gg.field_f;
                    pa.field_H = wn.field_i;
                    hh.field_a = 0;
                    ac.field_m = param1;
                    if (!oa.field_j) {
                      break L35;
                    } else {
                      if (eo.field_Vb != hh.field_a) {
                        break L35;
                      } else {
                        hh.field_a = 0;
                        oa.field_j = false;
                        break L35;
                      }
                    }
                  } else {
                    ac.field_m = param1;
                    if (!oa.field_j) {
                      break L35;
                    } else {
                      if (eo.field_Vb != hh.field_a) {
                        break L35;
                      } else {
                        hh.field_a = 0;
                        oa.field_j = false;
                        break L35;
                      }
                    }
                  }
                } else {
                  ac.field_m = param1;
                  if (!oa.field_j) {
                    break L35;
                  } else {
                    if (eo.field_Vb != hh.field_a) {
                      break L35;
                    } else {
                      hh.field_a = 0;
                      oa.field_j = false;
                      break L35;
                    }
                  }
                }
              } else {
                ac.field_m = param1;
                if (!oa.field_j) {
                  break L35;
                } else {
                  if (eo.field_Vb != hh.field_a) {
                    break L35;
                  } else {
                    hh.field_a = 0;
                    oa.field_j = false;
                    break L35;
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void f(int param0) {
        field_I = null;
        field_L = null;
    }

    jo(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
            ((jo) this).field_n = false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "jo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        var4 = ((jo) this).field_h[param2];
        if (var4 != 54) {
          if (var4 != 55) {
            if (56 != var4) {
              if (var4 != 57) {
                if (58 != var4) {
                  L0: {
                    if (59 != var4) {
                      if (var4 != 60) {
                        super.b(-16470, param1, param2);
                        if (param0 == -16470) {
                          return;
                        } else {
                          jo.g(-10, -105);
                          return;
                        }
                      } else {
                        if (!((jo) this).field_B.b((byte) 125)) {
                          break L0;
                        } else {
                          ac.a(256, true, true, jh.field_d);
                          if (param0 == -16470) {
                            return;
                          } else {
                            jo.g(-10, -105);
                            return;
                          }
                        }
                      }
                    } else {
                      if (!((jo) this).field_B.b((byte) 73)) {
                        break L0;
                      } else {
                        ac.a(256, true, true, ul.field_m);
                        if (param0 == -16470) {
                          return;
                        } else {
                          jo.g(-10, -105);
                          return;
                        }
                      }
                    }
                  }
                  if (param0 == -16470) {
                    return;
                  } else {
                    jo.g(-10, -105);
                    return;
                  }
                } else {
                  if (((jo) this).field_B.b((byte) 62)) {
                    ac.a(param0 + 16726, true, true, nn.field_b[4].field_b);
                    if (param0 == -16470) {
                      return;
                    } else {
                      jo.g(-10, -105);
                      return;
                    }
                  } else {
                    if (param0 == -16470) {
                      return;
                    } else {
                      jo.g(-10, -105);
                      return;
                    }
                  }
                }
              } else {
                if (((jo) this).field_B.b((byte) 56)) {
                  ac.a(param0 ^ -16726, true, true, nn.field_b[3].field_b);
                  if (param0 != -16470) {
                    jo.g(-10, -105);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 == -16470) {
                    return;
                  } else {
                    jo.g(-10, -105);
                    return;
                  }
                }
              }
            } else {
              if (((jo) this).field_B.b((byte) 54)) {
                ac.a(param0 ^ -16726, true, true, nn.field_b[2].field_b);
                if (param0 == -16470) {
                  return;
                } else {
                  jo.g(-10, -105);
                  return;
                }
              } else {
                if (param0 == -16470) {
                  return;
                } else {
                  jo.g(-10, -105);
                  return;
                }
              }
            }
          } else {
            if (((jo) this).field_B.b((byte) 115)) {
              ac.a(256, true, true, nn.field_b[1].field_b);
              if (param0 == -16470) {
                return;
              } else {
                jo.g(-10, -105);
                return;
              }
            } else {
              if (param0 == -16470) {
                return;
              } else {
                jo.g(-10, -105);
                return;
              }
            }
          }
        } else {
          if (((jo) this).field_B.b((byte) 54)) {
            ac.a(param0 ^ -16726, true, true, nn.field_b[0].field_b);
            if (param0 == -16470) {
              return;
            } else {
              jo.g(-10, -105);
              return;
            }
          } else {
            if (param0 == -16470) {
              return;
            } else {
              jo.g(-10, -105);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Message lobby";
        field_J = 0;
        field_I = new String[]{"Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Player 6", "Player 7", "Player 8"};
    }
}
