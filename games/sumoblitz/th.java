/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sp implements ca, ai {
    static ri field_C;
    static int field_H;
    private uk field_G;
    private wp field_D;
    static hr field_B;
    private ar field_F;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 60, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (98 != param3) {
                if (param3 != 99) {
                  L1: {
                    if (param2 >= 9) {
                      break L1;
                    } else {
                      th.e(false);
                      break L1;
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((th) this).a(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((th) this).a((byte) -94, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("th.KA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    th(uk param0) {
        super(0, 0, 288, 0, (mh) null);
        RuntimeException var2 = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((th) this).field_G = param0;
            ((th) this).field_D = new wp(wd.field_h, (qm) null);
            ((th) this).field_D.field_w = (mh) (Object) new ue();
            var7 = ic.a(qv.field_l, new String[2], (byte) -128);
            var3 = 20;
            var4 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
            ((th) this).field_F = new ar(var7, (mh) (Object) var4);
            ((th) this).field_F.field_t = "";
            ((th) this).field_F.a(-57, sb.field_e, 0);
            ((th) this).field_F.a(-66, sb.field_e, 1);
            ((th) this).field_F.field_o = (qm) this;
            ((th) this).field_F.field_q = -40 + ((th) this).field_q;
            ((th) this).field_F.a(var3, false, 26, -40 + ((th) this).field_q);
            var3 = var3 + (15 + ((th) this).field_F.field_p);
            ((th) this).a((pk) (Object) ((th) this).field_F, 99);
            var5 = 4;
            var6 = 200;
            ((th) this).field_D.a(-79, 300 + -var6 >> 1, var3, 40, var6);
            ((th) this).field_D.field_o = (qm) this;
            ((th) this).a((pk) (Object) ((th) this).field_D, 76);
            ((th) this).a(-112, 0, 0, 55 + var3 + var5, 300);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("th.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = 1 << param2;
        if ((var3 & kh.field_e) == 0) {
          L0: {
            kh.field_e = kh.field_e | var3;
            wj.field_e = wj.field_e | var3;
            pl.field_v.a((ms) (Object) new ge(param2), (byte) 39);
            if (gj.a((byte) -84, 10) >= 5) {
              fb.field_a = fb.field_a + iw.field_b;
              break L0;
            } else {
              ha.field_f = ha.field_f + iw.field_b;
              break L0;
            }
          }
          L1: {
            if (gj.a((byte) -84, 10) < 5) {
              ts.field_a = ts.field_a - te.field_c;
              break L1;
            } else {
              kn.field_b = kn.field_b - te.field_c;
              break L1;
            }
          }
          ia.a(param2, (byte) -82);
          if (param0 == 24753) {
            L2: {
              if (3 == param2) {
                kn.field_b = kn.field_b - ld.field_C;
                ha.field_f = ha.field_f + oh.field_e;
                ts.field_a = ts.field_a - nq.field_i;
                break L2;
              } else {
                if (param2 != 4) {
                  if (param2 != 5) {
                    L3: {
                      if (6 == param2) {
                        break L3;
                      } else {
                        if (param2 != 7) {
                          if (param2 != 10) {
                            L4: {
                              if (param2 == 0) {
                                break L4;
                              } else {
                                if (param2 == 1) {
                                  break L4;
                                } else {
                                  if (2 == param2) {
                                    break L4;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                            fb.field_a = fb.field_a + oh.field_e;
                            break L2;
                          } else {
                            ha.field_f = ha.field_f + oh.field_e;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    ts.field_a = ts.field_a + nq.field_i;
                    break L2;
                  } else {
                    L5: {
                      ts.field_a = ts.field_a + nq.field_i;
                      if (!f.field_w) {
                        pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (3 != param2) {
                        if (param2 != 4) {
                          if (param2 != 5) {
                            L7: {
                              if (6 == param2) {
                                break L7;
                              } else {
                                if (param2 == 7) {
                                  break L7;
                                } else {
                                  if (10 == param2) {
                                    L8: {
                                      ha.field_f = ha.field_f - oh.field_e;
                                      if (5 > gj.a((byte) -84, 10)) {
                                        ha.field_f = ha.field_f - iw.field_b;
                                        break L8;
                                      } else {
                                        fb.field_a = fb.field_a - iw.field_b;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (gj.a((byte) -84, 10) >= 5) {
                                        kn.field_b = kn.field_b + te.field_c;
                                        break L9;
                                      } else {
                                        ts.field_a = ts.field_a + te.field_c;
                                        break L9;
                                      }
                                    }
                                    return;
                                  } else {
                                    L10: {
                                      if (param2 == 0) {
                                        break L10;
                                      } else {
                                        if (param2 == 1) {
                                          break L10;
                                        } else {
                                          if (param2 == 2) {
                                            break L10;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    fb.field_a = fb.field_a - oh.field_e;
                                    break L6;
                                  }
                                }
                              }
                            }
                            L11: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L11;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L11;
                              }
                            }
                            L12: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L12;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L12;
                              }
                            }
                            return;
                          } else {
                            L13: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L13;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L13;
                              }
                            }
                            L14: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L14;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L14;
                              }
                            }
                            return;
                          }
                        } else {
                          L15: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              ha.field_f = ha.field_f - iw.field_b;
                              break L15;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              break L15;
                            }
                          }
                          L16: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              kn.field_b = kn.field_b + te.field_c;
                              break L16;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              break L16;
                            }
                          }
                          return;
                        }
                      } else {
                        kn.field_b = kn.field_b + ld.field_C;
                        ha.field_f = ha.field_f - oh.field_e;
                        ts.field_a = ts.field_a + nq.field_i;
                        break L6;
                      }
                    }
                    if (5 > gj.a((byte) -84, 10)) {
                      L17: {
                        ha.field_f = ha.field_f - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          break L17;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          break L17;
                        }
                      }
                      return;
                    } else {
                      L18: {
                        fb.field_a = fb.field_a - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          break L18;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          break L18;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L19: {
                    ts.field_a = ts.field_a + nq.field_i;
                    if (!f.field_w) {
                      pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (3 != param2) {
                      L21: {
                        if (param2 == 4) {
                          break L21;
                        } else {
                          if (param2 == 5) {
                            break L21;
                          } else {
                            if (6 == param2) {
                              break L21;
                            } else {
                              if (param2 == 7) {
                                break L21;
                              } else {
                                if (10 == param2) {
                                  L22: {
                                    ha.field_f = ha.field_f - oh.field_e;
                                    if (5 > gj.a((byte) -84, 10)) {
                                      ha.field_f = ha.field_f - iw.field_b;
                                      break L22;
                                    } else {
                                      fb.field_a = fb.field_a - iw.field_b;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (gj.a((byte) -84, 10) >= 5) {
                                      kn.field_b = kn.field_b + te.field_c;
                                      break L23;
                                    } else {
                                      ts.field_a = ts.field_a + te.field_c;
                                      break L23;
                                    }
                                  }
                                  return;
                                } else {
                                  L24: {
                                    if (param2 == 0) {
                                      break L24;
                                    } else {
                                      if (param2 == 1) {
                                        break L24;
                                      } else {
                                        if (param2 == 2) {
                                          break L24;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  fb.field_a = fb.field_a - oh.field_e;
                                  break L20;
                                }
                              }
                            }
                          }
                        }
                      }
                      L25: {
                        ts.field_a = ts.field_a - nq.field_i;
                        if (5 > gj.a((byte) -84, 10)) {
                          ha.field_f = ha.field_f - iw.field_b;
                          break L25;
                        } else {
                          fb.field_a = fb.field_a - iw.field_b;
                          break L25;
                        }
                      }
                      L26: {
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          break L26;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          break L26;
                        }
                      }
                      return;
                    } else {
                      kn.field_b = kn.field_b + ld.field_C;
                      ha.field_f = ha.field_f - oh.field_e;
                      ts.field_a = ts.field_a + nq.field_i;
                      break L20;
                    }
                  }
                  if (5 > gj.a((byte) -84, 10)) {
                    L27: {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L27;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L27;
                      }
                    }
                    return;
                  } else {
                    L28: {
                      fb.field_a = fb.field_a - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L28;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L28;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L29: {
              if (!f.field_w) {
                pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (3 != param2) {
                L31: {
                  if (param2 == 4) {
                    break L31;
                  } else {
                    if (param2 == 5) {
                      break L31;
                    } else {
                      if (6 == param2) {
                        break L31;
                      } else {
                        if (param2 == 7) {
                          break L31;
                        } else {
                          if (10 == param2) {
                            L32: {
                              ha.field_f = ha.field_f - oh.field_e;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L32;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L32;
                              }
                            }
                            L33: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L33;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L33;
                              }
                            }
                            return;
                          } else {
                            L34: {
                              if (param2 == 0) {
                                break L34;
                              } else {
                                if (param2 == 1) {
                                  break L34;
                                } else {
                                  if (param2 == 2) {
                                    break L34;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            fb.field_a = fb.field_a - oh.field_e;
                            break L30;
                          }
                        }
                      }
                    }
                  }
                }
                ts.field_a = ts.field_a - nq.field_i;
                if (5 > gj.a((byte) -84, 10)) {
                  ha.field_f = ha.field_f - iw.field_b;
                  if (gj.a((byte) -84, 10) >= 5) {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  } else {
                    ts.field_a = ts.field_a + te.field_c;
                    return;
                  }
                } else {
                  fb.field_a = fb.field_a - iw.field_b;
                  if (gj.a((byte) -84, 10) >= 5) {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  } else {
                    ts.field_a = ts.field_a + te.field_c;
                    return;
                  }
                }
              } else {
                kn.field_b = kn.field_b + ld.field_C;
                ha.field_f = ha.field_f - oh.field_e;
                ts.field_a = ts.field_a + nq.field_i;
                break L30;
              }
            }
            if (5 > gj.a((byte) -84, 10)) {
              ha.field_f = ha.field_f - iw.field_b;
              if (gj.a((byte) -84, 10) >= 5) {
                kn.field_b = kn.field_b + te.field_c;
                return;
              } else {
                ts.field_a = ts.field_a + te.field_c;
                return;
              }
            } else {
              fb.field_a = fb.field_a - iw.field_b;
              if (gj.a((byte) -84, 10) >= 5) {
                kn.field_b = kn.field_b + te.field_c;
                return;
              } else {
                ts.field_a = ts.field_a + te.field_c;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                hn.a((byte) 113, "terms.ws");
                break L1;
              } else {
                if (1 == param0) {
                  hn.a((byte) 80, "privacy.ws");
                  break L1;
                } else {
                  if (param0 != 2) {
                    break L1;
                  } else {
                    hn.a((byte) 98, "conduct.ws");
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3 == -20036) {
                break L2;
              } else {
                ((th) this).field_G = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("th.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(int param0) {
        return "</col></u>";
    }

    final static void e(boolean param0) {
        ha.field_d = fd.field_i + " <b>" + km.field_m + "</b> " + ws.field_a + " <b>" + up.field_b + "</b> " + oh.field_b + "<br>" + "<br>" + c.field_q;
        if (!param0) {
            th.e(false);
        }
    }

    private final String a(byte param0) {
        int var2 = -37;
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != ((th) this).field_D) {
                break L1;
              } else {
                kh.a(false);
                ((th) this).field_G.n(-7);
                break L1;
              }
            }
            L2: {
              if (param1 == 710) {
                break L2;
              } else {
                th.f(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(boolean param0) {
        if (param0) {
            th.b(82, -23, -57);
            field_C = null;
            field_B = null;
            return;
        }
        field_C = null;
        field_B = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
    }
}
