/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v {
    static w[] field_f;
    ml field_i;
    ml field_e;
    ml field_h;
    ml field_m;
    int field_g;
    long field_k;
    wi field_a;
    wi field_c;
    byte field_j;
    volatile int field_d;
    volatile int field_l;
    lf field_b;

    final int c(int param0) {
        if (param0 != -8217) {
            int discarded$0 = ((v) this).a(true);
        }
        return ((v) this).field_i.a((byte) 12) - -((v) this).field_e.a((byte) 12);
    }

    abstract boolean a(byte param0);

    final boolean b(boolean param0) {
        if (param0) {
            ((v) this).field_c = null;
        }
        return -21 >= (((v) this).c(-8217) ^ -1) ? true : false;
    }

    final static void d(byte param0) {
        if (param0 <= 37) {
            v.b(-27);
        }
        if (!(vc.d((byte) -96))) {
            return;
        }
        nj.a(false, -25698, 4);
    }

    public static void b(int param0) {
        if (param0 != -8217) {
            return;
        }
        field_f = null;
    }

    abstract void a(byte param0, Object param1, boolean param2);

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Bounce.field_N;
          if (param4 == -110) {
            break L0;
          } else {
            v.b(76);
            break L0;
          }
        }
        var6 = param2 + -param3;
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var8 = param1.charAt(var7 + param3);
                      if (0 >= var8) {
                        break L6;
                      } else {
                        if (128 > var8) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L4;
                    } else {
                      if (var8 > 255) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param0[param5 - -var7] = (byte)var8;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var8 == 8364) {
                    break L7;
                  } else {
                    L8: {
                      if (8218 != var8) {
                        break L8;
                      } else {
                        param0[param5 + var7] = (byte)-126;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var8 != 402) {
                        break L9;
                      } else {
                        param0[param5 - -var7] = (byte)-125;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8 == 8222) {
                        break L10;
                      } else {
                        L11: {
                          if (var8 != 8230) {
                            break L11;
                          } else {
                            param0[param5 - -var7] = (byte)-123;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var8 == 8224) {
                            break L12;
                          } else {
                            L13: {
                              if (var8 == 8225) {
                                break L13;
                              } else {
                                L14: {
                                  if (var8 != 710) {
                                    break L14;
                                  } else {
                                    param0[param5 - -var7] = (byte)-120;
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
                                    param0[var7 + param5] = (byte)-119;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (352 == var8) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (8249 == var8) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (var8 != 338) {
                                            break L18;
                                          } else {
                                            param0[var7 + param5] = (byte)-116;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        L19: {
                                          if (var8 == 381) {
                                            break L19;
                                          } else {
                                            L20: {
                                              if (var8 != 8216) {
                                                break L20;
                                              } else {
                                                param0[var7 + param5] = (byte)-111;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (var8 != 8217) {
                                                break L21;
                                              } else {
                                                param0[var7 + param5] = (byte)-110;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              if (var8 == 8220) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  if (var8 == 8221) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if (var8 != 8226) {
                                                        break L24;
                                                      } else {
                                                        param0[var7 + param5] = (byte)-107;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (8211 != var8) {
                                                        break L25;
                                                      } else {
                                                        param0[var7 + param5] = (byte)-106;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      if (var8 != 8212) {
                                                        break L26;
                                                      } else {
                                                        param0[param5 - -var7] = (byte)-105;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    L27: {
                                                      if (var8 == 732) {
                                                        break L27;
                                                      } else {
                                                        L28: {
                                                          if (var8 == 8482) {
                                                            break L28;
                                                          } else {
                                                            L29: {
                                                              if (var8 != 353) {
                                                                break L29;
                                                              } else {
                                                                param0[var7 + param5] = (byte)-102;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            L30: {
                                                              if (var8 != 8250) {
                                                                break L30;
                                                              } else {
                                                                param0[var7 + param5] = (byte)-101;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                            L31: {
                                                              if (var8 != 339) {
                                                                break L31;
                                                              } else {
                                                                param0[param5 - -var7] = (byte)-100;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            L32: {
                                                              if (var8 == 382) {
                                                                break L32;
                                                              } else {
                                                                L33: {
                                                                  if (var8 != 376) {
                                                                    break L33;
                                                                  } else {
                                                                    param0[var7 + param5] = (byte)-97;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L33;
                                                                    }
                                                                  }
                                                                }
                                                                param0[var7 + param5] = (byte)63;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L32;
                                                                }
                                                              }
                                                            }
                                                            param0[var7 + param5] = (byte)-98;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        param0[var7 + param5] = (byte)-103;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    param0[param5 - -var7] = (byte)-104;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                param0[param5 - -var7] = (byte)-108;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            param0[param5 + var7] = (byte)-109;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        param0[param5 + var7] = (byte)-114;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    param0[var7 + param5] = (byte)-117;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                param0[param5 + var7] = (byte)-118;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            param0[var7 + param5] = (byte)-121;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L12;
                            }
                          }
                        }
                        param0[var7 + param5] = (byte)-122;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param0[param5 + var7] = (byte)-124;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                }
                param0[var7 + param5] = (byte)-128;
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

    final boolean b(byte param0) {
        if (param0 < 32) {
            int discarded$0 = ((v) this).a(false);
        }
        return 20 <= ((v) this).a(true) ? true : false;
    }

    final lf a(int param0, byte param1, int param2, boolean param3, int param4) {
        long var6 = (long)param0 + ((long)param4 << -1734309216);
        lf var8 = new lf();
        var8.field_s = param1;
        var8.field_j = var6;
        int var9 = 25 % ((param2 - -13) / 49);
        var8.field_m = param3 ? true : false;
        if (!param3) {
            if (!(-21 < ((v) this).a(true))) {
                throw new RuntimeException();
            }
            ((v) this).field_h.a((byte) -78, (ug) (Object) var8);
        } else {
            if (-21 <= ((v) this).c(-8217)) {
                throw new RuntimeException();
            }
            ((v) this).field_i.a((byte) -78, (ug) (Object) var8);
        }
        return var8;
    }

    final int a(boolean param0) {
        if (!param0) {
            Object var3 = null;
            int discarded$0 = v.a((byte[]) null, (CharSequence) null, 42, 22, (byte) -44, -125);
        }
        return ((v) this).field_h.a((byte) 12) - -((v) this).field_m.a((byte) 12);
    }

    abstract void a(int param0);

    abstract void c(byte param0);

    v() {
        ((v) this).field_i = new ml();
        ((v) this).field_e = new ml();
        ((v) this).field_h = new ml();
        ((v) this).field_m = new ml();
        ((v) this).field_a = new wi(6);
        ((v) this).field_j = (byte) 0;
        ((v) this).field_l = 0;
        ((v) this).field_d = 0;
        ((v) this).field_c = new wi(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new w[255];
        for (var0 = 0; var0 < field_f.length; var0++) {
            field_f[var0] = new w();
        }
    }
}
