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
        iq var5 = null;
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
              this.field_q = param2.b((byte) 44, 4);
              if (param0 > 119) {
                break L1;
              } else {
                var5 = (iq) null;
                this.a((iq) null, 87, -34, 68, (byte) 5);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dc.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final int e(byte param0) {
        int discarded$3 = 0;
        if (param0 < -86) {
          return super.e((byte) -108) - -(this.field_r << 134225168);
        } else {
          discarded$3 = this.e((byte) 28);
          return super.e((byte) -108) - -(this.field_r << 134225168);
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 85, param1);
            int var3_int = -96 / ((param0 - -8) / 40);
            param1.a((byte) -125, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dc(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_n = 160;
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
        if (cu.field_o != null) {
          if (cu.field_o.length < param0) {
            cu.field_o = new int[param0 * 2];
            if (null == bq.field_h) {
              L4: {
                L5: {
                  bq.field_h = new int[param0 * 2];
                  if (im.field_o == null) {
                    break L5;
                  } else {
                    if (param0 <= im.field_o.length) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                im.field_o = new int[param0 * 2];
                break L4;
              }
              L6: {
                L7: {
                  if (ic.field_c == null) {
                    break L7;
                  } else {
                    if (param0 > ic.field_c.length) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                ic.field_c = new int[param0 * 2];
                break L6;
              }
              L8: {
                L9: {
                  if (boa.field_n == null) {
                    break L9;
                  } else {
                    if (param1 + param0 > boa.field_n.length) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                boa.field_n = new int[2 * (param1 + param0)];
                break L8;
              }
              if (gja.field_B == null) {
                gja.field_B = new boolean[2 * param0];
                ota.field_c = 2147483647;
                if (param2 == 47) {
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  field_o = -102;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                }
              } else {
                if (gja.field_B.length >= param0) {
                  ota.field_c = 2147483647;
                  if (param2 == 47) {
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  } else {
                    field_o = -102;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  }
                } else {
                  gja.field_B = new boolean[2 * param0];
                  ota.field_c = 2147483647;
                  if (param2 == 47) {
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  } else {
                    field_o = -102;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  }
                }
              }
            } else {
              if (bq.field_h.length >= param0) {
                if (im.field_o == null) {
                  L10: {
                    L11: {
                      im.field_o = new int[param0 * 2];
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
                    if (param2 == 47) {
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      field_o = -102;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    }
                  } else {
                    if (gja.field_B.length >= param0) {
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    } else {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 <= im.field_o.length) {
                    L14: {
                      L15: {
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
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      } else {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      }
                    }
                  } else {
                    L18: {
                      L19: {
                        im.field_o = new int[param0 * 2];
                        if (ic.field_c == null) {
                          break L19;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L18;
                    }
                    L20: {
                      L21: {
                        if (boa.field_n == null) {
                          break L21;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L21;
                          } else {
                            break L20;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L20;
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      } else {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L22: {
                  L23: {
                    bq.field_h = new int[param0 * 2];
                    if (im.field_o == null) {
                      break L23;
                    } else {
                      if (param0 <= im.field_o.length) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  im.field_o = new int[param0 * 2];
                  break L22;
                }
                L24: {
                  L25: {
                    if (ic.field_c == null) {
                      break L25;
                    } else {
                      if (param0 > ic.field_c.length) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ic.field_c = new int[param0 * 2];
                  break L24;
                }
                L26: {
                  L27: {
                    if (boa.field_n == null) {
                      break L27;
                    } else {
                      if (param1 + param0 > boa.field_n.length) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  boa.field_n = new int[2 * (param1 + param0)];
                  break L26;
                }
                L28: {
                  L29: {
                    if (gja.field_B == null) {
                      break L29;
                    } else {
                      if (gja.field_B.length >= param0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  gja.field_B = new boolean[2 * param0];
                  break L28;
                }
                ota.field_c = 2147483647;
                if (param2 == 47) {
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  field_o = -102;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                }
              }
            }
          } else {
            if (null == bq.field_h) {
              L30: {
                L31: {
                  bq.field_h = new int[param0 * 2];
                  if (im.field_o == null) {
                    break L31;
                  } else {
                    if (param0 <= im.field_o.length) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                im.field_o = new int[param0 * 2];
                break L30;
              }
              L32: {
                L33: {
                  if (ic.field_c == null) {
                    break L33;
                  } else {
                    if (param0 > ic.field_c.length) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                ic.field_c = new int[param0 * 2];
                break L32;
              }
              L34: {
                L35: {
                  if (boa.field_n == null) {
                    break L35;
                  } else {
                    if (param1 + param0 > boa.field_n.length) {
                      break L35;
                    } else {
                      break L34;
                    }
                  }
                }
                boa.field_n = new int[2 * (param1 + param0)];
                break L34;
              }
              L36: {
                L37: {
                  if (gja.field_B == null) {
                    break L37;
                  } else {
                    if (gja.field_B.length >= param0) {
                      break L36;
                    } else {
                      break L37;
                    }
                  }
                }
                gja.field_B = new boolean[2 * param0];
                break L36;
              }
              ota.field_c = 2147483647;
              if (param2 == 47) {
                ma.field_g = -2147483648;
                kc.field_a = 2147483647;
                ap.field_d = -2147483648;
                ola.field_Eb = 0;
                return;
              } else {
                field_o = -102;
                ma.field_g = -2147483648;
                kc.field_a = 2147483647;
                ap.field_d = -2147483648;
                ola.field_Eb = 0;
                return;
              }
            } else {
              if (bq.field_h.length >= param0) {
                if (im.field_o == null) {
                  L38: {
                    L39: {
                      im.field_o = new int[param0 * 2];
                      if (ic.field_c == null) {
                        break L39;
                      } else {
                        if (param0 > ic.field_c.length) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ic.field_c = new int[param0 * 2];
                    break L38;
                  }
                  L40: {
                    L41: {
                      if (boa.field_n == null) {
                        break L41;
                      } else {
                        if (param1 + param0 > boa.field_n.length) {
                          break L41;
                        } else {
                          break L40;
                        }
                      }
                    }
                    boa.field_n = new int[2 * (param1 + param0)];
                    break L40;
                  }
                  L42: {
                    L43: {
                      if (gja.field_B == null) {
                        break L43;
                      } else {
                        if (gja.field_B.length >= param0) {
                          break L42;
                        } else {
                          break L43;
                        }
                      }
                    }
                    gja.field_B = new boolean[2 * param0];
                    break L42;
                  }
                  ota.field_c = 2147483647;
                  if (param2 == 47) {
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  } else {
                    field_o = -102;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  }
                } else {
                  if (param0 <= im.field_o.length) {
                    L44: {
                      L45: {
                        if (ic.field_c == null) {
                          break L45;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L45;
                          } else {
                            break L44;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L44;
                    }
                    L46: {
                      L47: {
                        if (boa.field_n == null) {
                          break L47;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L47;
                          } else {
                            break L46;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L46;
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    } else {
                      if (gja.field_B.length >= param0) {
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      } else {
                        gja.field_B = new boolean[2 * param0];
                        ota.field_c = 2147483647;
                        if (param2 == 47) {
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        } else {
                          field_o = -102;
                          ma.field_g = -2147483648;
                          kc.field_a = 2147483647;
                          ap.field_d = -2147483648;
                          ola.field_Eb = 0;
                          return;
                        }
                      }
                    }
                  } else {
                    L48: {
                      L49: {
                        im.field_o = new int[param0 * 2];
                        if (ic.field_c == null) {
                          break L49;
                        } else {
                          if (param0 > ic.field_c.length) {
                            break L49;
                          } else {
                            break L48;
                          }
                        }
                      }
                      ic.field_c = new int[param0 * 2];
                      break L48;
                    }
                    L50: {
                      L51: {
                        if (boa.field_n == null) {
                          break L51;
                        } else {
                          if (param1 + param0 > boa.field_n.length) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      boa.field_n = new int[2 * (param1 + param0)];
                      break L50;
                    }
                    L52: {
                      L53: {
                        if (gja.field_B == null) {
                          break L53;
                        } else {
                          if (gja.field_B.length >= param0) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                      gja.field_B = new boolean[2 * param0];
                      break L52;
                    }
                    ota.field_c = 2147483647;
                    if (param2 == 47) {
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      field_o = -102;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    }
                  }
                }
              } else {
                L54: {
                  L55: {
                    bq.field_h = new int[param0 * 2];
                    if (im.field_o == null) {
                      break L55;
                    } else {
                      if (param0 <= im.field_o.length) {
                        break L54;
                      } else {
                        break L55;
                      }
                    }
                  }
                  im.field_o = new int[param0 * 2];
                  break L54;
                }
                L56: {
                  L57: {
                    if (ic.field_c == null) {
                      break L57;
                    } else {
                      if (param0 > ic.field_c.length) {
                        break L57;
                      } else {
                        break L56;
                      }
                    }
                  }
                  ic.field_c = new int[param0 * 2];
                  break L56;
                }
                L58: {
                  L59: {
                    if (boa.field_n == null) {
                      break L59;
                    } else {
                      if (param1 + param0 > boa.field_n.length) {
                        break L59;
                      } else {
                        break L58;
                      }
                    }
                  }
                  boa.field_n = new int[2 * (param1 + param0)];
                  break L58;
                }
                L60: {
                  L61: {
                    if (gja.field_B == null) {
                      break L61;
                    } else {
                      if (gja.field_B.length >= param0) {
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  gja.field_B = new boolean[2 * param0];
                  break L60;
                }
                ota.field_c = 2147483647;
                if (param2 == 47) {
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  field_o = -102;
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
          cu.field_o = new int[param0 * 2];
          if (null == bq.field_h) {
            L62: {
              L63: {
                bq.field_h = new int[param0 * 2];
                if (im.field_o == null) {
                  break L63;
                } else {
                  if (param0 <= im.field_o.length) {
                    break L62;
                  } else {
                    break L63;
                  }
                }
              }
              im.field_o = new int[param0 * 2];
              break L62;
            }
            L64: {
              L65: {
                if (ic.field_c == null) {
                  break L65;
                } else {
                  if (param0 > ic.field_c.length) {
                    break L65;
                  } else {
                    break L64;
                  }
                }
              }
              ic.field_c = new int[param0 * 2];
              break L64;
            }
            L66: {
              L67: {
                if (boa.field_n == null) {
                  break L67;
                } else {
                  if (param1 + param0 > boa.field_n.length) {
                    break L67;
                  } else {
                    break L66;
                  }
                }
              }
              boa.field_n = new int[2 * (param1 + param0)];
              break L66;
            }
            L68: {
              L69: {
                if (gja.field_B == null) {
                  break L69;
                } else {
                  if (gja.field_B.length >= param0) {
                    break L68;
                  } else {
                    break L69;
                  }
                }
              }
              gja.field_B = new boolean[2 * param0];
              break L68;
            }
            ota.field_c = 2147483647;
            if (param2 == 47) {
              ma.field_g = -2147483648;
              kc.field_a = 2147483647;
              ap.field_d = -2147483648;
              ola.field_Eb = 0;
              return;
            } else {
              field_o = -102;
              ma.field_g = -2147483648;
              kc.field_a = 2147483647;
              ap.field_d = -2147483648;
              ola.field_Eb = 0;
              return;
            }
          } else {
            if (bq.field_h.length >= param0) {
              if (im.field_o == null) {
                L70: {
                  L71: {
                    im.field_o = new int[param0 * 2];
                    if (ic.field_c == null) {
                      break L71;
                    } else {
                      if (param0 > ic.field_c.length) {
                        break L71;
                      } else {
                        break L70;
                      }
                    }
                  }
                  ic.field_c = new int[param0 * 2];
                  break L70;
                }
                L72: {
                  L73: {
                    if (boa.field_n == null) {
                      break L73;
                    } else {
                      if (param1 + param0 > boa.field_n.length) {
                        break L73;
                      } else {
                        break L72;
                      }
                    }
                  }
                  boa.field_n = new int[2 * (param1 + param0)];
                  break L72;
                }
                L74: {
                  L75: {
                    if (gja.field_B == null) {
                      break L75;
                    } else {
                      if (gja.field_B.length >= param0) {
                        break L74;
                      } else {
                        break L75;
                      }
                    }
                  }
                  gja.field_B = new boolean[2 * param0];
                  break L74;
                }
                ota.field_c = 2147483647;
                if (param2 == 47) {
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                } else {
                  field_o = -102;
                  ma.field_g = -2147483648;
                  kc.field_a = 2147483647;
                  ap.field_d = -2147483648;
                  ola.field_Eb = 0;
                  return;
                }
              } else {
                if (param0 <= im.field_o.length) {
                  L76: {
                    L77: {
                      if (ic.field_c == null) {
                        break L77;
                      } else {
                        if (param0 > ic.field_c.length) {
                          break L77;
                        } else {
                          break L76;
                        }
                      }
                    }
                    ic.field_c = new int[param0 * 2];
                    break L76;
                  }
                  L78: {
                    L79: {
                      if (boa.field_n == null) {
                        break L79;
                      } else {
                        if (param1 + param0 > boa.field_n.length) {
                          break L79;
                        } else {
                          break L78;
                        }
                      }
                    }
                    boa.field_n = new int[2 * (param1 + param0)];
                    break L78;
                  }
                  if (gja.field_B == null) {
                    gja.field_B = new boolean[2 * param0];
                    ota.field_c = 2147483647;
                    if (param2 == 47) {
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    } else {
                      field_o = -102;
                      ma.field_g = -2147483648;
                      kc.field_a = 2147483647;
                      ap.field_d = -2147483648;
                      ola.field_Eb = 0;
                      return;
                    }
                  } else {
                    if (gja.field_B.length >= param0) {
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    } else {
                      gja.field_B = new boolean[2 * param0];
                      ota.field_c = 2147483647;
                      if (param2 == 47) {
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      } else {
                        field_o = -102;
                        ma.field_g = -2147483648;
                        kc.field_a = 2147483647;
                        ap.field_d = -2147483648;
                        ola.field_Eb = 0;
                        return;
                      }
                    }
                  }
                } else {
                  L80: {
                    L81: {
                      im.field_o = new int[param0 * 2];
                      if (ic.field_c == null) {
                        break L81;
                      } else {
                        if (param0 > ic.field_c.length) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    ic.field_c = new int[param0 * 2];
                    break L80;
                  }
                  L82: {
                    L83: {
                      if (boa.field_n == null) {
                        break L83;
                      } else {
                        if (param1 + param0 > boa.field_n.length) {
                          break L83;
                        } else {
                          break L82;
                        }
                      }
                    }
                    boa.field_n = new int[2 * (param1 + param0)];
                    break L82;
                  }
                  L84: {
                    L85: {
                      if (gja.field_B == null) {
                        break L85;
                      } else {
                        if (gja.field_B.length >= param0) {
                          break L84;
                        } else {
                          break L85;
                        }
                      }
                    }
                    gja.field_B = new boolean[2 * param0];
                    break L84;
                  }
                  ota.field_c = 2147483647;
                  if (param2 == 47) {
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  } else {
                    field_o = -102;
                    ma.field_g = -2147483648;
                    kc.field_a = 2147483647;
                    ap.field_d = -2147483648;
                    ola.field_Eb = 0;
                    return;
                  }
                }
              }
            } else {
              L86: {
                L87: {
                  bq.field_h = new int[param0 * 2];
                  if (im.field_o == null) {
                    break L87;
                  } else {
                    if (param0 <= im.field_o.length) {
                      break L86;
                    } else {
                      break L87;
                    }
                  }
                }
                im.field_o = new int[param0 * 2];
                break L86;
              }
              L88: {
                L89: {
                  if (ic.field_c == null) {
                    break L89;
                  } else {
                    if (param0 > ic.field_c.length) {
                      break L89;
                    } else {
                      break L88;
                    }
                  }
                }
                ic.field_c = new int[param0 * 2];
                break L88;
              }
              L90: {
                L91: {
                  if (boa.field_n == null) {
                    break L91;
                  } else {
                    if (param1 + param0 > boa.field_n.length) {
                      break L91;
                    } else {
                      break L90;
                    }
                  }
                }
                boa.field_n = new int[2 * (param1 + param0)];
                break L90;
              }
              L92: {
                L93: {
                  if (gja.field_B == null) {
                    break L93;
                  } else {
                    if (gja.field_B.length >= param0) {
                      break L92;
                    } else {
                      break L93;
                    }
                  }
                }
                gja.field_B = new boolean[2 * param0];
                break L92;
              }
              ota.field_c = 2147483647;
              if (param2 == 47) {
                ma.field_g = -2147483648;
                kc.field_a = 2147483647;
                ap.field_d = -2147483648;
                ola.field_Eb = 0;
                return;
              } else {
                field_o = -102;
                ma.field_g = -2147483648;
                kc.field_a = 2147483647;
                ap.field_d = -2147483648;
                ola.field_Eb = 0;
                return;
              }
            }
          }
        }
    }

    final void d(int param0) {
        fla discarded$37 = null;
        fla discarded$38 = null;
        fla discarded$39 = null;
        fla discarded$40 = null;
        fla discarded$41 = null;
        fla discarded$42 = null;
        fla discarded$43 = null;
        fla discarded$44 = null;
        fla discarded$45 = null;
        fla discarded$46 = null;
        fla discarded$47 = null;
        fla discarded$48 = null;
        fla discarded$49 = null;
        fla discarded$50 = null;
        fla discarded$51 = null;
        fla discarded$52 = null;
        fla discarded$53 = null;
        fla discarded$54 = null;
        fla discarded$55 = null;
        fla discarded$56 = null;
        fla discarded$57 = null;
        fla discarded$58 = null;
        fla discarded$59 = null;
        fla discarded$60 = null;
        fla discarded$61 = null;
        fla discarded$62 = null;
        fla discarded$63 = null;
        fla discarded$64 = null;
        fla discarded$65 = null;
        fla discarded$66 = null;
        fla discarded$67 = null;
        fla discarded$68 = null;
        fla discarded$69 = null;
        fla discarded$70 = null;
        fla discarded$71 = null;
        fla discarded$72 = null;
        fla discarded$73 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int var7 = 0;
        fsa var8 = null;
        w var9 = null;
        fsa var10 = null;
        w var11 = null;
        int stackIn_20_0 = 0;
        int stackIn_65_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        if (null != this.field_v) {
          L0: {
            L1: {
              var2 = this.field_r;
              this.field_t = 0;
              this.field_r = this.field_n;
              this.field_m = 0;
              var3 = 1;
              if (this.field_v.c(76)) {
                break L1;
              } else {
                L2: {
                  if (this.field_v.r(-98)) {
                    break L2;
                  } else {
                    L3: {
                      if (!this.field_v.s(param0 ^ -61)) {
                        break L3;
                      } else {
                        var3 = 0;
                        this.field_r = 0;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (!this.field_v.l(param0 + -4)) {
                      break L0;
                    } else {
                      var3 = 0;
                      this.field_r = this.field_n * this.field_v.g((byte) -120) / this.field_v.d(false);
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var3 = 0;
                this.field_r = this.field_n + -(this.field_n * this.field_v.g((byte) -107) / this.field_v.j((byte) 90));
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_t = -2 + uca.field_c.a(5, 0);
            var3 = 0;
            this.field_m = uca.field_c.a(5, param0 ^ -1) - 2;
            break L0;
          }
          L4: {
            if (this.field_r != 0) {
              break L4;
            } else {
              if (var2 != 0) {
                this.a(42).b(false).a(0, this.c((byte) 92), 0, 0, 0, this.b((byte) 52));
                break L4;
              } else {
                var9 = (w) ((Object) this.a(param0 + 44).field_G);
                if (var9 != null) {
                  L5: {
                    var8 = (fsa) ((Object) this.field_h);
                    if (var8.d(param0 + 51, false)) {
                      if (var3 != 0) {
                        stackOut_18_0 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_20_0 = stackOut_17_0;
                        break L5;
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_20_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      L8: {
                        var6 = stackIn_20_0;
                        if (this.field_s != null) {
                          break L8;
                        } else {
                          if (var6 != 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (this.field_s != null) {
                        if (var6 == 0) {
                          this.field_s.a(1, var9);
                          this.field_s = null;
                          discarded$37 = var9.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
                          if (var7 != 0) {
                            break L7;
                          } else {
                            if (var6 != 0) {
                              break L6;
                            } else {
                              if (this.field_u) {
                                break L6;
                              } else {
                                if (!this.field_v.c(110)) {
                                  break L6;
                                } else {
                                  discarded$38 = var9.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                                  break L6;
                                }
                              }
                            }
                          }
                        } else {
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (this.field_u) {
                              break L6;
                            } else {
                              if (!this.field_v.c(110)) {
                                break L6;
                              } else {
                                discarded$39 = var9.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                                break L6;
                              }
                            }
                          }
                        }
                      } else {
                        if (var6 != 0) {
                          break L6;
                        } else {
                          if (this.field_u) {
                            break L6;
                          } else {
                            if (!this.field_v.c(110)) {
                              break L6;
                            } else {
                              discarded$40 = var9.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    discarded$41 = var9.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
                    this.field_s = var9.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
                    if (var6 != 0) {
                      break L6;
                    } else {
                      if (this.field_u) {
                        break L6;
                      } else {
                        if (!this.field_v.c(110)) {
                          break L6;
                        } else {
                          discarded$42 = var9.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                          break L6;
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      this.field_u = this.field_v.c(param0 + -77);
                      if (var6 != 0) {
                        break L10;
                      } else {
                        if (this.field_p) {
                          break L10;
                        } else {
                          if (this.field_v.r(-110)) {
                            discarded$43 = var9.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                            break L10;
                          } else {
                            this.field_p = this.field_v.r(-59);
                            if (-1 != (this.field_r ^ -1)) {
                              break L9;
                            } else {
                              if (-1 == (var2 ^ -1)) {
                                break L9;
                              } else {
                                discarded$44 = var9.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                    this.field_p = this.field_v.r(-59);
                    if (-1 != (this.field_r ^ -1)) {
                      break L9;
                    } else {
                      if (-1 == (var2 ^ -1)) {
                        break L9;
                      } else {
                        discarded$45 = var9.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                        break L9;
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
          var11 = (w) ((Object) this.a(param0 + 44).field_G);
          if (var11 != null) {
            L11: {
              var10 = (fsa) ((Object) this.field_h);
              if (var10.d(param0 + 51, false)) {
                if (var3 != 0) {
                  stackOut_63_0 = 1;
                  stackIn_65_0 = stackOut_63_0;
                  break L11;
                } else {
                  stackOut_62_0 = 0;
                  stackIn_65_0 = stackOut_62_0;
                  break L11;
                }
              } else {
                stackOut_60_0 = 0;
                stackIn_65_0 = stackOut_60_0;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_65_0;
              if (this.field_s != null) {
                L13: {
                  if (this.field_s == null) {
                    break L13;
                  } else {
                    if (var6 == 0) {
                      this.field_s.a(1, var11);
                      this.field_s = null;
                      discarded$46 = var11.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
                      if (var7 == 0) {
                        break L13;
                      } else {
                        break L12;
                      }
                    } else {
                      L14: {
                        if (var6 != 0) {
                          break L14;
                        } else {
                          if (this.field_u) {
                            break L14;
                          } else {
                            if (!this.field_v.c(110)) {
                              break L14;
                            } else {
                              discarded$47 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        this.field_u = this.field_v.c(param0 + -77);
                        if (var6 != 0) {
                          break L15;
                        } else {
                          if (this.field_p) {
                            break L15;
                          } else {
                            if (this.field_v.r(-110)) {
                              discarded$48 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      L16: {
                        this.field_p = this.field_v.r(-59);
                        if (-1 != (this.field_r ^ -1)) {
                          break L16;
                        } else {
                          if (-1 == (var2 ^ -1)) {
                            break L16;
                          } else {
                            discarded$49 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                            break L16;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L17: {
                  if (var6 != 0) {
                    break L17;
                  } else {
                    if (this.field_u) {
                      break L17;
                    } else {
                      if (!this.field_v.c(110)) {
                        break L17;
                      } else {
                        L18: {
                          discarded$50 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                          this.field_u = this.field_v.c(param0 + -77);
                          if (this.field_p) {
                            break L18;
                          } else {
                            if (this.field_v.r(-110)) {
                              discarded$51 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                              break L18;
                            } else {
                              this.field_p = this.field_v.r(-59);
                              if (-1 == (this.field_r ^ -1)) {
                                if (-1 == (var2 ^ -1)) {
                                  return;
                                } else {
                                  discarded$52 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                                  return;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        this.field_p = this.field_v.r(-59);
                        if (-1 == (this.field_r ^ -1)) {
                          if (-1 == (var2 ^ -1)) {
                            return;
                          } else {
                            discarded$53 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                L19: {
                  this.field_u = this.field_v.c(param0 + -77);
                  if (var6 != 0) {
                    break L19;
                  } else {
                    if (this.field_p) {
                      break L19;
                    } else {
                      if (this.field_v.r(-110)) {
                        discarded$54 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                        break L19;
                      } else {
                        this.field_p = this.field_v.r(-59);
                        if (-1 == (this.field_r ^ -1)) {
                          if (-1 != (var2 ^ -1)) {
                            discarded$55 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
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
                this.field_p = this.field_v.r(-59);
                if (-1 == (this.field_r ^ -1)) {
                  if (-1 != (var2 ^ -1)) {
                    discarded$56 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (var6 != 0) {
                  break L12;
                } else {
                  L20: {
                    if (this.field_s != null) {
                      if (var6 == 0) {
                        this.field_s.a(1, var11);
                        this.field_s = null;
                        discarded$57 = var11.a(new fm(58, this.b((byte) -99), this.c((byte) 95), this.e((byte) -122)), param0 ^ 57);
                        if (var7 != 0) {
                          discarded$58 = var11.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
                          this.field_s = var11.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
                          if (var6 != 0) {
                            break L20;
                          } else {
                            if (this.field_u) {
                              break L20;
                            } else {
                              if (!this.field_v.c(110)) {
                                break L20;
                              } else {
                                discarded$59 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                                break L20;
                              }
                            }
                          }
                        } else {
                          if (var6 != 0) {
                            break L20;
                          } else {
                            if (this.field_u) {
                              break L20;
                            } else {
                              if (!this.field_v.c(110)) {
                                break L20;
                              } else {
                                discarded$60 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                                break L20;
                              }
                            }
                          }
                        }
                      } else {
                        if (var6 != 0) {
                          break L20;
                        } else {
                          if (this.field_u) {
                            break L20;
                          } else {
                            if (!this.field_v.c(110)) {
                              break L20;
                            } else {
                              discarded$61 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                              break L20;
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_u) {
                        break L20;
                      } else {
                        if (!this.field_v.c(110)) {
                          break L20;
                        } else {
                          discarded$62 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                          break L20;
                        }
                      }
                    }
                  }
                  this.field_u = this.field_v.c(param0 + -77);
                  if (var6 == 0) {
                    if (!this.field_p) {
                      L21: {
                        if (this.field_v.r(-110)) {
                          discarded$63 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        this.field_p = this.field_v.r(-59);
                        if (-1 != (this.field_r ^ -1)) {
                          break L22;
                        } else {
                          if (-1 == (var2 ^ -1)) {
                            break L22;
                          } else {
                            discarded$64 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                            break L22;
                          }
                        }
                      }
                      return;
                    } else {
                      L23: {
                        this.field_p = this.field_v.r(-59);
                        if (-1 != (this.field_r ^ -1)) {
                          break L23;
                        } else {
                          if (-1 == (var2 ^ -1)) {
                            break L23;
                          } else {
                            discarded$65 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                            break L23;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L24: {
                      this.field_p = this.field_v.r(-59);
                      if (-1 != (this.field_r ^ -1)) {
                        break L24;
                      } else {
                        if (-1 == (var2 ^ -1)) {
                          break L24;
                        } else {
                          discarded$66 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                          break L24;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L25: {
              discarded$67 = var11.a(new fm(56, this.b((byte) -93), this.c((byte) 124), this.e((byte) -118)), -58);
              this.field_s = var11.a(new fm(57, this.b((byte) 32), this.c((byte) 118), this.e((byte) -95)), -58);
              if (var6 != 0) {
                break L25;
              } else {
                if (this.field_u) {
                  break L25;
                } else {
                  if (!this.field_v.c(110)) {
                    break L25;
                  } else {
                    L26: {
                      discarded$68 = var11.a(new fm(59, this.b((byte) -121), this.c((byte) 92), this.e((byte) -105)), -58);
                      this.field_u = this.field_v.c(param0 + -77);
                      if (this.field_p) {
                        break L26;
                      } else {
                        if (this.field_v.r(-110)) {
                          discarded$69 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      this.field_p = this.field_v.r(-59);
                      if (-1 != (this.field_r ^ -1)) {
                        break L27;
                      } else {
                        if (-1 == (var2 ^ -1)) {
                          break L27;
                        } else {
                          discarded$70 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                          break L27;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L28: {
              this.field_u = this.field_v.c(param0 + -77);
              if (var6 != 0) {
                break L28;
              } else {
                if (this.field_p) {
                  break L28;
                } else {
                  if (this.field_v.r(-110)) {
                    discarded$71 = var11.a(new fm(60, this.b((byte) -86), this.c((byte) 112), this.e((byte) -97)), -58);
                    break L28;
                  } else {
                    L29: {
                      this.field_p = this.field_v.r(-59);
                      if (-1 != (this.field_r ^ -1)) {
                        break L29;
                      } else {
                        if (-1 == (var2 ^ -1)) {
                          break L29;
                        } else {
                          discarded$72 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                          break L29;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            this.field_p = this.field_v.r(-59);
            if (-1 == (this.field_r ^ -1)) {
              if (-1 == (var2 ^ -1)) {
                return;
              } else {
                discarded$73 = var11.a(new fm(2, this.b((byte) -90), this.c((byte) 127), this.e((byte) -122)), -58);
                return;
              }
            } else {
              return;
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
        this.field_n = 160;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
                L3: {
                  var6_int = param2 + (this.field_t << 299537840);
                  param3 = param3 + (this.field_r << -1005290544);
                  var7 = param1 + (this.field_m << 1938679376);
                  var8 = dfa.a(4096 + -this.field_h.g(-25787) >> 1129803586, 2048, -120);
                  var10 = 14 % ((param4 - -38) / 47);
                  var11 = this.field_q;
                  if (var11 == 0) {
                    break L3;
                  } else {
                    if ((var11 ^ -1) == -2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = df.field_J[74];
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  break L2;
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
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("dc.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
                this.field_v = (rea) ((Object) param0);
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
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("dc.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
    }

    static {
        field_o = 6;
    }
}
