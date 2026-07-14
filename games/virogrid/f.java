/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f implements Iterator {
    private wb field_a;
    static km[] field_f;
    static ml field_j;
    private eb field_e;
    static String field_d;
    private wb field_i;
    static km field_c;
    static String field_g;
    static int field_b;
    static String field_h;

    final static String a(int param0) {
        if (param0 != 8) {
            f.a((byte) -24);
        }
        if (!(pa.field_l != ao.field_Kb)) {
            return ea.field_e;
        }
        return wd.field_d;
    }

    final static int a(int param0, int param1, int param2, int param3, byte[] param4, CharSequence param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        var6 = param0 - param3;
        if (param2 <= -120) {
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var6 <= var7) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        var8 = param5.charAt(var7 + param3);
                        if ((var8 ^ -1) >= -1) {
                          break L5;
                        } else {
                          if (var8 < 128) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (160 > var8) {
                        break L3;
                      } else {
                        if (var8 > 255) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param4[param1 - -var7] = (byte)var8;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (var8 == 8364) {
                      break L6;
                    } else {
                      L7: {
                        if (8218 == var8) {
                          break L7;
                        } else {
                          L8: {
                            if (var8 == 402) {
                              break L8;
                            } else {
                              L9: {
                                if (var8 == 8222) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var8 != 8230) {
                                      break L10;
                                    } else {
                                      param4[param1 - -var7] = (byte)-123;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (8224 != var8) {
                                      break L11;
                                    } else {
                                      param4[param1 + var7] = (byte)-122;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var8 != 8225) {
                                      break L12;
                                    } else {
                                      param4[param1 - -var7] = (byte)-121;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var8 != 710) {
                                      break L13;
                                    } else {
                                      param4[var7 + param1] = (byte)-120;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var8 == 8240) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (var8 != 352) {
                                          break L15;
                                        } else {
                                          param4[param1 - -var7] = (byte)-118;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var8 != 8249) {
                                          break L16;
                                        } else {
                                          param4[var7 + param1] = (byte)-117;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (338 == var8) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (var8 != 381) {
                                              break L18;
                                            } else {
                                              param4[var7 + param1] = (byte)-114;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var8 == 8216) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (var8 != 8217) {
                                                  break L20;
                                                } else {
                                                  param4[param1 + var7] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                if (var8 != 8220) {
                                                  break L21;
                                                } else {
                                                  param4[param1 + var7] = (byte)-109;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              L22: {
                                                if (var8 != 8221) {
                                                  break L22;
                                                } else {
                                                  param4[param1 - -var7] = (byte)-108;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              L23: {
                                                if (8226 != var8) {
                                                  break L23;
                                                } else {
                                                  param4[param1 - -var7] = (byte)-107;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L24: {
                                                if (var8 != 8211) {
                                                  break L24;
                                                } else {
                                                  param4[param1 + var7] = (byte)-106;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              L25: {
                                                if (var8 != 8212) {
                                                  break L25;
                                                } else {
                                                  param4[param1 - -var7] = (byte)-105;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              L26: {
                                                if (732 == var8) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (var8 != 8482) {
                                                      break L27;
                                                    } else {
                                                      param4[param1 - -var7] = (byte)-103;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  L28: {
                                                    if (var8 != 353) {
                                                      break L28;
                                                    } else {
                                                      param4[param1 - -var7] = (byte)-102;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  L29: {
                                                    if (8250 == var8) {
                                                      break L29;
                                                    } else {
                                                      L30: {
                                                        if (var8 == 339) {
                                                          break L30;
                                                        } else {
                                                          L31: {
                                                            if (var8 == 382) {
                                                              break L31;
                                                            } else {
                                                              L32: {
                                                                if (376 == var8) {
                                                                  break L32;
                                                                } else {
                                                                  param4[param1 - -var7] = (byte)63;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                              param4[param1 - -var7] = (byte)-97;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                          param4[param1 - -var7] = (byte)-98;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      param4[param1 - -var7] = (byte)-100;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L29;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param1] = (byte)-101;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              param4[var7 + param1] = (byte)-104;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          param4[param1 - -var7] = (byte)-111;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      param4[param1 + var7] = (byte)-116;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  param4[param1 - -var7] = (byte)-119;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              param4[param1 + var7] = (byte)-124;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L8;
                              }
                            }
                          }
                          param4[param1 + var7] = (byte)-125;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      param4[param1 + var7] = (byte)-126;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  param4[param1 + var7] = (byte)-128;
                  break L2;
                }
                var7++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var6;
          }
        } else {
          return 107;
        }
    }

    final static void a(byte param0) {
        ac.field_e = false;
        if (!(dk.field_v == null)) {
            dk.field_v.h(1026);
        }
        if (!(sd.field_e == 0)) {
            re.c((byte) 121);
        }
        if (param0 > -26) {
            f.b((byte) -19);
        }
        bf.field_o = 0;
    }

    public final Object next() {
        wb var1 = ((f) this).field_a;
        if (((f) this).field_e.field_e != var1) {
            ((f) this).field_a = var1.field_h;
        } else {
            ((f) this).field_a = null;
            var1 = null;
        }
        ((f) this).field_i = var1;
        return (Object) (Object) var1;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -844) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!mi.a((byte) -119)) {
              break L2;
            } else {
              if (-1 != (8 & id.field_r ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final boolean hasNext() {
        return ((f) this).field_a != ((f) this).field_e.field_e;
    }

    public static void b(byte param0) {
        field_h = null;
        field_c = null;
        field_d = null;
        int var1 = 57 / ((47 - param0) / 48);
        field_j = null;
        field_f = null;
        field_g = null;
    }

    f(eb param0) {
        ((f) this).field_i = null;
        ((f) this).field_e = param0;
        ((f) this).field_a = ((f) this).field_e.field_e.field_h;
        ((f) this).field_i = null;
    }

    final static String a(char param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param2 >= -3) {
            field_c = null;
        }
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    public final void remove() {
        if (((f) this).field_i == null) {
            throw new IllegalStateException();
        }
        ((f) this).field_i.c(25);
        ((f) this).field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "RuneScape clan";
        field_d = "Set up new game";
        field_h = "Hide lobby chat";
    }
}
