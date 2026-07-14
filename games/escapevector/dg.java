/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends ah {
    static ed field_t;
    private boolean field_q;
    static ed field_r;
    private lb field_p;
    static String field_s;
    static al field_o;
    private String field_n;

    final static String c(byte param0) {
        if (param0 > -8) {
            dg.g(7);
        }
        return ca.field_d;
    }

    public static void g(int param0) {
        field_o = null;
        field_s = null;
        if (param0 != 0) {
            String discarded$0 = dg.c((byte) 98);
        }
        field_t = null;
        field_r = null;
    }

    dg(ul param0, ul param1) {
        super(param0);
        ((dg) this).field_q = false;
        ((dg) this).field_n = "";
        ((dg) this).field_p = new lb(param0, param1);
    }

    final rf a(int param0, String param1) {
        if (((dg) this).field_p.a(param0, param1) == ob.field_a) {
            return ob.field_a;
        }
        if (param1.equals((Object) (Object) ((dg) this).field_n)) {
            return !((dg) this).field_q ? ob.field_a : df.field_h;
        }
        d var3 = ja.a(param1, true);
        if (!(var3.b(0))) {
            return ug.field_c;
        }
        ((dg) this).field_n = param1;
        ((dg) this).field_q = var3.c(param0 + 14669);
        return !((dg) this).field_q ? ob.field_a : df.field_h;
    }

    final String a(byte param0, String param1) {
        if (!(((dg) this).field_p.a(-1, param1) != ob.field_a)) {
            return ((dg) this).field_p.a((byte) -53, param1);
        }
        if (!(((dg) this).a(-1, param1) != ob.field_a)) {
            return wa.field_a;
        }
        int var3 = -120 % ((param0 - 10) / 51);
        return ec.field_c;
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          var6 = -param5 + param0;
          var7 = 0;
          if (param2 == 19409) {
            break L0;
          } else {
            String discarded$1 = dg.c((byte) -94);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var6 <= var7) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    var8 = param3.charAt(param5 + var7);
                    if (-1 <= (var8 ^ -1)) {
                      break L5;
                    } else {
                      if (var8 < 128) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (160 > var8) {
                      break L6;
                    } else {
                      if (var8 <= 255) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 == 8364) {
                      break L7;
                    } else {
                      L8: {
                        if (8218 == var8) {
                          break L8;
                        } else {
                          L9: {
                            if (var8 != 402) {
                              break L9;
                            } else {
                              param4[var7 + param1] = (byte)-125;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (8222 == var8) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 == 8230) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var8 != 8224) {
                                      break L12;
                                    } else {
                                      param4[var7 + param1] = (byte)-122;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var8 == 8225) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (var8 != 710) {
                                          break L14;
                                        } else {
                                          param4[var7 + param1] = (byte)-120;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        if (var8 != 8240) {
                                          break L15;
                                        } else {
                                          param4[var7 + param1] = (byte)-119;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var8 == 352) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (8249 != var8) {
                                              break L17;
                                            } else {
                                              param4[param1 - -var7] = (byte)-117;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var8 != 338) {
                                              break L18;
                                            } else {
                                              param4[param1 + var7] = (byte)-116;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var8 != 381) {
                                              break L19;
                                            } else {
                                              param4[param1 + var7] = (byte)-114;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (var8 == 8216) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (var8 != 8217) {
                                                  break L21;
                                                } else {
                                                  param4[param1 + var7] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (8220 == var8) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (var8 != 8221) {
                                                      break L23;
                                                    } else {
                                                      param4[var7 + param1] = (byte)-108;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  L24: {
                                                    if (var8 != 8226) {
                                                      break L24;
                                                    } else {
                                                      param4[var7 + param1] = (byte)-107;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (var8 == 8211) {
                                                      break L25;
                                                    } else {
                                                      L26: {
                                                        if (8212 == var8) {
                                                          break L26;
                                                        } else {
                                                          L27: {
                                                            if (var8 != 732) {
                                                              break L27;
                                                            } else {
                                                              param4[param1 - -var7] = (byte)-104;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          L28: {
                                                            if (var8 != 8482) {
                                                              break L28;
                                                            } else {
                                                              param4[var7 + param1] = (byte)-103;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          L29: {
                                                            if (353 == var8) {
                                                              break L29;
                                                            } else {
                                                              L30: {
                                                                if (var8 != 8250) {
                                                                  break L30;
                                                                } else {
                                                                  param4[param1 + var7] = (byte)-101;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              L31: {
                                                                if (339 == var8) {
                                                                  break L31;
                                                                } else {
                                                                  L32: {
                                                                    if (382 == var8) {
                                                                      break L32;
                                                                    } else {
                                                                      L33: {
                                                                        if (var8 == 376) {
                                                                          break L33;
                                                                        } else {
                                                                          param4[var7 + param1] = (byte)63;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[var7 + param1] = (byte)-97;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[var7 + param1] = (byte)-98;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              param4[param1 + var7] = (byte)-100;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param1] = (byte)-102;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      param4[param1 + var7] = (byte)-105;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param1] = (byte)-106;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param4[var7 + param1] = (byte)-109;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          param4[param1 + var7] = (byte)-111;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      param4[var7 + param1] = (byte)-118;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  param4[var7 + param1] = (byte)-121;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              param4[param1 - -var7] = (byte)-123;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param4[param1 - -var7] = (byte)-124;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param4[param1 + var7] = (byte)-126;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param4[var7 + param1] = (byte)-128;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param4[param1 - -var7] = (byte)var8;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Fuel bonus: ";
        field_o = new al();
    }
}
