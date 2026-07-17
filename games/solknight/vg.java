/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vg extends pj {
    static int field_N;
    private int field_O;
    static int[] field_I;
    private boolean field_U;
    static int field_M;
    private int field_R;
    private boolean field_S;
    private int field_Q;
    private long field_T;
    private int field_K;
    static i field_J;
    static int field_P;
    private long field_V;

    final static void b() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        if (ad.field_h >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 > ad.field_h) {
              var5 = (ad.field_h << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (ad.field_h <= 200) {
              break L1;
            } else {
              var5 = (250 - ad.field_h << 8) / 50;
              break L1;
            }
          }
          cl.a(-118, tg.field_J);
          hk.a();
          mi.a();
          ee.g(95);
          if (256 <= var5) {
            mf.e(4096);
            if (ad.field_h < 150) {
              tg.field_J.f(var3, var4);
              var6 = ad.field_h - 125;
              if (0 < var6) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L2: {
                        tg.field_I.a(var3, var4, 256);
                        var6 = -140 + ad.field_h;
                        if (var6 <= 0) {
                          break L2;
                        } else {
                          L3: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        var7 = (-(256 * var6) + 12800) / 20;
                        tg.field_I.a(var3, var4, var7);
                        var6 = -140 + ad.field_h;
                        if (var6 <= 0) {
                          break L4;
                        } else {
                          L5: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      var7 = var6 * 256 / 20;
                      tg.field_I.a(var3, var4, var7);
                      var6 = -140 + ad.field_h;
                      if (var6 <= 0) {
                        break L6;
                      } else {
                        L7: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    var6 = -140 + ad.field_h;
                    if (var6 <= 0) {
                      break L8;
                    } else {
                      L9: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  var6 = -140 + ad.field_h;
                  if (var6 <= 0) {
                    break L10;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                    break L10;
                  }
                }
                return;
              }
            } else {
              gg.field_e.c(15 + var3, var4 - -10, var5);
              var6 = ad.field_h - 125;
              if (0 < var6) {
                if (var6 < 50) {
                  if (var6 >= 20) {
                    if (30 > var6) {
                      L12: {
                        tg.field_I.a(var3, var4, 256);
                        var6 = -140 + ad.field_h;
                        if (var6 <= 0) {
                          break L12;
                        } else {
                          L13: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L14: {
                        var7 = (-(256 * var6) + 12800) / 20;
                        tg.field_I.a(var3, var4, var7);
                        var6 = -140 + ad.field_h;
                        if (var6 <= 0) {
                          break L14;
                        } else {
                          L15: {
                            var7 = 256;
                            if (var6 < 20) {
                              var7 = 256 * var6 / 20;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var7 = var6 * 256 / 20;
                      tg.field_I.a(var3, var4, var7);
                      var6 = -140 + ad.field_h;
                      if (var6 <= 0) {
                        break L16;
                      } else {
                        L17: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    var6 = -140 + ad.field_h;
                    if (var6 <= 0) {
                      break L18;
                    } else {
                      L19: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  var6 = -140 + ad.field_h;
                  if (var6 <= 0) {
                    break L20;
                  } else {
                    L21: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                    break L20;
                  }
                }
                return;
              }
            }
          } else {
            L22: {
              mi.a(0, 0, mi.field_a, mi.field_d, 0, -var5 + 256);
              mf.e(4096);
              if (ad.field_h < 150) {
                tg.field_J.f(var3, var4);
                break L22;
              } else {
                gg.field_e.c(15 + var3, var4 - -10, var5);
                break L22;
              }
            }
            var6 = ad.field_h - 125;
            if (0 < var6) {
              if (var6 < 50) {
                if (var6 >= 20) {
                  if (30 > var6) {
                    L23: {
                      tg.field_I.a(var3, var4, 256);
                      var6 = -140 + ad.field_h;
                      if (var6 <= 0) {
                        break L23;
                      } else {
                        L24: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                        break L23;
                      }
                    }
                    return;
                  } else {
                    L25: {
                      var7 = (-(256 * var6) + 12800) / 20;
                      tg.field_I.a(var3, var4, var7);
                      var6 = -140 + ad.field_h;
                      if (var6 <= 0) {
                        break L25;
                      } else {
                        L26: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  L27: {
                    var7 = var6 * 256 / 20;
                    tg.field_I.a(var3, var4, var7);
                    var6 = -140 + ad.field_h;
                    if (var6 <= 0) {
                      break L27;
                    } else {
                      L28: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                      break L27;
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  var6 = -140 + ad.field_h;
                  if (var6 <= 0) {
                    break L29;
                  } else {
                    L30: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                    break L29;
                  }
                }
                return;
              }
            } else {
              L31: {
                var6 = -140 + ad.field_h;
                if (var6 <= 0) {
                  break L31;
                } else {
                  L32: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  ql.field_p.c(var3 - -15, var4 - -10, var5 * var7 >> 8);
                  break L31;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        eg var8 = null;
        if (null != ((vg) this).field_w) {
          if (0 == param1) {
            ((vg) this).field_w.a((byte) 126, param0, ((vg) this).field_B, param2, (rc) this);
            if (((vg) this).field_w instanceof eg) {
              var8 = (eg) (Object) ((vg) this).field_w;
              if (((vg) this).field_O == ((vg) this).field_K) {
                var6 = je.a(param3 + 1);
                if (500L <= (-((vg) this).field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(((vg) this).field_K, param0, 1, (rc) this, param2);
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var8.a(((vg) this).field_O, (rc) this, ((vg) this).field_K, 114, param0, param2);
                var6 = je.a(param3 + 1);
                if (500L <= (-((vg) this).field_V + var6) % 1000L) {
                  if (param3 != 0) {
                    ((vg) this).field_U = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var8.a(((vg) this).field_K, param0, 1, (rc) this, param2);
                  if (param3 == 0) {
                    return;
                  } else {
                    ((vg) this).field_U = false;
                    return;
                  }
                }
              }
            } else {
              if (param3 != 0) {
                ((vg) this).field_U = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 != 0) {
              ((vg) this).field_U = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 0) {
            ((vg) this).field_U = false;
            return;
          } else {
            return;
          }
        }
    }

    void j(int param0) {
        int var2 = 0;
        var2 = -18 % ((param0 - -67) / 44);
        if (((vg) this).field_n instanceof pi) {
          ((pi) (Object) ((vg) this).field_n).a((vg) this, (byte) -79);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = 60 / ((param0 - -30) / 60);
              ((vg) this).field_i = param2;
              var5 = param2.length();
              if (((vg) this).field_Q == -1) {
                break L2;
              } else {
                if (var5 > ((vg) this).field_Q) {
                  ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_Q);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((vg) this).field_i.length();
              ((vg) this).field_O = dupTemp$2;
              ((vg) this).field_K = dupTemp$2;
              if (param1) {
                break L3;
              } else {
                ((vg) this).j(30);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("vg.G(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final String q() {
        int var2 = ((vg) this).field_K > ((vg) this).field_O ? ((vg) this).field_O : ((vg) this).field_K;
        int var3 = ((vg) this).field_K <= ((vg) this).field_O ? ((vg) this).field_O : ((vg) this).field_K;
        return ((vg) this).field_i.substring(var2, var3);
    }

    final void l(int param0) {
        ((vg) this).field_K = 0;
        ((vg) this).field_O = 0;
        ((vg) this).field_i = "";
        if (param0 >= -79) {
          ((vg) this).j(-49);
          ((vg) this).j(-124);
          return;
        } else {
          ((vg) this).j(-124);
          return;
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 110) {
          if (((vg) this).field_K != 0) {
            var2 = ((vg) this).field_K - 1;
            L0: while (true) {
              if (var2 > 0) {
                if (((vg) this).field_i.charAt(-1 + var2) != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return ((vg) this).field_K;
          }
        } else {
          ((vg) this).j(14);
          if (((vg) this).field_K != 0) {
            var2 = ((vg) this).field_K - 1;
            L1: while (true) {
              if (var2 > 0) {
                if (((vg) this).field_i.charAt(-1 + var2) != 32) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return ((vg) this).field_K;
          }
        }
    }

    private final void c() {
        if (((vg) this).field_n instanceof pi) {
            ((pi) (Object) ((vg) this).field_n).a((vg) this, true);
            return;
        }
    }

    private final void o() {
        int discarded$0 = -33;
        String var2 = this.q();
        if (!(var2.length() <= 0)) {
            int discarded$1 = -33;
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.q()), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        RuntimeException runtimeException = null;
        eg var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (param1 == 18874) {
              L1: {
                int discarded$2 = -119;
                this.d();
                if (1 != ((vg) this).field_u) {
                  break L1;
                } else {
                  L2: {
                    if (!(((vg) this).field_w instanceof eg)) {
                      break L2;
                    } else {
                      var5 = (eg) (Object) ((vg) this).field_w;
                      var6 = var5.a((rc) this, 0, gb.field_j, ad.field_m, param2, param0);
                      if (-1 != var6) {
                        L3: {
                          if (!((vg) this).field_U) {
                            break L3;
                          } else {
                            if (var6 >= ((vg) this).field_R) {
                              break L3;
                            } else {
                              if (var6 <= ((vg) this).field_O) {
                                break L3;
                              } else {
                                var6 = ((vg) this).field_R;
                                break L3;
                              }
                            }
                          }
                        }
                        ((vg) this).field_K = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((vg) this).field_V = je.a(param1 ^ 18875);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("vg.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static void a() {
        if (!sg.b((byte) -107)) {
            return;
        }
        hc.a(false, true, 4);
    }

    private final void d() {
        jf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eg var10 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        if (!((vg) this).field_S) {
          ((vg) this).field_q = 0;
          ((vg) this).field_k = 0;
          return;
        } else {
          if (((vg) this).field_w instanceof eg) {
            var10 = (eg) (Object) ((vg) this).field_w;
            var3 = var10.a(-21480, (rc) this);
            var6 = 0;
            var4 = var3.b(62);
            var5 = var10.b(265, (rc) this);
            var7 = var10.a(3) >> 1;
            if (-var7 + var5 > var4) {
              ((vg) this).field_q = 0;
              ((vg) this).field_k = 0;
              return;
            } else {
              var8 = ((vg) this).field_k - -var3.a(0, ((vg) this).field_K);
              if (-var7 + var5 >= var8) {
                if (var7 <= var8) {
                  if (((vg) this).field_k <= 0) {
                    if (((vg) this).field_k >= -var5 + var7) {
                      return;
                    } else {
                      ((vg) this).field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    ((vg) this).field_k = 0;
                    return;
                  }
                } else {
                  ((vg) this).field_k = var7 - var8 + ((vg) this).field_k;
                  if (((vg) this).field_k <= 0) {
                    if (((vg) this).field_k >= -var5 + var7) {
                      return;
                    } else {
                      ((vg) this).field_k = var7 + -var5;
                      return;
                    }
                  } else {
                    ((vg) this).field_k = 0;
                    return;
                  }
                }
              } else {
                ((vg) this).field_k = ((vg) this).field_k - (var8 + var7 + -var5);
                if (((vg) this).field_k <= 0) {
                  if (((vg) this).field_k >= -var5 + var7) {
                    return;
                  } else {
                    ((vg) this).field_k = var7 + -var5;
                    return;
                  }
                } else {
                  ((vg) this).field_k = 0;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_72_0 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        try {
          L0: {
            ((vg) this).field_V = je.a(1);
            if (60 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param0 < 32) {
                    break L1;
                  } else {
                    if (param0 <= 126) {
                      L2: {
                        if (((vg) this).field_O == ((vg) this).field_K) {
                          break L2;
                        } else {
                          int discarded$11 = 11002;
                          this.p();
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if (-1 == ((vg) this).field_Q) {
                            break L4;
                          } else {
                            if (((vg) this).field_i.length() >= ((vg) this).field_Q) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (((vg) this).field_K >= ((vg) this).field_i.length()) {
                            ((vg) this).field_i = ((vg) this).field_i + param0;
                            int dupTemp$12 = ((vg) this).field_i.length();
                            ((vg) this).field_K = dupTemp$12;
                            ((vg) this).field_O = dupTemp$12;
                            break L5;
                          } else {
                            ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_K) + param0 + ((vg) this).field_i.substring(((vg) this).field_K, ((vg) this).field_i.length());
                            ((vg) this).field_K = ((vg) this).field_K + 1;
                            ((vg) this).field_O = ((vg) this).field_K;
                            break L5;
                          }
                        }
                        ((vg) this).j(111);
                        break L3;
                      }
                      stackOut_72_0 = 1;
                      stackIn_73_0 = stackOut_72_0;
                      return stackIn_73_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if (85 != param2) {
                    if (param2 != 101) {
                      if (param2 != 13) {
                        if (param2 == 96) {
                          if (0 >= ((vg) this).field_K) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_58_0 = this;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_59_0 = stackOut_58_0;
                              if (!fh.field_d[82]) {
                                stackOut_60_0 = this;
                                stackOut_60_1 = ((vg) this).field_K - 1;
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                break L7;
                              } else {
                                stackOut_59_0 = this;
                                stackOut_59_1 = this.n(117);
                                stackIn_61_0 = stackOut_59_0;
                                stackIn_61_1 = stackOut_59_1;
                                break L7;
                              }
                            }
                            this.b(stackIn_61_1, -6331);
                            stackOut_61_0 = 1;
                            stackIn_62_0 = stackOut_61_0;
                            return stackIn_62_0 != 0;
                          }
                        } else {
                          if (param2 != 97) {
                            if (param2 == 102) {
                              this.b(0, -6331);
                              stackOut_55_0 = 1;
                              stackIn_56_0 = stackOut_55_0;
                              return stackIn_56_0 != 0;
                            } else {
                              if (103 == param2) {
                                this.b(((vg) this).field_i.length(), -6331);
                                stackOut_53_0 = 1;
                                stackIn_54_0 = stackOut_53_0;
                                return stackIn_54_0 != 0;
                              } else {
                                if (param2 == 84) {
                                  int discarded$13 = 1;
                                  this.c();
                                  stackOut_51_0 = 1;
                                  stackIn_52_0 = stackOut_51_0;
                                  return stackIn_52_0 != 0;
                                } else {
                                  L8: {
                                    if (!fh.field_d[82]) {
                                      break L8;
                                    } else {
                                      if (param2 == 65) {
                                        int discarded$14 = 108;
                                        this.m();
                                        stackOut_49_0 = 1;
                                        stackIn_50_0 = stackOut_49_0;
                                        return stackIn_50_0 != 0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!fh.field_d[82]) {
                                      break L9;
                                    } else {
                                      if (param2 != 66) {
                                        break L9;
                                      } else {
                                        int discarded$15 = -1;
                                        this.o();
                                        stackOut_43_0 = 1;
                                        stackIn_44_0 = stackOut_43_0;
                                        return stackIn_44_0 != 0;
                                      }
                                    }
                                  }
                                  if (!fh.field_d[82]) {
                                    break L6;
                                  } else {
                                    if (param2 != 67) {
                                      break L6;
                                    } else {
                                      int discarded$16 = -78;
                                      this.e();
                                      stackOut_47_0 = 1;
                                      stackIn_48_0 = stackOut_47_0;
                                      return stackIn_48_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (((vg) this).field_K >= ((vg) this).field_i.length()) {
                              break L6;
                            } else {
                              L10: {
                                stackOut_30_0 = this;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (!fh.field_d[82]) {
                                  stackOut_32_0 = this;
                                  stackOut_32_1 = 1 + ((vg) this).field_K;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  break L10;
                                } else {
                                  int discarded$17 = 11365;
                                  stackOut_31_0 = this;
                                  stackOut_31_1 = this.k();
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  break L10;
                                }
                              }
                              this.b(stackIn_33_1, -6331);
                              stackOut_33_0 = 1;
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0 != 0;
                            }
                          }
                        }
                      } else {
                        ((vg) this).l(-115);
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0 != 0;
                      }
                    } else {
                      if (((vg) this).field_K == ((vg) this).field_O) {
                        if (((vg) this).field_K < ((vg) this).field_i.length()) {
                          ((vg) this).field_O = ((vg) this).field_K + 1;
                          int discarded$18 = 11002;
                          this.p();
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        } else {
                          break L6;
                        }
                      } else {
                        int discarded$19 = 11002;
                        this.p();
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                    }
                  } else {
                    if (~((vg) this).field_O == ~((vg) this).field_K) {
                      if (0 < ((vg) this).field_K) {
                        ((vg) this).field_O = ((vg) this).field_K + -1;
                        int discarded$20 = 11002;
                        this.p();
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        break L6;
                      }
                    } else {
                      int discarded$21 = 11002;
                      this.p();
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
                var5_int = -50 % ((31 - param1) / 56);
                stackOut_74_0 = 0;
                stackIn_75_0 = stackOut_74_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var5;
            stackOut_76_1 = new StringBuilder().append("vg.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L11;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L11;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 41);
        }
        return stackIn_75_0 != 0;
    }

    public static void i() {
        field_I = null;
        field_J = null;
    }

    private final void p() {
        int var2 = 0;
        int var3 = 0;
        if (((vg) this).field_O != ((vg) this).field_K) {
            var2 = ((vg) this).field_K > ((vg) this).field_O ? ((vg) this).field_O : ((vg) this).field_K;
            var3 = ((vg) this).field_O >= ((vg) this).field_K ? ((vg) this).field_O : ((vg) this).field_K;
            ((vg) this).field_O = var2;
            ((vg) this).field_K = var2;
            ((vg) this).field_i = ((vg) this).field_i.substring(0, var2) + ((vg) this).field_i.substring(var3, ((vg) this).field_i.length());
            ((vg) this).j(-125);
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (((vg) this).field_Q != -1) {
                var3_int = ((vg) this).field_Q + -((vg) this).field_i.length();
                if (0 > var3_int) {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((vg) this).field_K != ((vg) this).field_i.length()) {
                ((vg) this).field_i = ((vg) this).field_i.substring(0, ((vg) this).field_K) + param1 + ((vg) this).field_i.substring(((vg) this).field_K, ((vg) this).field_i.length());
                break L2;
              } else {
                ((vg) this).field_i = ((vg) this).field_i + param1;
                break L2;
              }
            }
            var3_int = -81;
            ((vg) this).field_K = ((vg) this).field_K + param1.length();
            ((vg) this).field_O = ((vg) this).field_K;
            ((vg) this).j(-114);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vg.L(").append(-107).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void a(int param0, ob param1) {
        jd var5 = id.field_c;
        jd var3 = var5;
        var5.e(6, -2147483648);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.c(-104, 1);
        if (null != param1.field_k) {
            var5.c(-126, param1.field_k.length);
            var5.a(8, param1.field_k.length, param1.field_k, 0);
        } else {
            var5.c(126, 0);
        }
        int discarded$0 = var5.b(true, var4);
        var5.field_m = var5.field_m - 4;
        try {
            param1.field_i = var5.e(true);
            var5.b(1, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "vg.R(" + 6 + 44 + (param1 != null ? "{...}" : "null") + 44 + 118 + 41);
        }
    }

    vg(String param0, dg param1, int param2) {
        super(param0, param1);
        ((vg) this).field_R = -1;
        ((vg) this).field_U = false;
        ((vg) this).field_T = 0L;
        try {
            ((vg) this).field_Q = param2;
            ((vg) this).field_w = ph.field_f.field_h;
            ((vg) this).a(-90, true, param0);
            ((vg) this).field_S = true;
            ((vg) this).field_V = je.a(1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "vg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              if (((vg) this).field_w instanceof eg) {
                L1: {
                  var8_int = ((eg) (Object) ((vg) this).field_w).a((rc) this, 0, gb.field_j, ad.field_m, param5, param1);
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (-1 != var8_int) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = var8_int;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  this.b(stackIn_7_1, -6331);
                  var8_long = je.a(1);
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-((vg) this).field_T + var8_long >= 250L) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                L3: {
                  ((vg) this).field_U = stackIn_10_1 != 0;
                  if (((vg) this).field_U) {
                    L4: {
                      ((vg) this).field_O = this.n(126);
                      int discarded$1 = 11365;
                      ((vg) this).field_K = this.k();
                      if (((vg) this).field_K <= 0) {
                        break L4;
                      } else {
                        if (((vg) this).field_i.charAt(((vg) this).field_K - 1) != 32) {
                          break L4;
                        } else {
                          ((vg) this).field_K = ((vg) this).field_K - 1;
                          break L4;
                        }
                      }
                    }
                    ((vg) this).field_R = ((vg) this).field_K;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((vg) this).field_T = var8_long;
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("vg.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    private final void m() {
        int discarded$0 = -1;
        this.o();
        int var2 = 0;
        int discarded$1 = 11002;
        this.p();
    }

    private final void b(int param0, int param1) {
        ((vg) this).field_K = param0;
        if (!fh.field_d[81]) {
            ((vg) this).field_O = ((vg) this).field_K;
            return;
        }
    }

    private final void e() {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                int discarded$1 = 11002;
                this.p();
                this.a(-107, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = ((vg) this).field_i.length();
        if (((vg) this).field_K == var2) {
          return ((vg) this).field_K;
        } else {
          var3 = ((vg) this).field_K + 1;
          L0: while (true) {
            if (var2 > var3) {
              if (((vg) this).field_i.charAt(-1 + var3) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 200;
    }
}
