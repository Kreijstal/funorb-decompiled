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
        super.a(120, param1, param2);
        ((dc) this).field_q = param2.b((byte) 44, 4);
        if (param0 <= 119) {
            Object var5 = null;
            ((dc) this).a((iq) null, 87, -34, 68, (byte) 5);
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
          int discarded$2 = ((dc) this).e((byte) 28);
          return super.e((byte) -108) - -(((dc) this).field_r << 134225168);
        } else {
          return super.e((byte) -108) - -(((dc) this).field_r << 134225168);
        }
    }

    final void a(byte param0, kh param1) {
        super.a((byte) 85, param1);
        int var3 = -96 / ((param0 - -8) / 40);
        param1.a((byte) -125, ((dc) this).field_q, 4);
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
        int stackIn_17_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_149_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_145_0 = 0;
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
              ((dc) this).field_m = uca.field_c.a(5, param0 ^ -1) - 2;
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
                if (var13 == null) {
                  return;
                } else {
                  L2: {
                    var12 = (fsa) (Object) ((dc) this).field_h;
                    if (var12.d(param0 + 51, false)) {
                      if (var3 != 0) {
                        stackOut_83_0 = 1;
                        stackIn_85_0 = stackOut_83_0;
                        break L2;
                      } else {
                        stackOut_82_0 = 0;
                        stackIn_85_0 = stackOut_82_0;
                        break L2;
                      }
                    } else {
                      stackOut_80_0 = 0;
                      stackIn_85_0 = stackOut_80_0;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var6 = stackIn_85_0;
                      if (((dc) this).field_s != null) {
                        break L4;
                      } else {
                        if (var6 != 0) {
                          fla discarded$38 = var13.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                          ((dc) this).field_s = var13.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (((dc) this).field_s == null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        ((dc) this).field_s.a(1, var13);
                        ((dc) this).field_s = null;
                        fla discarded$39 = var13.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (var6 != 0) {
                      break L5;
                    } else {
                      if (((dc) this).field_u) {
                        break L5;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L5;
                        } else {
                          fla discarded$40 = var13.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L6;
                    } else {
                      if (((dc) this).field_p) {
                        break L6;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$41 = var13.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (-1 != ((dc) this).field_r) {
                      break L7;
                    } else {
                      if (-1 == var2) {
                        break L7;
                      } else {
                        fla discarded$42 = var13.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        break L7;
                      }
                    }
                  }
                  return;
                }
              } else {
                if (!((dc) this).field_v.s(param0 ^ -61)) {
                  if (!((dc) this).field_v.l(param0 + -4)) {
                    break L0;
                  } else {
                    L8: {
                      var3 = 0;
                      ((dc) this).field_r = ((dc) this).field_n * ((dc) this).field_v.g((byte) -120) / ((dc) this).field_v.d(false);
                      if (((dc) this).field_r != 0) {
                        break L8;
                      } else {
                        if (var2 != 0) {
                          ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var11 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                    if (var11 == null) {
                      return;
                    } else {
                      L9: {
                        var10 = (fsa) (Object) ((dc) this).field_h;
                        if (var10.d(param0 + 51, false)) {
                          if (var3 != 0) {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          } else {
                            stackOut_48_0 = 0;
                            stackIn_51_0 = stackOut_48_0;
                            break L9;
                          }
                        } else {
                          stackOut_46_0 = 0;
                          stackIn_51_0 = stackOut_46_0;
                          break L9;
                        }
                      }
                      L10: {
                        L11: {
                          var6 = stackIn_51_0;
                          if (((dc) this).field_s != null) {
                            break L11;
                          } else {
                            if (var6 != 0) {
                              fla discarded$43 = var11.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                              ((dc) this).field_s = var11.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (((dc) this).field_s == null) {
                          break L10;
                        } else {
                          if (var6 == 0) {
                            ((dc) this).field_s.a(1, var11);
                            ((dc) this).field_s = null;
                            fla discarded$44 = var11.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L12: {
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (((dc) this).field_u) {
                            break L12;
                          } else {
                            if (!((dc) this).field_v.c(110)) {
                              break L12;
                            } else {
                              fla discarded$45 = var11.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                        if (var6 != 0) {
                          break L13;
                        } else {
                          if (((dc) this).field_p) {
                            break L13;
                          } else {
                            if (((dc) this).field_v.r(-110)) {
                              fla discarded$46 = var11.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (-1 != ((dc) this).field_r) {
                          break L14;
                        } else {
                          if (-1 == var2) {
                            break L14;
                          } else {
                            fla discarded$47 = var11.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            break L14;
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L15: {
                    var3 = 0;
                    ((dc) this).field_r = 0;
                    if (((dc) this).field_r != 0) {
                      break L15;
                    } else {
                      if (var2 != 0) {
                        ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var9 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                  if (var9 != null) {
                    L16: {
                      var8 = (fsa) (Object) ((dc) this).field_h;
                      if (var8.d(param0 + 51, false)) {
                        if (var3 != 0) {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L16;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          break L16;
                        }
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_17_0 = stackOut_12_0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        var6 = stackIn_17_0;
                        if (((dc) this).field_s != null) {
                          break L18;
                        } else {
                          if (var6 != 0) {
                            fla discarded$48 = var9.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                            ((dc) this).field_s = var9.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (((dc) this).field_s == null) {
                        break L17;
                      } else {
                        if (var6 == 0) {
                          ((dc) this).field_s.a(1, var9);
                          ((dc) this).field_s = null;
                          fla discarded$49 = var9.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (var6 != 0) {
                        break L19;
                      } else {
                        if (((dc) this).field_u) {
                          break L19;
                        } else {
                          if (!((dc) this).field_v.c(110)) {
                            break L19;
                          } else {
                            fla discarded$50 = var9.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                            break L19;
                          }
                        }
                      }
                    }
                    L20: {
                      ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                      if (var6 == 0) {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (-1 != ((dc) this).field_r) {
                          break L20;
                        } else {
                          if (-1 == var2) {
                            break L20;
                          } else {
                            fla discarded$51 = var9.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            break L20;
                          }
                        }
                      } else {
                        ((dc) this).field_p = ((dc) this).field_v.r(-59);
                        if (-1 != ((dc) this).field_r) {
                          break L20;
                        } else {
                          if (-1 == var2) {
                            break L20;
                          } else {
                            fla discarded$52 = var9.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                            break L20;
                          }
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
          L21: {
            if (((dc) this).field_r != 0) {
              break L21;
            } else {
              if (var2 != 0) {
                ((dc) this).a(42).b(false).a(0, ((dc) this).c((byte) 92), 0, 0, 0, ((dc) this).b((byte) 52));
                break L21;
              } else {
                var15 = (w) (Object) ((dc) this).a(param0 + 44).field_G;
                if (var15 == null) {
                  return;
                } else {
                  L22: {
                    var14 = (fsa) (Object) ((dc) this).field_h;
                    if (var14.d(param0 + 51, false)) {
                      if (var3 != 0) {
                        stackOut_116_0 = 1;
                        stackIn_118_0 = stackOut_116_0;
                        break L22;
                      } else {
                        stackOut_115_0 = 0;
                        stackIn_118_0 = stackOut_115_0;
                        break L22;
                      }
                    } else {
                      stackOut_113_0 = 0;
                      stackIn_118_0 = stackOut_113_0;
                      break L22;
                    }
                  }
                  L23: {
                    L24: {
                      var6 = stackIn_118_0;
                      if (((dc) this).field_s != null) {
                        break L24;
                      } else {
                        if (var6 != 0) {
                          fla discarded$53 = var15.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                          ((dc) this).field_s = var15.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    if (((dc) this).field_s == null) {
                      break L23;
                    } else {
                      if (var6 == 0) {
                        ((dc) this).field_s.a(1, var15);
                        ((dc) this).field_s = null;
                        fla discarded$54 = var15.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (var6 != 0) {
                      break L25;
                    } else {
                      if (((dc) this).field_u) {
                        break L25;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L25;
                        } else {
                          fla discarded$55 = var15.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                          break L25;
                        }
                      }
                    }
                  }
                  L26: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L26;
                    } else {
                      if (((dc) this).field_p) {
                        break L26;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$56 = var15.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  L27: {
                    ((dc) this).field_p = ((dc) this).field_v.r(-59);
                    if (-1 != ((dc) this).field_r) {
                      break L27;
                    } else {
                      if (-1 == var2) {
                        break L27;
                      } else {
                        fla discarded$57 = var15.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                        break L27;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          var17_ref = (w) (Object) ((dc) this).a(param0 + 44).field_G;
          if (var17_ref != null) {
            L28: {
              var18 = (fsa) (Object) ((dc) this).field_h;
              if (var18.d(param0 + 51, false)) {
                if (var3 == 0) {
                  stackOut_148_0 = 0;
                  stackIn_149_0 = stackOut_148_0;
                  break L28;
                } else {
                  stackOut_147_0 = 1;
                  stackIn_149_0 = stackOut_147_0;
                  break L28;
                }
              } else {
                stackOut_145_0 = 0;
                stackIn_149_0 = stackOut_145_0;
                break L28;
              }
            }
            L29: {
              var6 = stackIn_149_0;
              if (((dc) this).field_s != null) {
                break L29;
              } else {
                if (var6 != 0) {
                  L30: {
                    fla discarded$58 = var17_ref.a(new fm(56, ((dc) this).b((byte) -93), ((dc) this).c((byte) 124), ((dc) this).e((byte) -118)), -58);
                    ((dc) this).field_s = var17_ref.a(new fm(57, ((dc) this).b((byte) 32), ((dc) this).c((byte) 118), ((dc) this).e((byte) -95)), -58);
                    if (var6 != 0) {
                      break L30;
                    } else {
                      if (((dc) this).field_u) {
                        break L30;
                      } else {
                        if (!((dc) this).field_v.c(110)) {
                          break L30;
                        } else {
                          L31: {
                            fla discarded$59 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                            ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                            if (((dc) this).field_p) {
                              break L31;
                            } else {
                              if (((dc) this).field_v.r(-110)) {
                                fla discarded$60 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            ((dc) this).field_p = ((dc) this).field_v.r(-59);
                            if (-1 != ((dc) this).field_r) {
                              break L32;
                            } else {
                              if (-1 == var2) {
                                break L32;
                              } else {
                                fla discarded$61 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                break L32;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  L33: {
                    ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                    if (var6 != 0) {
                      break L33;
                    } else {
                      if (((dc) this).field_p) {
                        break L33;
                      } else {
                        if (((dc) this).field_v.r(-110)) {
                          fla discarded$62 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                          break L33;
                        } else {
                          L34: {
                            ((dc) this).field_p = ((dc) this).field_v.r(-59);
                            if (-1 != ((dc) this).field_r) {
                              break L34;
                            } else {
                              if (-1 == var2) {
                                break L34;
                              } else {
                                fla discarded$63 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                break L34;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  ((dc) this).field_p = ((dc) this).field_v.r(-59);
                  if (-1 == ((dc) this).field_r) {
                    if (-1 != var2) {
                      fla discarded$64 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  break L29;
                }
              }
            }
            if (((dc) this).field_s == null) {
              L35: {
                if (var6 != 0) {
                  break L35;
                } else {
                  if (((dc) this).field_u) {
                    break L35;
                  } else {
                    if (!((dc) this).field_v.c(110)) {
                      break L35;
                    } else {
                      L36: {
                        fla discarded$65 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                        ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                        if (((dc) this).field_p) {
                          break L36;
                        } else {
                          if (((dc) this).field_v.r(-110)) {
                            fla discarded$66 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                            break L36;
                          } else {
                            L37: {
                              ((dc) this).field_p = ((dc) this).field_v.r(-59);
                              if (-1 != ((dc) this).field_r) {
                                break L37;
                              } else {
                                if (-1 == var2) {
                                  break L37;
                                } else {
                                  fla discarded$67 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                                  break L37;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      ((dc) this).field_p = ((dc) this).field_v.r(-59);
                      if (-1 == ((dc) this).field_r) {
                        if (-1 == var2) {
                          return;
                        } else {
                          fla discarded$68 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L38: {
                ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                if (var6 != 0) {
                  break L38;
                } else {
                  if (((dc) this).field_p) {
                    break L38;
                  } else {
                    if (((dc) this).field_v.r(-110)) {
                      fla discarded$69 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                      break L38;
                    } else {
                      ((dc) this).field_p = ((dc) this).field_v.r(-59);
                      if (-1 == ((dc) this).field_r) {
                        if (-1 != var2) {
                          fla discarded$70 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
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
              L39: {
                ((dc) this).field_p = ((dc) this).field_v.r(-59);
                if (-1 != ((dc) this).field_r) {
                  break L39;
                } else {
                  if (-1 == var2) {
                    break L39;
                  } else {
                    fla discarded$71 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                    return;
                  }
                }
              }
              return;
            } else {
              L40: {
                ((dc) this).field_s.a(1, var17_ref);
                ((dc) this).field_s = null;
                fla discarded$72 = var17_ref.a(new fm(58, ((dc) this).b((byte) -99), ((dc) this).c((byte) 95), ((dc) this).e((byte) -122)), param0 ^ 57);
                if (((dc) this).field_u) {
                  break L40;
                } else {
                  if (!((dc) this).field_v.c(110)) {
                    break L40;
                  } else {
                    fla discarded$73 = var17_ref.a(new fm(59, ((dc) this).b((byte) -121), ((dc) this).c((byte) 92), ((dc) this).e((byte) -105)), -58);
                    break L40;
                  }
                }
              }
              L41: {
                ((dc) this).field_u = ((dc) this).field_v.c(param0 + -77);
                if (((dc) this).field_p) {
                  break L41;
                } else {
                  if (((dc) this).field_v.r(-110)) {
                    fla discarded$74 = var17_ref.a(new fm(60, ((dc) this).b((byte) -86), ((dc) this).c((byte) 112), ((dc) this).e((byte) -97)), -58);
                    break L41;
                  } else {
                    break L41;
                  }
                }
              }
              L42: {
                ((dc) this).field_p = ((dc) this).field_v.r(-59);
                if (-1 != ((dc) this).field_r) {
                  break L42;
                } else {
                  if (-1 == var2) {
                    break L42;
                  } else {
                    fla discarded$75 = var17_ref.a(new fm(2, ((dc) this).b((byte) -90), ((dc) this).c((byte) 127), ((dc) this).e((byte) -122)), -58);
                    break L42;
                  }
                }
              }
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
        ((dc) this).field_n = 160;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        int var10 = 0;
        int var11 = 0;
        var6 = param2 + (((dc) this).field_t << 299537840);
        param3 = param3 + (((dc) this).field_r << -1005290544);
        var7 = param1 + (((dc) this).field_m << 1938679376);
        var8 = dfa.a(4096 + -((dc) this).field_h.g(-25787) >> 1129803586, 2048, -120);
        var10 = 14 % ((param4 - -38) / 47);
        var11 = ((dc) this).field_q;
        if (var11 != 0) {
          if ((var11 ^ -1) != -2) {
            var9 = df.field_J[74];
            gqa.a(var8, -83584144, var7, var6, var9, param3);
            return;
          } else {
            var9 = df.field_J[74];
            gqa.a(var8, -83584144, var7, var6, var9, param3);
            return;
          }
        } else {
          var9 = df.field_J[74];
          gqa.a(var8, -83584144, var7, var6, var9, param3);
          return;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        super.a(param0, param1, param2);
        if (!(!(param0 instanceof rea))) {
            ((dc) this).field_v = (rea) (Object) param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 6;
    }
}
