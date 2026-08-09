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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 60, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param3) {
                if (-100 != (param3 ^ -1)) {
                  L1: {
                    if (param2 >= 9) {
                      break L1;
                    } else {
                      th.e(false);
                      break L1;
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) -94, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("th.KA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    th(uk param0) {
        super(0, 0, 288, 0, (mh) null);
        String var7 = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_G = param0;
            this.field_D = new wp(wd.field_h, (qm) null);
            this.field_D.field_w = (mh) ((Object) new ue());
            var7 = ic.a(qv.field_l, new String[]{this.a((byte) 43), this.g(116)}, (byte) -128);
            var3 = 20;
            var4 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
            this.field_F = new ar(var7, var4);
            this.field_F.field_t = "";
            this.field_F.a(-57, sb.field_e, 0);
            this.field_F.a(-66, sb.field_e, 1);
            this.field_F.field_o = (qm) (this);
            this.field_F.field_q = -40 + this.field_q;
            this.field_F.a(var3, false, 26, -40 + this.field_q);
            var3 = var3 + (15 + this.field_F.field_p);
            this.a(this.field_F, 99);
            var5 = 4;
            var6 = 200;
            this.field_D.a(-79, 300 + -var6 >> 1811237697, var3, 40, var6);
            this.field_D.field_o = (qm) (this);
            this.a(this.field_D, 76);
            this.a(-112, 0, 0, 55 + var3 + var5, 300);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = 1 << param2;
        if ((var3 & kh.field_e) == 0) {
          L0: {
            kh.field_e = kh.field_e | var3;
            wj.field_e = wj.field_e | var3;
            pl.field_v.a((ms) (new ge(param2)), (byte) 39);
            if (-6 >= (gj.a((byte) -84, 10) ^ -1)) {
              fb.field_a = fb.field_a + iw.field_b;
              break L0;
            } else {
              ha.field_f = ha.field_f + iw.field_b;
              break L0;
            }
          }
          L1: {
            if ((gj.a((byte) -84, 10) ^ -1) > -6) {
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
                        if (-8 != (param2 ^ -1)) {
                          if (param2 != 10) {
                            if (param2 != 0) {
                              if (param2 != 1) {
                                if (2 != param2) {
                                  break L2;
                                } else {
                                  fb.field_a = fb.field_a + oh.field_e;
                                  break L2;
                                }
                              } else {
                                fb.field_a = fb.field_a + oh.field_e;
                                break L2;
                              }
                            } else {
                              fb.field_a = fb.field_a + oh.field_e;
                              break L2;
                            }
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
                    L4: {
                      ts.field_a = ts.field_a + nq.field_i;
                      if (!f.field_w) {
                        pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (3 != param2) {
                        if (param2 != 4) {
                          if ((param2 ^ -1) != -6) {
                            if (6 != param2) {
                              if (param2 != 7) {
                                if (10 == param2) {
                                  L6: {
                                    ha.field_f = ha.field_f - oh.field_e;
                                    if (5 > gj.a((byte) -84, 10)) {
                                      ha.field_f = ha.field_f - iw.field_b;
                                      break L6;
                                    } else {
                                      fb.field_a = fb.field_a - iw.field_b;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (gj.a((byte) -84, 10) >= 5) {
                                      kn.field_b = kn.field_b + te.field_c;
                                      break L7;
                                    } else {
                                      ts.field_a = ts.field_a + te.field_c;
                                      break L7;
                                    }
                                  }
                                  return;
                                } else {
                                  L8: {
                                    if (param2 == 0) {
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  fb.field_a = fb.field_a - oh.field_e;
                                  break L5;
                                }
                              } else {
                                L9: {
                                  ts.field_a = ts.field_a - nq.field_i;
                                  if (5 > gj.a((byte) -84, 10)) {
                                    ha.field_f = ha.field_f - iw.field_b;
                                    break L9;
                                  } else {
                                    fb.field_a = fb.field_a - iw.field_b;
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    break L10;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    break L10;
                                  }
                                }
                                return;
                              }
                            } else {
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
                            }
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
                        break L5;
                      }
                    }
                    if (5 <= gj.a((byte) -84, 10)) {
                      L17: {
                        fb.field_a = fb.field_a - iw.field_b;
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
                        ha.field_f = ha.field_f - iw.field_b;
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
                      pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (3 != param2) {
                      if (param2 != 4) {
                        if ((param2 ^ -1) != -6) {
                          if (6 != param2) {
                            if (param2 != 7) {
                              if (10 == param2) {
                                L21: {
                                  ha.field_f = ha.field_f - oh.field_e;
                                  if (5 > gj.a((byte) -84, 10)) {
                                    ha.field_f = ha.field_f - iw.field_b;
                                    break L21;
                                  } else {
                                    fb.field_a = fb.field_a - iw.field_b;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    break L22;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    break L22;
                                  }
                                }
                                return;
                              } else {
                                L23: {
                                  if (param2 == 0) {
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                fb.field_a = fb.field_a - oh.field_e;
                                break L20;
                              }
                            } else {
                              L24: {
                                ts.field_a = ts.field_a - nq.field_i;
                                if (5 > gj.a((byte) -84, 10)) {
                                  ha.field_f = ha.field_f - iw.field_b;
                                  break L24;
                                } else {
                                  fb.field_a = fb.field_a - iw.field_b;
                                  break L24;
                                }
                              }
                              L25: {
                                if (gj.a((byte) -84, 10) >= 5) {
                                  kn.field_b = kn.field_b + te.field_c;
                                  break L25;
                                } else {
                                  ts.field_a = ts.field_a + te.field_c;
                                  break L25;
                                }
                              }
                              return;
                            }
                          } else {
                            L26: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L26;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L26;
                              }
                            }
                            L27: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L27;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L27;
                              }
                            }
                            return;
                          }
                        } else {
                          L28: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              ha.field_f = ha.field_f - iw.field_b;
                              break L28;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              break L28;
                            }
                          }
                          L29: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              kn.field_b = kn.field_b + te.field_c;
                              break L29;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              break L29;
                            }
                          }
                          return;
                        }
                      } else {
                        L30: {
                          ts.field_a = ts.field_a - nq.field_i;
                          if (5 > gj.a((byte) -84, 10)) {
                            ha.field_f = ha.field_f - iw.field_b;
                            break L30;
                          } else {
                            fb.field_a = fb.field_a - iw.field_b;
                            break L30;
                          }
                        }
                        L31: {
                          if (gj.a((byte) -84, 10) >= 5) {
                            kn.field_b = kn.field_b + te.field_c;
                            break L31;
                          } else {
                            ts.field_a = ts.field_a + te.field_c;
                            break L31;
                          }
                        }
                        return;
                      }
                    } else {
                      kn.field_b = kn.field_b + ld.field_C;
                      ha.field_f = ha.field_f - oh.field_e;
                      ts.field_a = ts.field_a + nq.field_i;
                      break L20;
                    }
                  }
                  if (5 <= gj.a((byte) -84, 10)) {
                    L32: {
                      fb.field_a = fb.field_a - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L32;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L33;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L33;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L34: {
              if (!f.field_w) {
                pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (3 != param2) {
                L36: {
                  if (param2 == 4) {
                    break L36;
                  } else {
                    if ((param2 ^ -1) == -6) {
                      break L36;
                    } else {
                      if (6 == param2) {
                        break L36;
                      } else {
                        if (param2 == 7) {
                          break L36;
                        } else {
                          if (10 == param2) {
                            L37: {
                              ha.field_f = ha.field_f - oh.field_e;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L37;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L37;
                              }
                            }
                            L38: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L38;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L38;
                              }
                            }
                            return;
                          } else {
                            L39: {
                              if (param2 == 0) {
                                break L39;
                              } else {
                                if (-2 == (param2 ^ -1)) {
                                  break L39;
                                } else {
                                  if ((param2 ^ -1) == -3) {
                                    break L39;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            fb.field_a = fb.field_a - oh.field_e;
                            break L35;
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
                break L35;
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
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  if (-3 != (param0 ^ -1)) {
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
                this.field_G = (uk) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("th.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(int param0) {
        if (param0 <= 2) {
            ar var3 = (ar) null;
            this.a(-104, (ar) null, -45, 28);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final static void e(boolean param0) {
        ha.field_d = fd.field_i + " <b>" + km.field_m + "</b> " + ws.field_a + " <b>" + up.field_b + "</b> " + oh.field_b + "<br>" + "<br>" + c.field_q;
        if (!param0) {
            th.e(false);
        }
    }

    private final String a(byte param0) {
        int var2 = 75 / ((-65 - param0) / 44);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
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
              if (param2 != this.field_D) {
                break L1;
              } else {
                kh.a(false);
                this.field_G.n(-7);
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
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
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
        field_H = 0;
    }
}
