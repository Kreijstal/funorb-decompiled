/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc implements Runnable {
    static long[] field_a;
    private InputStream field_g;
    private int field_h;
    private OutputStream field_b;
    static int field_o;
    private java.net.Socket field_k;
    private int field_n;
    private uf field_m;
    private boolean field_j;
    static int[][] field_c;
    private ce field_f;
    private byte[] field_e;
    private boolean field_l;
    private int field_i;
    static boolean field_d;

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1548905857;
        param0 = param0 | param0 >>> -71695006;
        param0 = param0 | param0 >>> 1409272580;
        param0 = param0 | param0 >>> -1980750520;
        param0 = param0 | param0 >>> -147347280;
        if (param1 > -58) {
          return -67;
        } else {
          return param0 + 1;
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = param1.length();
        var3 = new byte[var2];
        if (param0 == -6) {
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param1.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (var5 < 128) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 < 160) {
                      break L4;
                    } else {
                      if (var5 <= 255) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (8364 != var5) {
                    if (var5 != 8218) {
                      if (402 == var5) {
                        var3[var4] = (byte)-125;
                        break L1;
                      } else {
                        if (8222 != var5) {
                          if (8230 == var5) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 != 8224) {
                              if (var5 != 8225) {
                                if (var5 != 710) {
                                  if (8240 != var5) {
                                    if (var5 != 352) {
                                      if (8249 != var5) {
                                        if (var5 != 338) {
                                          if (var5 != 381) {
                                            if (var5 != 8216) {
                                              if (var5 == 8217) {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              } else {
                                                if (var5 == 8220) {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                } else {
                                                  if (var5 == 8221) {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  } else {
                                                    if (var5 != 8226) {
                                                      if (var5 == 8211) {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      } else {
                                                        if (8212 == var5) {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        } else {
                                                          if (var5 != 732) {
                                                            if (var5 != 8482) {
                                                              if (var5 != 353) {
                                                                if (var5 == 8250) {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                } else {
                                                                  if (var5 == 339) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  } else {
                                                                    if (var5 != 382) {
                                                                      if (var5 == 376) {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            }
                                          } else {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        }
                                      } else {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      }
                                    } else {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    }
                                  } else {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                }
                              } else {
                                var3[var4] = (byte)-121;
                                break L1;
                              }
                            } else {
                              var3[var4] = (byte)-122;
                              break L1;
                            }
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L1;
                        }
                      }
                    } else {
                      var3[var4] = (byte)-126;
                      break L1;
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    var4++;
                    break L1;
                  }
                }
                var3[var4] = (byte)var5;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          L5: {
            var7 = null;
            byte[] discarded$1 = bc.a((byte) 8, (CharSequence) null);
            var4 = 0;
            if (var2 <= var4) {
              break L5;
            } else {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L9;
                      } else {
                        if (var5 < 128) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var5 < 160) {
                        break L10;
                      } else {
                        if (var5 <= 255) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (8364 != var5) {
                      L11: {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                L16: {
                                  L17: {
                                    L18: {
                                      L19: {
                                        L20: {
                                          L21: {
                                            L22: {
                                              L23: {
                                                L24: {
                                                  L25: {
                                                    L26: {
                                                      L27: {
                                                        L28: {
                                                          L29: {
                                                            L30: {
                                                              L31: {
                                                                L32: {
                                                                  L33: {
                                                                    L34: {
                                                                      L35: {
                                                                        L36: {
                                                                          if (var5 != 8218) {
                                                                            if (402 == var5) {
                                                                              var3[var4] = (byte)-125;
                                                                              break L11;
                                                                            } else {
                                                                              if (8222 != var5) {
                                                                                if (8230 == var5) {
                                                                                  var3[var4] = (byte)-123;
                                                                                  break L12;
                                                                                } else {
                                                                                  if (var5 != 8224) {
                                                                                    if (var5 != 8225) {
                                                                                      if (var5 != 710) {
                                                                                        if (8240 != var5) {
                                                                                          if (var5 != 352) {
                                                                                            if (8249 != var5) {
                                                                                              if (var5 != 338) {
                                                                                                if (var5 != 381) {
                                                                                                  if (var5 != 8216) {
                                                                                                    if (var5 == 8217) {
                                                                                                      var3[var4] = (byte)-110;
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      if (var5 == 8220) {
                                                                                                        var3[var4] = (byte)-109;
                                                                                                        break L14;
                                                                                                      } else {
                                                                                                        if (var5 == 8221) {
                                                                                                          var3[var4] = (byte)-108;
                                                                                                          break L15;
                                                                                                        } else {
                                                                                                          if (var5 != 8226) {
                                                                                                            if (var5 == 8211) {
                                                                                                              var3[var4] = (byte)-106;
                                                                                                              break L16;
                                                                                                            } else {
                                                                                                              if (8212 == var5) {
                                                                                                                var3[var4] = (byte)-105;
                                                                                                                break L17;
                                                                                                              } else {
                                                                                                                if (var5 != 732) {
                                                                                                                  if (var5 != 8482) {
                                                                                                                    if (var5 != 353) {
                                                                                                                      if (var5 == 8250) {
                                                                                                                        var3[var4] = (byte)-101;
                                                                                                                        break L18;
                                                                                                                      } else {
                                                                                                                        if (var5 == 339) {
                                                                                                                          var3[var4] = (byte)-100;
                                                                                                                          break L19;
                                                                                                                        } else {
                                                                                                                          if (var5 != 382) {
                                                                                                                            if (var5 == 376) {
                                                                                                                              var3[var4] = (byte)-97;
                                                                                                                              break L20;
                                                                                                                            } else {
                                                                                                                              var3[var4] = (byte)63;
                                                                                                                              break L21;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            var3[var4] = (byte)-98;
                                                                                                                            break L22;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      var3[var4] = (byte)-102;
                                                                                                                      break L23;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    var3[var4] = (byte)-103;
                                                                                                                    break L24;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var3[var4] = (byte)-104;
                                                                                                                  break L25;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            var3[var4] = (byte)-107;
                                                                                                            break L26;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3[var4] = (byte)-111;
                                                                                                    break L27;
                                                                                                  }
                                                                                                } else {
                                                                                                  var3[var4] = (byte)-114;
                                                                                                  break L28;
                                                                                                }
                                                                                              } else {
                                                                                                var3[var4] = (byte)-116;
                                                                                                break L29;
                                                                                              }
                                                                                            } else {
                                                                                              var3[var4] = (byte)-117;
                                                                                              break L30;
                                                                                            }
                                                                                          } else {
                                                                                            var3[var4] = (byte)-118;
                                                                                            break L31;
                                                                                          }
                                                                                        } else {
                                                                                          var3[var4] = (byte)-119;
                                                                                          break L32;
                                                                                        }
                                                                                      } else {
                                                                                        var3[var4] = (byte)-120;
                                                                                        break L33;
                                                                                      }
                                                                                    } else {
                                                                                      var3[var4] = (byte)-121;
                                                                                      break L34;
                                                                                    }
                                                                                  } else {
                                                                                    var3[var4] = (byte)-122;
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3[var4] = (byte)-124;
                                                                                break L36;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var3[var4] = (byte)-126;
                                                                            var4++;
                                                                            break L36;
                                                                          }
                                                                        }
                                                                        var4++;
                                                                        break L35;
                                                                      }
                                                                      var4++;
                                                                      break L34;
                                                                    }
                                                                    var4++;
                                                                    break L33;
                                                                  }
                                                                  var4++;
                                                                  break L32;
                                                                }
                                                                var4++;
                                                                break L31;
                                                              }
                                                              var4++;
                                                              break L30;
                                                            }
                                                            var4++;
                                                            break L29;
                                                          }
                                                          var4++;
                                                          break L28;
                                                        }
                                                        var4++;
                                                        break L27;
                                                      }
                                                      var4++;
                                                      break L26;
                                                    }
                                                    var4++;
                                                    break L25;
                                                  }
                                                  var4++;
                                                  break L24;
                                                }
                                                var4++;
                                                break L23;
                                              }
                                              var4++;
                                              break L22;
                                            }
                                            var4++;
                                            break L21;
                                          }
                                          var4++;
                                          break L20;
                                        }
                                        var4++;
                                        break L19;
                                      }
                                      var4++;
                                      break L18;
                                    }
                                    var4++;
                                    break L17;
                                  }
                                  var4++;
                                  break L16;
                                }
                                var4++;
                                break L15;
                              }
                              var4++;
                              break L14;
                            }
                            var4++;
                            break L13;
                          }
                          var4++;
                          break L12;
                        }
                        var4++;
                        break L11;
                      }
                      var4++;
                      break L7;
                    } else {
                      var3[var4] = (byte)-128;
                      var4++;
                      break L6;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L7;
                }
                var4++;
                break L6;
              }
              var4++;
              var4++;
              break L5;
            }
          }
          return var3;
        }
    }

    final static ck a(int param0, byte[] param1) {
        ck var2 = null;
        Object var3 = null;
        if (param1 != null) {
          if (param0 != 12587) {
            var3 = null;
            byte[] discarded$2 = bc.a((byte) -122, (CharSequence) null);
            var2 = new ck(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qe.field_z, qk.field_M);
            ff.b(26);
            return var2;
          } else {
            var2 = new ck(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qe.field_z, qk.field_M);
            ff.b(26);
            return var2;
          }
        } else {
          return null;
        }
    }

    protected final void finalize() {
        ((bc) this).d(16777215);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            Object var3 = null;
            byte[] discarded$4 = bc.a((byte) 44, (CharSequence) null);
            if (!(!((bc) this).field_j)) {
                return 0;
            }
            return ((bc) this).field_g.available();
        }
        if (!(!((bc) this).field_j)) {
            return 0;
        }
        return ((bc) this).field_g.available();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        if (((bc) this).field_j) {
          return;
        } else {
          L0: while (true) {
            if (0 >= param2) {
              if (param1 == 0) {
                return;
              } else {
                ((bc) this).field_b = null;
                return;
              }
            } else {
              var5 = ((bc) this).field_g.read(param0, param3, param2);
              if ((var5 ^ -1) < -1) {
                param2 = param2 - var5;
                param3 = param3 + var5;
                continue L0;
              } else {
                throw new EOFException();
              }
            }
          }
        }
    }

    final void d(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Object var2_ref2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TrackController.field_F ? 1 : 0;
                    if (param0 == 16777215) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = null;
                    ck discarded$1 = bc.a(-6, (byte[]) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!((bc) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var2_ref2 = this;
                    // monitorenter this
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        ((bc) this).field_j = true;
                        this.notifyAll();
                        // monitorexit var2_ref2
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2_ref2
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                case 9: {
                    if (null == ((bc) this).field_f) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (((bc) this).field_f.field_f != 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    wl.a(1L, false);
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    if (((bc) this).field_f.field_f != 1) {
                        statePc = 17;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    try {
                        ((Thread) ((bc) this).field_f.field_e).join();
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 16: {
                    ((bc) this).field_f = null;
                    return;
                }
                case 17: {
                    ((bc) this).field_f = null;
                    return;
                }
                case 18: {
                    ((bc) this).field_f = null;
                    return;
                }
                case 19: {
                    ((bc) this).field_f = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_64_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          var5 = param2 + param4;
          var6 = param3 + param0;
          if (ll.field_a >= param4) {
            stackOut_2_0 = ll.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (ll.field_b < param3) {
            stackOut_5_0 = param3;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ll.field_b;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (ll.field_e > var5) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = ll.field_e;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var9 = stackIn_9_0;
        if (param1 == -28846) {
          L3: {
            if (ll.field_g <= var6) {
              stackOut_63_0 = ll.field_g;
              stackIn_64_0 = stackOut_63_0;
              break L3;
            } else {
              stackOut_62_0 = var6;
              stackIn_64_0 = stackOut_62_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_64_0;
            if (param4 < ll.field_a) {
              break L4;
            } else {
              if (param4 >= ll.field_e) {
                break L4;
              } else {
                var11 = param4 + var8 * ll.field_d;
                var12 = -var8 + var10 + 1 >> 677255297;
                L5: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L4;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 = var11 + ll.field_d * 2;
                    continue L5;
                  }
                }
              }
            }
          }
          L6: {
            if (ll.field_b > param3) {
              break L6;
            } else {
              if (ll.field_g > var6) {
                var11 = var7 + param3 * ll.field_d;
                var12 = var9 + (1 - var7) >> -1081567551;
                L7: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L6;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                if (ll.field_a <= var5) {
                  if (ll.field_e <= var5) {
                    L8: {
                      if (param3 < ll.field_b) {
                        break L8;
                      } else {
                        if (var6 >= ll.field_g) {
                          break L8;
                        } else {
                          var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                          var12 = var9 + (1 + -var7) >> -1345020191;
                          L9: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L8;
                            } else {
                              ll.field_i[var11] = 16777215;
                              var11 += 2;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    var11 = ((1 & -param4 + var5) + var8) * ll.field_d - -var5;
                    var12 = 1 + var10 + -var8 >> 422854881;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        L11: {
                          if (param3 < ll.field_b) {
                            break L11;
                          } else {
                            if (var6 >= ll.field_g) {
                              break L11;
                            } else {
                              var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                              var12 = var9 + (1 + -var7) >> -1345020191;
                              L12: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L11;
                                } else {
                                  ll.field_i[var11] = 16777215;
                                  var11 += 2;
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        ll.field_i[var11] = 16777215;
                        var11 = var11 + ll.field_d * 2;
                        continue L10;
                      }
                    }
                  }
                } else {
                  L13: {
                    if (param3 < ll.field_b) {
                      break L13;
                    } else {
                      if (var6 >= ll.field_g) {
                        break L13;
                      } else {
                        var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                        var12 = var9 + (1 + -var7) >> -1345020191;
                        L14: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L13;
                          } else {
                            ll.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L15: {
            if (ll.field_a > var5) {
              break L15;
            } else {
              if (ll.field_e > var5) {
                var11 = ((1 & -param4 + var5) + var8) * ll.field_d - -var5;
                var12 = 1 + var10 + -var8 >> 422854881;
                L16: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L15;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 = var11 + ll.field_d * 2;
                    continue L16;
                  }
                }
              } else {
                L17: {
                  if (param3 < ll.field_b) {
                    break L17;
                  } else {
                    if (var6 >= ll.field_g) {
                      break L17;
                    } else {
                      var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                      var12 = var9 + (1 + -var7) >> -1345020191;
                      L18: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L17;
                        } else {
                          ll.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          L19: {
            if (param3 < ll.field_b) {
              break L19;
            } else {
              if (var6 >= ll.field_g) {
                break L19;
              } else {
                var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                var12 = var9 + (1 + -var7) >> -1345020191;
                L20: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L19;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L20;
                  }
                }
              }
            }
          }
          return;
        } else {
          L21: {
            field_a = null;
            if (ll.field_g <= var6) {
              stackOut_12_0 = ll.field_g;
              stackIn_13_0 = stackOut_12_0;
              break L21;
            } else {
              stackOut_11_0 = var6;
              stackIn_13_0 = stackOut_11_0;
              break L21;
            }
          }
          L22: {
            var10 = stackIn_13_0;
            if (param4 < ll.field_a) {
              break L22;
            } else {
              if (param4 >= ll.field_e) {
                break L22;
              } else {
                var11 = param4 + var8 * ll.field_d;
                var12 = -var8 + var10 + 1 >> 677255297;
                L23: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L22;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 = var11 + ll.field_d * 2;
                    continue L23;
                  }
                }
              }
            }
          }
          L24: {
            if (ll.field_b > param3) {
              break L24;
            } else {
              if (ll.field_g > var6) {
                var11 = var7 + param3 * ll.field_d;
                var12 = var9 + (1 - var7) >> -1081567551;
                L25: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L24;
                  } else {
                    ll.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L25;
                  }
                }
              } else {
                L26: {
                  if (ll.field_a > var5) {
                    break L26;
                  } else {
                    if (ll.field_e > var5) {
                      var11 = ((1 & -param4 + var5) + var8) * ll.field_d - -var5;
                      var12 = 1 + var10 + -var8 >> 422854881;
                      L27: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L26;
                        } else {
                          ll.field_i[var11] = 16777215;
                          var11 = var11 + ll.field_d * 2;
                          continue L27;
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                }
                L28: {
                  if (param3 < ll.field_b) {
                    break L28;
                  } else {
                    if (var6 >= ll.field_g) {
                      break L28;
                    } else {
                      var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                      var12 = var9 + (1 + -var7) >> -1345020191;
                      L29: while (true) {
                        var12--;
                        if (-1 < var12) {
                          break L28;
                        } else {
                          ll.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L29;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          if (ll.field_a <= var5) {
            if (ll.field_e <= var5) {
              L30: {
                if (param3 < ll.field_b) {
                  break L30;
                } else {
                  if (var6 >= ll.field_g) {
                    break L30;
                  } else {
                    var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                    var12 = var9 + (1 + -var7) >> -1345020191;
                    L31: while (true) {
                      var12--;
                      if (-1 < var12) {
                        break L30;
                      } else {
                        ll.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L31;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              var11 = ((1 & -param4 + var5) + var8) * ll.field_d - -var5;
              var12 = 1 + var10 + -var8 >> 422854881;
              L32: while (true) {
                var12--;
                if (var12 < 0) {
                  L33: {
                    if (param3 < ll.field_b) {
                      break L33;
                    } else {
                      if (var6 >= ll.field_g) {
                        break L33;
                      } else {
                        var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                        var12 = var9 + (1 + -var7) >> -1345020191;
                        L34: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L33;
                          } else {
                            ll.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L34;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ll.field_i[var11] = 16777215;
                  var11 = var11 + ll.field_d * 2;
                  continue L32;
                }
              }
            }
          } else {
            L35: {
              if (param3 < ll.field_b) {
                break L35;
              } else {
                if (var6 >= ll.field_g) {
                  break L35;
                } else {
                  var11 = ll.field_d * var6 + var7 - -(1 & -param3 + var6);
                  var12 = var9 + (1 + -var7) >> -1345020191;
                  L36: while (true) {
                    var12--;
                    if (-1 < var12) {
                      break L35;
                    } else {
                      ll.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L36;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    bc(java.net.Socket param0, uf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TrackController.field_F ? 1 : 0;
                    if (!((bc) this).field_j) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (!((bc) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((bc) this).field_l = false;
                    throw new IOException();
                }
                case 4: {
                    if (((bc) this).field_e == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((bc) this).field_e = new byte[((bc) this).field_n];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (param0 < -101) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((bc) this).field_k = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 <= var6) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((bc) this).field_e[((bc) this).field_h] = param1[param3 + var6];
                        ((bc) this).field_h = (1 + ((bc) this).field_h) % ((bc) this).field_n;
                        if ((-100 + (((bc) this).field_n + ((bc) this).field_i)) % ((bc) this).field_n == ((bc) this).field_h) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((bc) this).field_f == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((bc) this).field_f = ((bc) this).field_m.a(3, (Runnable) this, 17);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TrackController.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((bc) this).field_i == ((bc) this).field_h) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!((bc) this).field_j) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (((bc) this).field_h < ((bc) this).field_i) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = -((bc) this).field_i + ((bc) this).field_h;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((bc) this).field_i + ((bc) this).field_n;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = ((bc) this).field_i;
                            if (-1 <= (var1_int ^ -1)) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((bc) this).field_b.write(((bc) this).field_e, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((bc) this).field_l = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((bc) this).field_i = (((bc) this).field_i + var1_int) % ((bc) this).field_n;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((bc) this).field_i == ((bc) this).field_h) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((bc) this).field_b.flush();
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((bc) this).field_l = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (null == ((bc) this).field_g) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((bc) this).field_g.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == ((bc) this).field_b) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((bc) this).field_b.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null != ((bc) this).field_k) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((bc) this).field_k.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((bc) this).field_e = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        hb.a((Throwable) (Object) var1_ref, 0, (String) null);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        Object var3 = null;
        if (!((bc) this).field_j) {
          if (!((bc) this).field_l) {
            if (param0) {
              return;
            } else {
              var3 = null;
              ck discarded$2 = bc.a(113, (byte[]) null);
              return;
            }
          } else {
            ((bc) this).field_l = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 32) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final int a(int param0) throws IOException {
        if (param0 > -23) {
            return 58;
        }
        if (((bc) this).field_j) {
            return 0;
        }
        return ((bc) this).field_g.read();
    }

    private bc(java.net.Socket param0, uf param1, int param2) throws IOException {
        ((bc) this).field_h = 0;
        ((bc) this).field_j = false;
        ((bc) this).field_l = false;
        ((bc) this).field_i = 0;
        ((bc) this).field_m = param1;
        ((bc) this).field_k = param0;
        ((bc) this).field_k.setSoTimeout(30000);
        ((bc) this).field_k.setTcpNoDelay(true);
        ((bc) this).field_g = ((bc) this).field_k.getInputStream();
        ((bc) this).field_b = ((bc) this).field_k.getOutputStream();
        ((bc) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new long[32];
        field_o = 50;
    }
}
