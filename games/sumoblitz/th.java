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
        int decompiledRegionSelector0 = 0;
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
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.a(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = this.a((byte) -94, param0);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("th.KA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("th.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = 1 << param2;
        if ((var3 & kh.field_e) == 0) {
          kh.field_e = kh.field_e | var3;
          wj.field_e = wj.field_e | var3;
          pl.field_v.a((ms) (new ge(param2)), (byte) 39);
          if (-6 < (gj.a((byte) -84, 10) ^ -1)) {
            ha.field_f = ha.field_f + iw.field_b;
            if (var4 != 0) {
              L0: {
                L1: {
                  fb.field_a = fb.field_a + iw.field_b;
                  if ((gj.a((byte) -84, 10) ^ -1) > -6) {
                    break L1;
                  } else {
                    kn.field_b = kn.field_b - te.field_c;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                ts.field_a = ts.field_a - te.field_c;
                break L0;
              }
              ia.a(param2, (byte) -82);
              if (param0 == 24753) {
                L2: {
                  L3: {
                    if (3 == param2) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          if (param2 == 4) {
                            break L5;
                          } else {
                            if (param2 == 5) {
                              break L5;
                            } else {
                              if (6 == param2) {
                                break L5;
                              } else {
                                if (-8 != (param2 ^ -1)) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        ts.field_a = ts.field_a + nq.field_i;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (param2 != 10) {
                          break L6;
                        } else {
                          ha.field_f = ha.field_f + oh.field_e;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (param2 == 0) {
                          break L7;
                        } else {
                          if (param2 == 1) {
                            break L7;
                          } else {
                            if (2 == param2) {
                              break L7;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      fb.field_a = fb.field_a + oh.field_e;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  kn.field_b = kn.field_b - ld.field_C;
                  ha.field_f = ha.field_f + oh.field_e;
                  ts.field_a = ts.field_a - nq.field_i;
                  break L2;
                }
                L8: {
                  if (!f.field_w) {
                    pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (3 == param2) {
                  kn.field_b = kn.field_b + ld.field_C;
                  ha.field_f = ha.field_f - oh.field_e;
                  ts.field_a = ts.field_a + nq.field_i;
                  if (var4 != 0) {
                    L9: {
                      if (param2 == 4) {
                        break L9;
                      } else {
                        if ((param2 ^ -1) == -6) {
                          break L9;
                        } else {
                          if (6 == param2) {
                            break L9;
                          } else {
                            if (param2 == 7) {
                              break L9;
                            } else {
                              L10: {
                                L11: {
                                  if (10 == param2) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (param2 == 0) {
                                        break L12;
                                      } else {
                                        if (-2 == (param2 ^ -1)) {
                                          break L12;
                                        } else {
                                          if ((param2 ^ -1) == -3) {
                                            break L12;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    fb.field_a = fb.field_a - oh.field_e;
                                    if (var4 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                ha.field_f = ha.field_f - oh.field_e;
                                if (var4 == 0) {
                                  break L10;
                                } else {
                                  L13: {
                                    ts.field_a = ts.field_a - nq.field_i;
                                    if (5 > gj.a((byte) -84, 10)) {
                                      break L13;
                                    } else {
                                      fb.field_a = fb.field_a - iw.field_b;
                                      break L13;
                                    }
                                  }
                                  ha.field_f = ha.field_f - iw.field_b;
                                  L14: {
                                    L15: {
                                      if (gj.a((byte) -84, 10) >= 5) {
                                        break L15;
                                      } else {
                                        ts.field_a = ts.field_a + te.field_c;
                                        if (var4 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    kn.field_b = kn.field_b + te.field_c;
                                    break L14;
                                  }
                                  return;
                                }
                              }
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                if (gj.a((byte) -84, 10) >= 5) {
                                  kn.field_b = kn.field_b + te.field_c;
                                  return;
                                } else {
                                  ts.field_a = ts.field_a + te.field_c;
                                  if (var4 == 0) {
                                    return;
                                  } else {
                                    kn.field_b = kn.field_b + te.field_c;
                                    return;
                                  }
                                }
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                if (var4 == 0) {
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    return;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    if (var4 == 0) {
                                      return;
                                    } else {
                                      kn.field_b = kn.field_b + te.field_c;
                                      return;
                                    }
                                  }
                                } else {
                                  ha.field_f = ha.field_f - iw.field_b;
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    return;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    kn.field_b = kn.field_b + te.field_c;
                                    return;
                                  }
                                }
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
                        if (var4 == 0) {
                          return;
                        } else {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        }
                      }
                    } else {
                      fb.field_a = fb.field_a - iw.field_b;
                      if (var4 == 0) {
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          if (var4 == 0) {
                            return;
                          } else {
                            kn.field_b = kn.field_b + te.field_c;
                            return;
                          }
                        }
                      } else {
                        ha.field_f = ha.field_f - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        }
                      }
                    }
                  } else {
                    if (5 > gj.a((byte) -84, 10)) {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        return;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        if (var4 == 0) {
                          return;
                        } else {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        }
                      }
                    } else {
                      fb.field_a = fb.field_a - iw.field_b;
                      if (var4 == 0) {
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          if (var4 == 0) {
                            return;
                          } else {
                            kn.field_b = kn.field_b + te.field_c;
                            return;
                          }
                        }
                      } else {
                        ha.field_f = ha.field_f - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          kn.field_b = kn.field_b + te.field_c;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L16: {
                    if (param2 == 4) {
                      break L16;
                    } else {
                      if ((param2 ^ -1) == -6) {
                        break L16;
                      } else {
                        if (6 == param2) {
                          break L16;
                        } else {
                          if (param2 == 7) {
                            break L16;
                          } else {
                            L17: {
                              L18: {
                                if (10 == param2) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (param2 == 0) {
                                      break L19;
                                    } else {
                                      if (-2 == (param2 ^ -1)) {
                                        break L19;
                                      } else {
                                        if ((param2 ^ -1) == -3) {
                                          break L19;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                  fb.field_a = fb.field_a - oh.field_e;
                                  if (var4 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              ha.field_f = ha.field_f - oh.field_e;
                              if (var4 == 0) {
                                break L17;
                              } else {
                                L20: {
                                  ts.field_a = ts.field_a - nq.field_i;
                                  if (5 > gj.a((byte) -84, 10)) {
                                    break L20;
                                  } else {
                                    fb.field_a = fb.field_a - iw.field_b;
                                    break L20;
                                  }
                                }
                                ha.field_f = ha.field_f - iw.field_b;
                                L21: {
                                  L22: {
                                    if (gj.a((byte) -84, 10) >= 5) {
                                      break L22;
                                    } else {
                                      ts.field_a = ts.field_a + te.field_c;
                                      if (var4 == 0) {
                                        break L21;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  kn.field_b = kn.field_b + te.field_c;
                                  break L21;
                                }
                                return;
                              }
                            }
                            if (5 > gj.a((byte) -84, 10)) {
                              ha.field_f = ha.field_f - iw.field_b;
                              if (gj.a((byte) -84, 10) < 5) {
                                ts.field_a = ts.field_a + te.field_c;
                                if (var4 != 0) {
                                  kn.field_b = kn.field_b + te.field_c;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                kn.field_b = kn.field_b + te.field_c;
                                return;
                              }
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              if (var4 == 0) {
                                if (gj.a((byte) -84, 10) < 5) {
                                  ts.field_a = ts.field_a + te.field_c;
                                  if (var4 != 0) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    return;
                                  } else {
                                    return;
                                  }
                                } else {
                                  kn.field_b = kn.field_b + te.field_c;
                                  return;
                                }
                              } else {
                                ha.field_f = ha.field_f - iw.field_b;
                                if (gj.a((byte) -84, 10) < 5) {
                                  ts.field_a = ts.field_a + te.field_c;
                                  kn.field_b = kn.field_b + te.field_c;
                                  return;
                                } else {
                                  kn.field_b = kn.field_b + te.field_c;
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L23: {
                    L24: {
                      ts.field_a = ts.field_a - nq.field_i;
                      if (5 > gj.a((byte) -84, 10)) {
                        break L24;
                      } else {
                        fb.field_a = fb.field_a - iw.field_b;
                        if (var4 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    ha.field_f = ha.field_f - iw.field_b;
                    break L23;
                  }
                  if (gj.a((byte) -84, 10) < 5) {
                    ts.field_a = ts.field_a + te.field_c;
                    if (var4 != 0) {
                      kn.field_b = kn.field_b + te.field_c;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L25: {
                L26: {
                  if ((gj.a((byte) -84, 10) ^ -1) > -6) {
                    break L26;
                  } else {
                    kn.field_b = kn.field_b - te.field_c;
                    if (var4 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                ts.field_a = ts.field_a - te.field_c;
                break L25;
              }
              ia.a(param2, (byte) -82);
              if (param0 == 24753) {
                L27: {
                  L28: {
                    if (3 == param2) {
                      break L28;
                    } else {
                      L29: {
                        L30: {
                          if (param2 == 4) {
                            break L30;
                          } else {
                            if (param2 == 5) {
                              break L30;
                            } else {
                              if (6 == param2) {
                                break L30;
                              } else {
                                if (-8 != (param2 ^ -1)) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        }
                        ts.field_a = ts.field_a + nq.field_i;
                        if (var4 == 0) {
                          break L27;
                        } else {
                          break L29;
                        }
                      }
                      L31: {
                        if (param2 != 10) {
                          break L31;
                        } else {
                          ha.field_f = ha.field_f + oh.field_e;
                          if (var4 == 0) {
                            break L27;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L32: {
                        if (param2 == 0) {
                          break L32;
                        } else {
                          if (param2 == 1) {
                            break L32;
                          } else {
                            if (2 == param2) {
                              break L32;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      fb.field_a = fb.field_a + oh.field_e;
                      if (var4 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  kn.field_b = kn.field_b - ld.field_C;
                  ha.field_f = ha.field_f + oh.field_e;
                  ts.field_a = ts.field_a - nq.field_i;
                  break L27;
                }
                L33: {
                  if (!f.field_w) {
                    pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  L35: {
                    if (3 != param2) {
                      break L35;
                    } else {
                      kn.field_b = kn.field_b + ld.field_C;
                      ha.field_f = ha.field_f - oh.field_e;
                      ts.field_a = ts.field_a + nq.field_i;
                      if (var4 == 0) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  if (param2 != 4) {
                    if ((param2 ^ -1) != -6) {
                      if (6 != param2) {
                        if (param2 != 7) {
                          L36: {
                            if (10 == param2) {
                              break L36;
                            } else {
                              L37: {
                                if (param2 == 0) {
                                  break L37;
                                } else {
                                  if (-2 == (param2 ^ -1)) {
                                    break L37;
                                  } else {
                                    if ((param2 ^ -1) == -3) {
                                      break L37;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                              }
                              fb.field_a = fb.field_a - oh.field_e;
                              if (var4 == 0) {
                                break L34;
                              } else {
                                break L36;
                              }
                            }
                          }
                          ha.field_f = ha.field_f - oh.field_e;
                          if (var4 == 0) {
                            break L34;
                          } else {
                            L38: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                break L38;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L38;
                              }
                            }
                            ha.field_f = ha.field_f - iw.field_b;
                            L39: {
                              L40: {
                                if (gj.a((byte) -84, 10) >= 5) {
                                  break L40;
                                } else {
                                  ts.field_a = ts.field_a + te.field_c;
                                  if (var4 == 0) {
                                    break L39;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              kn.field_b = kn.field_b + te.field_c;
                              break L39;
                            }
                            return;
                          }
                        } else {
                          L41: {
                            L42: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                break L42;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                if (var4 == 0) {
                                  break L41;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            ha.field_f = ha.field_f - iw.field_b;
                            break L41;
                          }
                          L43: {
                            L44: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                break L44;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                if (var4 == 0) {
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            kn.field_b = kn.field_b + te.field_c;
                            break L43;
                          }
                          return;
                        }
                      } else {
                        L45: {
                          L46: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              break L46;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              if (var4 == 0) {
                                break L45;
                              } else {
                                break L46;
                              }
                            }
                          }
                          ha.field_f = ha.field_f - iw.field_b;
                          break L45;
                        }
                        L47: {
                          L48: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              break L48;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              if (var4 == 0) {
                                break L47;
                              } else {
                                break L48;
                              }
                            }
                          }
                          kn.field_b = kn.field_b + te.field_c;
                          break L47;
                        }
                        return;
                      }
                    } else {
                      L49: {
                        L50: {
                          ts.field_a = ts.field_a - nq.field_i;
                          if (5 > gj.a((byte) -84, 10)) {
                            break L50;
                          } else {
                            fb.field_a = fb.field_a - iw.field_b;
                            if (var4 == 0) {
                              break L49;
                            } else {
                              break L50;
                            }
                          }
                        }
                        ha.field_f = ha.field_f - iw.field_b;
                        break L49;
                      }
                      L51: {
                        L52: {
                          if (gj.a((byte) -84, 10) >= 5) {
                            break L52;
                          } else {
                            ts.field_a = ts.field_a + te.field_c;
                            if (var4 == 0) {
                              break L51;
                            } else {
                              break L52;
                            }
                          }
                        }
                        kn.field_b = kn.field_b + te.field_c;
                        break L51;
                      }
                      return;
                    }
                  } else {
                    L53: {
                      L54: {
                        ts.field_a = ts.field_a - nq.field_i;
                        if (5 > gj.a((byte) -84, 10)) {
                          break L54;
                        } else {
                          fb.field_a = fb.field_a - iw.field_b;
                          if (var4 == 0) {
                            break L53;
                          } else {
                            break L54;
                          }
                        }
                      }
                      ha.field_f = ha.field_f - iw.field_b;
                      break L53;
                    }
                    L55: {
                      L56: {
                        if (gj.a((byte) -84, 10) >= 5) {
                          break L56;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          if (var4 == 0) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      kn.field_b = kn.field_b + te.field_c;
                      break L55;
                    }
                    return;
                  }
                }
                if (5 <= gj.a((byte) -84, 10)) {
                  fb.field_a = fb.field_a - iw.field_b;
                  if (var4 == 0) {
                    if (gj.a((byte) -84, 10) < 5) {
                      ts.field_a = ts.field_a + te.field_c;
                      if (var4 == 0) {
                        return;
                      } else {
                        kn.field_b = kn.field_b + te.field_c;
                        return;
                      }
                    } else {
                      kn.field_b = kn.field_b + te.field_c;
                      return;
                    }
                  } else {
                    L57: {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        break L57;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L57;
                      }
                    }
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  }
                } else {
                  L58: {
                    L59: {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        break L59;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        if (var4 == 0) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    kn.field_b = kn.field_b + te.field_c;
                    break L58;
                  }
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L60: {
              L61: {
                fb.field_a = fb.field_a + iw.field_b;
                if ((gj.a((byte) -84, 10) ^ -1) > -6) {
                  break L61;
                } else {
                  kn.field_b = kn.field_b - te.field_c;
                  if (var4 == 0) {
                    break L60;
                  } else {
                    break L61;
                  }
                }
              }
              ts.field_a = ts.field_a - te.field_c;
              break L60;
            }
            ia.a(param2, (byte) -82);
            if (param0 == 24753) {
              L62: {
                L63: {
                  if (3 == param2) {
                    break L63;
                  } else {
                    L64: {
                      L65: {
                        if (param2 == 4) {
                          break L65;
                        } else {
                          if (param2 == 5) {
                            break L65;
                          } else {
                            if (6 == param2) {
                              break L65;
                            } else {
                              if (-8 != (param2 ^ -1)) {
                                break L64;
                              } else {
                                break L65;
                              }
                            }
                          }
                        }
                      }
                      ts.field_a = ts.field_a + nq.field_i;
                      if (var4 == 0) {
                        break L62;
                      } else {
                        break L64;
                      }
                    }
                    L66: {
                      if (param2 != 10) {
                        break L66;
                      } else {
                        ha.field_f = ha.field_f + oh.field_e;
                        if (var4 == 0) {
                          break L62;
                        } else {
                          break L66;
                        }
                      }
                    }
                    L67: {
                      if (param2 == 0) {
                        break L67;
                      } else {
                        if (param2 == 1) {
                          break L67;
                        } else {
                          if (2 == param2) {
                            break L67;
                          } else {
                            break L62;
                          }
                        }
                      }
                    }
                    fb.field_a = fb.field_a + oh.field_e;
                    if (var4 == 0) {
                      break L62;
                    } else {
                      break L63;
                    }
                  }
                }
                kn.field_b = kn.field_b - ld.field_C;
                ha.field_f = ha.field_f + oh.field_e;
                ts.field_a = ts.field_a - nq.field_i;
                break L62;
              }
              L68: {
                if (!f.field_w) {
                  pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                L70: {
                  if (3 != param2) {
                    break L70;
                  } else {
                    kn.field_b = kn.field_b + ld.field_C;
                    ha.field_f = ha.field_f - oh.field_e;
                    ts.field_a = ts.field_a + nq.field_i;
                    if (var4 == 0) {
                      break L69;
                    } else {
                      break L70;
                    }
                  }
                }
                if (param2 != 4) {
                  if ((param2 ^ -1) != -6) {
                    if (6 != param2) {
                      if (param2 != 7) {
                        L71: {
                          if (10 == param2) {
                            break L71;
                          } else {
                            L72: {
                              if (param2 == 0) {
                                break L72;
                              } else {
                                if (-2 == (param2 ^ -1)) {
                                  break L72;
                                } else {
                                  if ((param2 ^ -1) == -3) {
                                    break L72;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                            }
                            fb.field_a = fb.field_a - oh.field_e;
                            if (var4 == 0) {
                              break L69;
                            } else {
                              break L71;
                            }
                          }
                        }
                        ha.field_f = ha.field_f - oh.field_e;
                        if (var4 == 0) {
                          break L69;
                        } else {
                          L73: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              break L73;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              break L73;
                            }
                          }
                          ha.field_f = ha.field_f - iw.field_b;
                          L74: {
                            L75: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                break L75;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                if (var4 == 0) {
                                  break L74;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            kn.field_b = kn.field_b + te.field_c;
                            break L74;
                          }
                          return;
                        }
                      } else {
                        L76: {
                          L77: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              break L77;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              if (var4 == 0) {
                                break L76;
                              } else {
                                break L77;
                              }
                            }
                          }
                          ha.field_f = ha.field_f - iw.field_b;
                          break L76;
                        }
                        L78: {
                          L79: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              break L79;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              if (var4 == 0) {
                                break L78;
                              } else {
                                break L79;
                              }
                            }
                          }
                          kn.field_b = kn.field_b + te.field_c;
                          break L78;
                        }
                        return;
                      }
                    } else {
                      L80: {
                        L81: {
                          ts.field_a = ts.field_a - nq.field_i;
                          if (5 > gj.a((byte) -84, 10)) {
                            break L81;
                          } else {
                            fb.field_a = fb.field_a - iw.field_b;
                            if (var4 == 0) {
                              break L80;
                            } else {
                              break L81;
                            }
                          }
                        }
                        ha.field_f = ha.field_f - iw.field_b;
                        break L80;
                      }
                      L82: {
                        L83: {
                          if (gj.a((byte) -84, 10) >= 5) {
                            break L83;
                          } else {
                            ts.field_a = ts.field_a + te.field_c;
                            if (var4 == 0) {
                              break L82;
                            } else {
                              break L83;
                            }
                          }
                        }
                        kn.field_b = kn.field_b + te.field_c;
                        break L82;
                      }
                      return;
                    }
                  } else {
                    L84: {
                      L85: {
                        ts.field_a = ts.field_a - nq.field_i;
                        if (5 > gj.a((byte) -84, 10)) {
                          break L85;
                        } else {
                          fb.field_a = fb.field_a - iw.field_b;
                          if (var4 == 0) {
                            break L84;
                          } else {
                            break L85;
                          }
                        }
                      }
                      ha.field_f = ha.field_f - iw.field_b;
                      break L84;
                    }
                    L86: {
                      L87: {
                        if (gj.a((byte) -84, 10) >= 5) {
                          break L87;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          if (var4 == 0) {
                            break L86;
                          } else {
                            break L87;
                          }
                        }
                      }
                      kn.field_b = kn.field_b + te.field_c;
                      break L86;
                    }
                    return;
                  }
                } else {
                  L88: {
                    L89: {
                      ts.field_a = ts.field_a - nq.field_i;
                      if (5 > gj.a((byte) -84, 10)) {
                        break L89;
                      } else {
                        fb.field_a = fb.field_a - iw.field_b;
                        if (var4 == 0) {
                          break L88;
                        } else {
                          break L89;
                        }
                      }
                    }
                    ha.field_f = ha.field_f - iw.field_b;
                    break L88;
                  }
                  L90: {
                    L91: {
                      if (gj.a((byte) -84, 10) >= 5) {
                        break L91;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        if (var4 == 0) {
                          break L90;
                        } else {
                          break L91;
                        }
                      }
                    }
                    kn.field_b = kn.field_b + te.field_c;
                    break L90;
                  }
                  return;
                }
              }
              if (5 <= gj.a((byte) -84, 10)) {
                fb.field_a = fb.field_a - iw.field_b;
                if (var4 == 0) {
                  if (gj.a((byte) -84, 10) < 5) {
                    ts.field_a = ts.field_a + te.field_c;
                    if (var4 != 0) {
                      kn.field_b = kn.field_b + te.field_c;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  }
                } else {
                  L92: {
                    ha.field_f = ha.field_f - iw.field_b;
                    if (gj.a((byte) -84, 10) >= 5) {
                      break L92;
                    } else {
                      ts.field_a = ts.field_a + te.field_c;
                      break L92;
                    }
                  }
                  kn.field_b = kn.field_b + te.field_c;
                  return;
                }
              } else {
                L93: {
                  L94: {
                    ha.field_f = ha.field_f - iw.field_b;
                    if (gj.a((byte) -84, 10) >= 5) {
                      break L94;
                    } else {
                      ts.field_a = ts.field_a + te.field_c;
                      if (var4 == 0) {
                        break L93;
                      } else {
                        break L94;
                      }
                    }
                  }
                  kn.field_b = kn.field_b + te.field_c;
                  break L93;
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (1 == param0) {
                      break L3;
                    } else {
                      if (-3 != (param0 ^ -1)) {
                        break L1;
                      } else {
                        hn.a((byte) 98, "conduct.ws");
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  hn.a((byte) 80, "privacy.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              hn.a((byte) 113, "terms.ws");
              break L1;
            }
            L4: {
              if (param3 == -20036) {
                break L4;
              } else {
                this.field_G = (uk) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("th.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
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
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
