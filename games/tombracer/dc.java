/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends dg {
    private int field_r;
    private int field_m;
    private int field_t;
    static int field_o;
    private boolean field_p;
    private rea field_v;
    private int field_n;
    private int field_q;
    private boolean field_u;
    private fla field_s;

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(120, param1, param2);
              ((dc) this).field_q = param2.b((byte) 44, 4);
              if (param0 > 119) {
                break L1;
              } else {
                var5 = null;
                ((dc) this).a((iq) null, 87, -34, 68, (byte) 5);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dc.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          int discarded$2 = ((dc) this).e((byte) 28);
          return super.e((byte) -108) - -(((dc) this).field_r << 16);
        } else {
          return super.e((byte) -108) - -(((dc) this).field_r << 16);
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 85, param1);
            int var3_int = -96 / ((param0 - -8) / 40);
            param1.a((byte) -125, ((dc) this).field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dc.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    dc(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        ((dc) this).field_n = 160;
    }

    final static void a(int param0, int param1, byte param2) {
        L0: {
          L1: {
            if (null == pd.field_p) {
              break L1;
            } else {
              if (param0 <= pd.field_p.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          pd.field_p = new int[param0 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == jk.field_h) {
              break L3;
            } else {
              if (param0 > jk.field_h.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          jk.field_h = new int[param0 * 2];
          break L2;
        }
        L4: {
          if (cu.field_o == null) {
            break L4;
          } else {
            if (cu.field_o.length >= param0) {
              if (null == bq.field_h) {
                bq.field_h = new int[param0 * 2];
                if (im.field_o == null) {
                  L5: {
                    L6: {
                      im.field_o = new int[param0 * 2];
                      if (ic.field_c == null) {
                        break L6;
                      } else {
                        if (param0 > ic.field_c.length) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ic.field_c = new int[param0 * 2];
                    break L5;
                  }
                  L7: {
                    L8: {
                      if (boa.field_n == null) {
                        break L8;
                      } else {
                        if (param1 + param0 > boa.field_n.length) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    boa.field_n = new int[2 * (param1 + param0)];
                    break L7;
                  }
                  L9: {
                    if (gja.field_B == null) {
                      break L9;
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        break L9;
                      }
                    }
                  }
                  gja.field_B = new boolean[2 * param0];
                  ota.field_c = 2147483647;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  if (param0 <= im.field_o.length) {
                    L10: {
                      L11: {
                        if (ic.field_c == null) {
                          break L11;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L10;
                    }
                    L12: {
                      L13: {
                        if (boa.field_n == null) {
                          break L13;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L12;
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    }
                  } else {
                    L14: {
                      L15: {
                        im.field_o = new int[param0 * 2];
                        if (ic.field_c == null) {
                          break L15;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L14;
                    }
                    L16: {
                      L17: {
                        if (boa.field_n == null) {
                          break L17;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L16;
                    }
                    L18: {
                      if (gja.field_B == null) {
                        break L18;
                      } else {
                        if (gja.field_B.length >= param0) {
                          ota.field_c = 2147483647;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          break L18;
                        }
                      }
                    }
                    gja.field_B = new boolean[2 * param0];
                    ota.field_c = 2147483647;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  }
                }
              } else {
                if (bq.field_h.length >= param0) {
                  if (im.field_o == null) {
                    L19: {
                      L20: {
                        im.field_o = new int[param0 * 2];
                        if (ic.field_c == null) {
                          break L20;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L19;
                    }
                    L21: {
                      L22: {
                        if (boa.field_n == null) {
                          break L22;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L21;
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    }
                  } else {
                    if (param0 <= im.field_o.length) {
                      L23: {
                        L24: {
                          if (ic.field_c == null) {
                            break L24;
                          } else {
                            if (param0 > ic.field_c.length) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ic.field_c = new int[param0 * 2];
                        break L23;
                      }
                      L25: {
                        L26: {
                          if (boa.field_n == null) {
                            break L26;
                          } else {
                            if (param1 + param0 > boa.field_n.length) {
                              break L26;
                            } else {
                              break L25;
                            }
                          }
                        }
                        boa.field_n = new int[2 * (param1 + param0)];
                        break L25;
                      }
                      if (gja.field_B == null) {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        if (gja.field_B.length >= param0) {
                          ota.field_c = 2147483647;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          gja.field_B = new boolean[2 * param0];
                          ota.field_c = 2147483647;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      }
                    } else {
                      L27: {
                        L28: {
                          im.field_o = new int[param0 * 2];
                          if (ic.field_c == null) {
                            break L28;
                          } else {
                            if (param0 > ic.field_c.length) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        ic.field_c = new int[param0 * 2];
                        break L27;
                      }
                      L29: {
                        L30: {
                          if (boa.field_n == null) {
                            break L30;
                          } else {
                            if (param1 + param0 > boa.field_n.length) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        boa.field_n = new int[2 * (param1 + param0)];
                        break L29;
                      }
                      if (gja.field_B == null) {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        if (gja.field_B.length >= param0) {
                          ota.field_c = 2147483647;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          gja.field_B = new boolean[2 * param0];
                          ota.field_c = 2147483647;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L31: {
                    L32: {
                      bq.field_h = new int[param0 * 2];
                      if (im.field_o == null) {
                        break L32;
                      } else {
                        if (param0 <= im.field_o.length) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    im.field_o = new int[param0 * 2];
                    break L31;
                  }
                  L33: {
                    L34: {
                      if (ic.field_c == null) {
                        break L34;
                      } else {
                        if (param0 > ic.field_c.length) {
                          break L34;
                        } else {
                          break L33;
                        }
                      }
                    }
                    ic.field_c = new int[param0 * 2];
                    break L33;
                  }
                  L35: {
                    L36: {
                      if (boa.field_n == null) {
                        break L36;
                      } else {
                        if (param1 + param0 > boa.field_n.length) {
                          break L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                    boa.field_n = new int[2 * (param1 + param0)];
                    break L35;
                  }
                  if (gja.field_B == null) {
                    gja.field_B = new boolean[2 * param0];
                    ota.field_c = 2147483647;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  } else {
                    if (gja.field_B.length >= param0) {
                      ota.field_c = 2147483647;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
        L37: {
          L38: {
            cu.field_o = new int[param0 * 2];
            if (null == bq.field_h) {
              break L38;
            } else {
              if (bq.field_h.length >= param0) {
                break L37;
              } else {
                break L38;
              }
            }
          }
          bq.field_h = new int[param0 * 2];
          break L37;
        }
        L39: {
          L40: {
            if (im.field_o == null) {
              break L40;
            } else {
              if (param0 <= im.field_o.length) {
                break L39;
              } else {
                break L40;
              }
            }
          }
          im.field_o = new int[param0 * 2];
          break L39;
        }
        L41: {
          L42: {
            if (ic.field_c == null) {
              break L42;
            } else {
              if (param0 > ic.field_c.length) {
                break L42;
              } else {
                break L41;
              }
            }
          }
          ic.field_c = new int[param0 * 2];
          break L41;
        }
        if (boa.field_n != null) {
          if (param1 + param0 <= boa.field_n.length) {
            L43: {
              if (gja.field_B == null) {
                break L43;
              } else {
                if (gja.field_B.length >= param0) {
                  ota.field_c = 2147483647;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  break L43;
                }
              }
            }
            gja.field_B = new boolean[2 * param0];
            ota.field_c = 2147483647;
            ma.field_g = -2147483648;
            kc.field_a = 2147483647;
            ap.field_d = -2147483648;
            ola.field_Eb = 0;
            return;
          } else {
            L44: {
              boa.field_n = new int[2 * (param1 + param0)];
              if (gja.field_B == null) {
                break L44;
              } else {
                if (gja.field_B.length >= param0) {
                  ota.field_c = 2147483647;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  break L44;
                }
              }
            }
            gja.field_B = new boolean[2 * param0];
            ota.field_c = 2147483647;
            ma.field_g = -2147483648;
            kc.field_a = 2147483647;
            ap.field_d = -2147483648;
            ola.field_Eb = 0;
            return;
          }
        } else {
          L45: {
            boa.field_n = new int[2 * (param1 + param0)];
            if (gja.field_B == null) {
              break L45;
            } else {
              if (gja.field_B.length >= param0) {
                ota.field_c = 2147483647;
                ma.field_g = -2147483648;
                kc.field_a = 2147483647;
                ap.field_d = -2147483648;
                ola.field_Eb = 0;
                return;
              } else {
                break L45;
              }
            }
          }
          gja.field_B = new boolean[2 * param0];
          ota.field_c = 2147483647;
          ma.field_g = -2147483648;
          kc.field_a = 2147483647;
          ap.field_d = -2147483648;
          ola.field_Eb = 0;
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int var7 = 0;
        fsa var8 = null;
        w var9 = null;
        fsa var10 = null;
        w var11 = null;
        fsa var12 = null;
        w var13 = null;
        fsa var14 = null;
        w var15 = null;
        Object var16 = null;
        Object var17 = null;
        w var17_ref = null;
        fsa var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_136_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_135_0 = 0;
        var17 = null;
        var16 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        if (null != ((dc) this).field_v) {
          L0: {
            var2 = ((dc) this).field_r;
            ((dc) this).field_t = 0;
            ((dc) this).field_r = ((dc) this).field_n;
            ((dc) this).field_m = 0;
            var3 = 1;
            if (((dc) this).field_v.c(76)) {
              ((dc) this).field_t = -2 + uca.field_c.a(5, 0);
              var3 = 0;
              ((dc) this).field_m = uca.field_c.a(5, ~param0) - 2;
              break L0;
            } else {
              if (((dc) this).field_v.r(-98)) {
                L1: {
                  var3 = 0;
                  ((dc) this).field_r = ((dc) this).field_n + -(((dc) this).field_n * ((dc) this).field_v.g((byte) -107) / ((dc) this).field_v.j((byte) 90));
                  if (((dc) this).field_r != 0) {
                    break L1;
                  } else {
                    if (var2 != 0) {
                      ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var13 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                if (var13 != null) {
                  L2: {
                    L3: {
                      var12 = (fsa) (Object) ((dc) this).field_h;
                      if (!var12.d(param0 + 51, false)) {
                        break L3;
                      } else {
                        if (var3 == 0) {
                          break L3;
                        } else {
                          stackOut_76_0 = 1;
                          stackIn_78_0 = stackOut_76_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_77_0 = 0;
                    stackIn_78_0 = stackOut_77_0;
                    break L2;
                  }
                  L4: {
                    L5: {
                      var6 = stackIn_78_0;
                      if (((dc) this).field_s != null) {
                        break L5;
                      } else {
                        if (var6 != 0) {
                          fla discarded$43 = var13.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                          ((dc) this).field_s = var13.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (((dc) this).field_s == null) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        ((dc) this).field_s.a(1, var13);
                        ((dc) this).field_s = null;
                        fla discarded$44 = var13.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (var6 != 0) {
                      break L6;
                    } else {
                      if (((dc) this).field_u) {
                        break L6;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L6;
                        } else {
                          fla discarded$45 = var13.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L7;
                    } else {
                      if (((dc) this).field_p) {
                        break L7;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$46 = var13.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (((dc) this).field_r != 0) {
                      break L8;
                    } else {
                      if (var2 == 0) {
                        break L8;
                      } else {
                        fla discarded$47 = var13.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        break L8;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                if (!((dc) this).field_v.s(param0 ^ -61)) {
                  if (!((dc) this).field_v.l(param0 + -4)) {
                    break L0;
                  } else {
                    L9: {
                      var3 = 0;
                      ((dc) this).field_r = ((dc) this).field_n * ((dc) this).field_v.g((byte) -120) / ((dc) this).field_v.d(false);
                      if (((dc) this).field_r != 0) {
                        break L9;
                      } else {
                        if (var2 != 0) {
                          ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var11 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                    if (var11 != null) {
                      L10: {
                        L11: {
                          var10 = (fsa) (Object) ((dc) this).field_h;
                          if (!var10.d(param0 + 51, false)) {
                            break L11;
                          } else {
                            if (var3 == 0) {
                              break L11;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L10;
                            }
                          }
                        }
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L10;
                      }
                      L12: {
                        L13: {
                          var6 = stackIn_47_0;
                          if (((dc) this).field_s != null) {
                            break L13;
                          } else {
                            if (var6 != 0) {
                              fla discarded$48 = var11.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                              ((dc) this).field_s = var11.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (((dc) this).field_s == null) {
                          break L12;
                        } else {
                          if (var6 == 0) {
                            ((dc) this).field_s.a(1, var11);
                            ((dc) this).field_s = null;
                            fla discarded$49 = var11.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var6 != 0) {
                          break L14;
                        } else {
                          if (((dc) this).field_u) {
                            break L14;
                          } else {
                            if (!((dc) this).field_v.c(110)) {
                              break L14;
                            } else {
                              fla discarded$50 = var11.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                        if (var6 != 0) {
                          break L15;
                        } else {
                          if (((dc) this).field_p) {
                            break L15;
                          } else {
                            if (((dc) this).field_v.r(-110)) {
                              fla discarded$51 = var11.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      L16: {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (((dc) this).field_r != 0) {
                          break L16;
                        } else {
                          if (var2 == 0) {
                            break L16;
                          } else {
                            fla discarded$52 = var11.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            break L16;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L17: {
                    var3 = 0;
                    ((dc) this).field_r = 0;
                    if (((dc) this).field_r != 0) {
                      break L17;
                    } else {
                      if (var2 != 0) {
                        ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var9 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                  if (var9 != null) {
                    L18: {
                      L19: {
                        var8 = (fsa) (Object) ((dc) this).field_h;
                        if (!var8.d(param0 + 51, false)) {
                          break L19;
                        } else {
                          if (var3 == 0) {
                            break L19;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L18;
                          }
                        }
                      }
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L18;
                    }
                    L20: {
                      L21: {
                        var6 = stackIn_15_0;
                        if (((dc) this).field_s != null) {
                          break L21;
                        } else {
                          if (var6 != 0) {
                            fla discarded$53 = var9.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                            ((dc) this).field_s = var9.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (((dc) this).field_s == null) {
                        break L20;
                      } else {
                        if (var6 == 0) {
                          ((dc) this).field_s.a(1, var9);
                          ((dc) this).field_s = null;
                          fla discarded$54 = var9.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L22: {
                      if (var6 != 0) {
                        break L22;
                      } else {
                        if (((dc) this).field_u) {
                          break L22;
                        } else {
                          if (!((dc) this).field_v.c(110)) {
                            break L22;
                          } else {
                            fla discarded$55 = var9.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                            break L22;
                          }
                        }
                      }
                    }
                    L23: {
                      ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                      if (var6 != 0) {
                        break L23;
                      } else {
                        if (((dc) this).field_p) {
                          break L23;
                        } else {
                          if (((dc) this).field_v.r(-110)) {
                            fla discarded$56 = var9.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    L24: {
                      ((dc) this).field_p = ((dc) this).field_v.r(-59);
                      if (((dc) this).field_r != 0) {
                        break L24;
                      } else {
                        if (var2 == 0) {
                          break L24;
                        } else {
                          fla discarded$57 = var9.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                          break L24;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L25: {
            if (((dc) this).field_r != 0) {
              break L25;
            } else {
              if (var2 != 0) {
                ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                break L25;
              } else {
                var15 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                if (var15 != null) {
                  L26: {
                    L27: {
                      var14 = (fsa) (Object) ((dc) this).field_h;
                      if (!var14.d(param0 + 51, false)) {
                        break L27;
                      } else {
                        if (var3 == 0) {
                          break L27;
                        } else {
                          stackOut_106_0 = 1;
                          stackIn_108_0 = stackOut_106_0;
                          break L26;
                        }
                      }
                    }
                    stackOut_107_0 = 0;
                    stackIn_108_0 = stackOut_107_0;
                    break L26;
                  }
                  L28: {
                    L29: {
                      var6 = stackIn_108_0;
                      if (((dc) this).field_s != null) {
                        break L29;
                      } else {
                        if (var6 != 0) {
                          fla discarded$58 = var15.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                          ((dc) this).field_s = var15.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    if (((dc) this).field_s == null) {
                      break L28;
                    } else {
                      if (var6 == 0) {
                        ((dc) this).field_s.a(1, var15);
                        ((dc) this).field_s = null;
                        fla discarded$59 = var15.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L30: {
                    if (var6 != 0) {
                      break L30;
                    } else {
                      if (((dc) this).field_u) {
                        break L30;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L30;
                        } else {
                          fla discarded$60 = var15.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                          break L30;
                        }
                      }
                    }
                  }
                  L31: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L31;
                    } else {
                      if (((dc) this).field_p) {
                        break L31;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$61 = var15.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  L32: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (((dc) this).field_r != 0) {
                      break L32;
                    } else {
                      if (var2 == 0) {
                        break L32;
                      } else {
                        fla discarded$62 = var15.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        break L32;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
          var17_ref = (w) (Object) ((dc) this).a(param0 + 44).field_G;
          if (var17_ref != null) {
            L33: {
              L34: {
                var18 = (fsa) (Object) ((dc) this).field_h;
                if (!var18.d(param0 + 51, false)) {
                  break L34;
                } else {
                  if (var3 == 0) {
                    break L34;
                  } else {
                    stackOut_134_0 = 1;
                    stackIn_136_0 = stackOut_134_0;
                    break L33;
                  }
                }
              }
              stackOut_135_0 = 0;
              stackIn_136_0 = stackOut_135_0;
              break L33;
            }
            L35: {
              var6 = stackIn_136_0;
              if (((dc) this).field_s != null) {
                break L35;
              } else {
                if (var6 != 0) {
                  L36: {
                    fla discarded$63 = var17_ref.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                    ((dc) this).field_s = var17_ref.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                    if (var6 != 0) {
                      break L36;
                    } else {
                      if (((dc) this).field_u) {
                        break L36;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L36;
                        } else {
                          L37: {
                            fla discarded$64 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                            ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                            if (var6 != 0) {
                              break L37;
                            } else {
                              if (((dc) this).field_p) {
                                break L37;
                              } else {
                                if (((dc) this).field_v.r(-110)) {
                                  fla discarded$65 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                          L38: {
                            ((dc) this).field_p = ((dc) this).field_v.r(-59);
                            if (((dc) this).field_r != 0) {
                              break L38;
                            } else {
                              if (var2 == 0) {
                                break L38;
                              } else {
                                fla discarded$66 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                break L38;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L39: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L39;
                    } else {
                      if (((dc) this).field_p) {
                        break L39;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$67 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L39;
                        } else {
                          L40: {
                            ((dc) this).field_p = ((dc) this).field_v.r(-59);
                            if (((dc) this).field_r != 0) {
                              break L40;
                            } else {
                              if (var2 == 0) {
                                break L40;
                              } else {
                                fla discarded$68 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                break L40;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L41: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (((dc) this).field_r != 0) {
                      break L41;
                    } else {
                      if (var2 == 0) {
                        break L41;
                      } else {
                        fla discarded$69 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  break L35;
                }
              }
            }
            if (((dc) this).field_s == null) {
              L42: {
                if (var6 != 0) {
                  break L42;
                } else {
                  if (((dc) this).field_u) {
                    break L42;
                  } else {
                    if (!((dc) this).field_v.c(110)) {
                      break L42;
                    } else {
                      L43: {
                        fla discarded$70 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                        ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                        if (var6 != 0) {
                          break L43;
                        } else {
                          if (((dc) this).field_p) {
                            break L43;
                          } else {
                            if (((dc) this).field_v.r(-110)) {
                              fla discarded$71 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                              break L43;
                            } else {
                              L44: {
                                ((dc) this).field_p = ((dc) this).field_v.r(-59);
                                if (((dc) this).field_r != 0) {
                                  break L44;
                                } else {
                                  if (var2 == 0) {
                                    break L44;
                                  } else {
                                    fla discarded$72 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                    break L44;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      L45: {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (((dc) this).field_r != 0) {
                          break L45;
                        } else {
                          if (var2 == 0) {
                            break L45;
                          } else {
                            fla discarded$73 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L46: {
                ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                if (var6 != 0) {
                  break L46;
                } else {
                  if (((dc) this).field_p) {
                    break L46;
                  } else {
                    if (((dc) this).field_v.r(-110)) {
                      fla discarded$74 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                      break L46;
                    } else {
                      L47: {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (((dc) this).field_r != 0) {
                          break L47;
                        } else {
                          if (var2 == 0) {
                            break L47;
                          } else {
                            fla discarded$75 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L48: {
                ((dc) this).field_p = ((dc) this).field_v.r(-59);
                if (((dc) this).field_r != 0) {
                  break L48;
                } else {
                  if (var2 == 0) {
                    break L48;
                  } else {
                    fla discarded$76 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                    return;
                  }
                }
              }
              return;
            } else {
              if (var6 == 0) {
                L49: {
                  ((dc) this).field_s.a(1, var17_ref);
                  ((dc) this).field_s = null;
                  fla discarded$77 = var17_ref.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                  if (var6 != 0) {
                    break L49;
                  } else {
                    if (((dc) this).field_u) {
                      break L49;
                    } else {
                      if (!((dc) this).field_v.c(110)) {
                        break L49;
                      } else {
                        fla discarded$78 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                        break L49;
                      }
                    }
                  }
                }
                L50: {
                  ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                  if (var6 != 0) {
                    break L50;
                  } else {
                    if (((dc) this).field_p) {
                      break L50;
                    } else {
                      if (((dc) this).field_v.r(-110)) {
                        fla discarded$79 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                  }
                }
                L51: {
                  ((dc) this).field_p = ((dc) this).field_v.r(-59);
                  if (((dc) this).field_r != 0) {
                    break L51;
                  } else {
                    if (var2 == 0) {
                      break L51;
                    } else {
                      fla discarded$80 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                      break L51;
                    }
                  }
                }
                return;
              } else {
                L52: {
                  if (var6 != 0) {
                    break L52;
                  } else {
                    if (((dc) this).field_u) {
                      break L52;
                    } else {
                      if (!((dc) this).field_v.c(110)) {
                        break L52;
                      } else {
                        fla discarded$81 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                        break L52;
                      }
                    }
                  }
                }
                ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                if (var6 == 0) {
                  if (!((dc) this).field_p) {
                    L53: {
                      if (((dc) this).field_v.r(-110)) {
                        fla discarded$82 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      ((dc) this).field_p = ((dc) this).field_v.r(-59);
                      if (((dc) this).field_r != 0) {
                        break L54;
                      } else {
                        if (var2 == 0) {
                          break L54;
                        } else {
                          fla discarded$83 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                          break L54;
                        }
                      }
                    }
                    return;
                  } else {
                    L55: {
                      ((dc) this).field_p = ((dc) this).field_v.r(-59);
                      if (((dc) this).field_r != 0) {
                        break L55;
                      } else {
                        if (var2 == 0) {
                          break L55;
                        } else {
                          fla discarded$84 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                          break L55;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L56: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (((dc) this).field_r != 0) {
                      break L56;
                    } else {
                      if (var2 == 0) {
                        break L56;
                      } else {
                        fla discarded$85 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        break L56;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    dc(int param0) {
        super(param0);
        ((dc) this).field_n = 160;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = param2 + (((dc) this).field_t << 16);
                param3 = param3 + (((dc) this).field_r << 16);
                var7 = param1 + (((dc) this).field_m << 16);
                var8 = dfa.a(4096 + -((dc) this).field_h.g(-25787) >> 2, 2048, -120);
                var10 = 14 % ((param4 - -38) / 47);
                var11 = ((dc) this).field_q;
                if (var11 == 0) {
                  break L2;
                } else {
                  if (var11 == 1) {
                    var9 = df.field_J[74];
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var9 = df.field_J[74];
              break L1;
            }
            gqa.a(var8, -83584144, var7, var6_int, var9, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("dc.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2);
              if (param0 instanceof rea) {
                ((dc) this).field_v = (rea) (Object) param0;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("dc.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 6;
    }
}
