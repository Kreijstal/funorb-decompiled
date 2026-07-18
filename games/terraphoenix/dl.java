/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    boolean field_d;
    int field_j;
    boolean field_z;
    private int field_q;
    boolean field_a;
    r field_h;
    boolean field_w;
    int field_k;
    static int[] field_f;
    int field_b;
    dl field_C;
    int field_i;
    int field_p;
    int field_t;
    int field_A;
    int field_l;
    static String field_o;
    dl field_c;
    private boolean field_u;
    int field_x;
    boolean field_B;
    int field_g;
    static boolean[] field_y;
    int field_v;
    int field_r;
    dk field_s;
    int field_m;
    int field_e;
    int field_n;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(bb.a((byte) 119, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        if (((dl) this).field_v != -1) {
          if (((dl) this).field_v == 2) {
            return 10000;
          } else {
            if (((dl) this).field_v == 3) {
              return 10000;
            } else {
              L0: {
                if (param0) {
                  L1: {
                    if (((dl) this).field_v != 4) {
                      break L1;
                    } else {
                      if (((dl) this).field_C == null) {
                        return 10000;
                      } else {
                        if (((dl) this).field_C.field_h == null) {
                          L2: {
                            if (0 != param2) {
                              break L2;
                            } else {
                              if (param3 == 1) {
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                          return 10000;
                        } else {
                          return 10000;
                        }
                      }
                    }
                  }
                  if (5 == ((dl) this).field_v) {
                    if (null != ((dl) this).field_c) {
                      if (((dl) this).field_c.field_h != null) {
                        return 10000;
                      } else {
                        L3: {
                          if (param2 != 0) {
                            break L3;
                          } else {
                            if (param3 != -1) {
                              break L3;
                            } else {
                              break L0;
                            }
                          }
                        }
                        return 10000;
                      }
                    } else {
                      return 10000;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L4: {
                var5 = ((dl) this).field_A + param2;
                var6 = param3 + ((dl) this).field_n;
                var7 = 4;
                if (param2 == 0) {
                  break L4;
                } else {
                  if (param3 == 0) {
                    break L4;
                  } else {
                    var7 = 6;
                    break L4;
                  }
                }
              }
              var8 = 0;
              var9 = ((dl) this).field_s.a(110, var6, ((dl) this).field_r, var5);
              if (var9 != null) {
                L5: {
                  L6: {
                    if (((dl) this).field_i == 0) {
                      break L6;
                    } else {
                      if (param0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (!param0) {
                    L7: {
                      if (((dl) this).field_i == 1) {
                        break L7;
                      } else {
                        if (param2 != -1) {
                          break L7;
                        } else {
                          if (0 != param3) {
                            break L7;
                          } else {
                            if ((((dl) this).field_e & 1) != 1) {
                              break L7;
                            } else {
                              return 10000;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (-1 != param2) {
                        break L8;
                      } else {
                        if (param3 != -1) {
                          break L8;
                        } else {
                          L9: {
                            if ((3 & ((dl) this).field_e) == 3) {
                              break L9;
                            } else {
                              if ((((dl) this).field_e & 1) - -(4 & var9.field_e) == 5) {
                                break L9;
                              } else {
                                if ((2 & ((dl) this).field_e) + (8 & var9.field_e) == 10) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          return 10000;
                        }
                      }
                    }
                    L10: {
                      if (((dl) this).field_i == 2) {
                        break L10;
                      } else {
                        if (0 != param2) {
                          break L10;
                        } else {
                          if (-1 != param3) {
                            break L10;
                          } else {
                            if ((((dl) this).field_e & 2) == 2) {
                              return 10000;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      if (1 != param2) {
                        break L11;
                      } else {
                        if (param3 != -1) {
                          break L11;
                        } else {
                          L12: {
                            if ((6 & ((dl) this).field_e) == 6) {
                              break L12;
                            } else {
                              if ((1 & var9.field_e) + (4 & ((dl) this).field_e) == 5) {
                                break L12;
                              } else {
                                if ((8 & var9.field_e) + (((dl) this).field_e & 2) == 10) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          return 10000;
                        }
                      }
                    }
                    L13: {
                      if (((dl) this).field_i == 4) {
                        break L13;
                      } else {
                        if (param2 != 1) {
                          break L13;
                        } else {
                          if (param3 != 0) {
                            break L13;
                          } else {
                            if ((((dl) this).field_e & 4) == 4) {
                              return 10000;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param2 != 1) {
                        break L14;
                      } else {
                        if (param3 != 1) {
                          break L14;
                        } else {
                          L15: {
                            if ((12 & ((dl) this).field_e) == 12) {
                              break L15;
                            } else {
                              if ((var9.field_e & 1) + (4 & ((dl) this).field_e) == 5) {
                                break L15;
                              } else {
                                if ((var9.field_e & 2) + (8 & ((dl) this).field_e) != 10) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          return 10000;
                        }
                      }
                    }
                    L16: {
                      if (((dl) this).field_i == 8) {
                        break L16;
                      } else {
                        if (param2 != 0) {
                          break L16;
                        } else {
                          if (param3 != 1) {
                            break L16;
                          } else {
                            if (8 == (((dl) this).field_e & 8)) {
                              return 10000;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    if (-1 != param2) {
                      break L5;
                    } else {
                      if (1 != param3) {
                        break L5;
                      } else {
                        L17: {
                          if ((((dl) this).field_e & 9) == 9) {
                            break L17;
                          } else {
                            if ((4 & var9.field_e) + (((dl) this).field_e & 1) == 5) {
                              break L17;
                            } else {
                              if ((var9.field_e & 2) + (((dl) this).field_e & 8) != 10) {
                                break L5;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        return 10000;
                      }
                    }
                  } else {
                    L18: {
                      if (param2 != -1) {
                        break L18;
                      } else {
                        if ((((dl) this).field_e & 1) != 1) {
                          break L18;
                        } else {
                          return 10000;
                        }
                      }
                    }
                    L19: {
                      if (param3 != -1) {
                        break L19;
                      } else {
                        if ((2 & ((dl) this).field_e) != 2) {
                          break L19;
                        } else {
                          return 10000;
                        }
                      }
                    }
                    L20: {
                      if (1 != param2) {
                        break L20;
                      } else {
                        if ((4 & ((dl) this).field_e) != 4) {
                          break L20;
                        } else {
                          return 10000;
                        }
                      }
                    }
                    L21: {
                      if (param3 != 1) {
                        break L21;
                      } else {
                        if ((8 & ((dl) this).field_e) != 8) {
                          break L21;
                        } else {
                          return 10000;
                        }
                      }
                    }
                    L22: {
                      if (-1 != param2) {
                        break L22;
                      } else {
                        if ((((dl) this).field_e & 16) == 16) {
                          var8++;
                          var7 = 10;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (param3 != -1) {
                        break L23;
                      } else {
                        if (32 == (((dl) this).field_e & 32)) {
                          var7 = 10;
                          var8++;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (param2 != 1) {
                        break L24;
                      } else {
                        if (64 != (64 & ((dl) this).field_e)) {
                          break L24;
                        } else {
                          var7 = 10;
                          var8++;
                          break L24;
                        }
                      }
                    }
                    if (param3 != 1) {
                      break L5;
                    } else {
                      if ((((dl) this).field_e & 128) == 128) {
                        var7 = 10;
                        var8++;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L25: {
                  if (!param0) {
                    break L25;
                  } else {
                    L26: {
                      if (var9.field_i == 0) {
                        L27: {
                          if (param2 != 1) {
                            break L27;
                          } else {
                            if ((var9.field_e & 1) == 1) {
                              return 10000;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if (param3 != 1) {
                            break L28;
                          } else {
                            if ((2 & var9.field_e) != 2) {
                              break L28;
                            } else {
                              return 10000;
                            }
                          }
                        }
                        L29: {
                          if (param2 != -1) {
                            break L29;
                          } else {
                            if ((var9.field_e & 4) != 4) {
                              break L29;
                            } else {
                              return 10000;
                            }
                          }
                        }
                        L30: {
                          if (param3 != -1) {
                            break L30;
                          } else {
                            if ((var9.field_e & 8) != 8) {
                              break L30;
                            } else {
                              return 10000;
                            }
                          }
                        }
                        L31: {
                          if (param2 != 1) {
                            break L31;
                          } else {
                            if ((var9.field_e & 16) != 16) {
                              break L31;
                            } else {
                              var8++;
                              var7 = 10;
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if (1 != param3) {
                            break L32;
                          } else {
                            if ((32 & var9.field_e) != 32) {
                              break L32;
                            } else {
                              var7 = 10;
                              var8++;
                              break L32;
                            }
                          }
                        }
                        L33: {
                          if (param2 != -1) {
                            break L33;
                          } else {
                            if ((64 & var9.field_e) != 64) {
                              break L33;
                            } else {
                              var7 = 10;
                              var8++;
                              break L33;
                            }
                          }
                        }
                        if (param3 != -1) {
                          break L26;
                        } else {
                          if ((128 & var9.field_e) != 128) {
                            break L26;
                          } else {
                            var7 = 10;
                            var8++;
                            break L26;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                    L34: {
                      if (var8 > 2) {
                        break L34;
                      } else {
                        if (param2 == 0) {
                          break L25;
                        } else {
                          if (param3 == 0) {
                            break L25;
                          } else {
                            if (var8 > 0) {
                              break L34;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                    }
                    return 10000;
                  }
                }
                L35: {
                  if (param0) {
                    if (var9.field_v == 2) {
                      return 10000;
                    } else {
                      if (3 != var9.field_v) {
                        if (var9.field_v == -1) {
                          return 10000;
                        } else {
                          L36: {
                            if (1 == var9.field_v) {
                              var7 += 4;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (var9.field_v != 4) {
                              break L37;
                            } else {
                              if (var9.field_C.field_h != null) {
                                return 10000;
                              } else {
                                L38: {
                                  if (param2 != 0) {
                                    break L38;
                                  } else {
                                    if (param3 == -1) {
                                      break L37;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                                return 10000;
                              }
                            }
                          }
                          L39: {
                            if (5 == var9.field_v) {
                              L40: {
                                if (null != var9.field_c) {
                                  if (null != var9.field_c.field_h) {
                                    return 10000;
                                  } else {
                                    break L40;
                                  }
                                } else {
                                  var9.field_v = 0;
                                  break L40;
                                }
                              }
                              L41: {
                                if (param2 != 0) {
                                  break L41;
                                } else {
                                  if (param3 == 1) {
                                    break L39;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              return 10000;
                            } else {
                              break L39;
                            }
                          }
                          if (null != var9.field_h) {
                            L42: {
                              if (var9.field_h.field_k) {
                                break L42;
                              } else {
                                if (var9.field_h.field_C == 0) {
                                  break L42;
                                } else {
                                  if (!var9.field_s.field_i.field_J) {
                                    break L42;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            return 10000;
                          } else {
                            break L35;
                          }
                        }
                      } else {
                        return 10000;
                      }
                    }
                  } else {
                    break L35;
                  }
                }
                return var7;
              } else {
                return 10000;
              }
            }
          }
        } else {
          return 10000;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          if (param1) {
            break L0;
          } else {
            param0 = param0 << 4;
            break L0;
          }
        }
        L1: {
          var5 = -53 % ((19 - param2) / 59);
          if ((((dl) this).field_e & param0) == param0) {
            ((dl) this).field_e = ((dl) this).field_e - param0;
            break L1;
          } else {
            ((dl) this).field_e = ((dl) this).field_e + param0;
            break L1;
          }
        }
        L2: {
          var4 = null;
          var6 = 0;
          if (param0 != 1) {
            break L2;
          } else {
            if (((dl) this).field_A > 0) {
              var4 = (Object) (Object) ((dl) this).field_s.a(-87, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A);
              var6 = 4;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param0 != 2) {
            break L3;
          } else {
            if (((dl) this).field_n <= 0) {
              break L3;
            } else {
              var4 = (Object) (Object) ((dl) this).field_s.a(-52, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A);
              var6 = 8;
              break L3;
            }
          }
        }
        L4: {
          if (4 != param0) {
            break L4;
          } else {
            if (~((dl) this).field_A <= ~(((dl) this).field_s.field_b - 1)) {
              break L4;
            } else {
              var6 = 1;
              var4 = (Object) (Object) ((dl) this).field_s.a(97, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A);
              break L4;
            }
          }
        }
        L5: {
          if (8 != param0) {
            break L5;
          } else {
            if (~(((dl) this).field_s.field_e - 1) >= ~((dl) this).field_n) {
              break L5;
            } else {
              var6 = 2;
              var4 = (Object) (Object) ((dl) this).field_s.a(87, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A);
              break L5;
            }
          }
        }
        L6: {
          if (param0 != 16) {
            break L6;
          } else {
            if (((dl) this).field_A <= 0) {
              break L6;
            } else {
              var4 = (Object) (Object) ((dl) this).field_s.a(110, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1);
              var6 = 64;
              break L6;
            }
          }
        }
        L7: {
          if (param0 != 32) {
            break L7;
          } else {
            if (((dl) this).field_n > 0) {
              var4 = (Object) (Object) ((dl) this).field_s.a(94, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A);
              var6 = 128;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (64 != param0) {
            break L8;
          } else {
            if (~(-1 + ((dl) this).field_s.field_b) >= ~((dl) this).field_A) {
              break L8;
            } else {
              var6 = 16;
              var4 = (Object) (Object) ((dl) this).field_s.a(-119, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1);
              break L8;
            }
          }
        }
        L9: {
          if (128 != param0) {
            break L9;
          } else {
            if (~((dl) this).field_n > ~(((dl) this).field_s.field_e + -1)) {
              var6 = 32;
              var4 = (Object) (Object) ((dl) this).field_s.a(-85, ((dl) this).field_n - -1, ((dl) this).field_r, ((dl) this).field_A);
              break L9;
            } else {
              break L9;
            }
          }
        }
        L10: {
          if (var4 == null) {
            break L10;
          } else {
            if ((var6 & ((dl) var4).field_e) == var6) {
              ((dl) var4).field_e = ((dl) var4).field_e - var6;
              break L10;
            } else {
              ((dl) var4).field_e = ((dl) var4).field_e + var6;
              break L10;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            if (param1 != -6242) {
                dl.b(-103);
            }
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= 0) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(bb.a((byte) 124, var5, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param2 >= -105) {
            ((dl) this).field_i = -65;
        }
        return this.a(true, (byte) -14, param1, param0);
    }

    final void a(boolean param0) {
        if (-1 != ((dl) this).field_b) {
            ((dl) this).field_b = ck.field_f[((dl) this).field_b];
        }
        if (!(((dl) this).field_j < 0)) {
            ((dl) this).field_j = hb.field_h[((dl) this).field_j];
            if (!(((dl) this).field_j <= -1)) {
                ((dl) this).field_v = nc.field_a[((dl) this).field_j];
            }
        }
        if (param0) {
            ((dl) this).field_n = 46;
        }
    }

    public static void b(int param0) {
        if (param0 != -32) {
            Object var2 = null;
            dl.a((java.applet.Applet) null, -53);
        }
        field_o = null;
        field_y = null;
        field_f = null;
    }

    final int a(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          var5 = this;
          if (param1 == 1000) {
            break L0;
          } else {
            ((dl) this).field_h = null;
            break L0;
          }
        }
        L1: while (true) {
          if (param2 > ((dl) var5).field_r) {
            var5 = (Object) (Object) ((dl) var5).field_C;
            if (var5 == null) {
              return 1000;
            } else {
              continue L1;
            }
          } else {
            return ((dl) var5).a(true, (byte) -14, param3, param0);
          }
        }
    }

    private final void a(int param0, int param1, ci param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (param4 == 256) {
              param2.b(param0, param1);
              return;
            } else {
              L1: {
                param1 = param1 + param2.field_v;
                if (param3 == 17335) {
                  break L1;
                } else {
                  ((dl) this).field_r = -16;
                  break L1;
                }
              }
              L2: {
                param0 = param0 + param2.field_p;
                var6_int = param0 + param1 * l.field_k;
                var7 = 0;
                var8 = param2.field_t;
                var9 = param2.field_r;
                var10 = l.field_k + -var9;
                if (param1 < l.field_d) {
                  var12 = l.field_d + -param1;
                  param1 = l.field_d;
                  var8 = var8 - var12;
                  var6_int = var6_int + var12 * l.field_k;
                  var7 = var7 + var9 * var12;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var11 = 0;
                if (l.field_c >= var8 + param1) {
                  break L3;
                } else {
                  var8 = var8 - (-l.field_c + var8 + param1);
                  break L3;
                }
              }
              L4: {
                if (l.field_b > param0) {
                  var12 = l.field_b - param0;
                  var9 = var9 - var12;
                  var7 = var7 + var12;
                  var10 = var10 + var12;
                  var6_int = var6_int + var12;
                  var11 = var11 + var12;
                  param0 = l.field_b;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 + param0 > l.field_f) {
                  var12 = -l.field_f + (param0 - -var9);
                  var9 = var9 - var12;
                  var10 = var10 + var12;
                  var11 = var11 + var12;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var9 <= 0) {
                  break L6;
                } else {
                  if (0 < var8) {
                    qc.a(l.field_i, var10, param2.field_z, var7, param4, var11, var8, param3 ^ 16729015, 0, var9, var6_int);
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6;
            stackOut_23_1 = new StringBuilder().append("dl.K(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (!(param1 != 0)) {
            return this.a(false, (byte) -14, 1, 0);
        }
        if (!(param1 != 1)) {
            return this.a(false, (byte) -14, 1, 1);
        }
        if (2 == param1) {
            return this.a(false, (byte) -14, 0, 1);
        }
        if (!(3 != param1)) {
            return this.a(false, (byte) -14, -1, 1);
        }
        int var3 = -62 % ((param0 - -46) / 50);
        if (!(param1 != 4)) {
            return this.a(false, (byte) -14, -1, 0);
        }
        if (param1 == 5) {
            return this.a(false, (byte) -14, -1, -1);
        }
        if (!(param1 != 6)) {
            return this.a(false, (byte) -14, 0, -1);
        }
        if (!(param1 != 7)) {
            return this.a(false, (byte) -14, 1, -1);
        }
        return 1000;
    }

    final int a(int param0, int param1, gi[] param2, int param3, byte param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_53_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_332_0 = 0;
        Object stackIn_427_0 = null;
        int stackIn_427_1 = 0;
        int stackIn_427_2 = 0;
        ci stackIn_427_3 = null;
        int stackIn_427_4 = 0;
        Object stackIn_428_0 = null;
        int stackIn_428_1 = 0;
        int stackIn_428_2 = 0;
        ci stackIn_428_3 = null;
        int stackIn_428_4 = 0;
        Object stackIn_429_0 = null;
        int stackIn_429_1 = 0;
        int stackIn_429_2 = 0;
        ci stackIn_429_3 = null;
        int stackIn_429_4 = 0;
        Object stackIn_430_0 = null;
        int stackIn_430_1 = 0;
        int stackIn_430_2 = 0;
        ci stackIn_430_3 = null;
        int stackIn_430_4 = 0;
        Object stackIn_431_0 = null;
        int stackIn_431_1 = 0;
        int stackIn_431_2 = 0;
        ci stackIn_431_3 = null;
        int stackIn_431_4 = 0;
        int stackIn_431_5 = 0;
        Object stackIn_433_0 = null;
        int stackIn_433_1 = 0;
        int stackIn_433_2 = 0;
        ci stackIn_433_3 = null;
        int stackIn_433_4 = 0;
        Object stackIn_434_0 = null;
        int stackIn_434_1 = 0;
        int stackIn_434_2 = 0;
        ci stackIn_434_3 = null;
        int stackIn_434_4 = 0;
        Object stackIn_435_0 = null;
        int stackIn_435_1 = 0;
        int stackIn_435_2 = 0;
        ci stackIn_435_3 = null;
        int stackIn_435_4 = 0;
        Object stackIn_436_0 = null;
        int stackIn_436_1 = 0;
        int stackIn_436_2 = 0;
        ci stackIn_436_3 = null;
        int stackIn_436_4 = 0;
        Object stackIn_437_0 = null;
        int stackIn_437_1 = 0;
        int stackIn_437_2 = 0;
        ci stackIn_437_3 = null;
        int stackIn_437_4 = 0;
        int stackIn_437_5 = 0;
        Object stackIn_440_0 = null;
        int stackIn_440_1 = 0;
        int stackIn_440_2 = 0;
        ci stackIn_440_3 = null;
        int stackIn_440_4 = 0;
        Object stackIn_441_0 = null;
        int stackIn_441_1 = 0;
        int stackIn_441_2 = 0;
        ci stackIn_441_3 = null;
        int stackIn_441_4 = 0;
        Object stackIn_442_0 = null;
        int stackIn_442_1 = 0;
        int stackIn_442_2 = 0;
        ci stackIn_442_3 = null;
        int stackIn_442_4 = 0;
        Object stackIn_443_0 = null;
        int stackIn_443_1 = 0;
        int stackIn_443_2 = 0;
        ci stackIn_443_3 = null;
        int stackIn_443_4 = 0;
        Object stackIn_444_0 = null;
        int stackIn_444_1 = 0;
        int stackIn_444_2 = 0;
        ci stackIn_444_3 = null;
        int stackIn_444_4 = 0;
        int stackIn_444_5 = 0;
        Object stackIn_446_0 = null;
        int stackIn_446_1 = 0;
        int stackIn_446_2 = 0;
        ci stackIn_446_3 = null;
        int stackIn_446_4 = 0;
        Object stackIn_447_0 = null;
        int stackIn_447_1 = 0;
        int stackIn_447_2 = 0;
        ci stackIn_447_3 = null;
        int stackIn_447_4 = 0;
        Object stackIn_448_0 = null;
        int stackIn_448_1 = 0;
        int stackIn_448_2 = 0;
        ci stackIn_448_3 = null;
        int stackIn_448_4 = 0;
        Object stackIn_449_0 = null;
        int stackIn_449_1 = 0;
        int stackIn_449_2 = 0;
        ci stackIn_449_3 = null;
        int stackIn_449_4 = 0;
        Object stackIn_450_0 = null;
        int stackIn_450_1 = 0;
        int stackIn_450_2 = 0;
        ci stackIn_450_3 = null;
        int stackIn_450_4 = 0;
        int stackIn_450_5 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_322_0 = 0;
        int stackOut_330_0 = 0;
        int stackOut_331_0 = 0;
        Object stackOut_445_0 = null;
        int stackOut_445_1 = 0;
        int stackOut_445_2 = 0;
        ci stackOut_445_3 = null;
        int stackOut_445_4 = 0;
        Object stackOut_449_0 = null;
        int stackOut_449_1 = 0;
        int stackOut_449_2 = 0;
        ci stackOut_449_3 = null;
        int stackOut_449_4 = 0;
        int stackOut_449_5 = 0;
        Object stackOut_446_0 = null;
        int stackOut_446_1 = 0;
        int stackOut_446_2 = 0;
        ci stackOut_446_3 = null;
        int stackOut_446_4 = 0;
        Object stackOut_448_0 = null;
        int stackOut_448_1 = 0;
        int stackOut_448_2 = 0;
        ci stackOut_448_3 = null;
        int stackOut_448_4 = 0;
        int stackOut_448_5 = 0;
        Object stackOut_447_0 = null;
        int stackOut_447_1 = 0;
        int stackOut_447_2 = 0;
        ci stackOut_447_3 = null;
        int stackOut_447_4 = 0;
        int stackOut_447_5 = 0;
        Object stackOut_439_0 = null;
        int stackOut_439_1 = 0;
        int stackOut_439_2 = 0;
        ci stackOut_439_3 = null;
        int stackOut_439_4 = 0;
        Object stackOut_443_0 = null;
        int stackOut_443_1 = 0;
        int stackOut_443_2 = 0;
        ci stackOut_443_3 = null;
        int stackOut_443_4 = 0;
        int stackOut_443_5 = 0;
        Object stackOut_440_0 = null;
        int stackOut_440_1 = 0;
        int stackOut_440_2 = 0;
        ci stackOut_440_3 = null;
        int stackOut_440_4 = 0;
        Object stackOut_442_0 = null;
        int stackOut_442_1 = 0;
        int stackOut_442_2 = 0;
        ci stackOut_442_3 = null;
        int stackOut_442_4 = 0;
        int stackOut_442_5 = 0;
        Object stackOut_441_0 = null;
        int stackOut_441_1 = 0;
        int stackOut_441_2 = 0;
        ci stackOut_441_3 = null;
        int stackOut_441_4 = 0;
        int stackOut_441_5 = 0;
        Object stackOut_432_0 = null;
        int stackOut_432_1 = 0;
        int stackOut_432_2 = 0;
        ci stackOut_432_3 = null;
        int stackOut_432_4 = 0;
        Object stackOut_436_0 = null;
        int stackOut_436_1 = 0;
        int stackOut_436_2 = 0;
        ci stackOut_436_3 = null;
        int stackOut_436_4 = 0;
        int stackOut_436_5 = 0;
        Object stackOut_433_0 = null;
        int stackOut_433_1 = 0;
        int stackOut_433_2 = 0;
        ci stackOut_433_3 = null;
        int stackOut_433_4 = 0;
        Object stackOut_435_0 = null;
        int stackOut_435_1 = 0;
        int stackOut_435_2 = 0;
        ci stackOut_435_3 = null;
        int stackOut_435_4 = 0;
        int stackOut_435_5 = 0;
        Object stackOut_434_0 = null;
        int stackOut_434_1 = 0;
        int stackOut_434_2 = 0;
        ci stackOut_434_3 = null;
        int stackOut_434_4 = 0;
        int stackOut_434_5 = 0;
        Object stackOut_426_0 = null;
        int stackOut_426_1 = 0;
        int stackOut_426_2 = 0;
        ci stackOut_426_3 = null;
        int stackOut_426_4 = 0;
        Object stackOut_428_0 = null;
        int stackOut_428_1 = 0;
        int stackOut_428_2 = 0;
        ci stackOut_428_3 = null;
        int stackOut_428_4 = 0;
        Object stackOut_430_0 = null;
        int stackOut_430_1 = 0;
        int stackOut_430_2 = 0;
        ci stackOut_430_3 = null;
        int stackOut_430_4 = 0;
        int stackOut_430_5 = 0;
        Object stackOut_429_0 = null;
        int stackOut_429_1 = 0;
        int stackOut_429_2 = 0;
        ci stackOut_429_3 = null;
        int stackOut_429_4 = 0;
        int stackOut_429_5 = 0;
        Object stackOut_427_0 = null;
        int stackOut_427_1 = 0;
        int stackOut_427_2 = 0;
        ci stackOut_427_3 = null;
        int stackOut_427_4 = 0;
        int stackOut_427_5 = 0;
        var13 = Terraphoenix.field_V;
        if (param4 == 125) {
          L0: {
            if (null == u.field_a) {
              u.field_a = new ci(128, 160);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var7_int = 0;
            if (((dl) this).field_s.field_i == null) {
              break L1;
            } else {
              L2: {
                if (((dl) this).field_s.field_m != 1) {
                  break L2;
                } else {
                  if (((dl) this).field_r == 0) {
                    if (!((dl) this).field_d) {
                      var7_int = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (2 != ((dl) this).field_s.field_m) {
                  break L3;
                } else {
                  if (((dl) this).field_r != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (Math.abs(((dl) this).field_A - ((dl) this).field_s.field_b / 2) >= ((dl) this).field_s.field_b / 2 - 5) {
                        break L4;
                      } else {
                        if (~Math.abs(((dl) this).field_n + -(((dl) this).field_s.field_e / 2)) > ~(-5 + ((dl) this).field_s.field_e / 2)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7_int = 1;
                    break L3;
                  }
                }
              }
              L5: {
                if (3 != ((dl) this).field_s.field_m) {
                  break L5;
                } else {
                  if (((dl) this).field_r != 1) {
                    break L5;
                  } else {
                    if (((dl) this).field_A >= 12) {
                      break L5;
                    } else {
                      if (12 > ((dl) this).field_n) {
                        var7_int = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              if (((dl) this).field_s.field_m != 4) {
                break L1;
              } else {
                if (((dl) this).field_r != 2) {
                  break L1;
                } else {
                  if (5 != ((dl) this).field_b) {
                    var7_int = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L6: {
            if (((dl) this).field_p <= 0) {
              break L6;
            } else {
              if (null != ((dl) this).field_s.field_i.field_K) {
                break L6;
              } else {
                ((dl) this).field_p = ((dl) this).field_p - 4;
                break L6;
              }
            }
          }
          L7: {
            if (!d.field_H) {
              break L7;
            } else {
              if (~((dl) this).field_r != ~tg.field_l) {
                break L7;
              } else {
                L8: {
                  var9 = null;
                  if (!param5) {
                    break L8;
                  } else {
                    if (tg.field_l != ((dl) this).field_r) {
                      break L8;
                    } else {
                      var9 = (Object) (Object) oi.field_J;
                      oi.field_J.a();
                      l.f(0, 0, 128, 160, 0);
                      k.field_f.a(0);
                      break L8;
                    }
                  }
                }
                var8 = -(((dl) this).field_l * 48 / 100) + param3;
                if (tg.field_l >= ((dl) this).field_r) {
                  L9: {
                    if (dh.field_j) {
                      break L9;
                    } else {
                      if (~tg.field_l != ~((dl) this).field_r) {
                        L10: {
                          if (((dl) this).field_C == null) {
                            break L10;
                          } else {
                            param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                            param5 = false;
                            break L10;
                          }
                        }
                        return param1;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var10 = 1;
                    if (tg.field_l > ((dl) this).field_r) {
                      L12: {
                        if (((dl) this).field_u) {
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L12;
                        } else {
                          stackOut_51_0 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L12;
                        }
                      }
                      var10 = stackIn_53_0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L13: {
                    if (var10 != 0) {
                      L14: {
                        if (((dl) this).field_z) {
                          break L14;
                        } else {
                          if (((dl) this).field_a) {
                            break L14;
                          } else {
                            L15: {
                              var11_int = ((dl) this).field_b;
                              if (var11_int >= 0) {
                                break L15;
                              } else {
                                L16: {
                                  if (((dl) this).field_v == 0) {
                                    break L16;
                                  } else {
                                    if (4 == ((dl) this).field_v) {
                                      break L16;
                                    } else {
                                      if (((dl) this).field_v == 5) {
                                        break L16;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                var11_int = 0;
                                break L15;
                              }
                            }
                            L17: {
                              if (var11_int < 0) {
                                if (var9 != null) {
                                  ((ci) var9).a();
                                  l.a(32, 124, 16777215);
                                  l.a(64, 108, 16777215);
                                  l.a(64, 139, 16777215);
                                  l.a(95, 124, 16777215);
                                  k.field_f.a(0);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              } else {
                                L18: {
                                  var12 = 43520;
                                  if (((dl) this).field_v == 1) {
                                    var12 = 32768;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (((dl) this).field_v != 2) {
                                    break L19;
                                  } else {
                                    var12 = 16776960;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (((dl) this).field_v != 3) {
                                    break L20;
                                  } else {
                                    var12 = 16711680;
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (((dl) this).field_v != 4) {
                                    break L21;
                                  } else {
                                    var12 = 16777215;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (((dl) this).field_v == 5) {
                                    var12 = 16777215;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                L23: {
                                  if (((dl) this).field_d) {
                                    var12 = 0;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                L24: {
                                  if (var9 != null) {
                                    ((ci) var9).a();
                                    aj.field_a[var11_int].b(32, 108, var12);
                                    k.field_f.a(0);
                                    break L24;
                                  } else {
                                    aj.field_a[var11_int].b(-32 + param0, var8 + -16, var12);
                                    break L24;
                                  }
                                }
                                L25: {
                                  if (((dl) this).field_s.field_i == null) {
                                    break L25;
                                  } else {
                                    if (((dl) this).field_b < 0) {
                                      break L25;
                                    } else {
                                      ((dl) this).field_s.field_i.a(param0 + -32, -16 + var8, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                                      break L17;
                                    }
                                  }
                                }
                                break L17;
                              }
                            }
                            L26: {
                              L27: {
                                if (null == ((dl) this).field_s.a(115, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A)) {
                                  break L27;
                                } else {
                                  if (((dl) this).field_s.a(-36, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_a) {
                                    break L27;
                                  } else {
                                    if (((dl) this).field_s.a(108, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_d) {
                                      stackOut_95_0 = 0;
                                      stackIn_96_0 = stackOut_95_0;
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              stackOut_94_0 = 256;
                              stackIn_96_0 = stackOut_94_0;
                              break L26;
                            }
                            L28: {
                              var12 = stackIn_96_0;
                              if (((dl) this).field_g < 0) {
                                break L28;
                              } else {
                                if (var12 <= 0) {
                                  break L28;
                                } else {
                                  dm.field_a[((dl) this).field_g].a(param0 - 32, -64 + var8, 128);
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              L30: {
                                if (((dl) this).field_s.a(93, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                  break L30;
                                } else {
                                  if (((dl) this).field_s.a(-86, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_a) {
                                    break L30;
                                  } else {
                                    if (((dl) this).field_s.a(param4 + -198, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_d) {
                                      stackOut_104_0 = 0;
                                      stackIn_105_0 = stackOut_104_0;
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                              stackOut_103_0 = 256;
                              stackIn_105_0 = stackOut_103_0;
                              break L29;
                            }
                            var12 = stackIn_105_0;
                            if (((dl) this).field_k >= 0) {
                              if (var12 > 0) {
                                bk.field_a[((dl) this).field_k].a(-32 + param0, var8 - 64, 128);
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L31: {
                        ((dl) this).field_a = true;
                        var11_int = ((dl) this).field_b;
                        if (var11_int >= 0) {
                          break L31;
                        } else {
                          L32: {
                            if (0 == ((dl) this).field_v) {
                              break L32;
                            } else {
                              if (((dl) this).field_v == 4) {
                                break L32;
                              } else {
                                if (((dl) this).field_v == 5) {
                                  break L32;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                          var11_int = 0;
                          break L31;
                        }
                      }
                      L33: {
                        if (0 <= var11_int) {
                          L34: {
                            var12 = 65280;
                            if (1 != ((dl) this).field_v) {
                              break L34;
                            } else {
                              var12 = 32768;
                              break L34;
                            }
                          }
                          L35: {
                            if (((dl) this).field_v == 2) {
                              var12 = 16776960;
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (3 == ((dl) this).field_v) {
                              var12 = 16711680;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (((dl) this).field_v != 4) {
                              break L37;
                            } else {
                              var12 = 16777215;
                              break L37;
                            }
                          }
                          L38: {
                            if (((dl) this).field_v != 5) {
                              break L38;
                            } else {
                              var12 = 16777215;
                              break L38;
                            }
                          }
                          L39: {
                            if (var9 == null) {
                              aj.field_a[var11_int].b(-32 + param0, var8 - 16, var12);
                              break L39;
                            } else {
                              ((ci) var9).a();
                              aj.field_a[var11_int].b(32, 108, var12);
                              k.field_f.a(0);
                              break L39;
                            }
                          }
                          if (((dl) this).field_s.field_i == null) {
                            break L33;
                          } else {
                            if (0 <= ((dl) this).field_b) {
                              ((dl) this).field_s.field_i.a(-32 + param0, -16 + var8, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        } else {
                          if (var9 != null) {
                            ((ci) var9).a();
                            l.a(32, 124, 16777215);
                            l.a(64, 108, 16777215);
                            l.a(64, 139, 16777215);
                            l.a(95, 124, 16777215);
                            k.field_f.a(0);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if (ll.field_c) {
                        L40: {
                          if (((dl) this).field_g >= 0) {
                            if (((dl) this).field_g % 4 == 0) {
                              L41: {
                                var12 = 0;
                                if (((dl) this).field_s.a(param4 + 2, ((dl) this).field_n - 1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                  break L41;
                                } else {
                                  if (((dl) this).field_s.a(-35, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g != 3 + ((dl) this).field_g) {
                                    break L41;
                                  } else {
                                    var12++;
                                    break L41;
                                  }
                                }
                              }
                              L42: {
                                if (null == ((dl) this).field_s.a(96, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A)) {
                                  break L42;
                                } else {
                                  if (~((dl) this).field_s.a(108, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g == ~(3 + ((dl) this).field_g)) {
                                    var12 += 2;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              L43: {
                                if (var12 == 3) {
                                  L44: {
                                    var12 = 0;
                                    ((dl) this).field_g = ((dl) this).field_g + 3;
                                    if ((((dl) this).field_e & 16) != 16) {
                                      break L44;
                                    } else {
                                      ((dl) this).a(1, false, 86);
                                      break L44;
                                    }
                                  }
                                  if ((1 & ((dl) this).field_e) == 1) {
                                    ((dl) this).a(1, true, 107);
                                    ((dl) this).a(1, false, -92);
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                } else {
                                  break L43;
                                }
                              }
                              dm.field_a[var12 + ((dl) this).field_g].a(param0 + -32, var8 + -64, 128);
                              break L40;
                            } else {
                              dm.field_a[((dl) this).field_g].a(param0 - 32, -64 + var8, 128);
                              break L40;
                            }
                          } else {
                            break L40;
                          }
                        }
                        if (((dl) this).field_k >= 0) {
                          if (0 == ((dl) this).field_k % 4) {
                            L45: {
                              var12 = 0;
                              if (((dl) this).field_s.a(-29, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A) == null) {
                                break L45;
                              } else {
                                if (((dl) this).field_s.a(81, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1).field_k != 3 + ((dl) this).field_k) {
                                  break L45;
                                } else {
                                  var12++;
                                  break L45;
                                }
                              }
                            }
                            L46: {
                              if (((dl) this).field_s.a(96, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A) == null) {
                                break L46;
                              } else {
                                if (~((dl) this).field_s.a(116, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1).field_k != ~(((dl) this).field_k + 3)) {
                                  break L46;
                                } else {
                                  var12 += 2;
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              if (var12 == 3) {
                                L48: {
                                  var12 = 0;
                                  ((dl) this).field_k = ((dl) this).field_k + 3;
                                  if ((32 & ((dl) this).field_e) != 32) {
                                    break L48;
                                  } else {
                                    ((dl) this).a(2, false, -63);
                                    break L48;
                                  }
                                }
                                if (2 == (2 & ((dl) this).field_e)) {
                                  ((dl) this).a(2, true, 112);
                                  ((dl) this).a(2, false, 90);
                                  break L47;
                                } else {
                                  break L47;
                                }
                              } else {
                                break L47;
                              }
                            }
                            bk.field_a[((dl) this).field_k + var12].a(param0 + -32, var8 - 64, 128);
                            break L13;
                          } else {
                            bk.field_a[((dl) this).field_k].a(param0 - 32, -64 + var8, 128);
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L49: {
                    if (((dl) this).field_p <= 0) {
                      break L49;
                    } else {
                      li.field_a = true;
                      if (((dl) this).field_p >= 64) {
                        break L49;
                      } else {
                        l.b(param0, -24 + var8, 32, 16777215, 4 * ((dl) this).field_p);
                        break L49;
                      }
                    }
                  }
                  L50: {
                    L51: {
                      if (((dl) this).field_z) {
                        break L51;
                      } else {
                        if (((dl) this).field_a) {
                          break L51;
                        } else {
                          if (!((dl) this).field_d) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                    }
                    if (((dl) this).field_v != 1) {
                      break L50;
                    } else {
                      if (((dl) this).field_j != 7) {
                        kg.field_r[((dl) this).field_j].a(-32 + param0, var8 - 64, 128);
                        break L50;
                      } else {
                        se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length].a(-32 + param0, -112 + var8, 128);
                        break L50;
                      }
                    }
                  }
                  L52: {
                    if (null != ((dl) this).field_C) {
                      int discarded$2 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                  L53: {
                    if (var9 != null) {
                      L54: {
                        L55: {
                          u.field_a.a();
                          ((ci) var9).d(0, 0);
                          if (((dl) this).field_s.field_i == null) {
                            break L55;
                          } else {
                            if (((dl) this).field_s.field_i.field_L > 0) {
                              c.a((byte) -86, u.field_a, 16777215);
                              c.a((byte) -86, u.field_a, 16744576);
                              c.a((byte) -86, u.field_a, 16728128);
                              c.a((byte) -86, u.field_a, 8388608);
                              c.a((byte) -86, u.field_a, 4194304);
                              break L54;
                            } else {
                              break L55;
                            }
                          }
                        }
                        c.a((byte) -86, u.field_a, 16777215);
                        c.a((byte) -86, u.field_a, 8454016);
                        c.a((byte) -86, u.field_a, 4259648);
                        c.a((byte) -86, u.field_a, 32768);
                        c.a((byte) -86, u.field_a, 16384);
                        break L54;
                      }
                      ((ci) var9).b(0, 0, 0);
                      k.field_f.a(0);
                      hb.field_n = var8 + -124;
                      ug.field_b = param0 - 64;
                      ((ci) var9).b(param0 - 64, -124 + var8);
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                  return param1;
                } else {
                  L56: {
                    if (null != ((dl) this).field_C) {
                      param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      param5 = false;
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                  return param1;
                }
              }
            }
          }
          L57: {
            var8 = -(((dl) this).field_l * 48 / 100) + param3;
            var9 = null;
            if (!param5) {
              break L57;
            } else {
              if (tg.field_l != ((dl) this).field_r) {
                break L57;
              } else {
                var9 = (Object) (Object) oi.field_J;
                oi.field_J.a();
                l.f(0, 0, 128, 160, 0);
                k.field_f.a(0);
                break L57;
              }
            }
          }
          if (tg.field_l < ((dl) this).field_r) {
            L58: {
              if (((dl) this).field_h != null) {
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              if (((dl) this).field_C == null) {
                break L59;
              } else {
                param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                break L59;
              }
            }
            return param1;
          } else {
            L60: {
              if (dh.field_j) {
                break L60;
              } else {
                if (((dl) this).field_r != tg.field_l) {
                  L61: {
                    if (null == ((dl) this).field_h) {
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  L62: {
                    if (null == ((dl) this).field_C) {
                      break L62;
                    } else {
                      param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      break L62;
                    }
                  }
                  return param1;
                } else {
                  break L60;
                }
              }
            }
            L63: {
              var10 = 1;
              if (((dl) this).field_r < tg.field_l) {
                L64: {
                  if (((dl) this).field_u) {
                    stackOut_221_0 = 0;
                    stackIn_222_0 = stackOut_221_0;
                    break L64;
                  } else {
                    stackOut_220_0 = 1;
                    stackIn_222_0 = stackOut_220_0;
                    break L64;
                  }
                }
                var10 = stackIn_222_0;
                break L63;
              } else {
                break L63;
              }
            }
            L65: {
              if (var10 == 0) {
                break L65;
              } else {
                L66: {
                  if (((dl) this).field_z) {
                    break L66;
                  } else {
                    if (((dl) this).field_a) {
                      break L66;
                    } else {
                      if (((dl) this).field_s.field_l == null) {
                        L67: {
                          if (!((dl) this).field_d) {
                            L68: {
                              if (0 > ((dl) this).field_b) {
                                if (var9 != null) {
                                  ((ci) var9).a();
                                  l.a(32, 124, 16777215);
                                  l.a(64, 108, 16777215);
                                  l.a(64, 139, 16777215);
                                  l.a(95, 124, 16777215);
                                  k.field_f.a(0);
                                  break L68;
                                } else {
                                  break L68;
                                }
                              } else {
                                L69: {
                                  var11_int = 128;
                                  if (var7_int == 0) {
                                    break L69;
                                  } else {
                                    var11_int = (int)(128.0 + 64.0 * Math.sin((double)((dl) this).field_A + 2.0 * mm.field_f - (double)((dl) this).field_n));
                                    break L69;
                                  }
                                }
                                L70: {
                                  if (var9 == null) {
                                    this.a(param0 + -32, var8 - 16, aj.field_a[((dl) this).field_b], 17335, var11_int);
                                    if (((dl) this).field_q == -1) {
                                      break L70;
                                    } else {
                                      this.a(-32 + param0, var8 + -16, ji.field_j[((dl) this).field_q], param4 + 17210, 128);
                                      break L70;
                                    }
                                  } else {
                                    L71: {
                                      ((ci) var9).a();
                                      this.a(32, 108, aj.field_a[((dl) this).field_b], 17335, var11_int);
                                      if (-1 != ((dl) this).field_q) {
                                        this.a(param0 + -32, var8 - 16, ji.field_j[((dl) this).field_q], param4 ^ 17354, 128);
                                        break L71;
                                      } else {
                                        break L71;
                                      }
                                    }
                                    k.field_f.a(0);
                                    break L70;
                                  }
                                }
                                if (((dl) this).field_s.field_i != null) {
                                  ((dl) this).field_s.field_i.a(-32 + param0, var8 + -16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                                  break L68;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            L72: {
                              if (((dl) this).field_g < 0) {
                                break L72;
                              } else {
                                if (((dl) this).field_g % 4 == 0) {
                                  L73: {
                                    var11_int = 0;
                                    if (null == ((dl) this).field_s.a(param4 ^ -37, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A)) {
                                      break L73;
                                    } else {
                                      if (((dl) this).field_s.a(127, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g != ((dl) this).field_g - -3) {
                                        break L73;
                                      } else {
                                        var11_int++;
                                        break L73;
                                      }
                                    }
                                  }
                                  L74: {
                                    if (((dl) this).field_s.a(param4 ^ 33, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                      break L74;
                                    } else {
                                      if (~((dl) this).field_s.a(param4 ^ 45, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A).field_g != ~(3 + ((dl) this).field_g)) {
                                        break L74;
                                      } else {
                                        var11_int += 2;
                                        break L74;
                                      }
                                    }
                                  }
                                  L75: {
                                    if (var11_int != 3) {
                                      break L75;
                                    } else {
                                      L76: {
                                        var11_int = 0;
                                        ((dl) this).field_g = ((dl) this).field_g + 3;
                                        if ((((dl) this).field_e & 16) == 16) {
                                          ((dl) this).a(1, false, param4 + -45);
                                          break L76;
                                        } else {
                                          break L76;
                                        }
                                      }
                                      if ((1 & ((dl) this).field_e) == 1) {
                                        ((dl) this).a(1, true, 92);
                                        ((dl) this).a(1, false, param4 ^ -22);
                                        break L75;
                                      } else {
                                        break L75;
                                      }
                                    }
                                  }
                                  L77: {
                                    if (var9 == null) {
                                      this.a(-32 + param0, -64 + var8, dm.field_a[var11_int + ((dl) this).field_g], 17335, 64);
                                      break L77;
                                    } else {
                                      ((ci) var9).a();
                                      this.a(32, 60, dm.field_a[((dl) this).field_g - -var11_int], param4 ^ 17354, 64);
                                      k.field_f.a(0);
                                      break L77;
                                    }
                                  }
                                  if (((dl) this).field_s.field_i == null) {
                                    break L72;
                                  } else {
                                    ((dl) this).field_s.field_i.a(param0 + -32, var8 + -64, ((dl) this).field_r, dm.field_a[var11_int + ((dl) this).field_g], true, 28144);
                                    break L72;
                                  }
                                } else {
                                  L78: {
                                    if (var9 != null) {
                                      ((ci) var9).a();
                                      this.a(32, 60, dm.field_a[((dl) this).field_g], 17335, 64);
                                      k.field_f.a(param4 + -125);
                                      break L78;
                                    } else {
                                      this.a(param0 + -32, -64 + var8, dm.field_a[((dl) this).field_g], param4 ^ 17354, 64);
                                      break L78;
                                    }
                                  }
                                  if (((dl) this).field_s.field_i == null) {
                                    break L72;
                                  } else {
                                    ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, 28144);
                                    break L72;
                                  }
                                }
                              }
                            }
                            if (((dl) this).field_k < 0) {
                              break L67;
                            } else {
                              if (((dl) this).field_k % 4 != 0) {
                                L79: {
                                  if (var9 != null) {
                                    ((ci) var9).a();
                                    bk.field_a[((dl) this).field_k].c(32, 60, 128);
                                    k.field_f.a(0);
                                    break L79;
                                  } else {
                                    bk.field_a[((dl) this).field_k].c(-32 + param0, -64 + var8, 128);
                                    break L79;
                                  }
                                }
                                if (((dl) this).field_s.field_i == null) {
                                  break L67;
                                } else {
                                  ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                                  break L67;
                                }
                              } else {
                                L80: {
                                  var11_int = 0;
                                  if (((dl) this).field_s.a(param4 + -25, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + -1) == null) {
                                    break L80;
                                  } else {
                                    if (((dl) this).field_s.a(-104, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_k != 3 + ((dl) this).field_k) {
                                      break L80;
                                    } else {
                                      var11_int++;
                                      break L80;
                                    }
                                  }
                                }
                                L81: {
                                  if (((dl) this).field_s.a(-114, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + 1) == null) {
                                    break L81;
                                  } else {
                                    if (((dl) this).field_s.a(116, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + 1).field_k == ((dl) this).field_k - -3) {
                                      var11_int += 2;
                                      break L81;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                                L82: {
                                  if (var11_int == 3) {
                                    L83: {
                                      var11_int = 0;
                                      ((dl) this).field_k = ((dl) this).field_k + 3;
                                      if ((32 & ((dl) this).field_e) != 32) {
                                        break L83;
                                      } else {
                                        ((dl) this).a(2, false, -94);
                                        break L83;
                                      }
                                    }
                                    if ((2 & ((dl) this).field_e) == 2) {
                                      ((dl) this).a(2, true, 83);
                                      ((dl) this).a(2, false, 96);
                                      break L82;
                                    } else {
                                      break L82;
                                    }
                                  } else {
                                    break L82;
                                  }
                                }
                                L84: {
                                  if (var9 == null) {
                                    bk.field_a[var11_int + ((dl) this).field_k].c(-32 + param0, var8 + -64, 128);
                                    break L84;
                                  } else {
                                    ((ci) var9).a();
                                    bk.field_a[var11_int + ((dl) this).field_k].c(32, 60, 128);
                                    k.field_f.a(0);
                                    break L84;
                                  }
                                }
                                if (((dl) this).field_s.field_i == null) {
                                  break L67;
                                } else {
                                  ((dl) this).field_s.field_i.a(param0 - 32, var8 - 64, ((dl) this).field_r, bk.field_a[var11_int + ((dl) this).field_k], true, 28144);
                                  break L67;
                                }
                              }
                            }
                          } else {
                            L85: {
                              if (0 > ((dl) this).field_b) {
                                break L85;
                              } else {
                                this.a(param0 - 32, -16 + var8, aj.field_a[((dl) this).field_b], 17335, 0);
                                if (null != ((dl) this).field_s.field_i) {
                                  ((dl) this).field_s.field_i.a(param0 - 32, var8 - 16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                                  break L85;
                                } else {
                                  break L85;
                                }
                              }
                            }
                            L86: {
                              L87: {
                                if ((((dl) this).field_i & 1) <= 0) {
                                  break L87;
                                } else {
                                  if (((dl) this).field_s.a(param4 ^ -98, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1).field_a) {
                                    stackOut_323_0 = 192;
                                    stackIn_324_0 = stackOut_323_0;
                                    break L86;
                                  } else {
                                    break L87;
                                  }
                                }
                              }
                              stackOut_322_0 = 0;
                              stackIn_324_0 = stackOut_322_0;
                              break L86;
                            }
                            L88: {
                              var11_int = stackIn_324_0;
                              if (((dl) this).field_g < 0) {
                                break L88;
                              } else {
                                this.a(param0 - 32, -64 + var8, dm.field_a[((dl) this).field_g], 17335, var11_int);
                                if (((dl) this).field_s.field_i != null) {
                                  ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, param4 + 28019);
                                  break L88;
                                } else {
                                  break L88;
                                }
                              }
                            }
                            L89: {
                              L90: {
                                if ((2 & ((dl) this).field_i) <= 0) {
                                  break L90;
                                } else {
                                  if (!((dl) this).field_s.a(116, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_a) {
                                    break L90;
                                  } else {
                                    stackOut_330_0 = 160;
                                    stackIn_332_0 = stackOut_330_0;
                                    break L89;
                                  }
                                }
                              }
                              stackOut_331_0 = 0;
                              stackIn_332_0 = stackOut_331_0;
                              break L89;
                            }
                            var11_int = stackIn_332_0;
                            if (0 <= ((dl) this).field_k) {
                              this.a(param0 - 32, -64 + var8, bk.field_a[((dl) this).field_k], 17335, var11_int);
                              if (((dl) this).field_s.field_i == null) {
                                break L67;
                              } else {
                                ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                                break L67;
                              }
                            } else {
                              break L67;
                            }
                          }
                        }
                        if (((dl) this).field_A != uf.field_c) {
                          break L65;
                        } else {
                          if (~((dl) this).field_n == ~vf.field_a) {
                            break L65;
                          } else {
                            break L65;
                          }
                        }
                      } else {
                        break L66;
                      }
                    }
                  }
                }
                L91: {
                  ((dl) this).field_a = true;
                  if (((dl) this).field_b < 0) {
                    L92: {
                      if (null != ((dl) this).field_s.field_l) {
                        vc.field_f.c("N", param0 + -12, var8, 16711680, -1);
                        break L92;
                      } else {
                        break L92;
                      }
                    }
                    if (var9 != null) {
                      ((ci) var9).a();
                      l.a(32, 124, 16777215);
                      l.a(64, 108, 16777215);
                      l.a(64, 139, 16777215);
                      l.a(95, 124, 16777215);
                      k.field_f.a(0);
                      break L91;
                    } else {
                      break L91;
                    }
                  } else {
                    L93: {
                      var11_int = 256;
                      if (var7_int != 0) {
                        var11_int = (int)(Math.sin((double)((dl) this).field_A + 2.0 * mm.field_f - (double)((dl) this).field_n) * 64.0 + 192.0);
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      if (((dl) this).field_r >= tg.field_l) {
                        break L94;
                      } else {
                        var11_int -= 64;
                        break L94;
                      }
                    }
                    L95: {
                      if (var9 != null) {
                        L96: {
                          ((ci) var9).a();
                          aj.field_a[((dl) this).field_b].c(32, 108, var11_int);
                          if (((dl) this).field_q == -1) {
                            break L96;
                          } else {
                            ji.field_j[((dl) this).field_q].b(32, 108);
                            break L96;
                          }
                        }
                        k.field_f.a(param4 ^ 125);
                        break L95;
                      } else {
                        aj.field_a[((dl) this).field_b].c(param0 - 32, -16 + var8, var11_int);
                        if (((dl) this).field_q == -1) {
                          break L95;
                        } else {
                          ji.field_j[((dl) this).field_q].b(-32 + param0, -16 + var8);
                          break L95;
                        }
                      }
                    }
                    if (null == ((dl) this).field_s.field_i) {
                      break L91;
                    } else {
                      ((dl) this).field_s.field_i.a(param0 + -32, var8 + -16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                      break L91;
                    }
                  }
                }
                L97: {
                  if (uf.field_c != ((dl) this).field_A) {
                    break L97;
                  } else {
                    if (((dl) this).field_n == vf.field_a) {
                      break L97;
                    } else {
                      break L97;
                    }
                  }
                }
                L98: {
                  if (((dl) this).field_s.field_l != null) {
                    if (~((dl) this).field_A != ~uf.field_c) {
                      break L98;
                    } else {
                      if (vf.field_a == ((dl) this).field_n) {
                        L99: {
                          var11_int = 32768;
                          if (((dl) this).field_r == tg.field_l) {
                            var11_int = 65280;
                            break L99;
                          } else {
                            break L99;
                          }
                        }
                        l.d(param0 + -32, -16 + var8, 64, 32, var11_int, 128);
                        break L98;
                      } else {
                        break L98;
                      }
                    }
                  } else {
                    break L98;
                  }
                }
                if (!ll.field_c) {
                  break L65;
                } else {
                  L100: {
                    if (((dl) this).field_g < 0) {
                      break L100;
                    } else {
                      if (((dl) this).field_g % 4 != 0) {
                        L101: {
                          if (var9 == null) {
                            dm.field_a[((dl) this).field_g].c(param0 + -32, var8 - 64, 200);
                            break L101;
                          } else {
                            ((ci) var9).a();
                            dm.field_a[((dl) this).field_g].c(32, 60, 200);
                            k.field_f.a(0);
                            break L101;
                          }
                        }
                        if (((dl) this).field_s.field_i != null) {
                          ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, 28144);
                          break L100;
                        } else {
                          break L100;
                        }
                      } else {
                        L102: {
                          var11_int = 0;
                          if (((dl) this).field_s.a(112, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                            break L102;
                          } else {
                            if (((dl) this).field_s.a(param4 ^ 17, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g == ((dl) this).field_g - -3) {
                              var11_int++;
                              break L102;
                            } else {
                              break L102;
                            }
                          }
                        }
                        L103: {
                          if (null == ((dl) this).field_s.a(89, ((dl) this).field_n - -1, ((dl) this).field_r, ((dl) this).field_A)) {
                            break L103;
                          } else {
                            if (~((dl) this).field_s.a(-121, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g != ~(3 + ((dl) this).field_g)) {
                              break L103;
                            } else {
                              var11_int += 2;
                              break L103;
                            }
                          }
                        }
                        L104: {
                          if (var11_int != 3) {
                            break L104;
                          } else {
                            L105: {
                              var11_int = 0;
                              ((dl) this).field_g = ((dl) this).field_g + 3;
                              if ((((dl) this).field_e & 16) == 16) {
                                ((dl) this).a(1, false, -93);
                                break L105;
                              } else {
                                break L105;
                              }
                            }
                            if ((1 & ((dl) this).field_e) != 1) {
                              break L104;
                            } else {
                              ((dl) this).a(1, true, param4 ^ 18);
                              ((dl) this).a(1, false, param4 + -225);
                              break L104;
                            }
                          }
                        }
                        L106: {
                          if (var9 == null) {
                            dm.field_a[((dl) this).field_g + var11_int].c(-32 + param0, var8 - 64, 200);
                            break L106;
                          } else {
                            ((ci) var9).a();
                            dm.field_a[((dl) this).field_g + var11_int].c(32, 60, 200);
                            k.field_f.a(0);
                            break L106;
                          }
                        }
                        if (((dl) this).field_s.field_i != null) {
                          ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[var11_int + ((dl) this).field_g], true, 28144);
                          break L100;
                        } else {
                          break L100;
                        }
                      }
                    }
                  }
                  if (((dl) this).field_k < 0) {
                    break L65;
                  } else {
                    if (0 != ((dl) this).field_k % 4) {
                      L107: {
                        if (var9 != null) {
                          ((ci) var9).a();
                          bk.field_a[((dl) this).field_k].c(32, 60, 256);
                          k.field_f.a(0);
                          break L107;
                        } else {
                          bk.field_a[((dl) this).field_k].c(param0 - 32, -64 + var8, 256);
                          break L107;
                        }
                      }
                      if (((dl) this).field_s.field_i != null) {
                        ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                        break L65;
                      } else {
                        break L65;
                      }
                    } else {
                      L108: {
                        var11_int = 0;
                        if (null == ((dl) this).field_s.a(-124, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1)) {
                          break L108;
                        } else {
                          if (~((dl) this).field_s.a(83, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + -1).field_k == ~(3 + ((dl) this).field_k)) {
                            var11_int++;
                            break L108;
                          } else {
                            break L108;
                          }
                        }
                      }
                      L109: {
                        if (((dl) this).field_s.a(111, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1) == null) {
                          break L109;
                        } else {
                          if (~((dl) this).field_s.a(-78, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A).field_k != ~(((dl) this).field_k - -3)) {
                            break L109;
                          } else {
                            var11_int += 2;
                            break L109;
                          }
                        }
                      }
                      L110: {
                        if (3 != var11_int) {
                          break L110;
                        } else {
                          L111: {
                            var11_int = 0;
                            ((dl) this).field_k = ((dl) this).field_k + 3;
                            if ((((dl) this).field_e & 32) != 32) {
                              break L111;
                            } else {
                              ((dl) this).a(2, false, 101);
                              break L111;
                            }
                          }
                          if ((((dl) this).field_e & 2) != 2) {
                            break L110;
                          } else {
                            ((dl) this).a(2, true, 121);
                            ((dl) this).a(2, false, -96);
                            break L110;
                          }
                        }
                      }
                      L112: {
                        if (var9 != null) {
                          ((ci) var9).a();
                          bk.field_a[var11_int + ((dl) this).field_k].c(32, 60, 256);
                          k.field_f.a(0);
                          break L112;
                        } else {
                          bk.field_a[((dl) this).field_k + var11_int].c(param0 + -32, var8 + -64, 256);
                          break L112;
                        }
                      }
                      if (null != ((dl) this).field_s.field_i) {
                        ((dl) this).field_s.field_i.a(param0 - 32, var8 - 64, ((dl) this).field_r, bk.field_a[var11_int + ((dl) this).field_k], true, param4 ^ 28045);
                        break L65;
                      } else {
                        break L65;
                      }
                    }
                  }
                }
              }
            }
            L113: {
              if (((dl) this).field_p > 0) {
                li.field_a = true;
                if (((dl) this).field_p < 64) {
                  gi.field_j[-(((dl) this).field_p / 4) + 15].b().a(-32 + param0, var8 + -56, 64, 64, 255);
                  break L113;
                } else {
                  break L113;
                }
              } else {
                break L113;
              }
            }
            L114: {
              if (((dl) this).field_j < 0) {
                break L114;
              } else {
                if (jb.field_a) {
                  L115: {
                    L116: {
                      if (((dl) this).field_z) {
                        break L116;
                      } else {
                        if (null == ((dl) this).field_s.field_l) {
                          if (((dl) this).field_j == 7) {
                            if (var9 == null) {
                              L117: {
                                stackOut_445_0 = this;
                                stackOut_445_1 = param0 + -32;
                                stackOut_445_2 = -112 + var8;
                                stackOut_445_3 = se.field_c[(3 * ((dl) this).field_n + ((dl) this).field_A) % se.field_c.length];
                                stackOut_445_4 = 17335;
                                stackIn_449_0 = stackOut_445_0;
                                stackIn_449_1 = stackOut_445_1;
                                stackIn_449_2 = stackOut_445_2;
                                stackIn_449_3 = stackOut_445_3;
                                stackIn_449_4 = stackOut_445_4;
                                stackIn_446_0 = stackOut_445_0;
                                stackIn_446_1 = stackOut_445_1;
                                stackIn_446_2 = stackOut_445_2;
                                stackIn_446_3 = stackOut_445_3;
                                stackIn_446_4 = stackOut_445_4;
                                if (((dl) this).field_a) {
                                  stackOut_449_0 = this;
                                  stackOut_449_1 = stackIn_449_1;
                                  stackOut_449_2 = stackIn_449_2;
                                  stackOut_449_3 = (ci) (Object) stackIn_449_3;
                                  stackOut_449_4 = stackIn_449_4;
                                  stackOut_449_5 = 256;
                                  stackIn_450_0 = stackOut_449_0;
                                  stackIn_450_1 = stackOut_449_1;
                                  stackIn_450_2 = stackOut_449_2;
                                  stackIn_450_3 = stackOut_449_3;
                                  stackIn_450_4 = stackOut_449_4;
                                  stackIn_450_5 = stackOut_449_5;
                                  break L117;
                                } else {
                                  stackOut_446_0 = this;
                                  stackOut_446_1 = stackIn_446_1;
                                  stackOut_446_2 = stackIn_446_2;
                                  stackOut_446_3 = (ci) (Object) stackIn_446_3;
                                  stackOut_446_4 = stackIn_446_4;
                                  stackIn_448_0 = stackOut_446_0;
                                  stackIn_448_1 = stackOut_446_1;
                                  stackIn_448_2 = stackOut_446_2;
                                  stackIn_448_3 = stackOut_446_3;
                                  stackIn_448_4 = stackOut_446_4;
                                  stackIn_447_0 = stackOut_446_0;
                                  stackIn_447_1 = stackOut_446_1;
                                  stackIn_447_2 = stackOut_446_2;
                                  stackIn_447_3 = stackOut_446_3;
                                  stackIn_447_4 = stackOut_446_4;
                                  if (((dl) this).field_d) {
                                    stackOut_448_0 = this;
                                    stackOut_448_1 = stackIn_448_1;
                                    stackOut_448_2 = stackIn_448_2;
                                    stackOut_448_3 = (ci) (Object) stackIn_448_3;
                                    stackOut_448_4 = stackIn_448_4;
                                    stackOut_448_5 = 0;
                                    stackIn_450_0 = stackOut_448_0;
                                    stackIn_450_1 = stackOut_448_1;
                                    stackIn_450_2 = stackOut_448_2;
                                    stackIn_450_3 = stackOut_448_3;
                                    stackIn_450_4 = stackOut_448_4;
                                    stackIn_450_5 = stackOut_448_5;
                                    break L117;
                                  } else {
                                    stackOut_447_0 = this;
                                    stackOut_447_1 = stackIn_447_1;
                                    stackOut_447_2 = stackIn_447_2;
                                    stackOut_447_3 = (ci) (Object) stackIn_447_3;
                                    stackOut_447_4 = stackIn_447_4;
                                    stackOut_447_5 = 128;
                                    stackIn_450_0 = stackOut_447_0;
                                    stackIn_450_1 = stackOut_447_1;
                                    stackIn_450_2 = stackOut_447_2;
                                    stackIn_450_3 = stackOut_447_3;
                                    stackIn_450_4 = stackOut_447_4;
                                    stackIn_450_5 = stackOut_447_5;
                                    break L117;
                                  }
                                }
                              }
                              this.a(stackIn_450_1, stackIn_450_2, stackIn_450_3, stackIn_450_4, stackIn_450_5);
                              break L115;
                            } else {
                              L118: {
                                ((ci) var9).a();
                                stackOut_439_0 = this;
                                stackOut_439_1 = 32;
                                stackOut_439_2 = 12;
                                stackOut_439_3 = se.field_c[(((dl) this).field_A + 3 * ((dl) this).field_n) % se.field_c.length];
                                stackOut_439_4 = 17335;
                                stackIn_443_0 = stackOut_439_0;
                                stackIn_443_1 = stackOut_439_1;
                                stackIn_443_2 = stackOut_439_2;
                                stackIn_443_3 = stackOut_439_3;
                                stackIn_443_4 = stackOut_439_4;
                                stackIn_440_0 = stackOut_439_0;
                                stackIn_440_1 = stackOut_439_1;
                                stackIn_440_2 = stackOut_439_2;
                                stackIn_440_3 = stackOut_439_3;
                                stackIn_440_4 = stackOut_439_4;
                                if (((dl) this).field_a) {
                                  stackOut_443_0 = this;
                                  stackOut_443_1 = stackIn_443_1;
                                  stackOut_443_2 = stackIn_443_2;
                                  stackOut_443_3 = (ci) (Object) stackIn_443_3;
                                  stackOut_443_4 = stackIn_443_4;
                                  stackOut_443_5 = 256;
                                  stackIn_444_0 = stackOut_443_0;
                                  stackIn_444_1 = stackOut_443_1;
                                  stackIn_444_2 = stackOut_443_2;
                                  stackIn_444_3 = stackOut_443_3;
                                  stackIn_444_4 = stackOut_443_4;
                                  stackIn_444_5 = stackOut_443_5;
                                  break L118;
                                } else {
                                  stackOut_440_0 = this;
                                  stackOut_440_1 = stackIn_440_1;
                                  stackOut_440_2 = stackIn_440_2;
                                  stackOut_440_3 = (ci) (Object) stackIn_440_3;
                                  stackOut_440_4 = stackIn_440_4;
                                  stackIn_442_0 = stackOut_440_0;
                                  stackIn_442_1 = stackOut_440_1;
                                  stackIn_442_2 = stackOut_440_2;
                                  stackIn_442_3 = stackOut_440_3;
                                  stackIn_442_4 = stackOut_440_4;
                                  stackIn_441_0 = stackOut_440_0;
                                  stackIn_441_1 = stackOut_440_1;
                                  stackIn_441_2 = stackOut_440_2;
                                  stackIn_441_3 = stackOut_440_3;
                                  stackIn_441_4 = stackOut_440_4;
                                  if (((dl) this).field_d) {
                                    stackOut_442_0 = this;
                                    stackOut_442_1 = stackIn_442_1;
                                    stackOut_442_2 = stackIn_442_2;
                                    stackOut_442_3 = (ci) (Object) stackIn_442_3;
                                    stackOut_442_4 = stackIn_442_4;
                                    stackOut_442_5 = 0;
                                    stackIn_444_0 = stackOut_442_0;
                                    stackIn_444_1 = stackOut_442_1;
                                    stackIn_444_2 = stackOut_442_2;
                                    stackIn_444_3 = stackOut_442_3;
                                    stackIn_444_4 = stackOut_442_4;
                                    stackIn_444_5 = stackOut_442_5;
                                    break L118;
                                  } else {
                                    stackOut_441_0 = this;
                                    stackOut_441_1 = stackIn_441_1;
                                    stackOut_441_2 = stackIn_441_2;
                                    stackOut_441_3 = (ci) (Object) stackIn_441_3;
                                    stackOut_441_4 = stackIn_441_4;
                                    stackOut_441_5 = 128;
                                    stackIn_444_0 = stackOut_441_0;
                                    stackIn_444_1 = stackOut_441_1;
                                    stackIn_444_2 = stackOut_441_2;
                                    stackIn_444_3 = stackOut_441_3;
                                    stackIn_444_4 = stackOut_441_4;
                                    stackIn_444_5 = stackOut_441_5;
                                    break L118;
                                  }
                                }
                              }
                              this.a(stackIn_444_1, stackIn_444_2, stackIn_444_3, stackIn_444_4, stackIn_444_5);
                              k.field_f.a(0);
                              break L115;
                            }
                          } else {
                            if (var9 == null) {
                              L119: {
                                stackOut_432_0 = this;
                                stackOut_432_1 = -32 + param0;
                                stackOut_432_2 = var8 + -64;
                                stackOut_432_3 = kg.field_r[((dl) this).field_j];
                                stackOut_432_4 = 17335;
                                stackIn_436_0 = stackOut_432_0;
                                stackIn_436_1 = stackOut_432_1;
                                stackIn_436_2 = stackOut_432_2;
                                stackIn_436_3 = stackOut_432_3;
                                stackIn_436_4 = stackOut_432_4;
                                stackIn_433_0 = stackOut_432_0;
                                stackIn_433_1 = stackOut_432_1;
                                stackIn_433_2 = stackOut_432_2;
                                stackIn_433_3 = stackOut_432_3;
                                stackIn_433_4 = stackOut_432_4;
                                if (((dl) this).field_a) {
                                  stackOut_436_0 = this;
                                  stackOut_436_1 = stackIn_436_1;
                                  stackOut_436_2 = stackIn_436_2;
                                  stackOut_436_3 = (ci) (Object) stackIn_436_3;
                                  stackOut_436_4 = stackIn_436_4;
                                  stackOut_436_5 = 256;
                                  stackIn_437_0 = stackOut_436_0;
                                  stackIn_437_1 = stackOut_436_1;
                                  stackIn_437_2 = stackOut_436_2;
                                  stackIn_437_3 = stackOut_436_3;
                                  stackIn_437_4 = stackOut_436_4;
                                  stackIn_437_5 = stackOut_436_5;
                                  break L119;
                                } else {
                                  stackOut_433_0 = this;
                                  stackOut_433_1 = stackIn_433_1;
                                  stackOut_433_2 = stackIn_433_2;
                                  stackOut_433_3 = (ci) (Object) stackIn_433_3;
                                  stackOut_433_4 = stackIn_433_4;
                                  stackIn_435_0 = stackOut_433_0;
                                  stackIn_435_1 = stackOut_433_1;
                                  stackIn_435_2 = stackOut_433_2;
                                  stackIn_435_3 = stackOut_433_3;
                                  stackIn_435_4 = stackOut_433_4;
                                  stackIn_434_0 = stackOut_433_0;
                                  stackIn_434_1 = stackOut_433_1;
                                  stackIn_434_2 = stackOut_433_2;
                                  stackIn_434_3 = stackOut_433_3;
                                  stackIn_434_4 = stackOut_433_4;
                                  if (((dl) this).field_d) {
                                    stackOut_435_0 = this;
                                    stackOut_435_1 = stackIn_435_1;
                                    stackOut_435_2 = stackIn_435_2;
                                    stackOut_435_3 = (ci) (Object) stackIn_435_3;
                                    stackOut_435_4 = stackIn_435_4;
                                    stackOut_435_5 = 0;
                                    stackIn_437_0 = stackOut_435_0;
                                    stackIn_437_1 = stackOut_435_1;
                                    stackIn_437_2 = stackOut_435_2;
                                    stackIn_437_3 = stackOut_435_3;
                                    stackIn_437_4 = stackOut_435_4;
                                    stackIn_437_5 = stackOut_435_5;
                                    break L119;
                                  } else {
                                    stackOut_434_0 = this;
                                    stackOut_434_1 = stackIn_434_1;
                                    stackOut_434_2 = stackIn_434_2;
                                    stackOut_434_3 = (ci) (Object) stackIn_434_3;
                                    stackOut_434_4 = stackIn_434_4;
                                    stackOut_434_5 = 128;
                                    stackIn_437_0 = stackOut_434_0;
                                    stackIn_437_1 = stackOut_434_1;
                                    stackIn_437_2 = stackOut_434_2;
                                    stackIn_437_3 = stackOut_434_3;
                                    stackIn_437_4 = stackOut_434_4;
                                    stackIn_437_5 = stackOut_434_5;
                                    break L119;
                                  }
                                }
                              }
                              this.a(stackIn_437_1, stackIn_437_2, stackIn_437_3, stackIn_437_4, stackIn_437_5);
                              break L115;
                            } else {
                              L120: {
                                ((ci) var9).a();
                                stackOut_426_0 = this;
                                stackOut_426_1 = 32;
                                stackOut_426_2 = 60;
                                stackOut_426_3 = kg.field_r[((dl) this).field_j];
                                stackOut_426_4 = 17335;
                                stackIn_428_0 = stackOut_426_0;
                                stackIn_428_1 = stackOut_426_1;
                                stackIn_428_2 = stackOut_426_2;
                                stackIn_428_3 = stackOut_426_3;
                                stackIn_428_4 = stackOut_426_4;
                                stackIn_427_0 = stackOut_426_0;
                                stackIn_427_1 = stackOut_426_1;
                                stackIn_427_2 = stackOut_426_2;
                                stackIn_427_3 = stackOut_426_3;
                                stackIn_427_4 = stackOut_426_4;
                                if (!((dl) this).field_a) {
                                  stackOut_428_0 = this;
                                  stackOut_428_1 = stackIn_428_1;
                                  stackOut_428_2 = stackIn_428_2;
                                  stackOut_428_3 = (ci) (Object) stackIn_428_3;
                                  stackOut_428_4 = stackIn_428_4;
                                  stackIn_430_0 = stackOut_428_0;
                                  stackIn_430_1 = stackOut_428_1;
                                  stackIn_430_2 = stackOut_428_2;
                                  stackIn_430_3 = stackOut_428_3;
                                  stackIn_430_4 = stackOut_428_4;
                                  stackIn_429_0 = stackOut_428_0;
                                  stackIn_429_1 = stackOut_428_1;
                                  stackIn_429_2 = stackOut_428_2;
                                  stackIn_429_3 = stackOut_428_3;
                                  stackIn_429_4 = stackOut_428_4;
                                  if (((dl) this).field_d) {
                                    stackOut_430_0 = this;
                                    stackOut_430_1 = stackIn_430_1;
                                    stackOut_430_2 = stackIn_430_2;
                                    stackOut_430_3 = (ci) (Object) stackIn_430_3;
                                    stackOut_430_4 = stackIn_430_4;
                                    stackOut_430_5 = 0;
                                    stackIn_431_0 = stackOut_430_0;
                                    stackIn_431_1 = stackOut_430_1;
                                    stackIn_431_2 = stackOut_430_2;
                                    stackIn_431_3 = stackOut_430_3;
                                    stackIn_431_4 = stackOut_430_4;
                                    stackIn_431_5 = stackOut_430_5;
                                    break L120;
                                  } else {
                                    stackOut_429_0 = this;
                                    stackOut_429_1 = stackIn_429_1;
                                    stackOut_429_2 = stackIn_429_2;
                                    stackOut_429_3 = (ci) (Object) stackIn_429_3;
                                    stackOut_429_4 = stackIn_429_4;
                                    stackOut_429_5 = 128;
                                    stackIn_431_0 = stackOut_429_0;
                                    stackIn_431_1 = stackOut_429_1;
                                    stackIn_431_2 = stackOut_429_2;
                                    stackIn_431_3 = stackOut_429_3;
                                    stackIn_431_4 = stackOut_429_4;
                                    stackIn_431_5 = stackOut_429_5;
                                    break L120;
                                  }
                                } else {
                                  stackOut_427_0 = this;
                                  stackOut_427_1 = stackIn_427_1;
                                  stackOut_427_2 = stackIn_427_2;
                                  stackOut_427_3 = (ci) (Object) stackIn_427_3;
                                  stackOut_427_4 = stackIn_427_4;
                                  stackOut_427_5 = 256;
                                  stackIn_431_0 = stackOut_427_0;
                                  stackIn_431_1 = stackOut_427_1;
                                  stackIn_431_2 = stackOut_427_2;
                                  stackIn_431_3 = stackOut_427_3;
                                  stackIn_431_4 = stackOut_427_4;
                                  stackIn_431_5 = stackOut_427_5;
                                  break L120;
                                }
                              }
                              this.a(stackIn_431_1, stackIn_431_2, stackIn_431_3, stackIn_431_4, stackIn_431_5);
                              k.field_f.a(param4 + -125);
                              break L115;
                            }
                          }
                        } else {
                          break L116;
                        }
                      }
                    }
                    if (((dl) this).field_j != 7) {
                      if (var9 != null) {
                        ((ci) var9).a();
                        kg.field_r[((dl) this).field_j].b(32, 60);
                        k.field_f.a(0);
                        break L115;
                      } else {
                        kg.field_r[((dl) this).field_j].b(param0 + -32, -64 + var8);
                        break L115;
                      }
                    } else {
                      if (var9 != null) {
                        ((ci) var9).a();
                        se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length].b(32, 12);
                        k.field_f.a(0);
                        break L115;
                      } else {
                        se.field_c[(((dl) this).field_A - -(3 * ((dl) this).field_n)) % se.field_c.length].b(param0 + -32, var8 - 112);
                        break L115;
                      }
                    }
                  }
                  if (null == ((dl) this).field_s.field_i) {
                    break L114;
                  } else {
                    L121: {
                      var11_int = 0;
                      if (2 == nc.field_a[((dl) this).field_j]) {
                        var11_int = 1;
                        break L121;
                      } else {
                        break L121;
                      }
                    }
                    L122: {
                      if (nc.field_a[((dl) this).field_j] == 3) {
                        var11_int = 1;
                        break L122;
                      } else {
                        break L122;
                      }
                    }
                    L123: {
                      if (5 != nc.field_a[((dl) this).field_j]) {
                        break L123;
                      } else {
                        var11_int = 2;
                        break L123;
                      }
                    }
                    L124: {
                      if (nc.field_a[((dl) this).field_j] != 4) {
                        break L124;
                      } else {
                        var11_int = 3;
                        break L124;
                      }
                    }
                    if (7 == ((dl) this).field_j) {
                      ((dl) this).field_s.field_i.a((byte) -101, var8 - 112, param0 - 32, se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length]);
                      break L114;
                    } else {
                      ((dl) this).field_s.field_i.a(((dl) this).field_r, -32 + param0, (byte) -118, var11_int, -64 + var8, kg.field_r[((dl) this).field_j]);
                      break L114;
                    }
                  }
                } else {
                  break L114;
                }
              }
            }
            L125: {
              if (((dl) this).field_m < 0) {
                break L125;
              } else {
                L126: {
                  var11 = null;
                  var11 = null;
                  if (1 != ((dl) this).field_m) {
                    break L126;
                  } else {
                    var11 = (Object) (Object) ui.field_a[11];
                    break L126;
                  }
                }
                L127: {
                  if (((dl) this).field_m != 2) {
                    break L127;
                  } else {
                    var11 = (Object) (Object) ui.field_a[3];
                    break L127;
                  }
                }
                L128: {
                  if (((dl) this).field_m == 3) {
                    var11 = (Object) (Object) ui.field_a[11];
                    break L128;
                  } else {
                    break L128;
                  }
                }
                L129: {
                  if (4 == ((dl) this).field_m) {
                    var11 = (Object) (Object) ui.field_a[7];
                    break L129;
                  } else {
                    break L129;
                  }
                }
                L130: {
                  if (5 == ((dl) this).field_m) {
                    var11 = (Object) (Object) ui.field_a[15];
                    break L130;
                  } else {
                    break L130;
                  }
                }
                L131: {
                  if (6 != ((dl) this).field_m) {
                    break L131;
                  } else {
                    var11 = (Object) (Object) ui.field_a[15];
                    break L131;
                  }
                }
                L132: {
                  if (((dl) this).field_m != 7) {
                    break L132;
                  } else {
                    var11 = (Object) (Object) lf.field_e[3];
                    break L132;
                  }
                }
                L133: {
                  if (((dl) this).field_m == 8) {
                    var11 = (Object) (Object) lf.field_e[7];
                    break L133;
                  } else {
                    break L133;
                  }
                }
                L134: {
                  if (((dl) this).field_m != 9) {
                    break L134;
                  } else {
                    var11 = (Object) (Object) lf.field_e[11];
                    break L134;
                  }
                }
                L135: {
                  if (((dl) this).field_m == 10) {
                    var11 = (Object) (Object) lf.field_e[15];
                    break L135;
                  } else {
                    break L135;
                  }
                }
                L136: {
                  if (11 != ((dl) this).field_m) {
                    break L136;
                  } else {
                    var11 = (Object) (Object) wb.field_h[3];
                    break L136;
                  }
                }
                if (var11 == null) {
                  break L125;
                } else {
                  L137: {
                    if (((dl) this).field_z) {
                      break L137;
                    } else {
                      if (null != ((dl) this).field_s.field_l) {
                        break L137;
                      } else {
                        if (!((dl) this).field_a) {
                          if (var9 != null) {
                            ((ci) var9).a();
                            this.a(-(((bg) var11).field_f / 2) + 64, 15 + (124 - ((bg) var11).field_i), ((bg) var11).b(), 17335, 0);
                            k.field_f.a(0);
                            break L125;
                          } else {
                            this.a(param0 - ((bg) var11).field_f / 2, -((bg) var11).field_i + var8 + 15, ((bg) var11).b(), 17335, 0);
                            break L125;
                          }
                        } else {
                          break L137;
                        }
                      }
                    }
                  }
                  if (var9 == null) {
                    ((bg) var11).b(-(((bg) var11).field_f / 2) + param0, 15 + var8 - ((bg) var11).field_i, ((dl) this).field_t);
                    break L125;
                  } else {
                    ((ci) var9).a();
                    ((bg) var11).b(64 - ((bg) var11).field_f / 2, 15 + (124 - ((bg) var11).field_i), ((dl) this).field_t);
                    k.field_f.a(0);
                    break L125;
                  }
                }
              }
            }
            L138: {
              if (null == ((dl) this).field_C) {
                break L138;
              } else {
                int discarded$3 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                break L138;
              }
            }
            L139: {
              if (var9 == null) {
                break L139;
              } else {
                L140: {
                  L141: {
                    u.field_a.a();
                    ((ci) var9).d(0, 0);
                    if (null == ((dl) this).field_s.field_i) {
                      break L141;
                    } else {
                      if (((dl) this).field_s.field_i.field_L > 0) {
                        c.a((byte) -86, u.field_a, 16777215);
                        c.a((byte) -86, u.field_a, 16744576);
                        c.a((byte) -86, u.field_a, 16728128);
                        c.a((byte) -86, u.field_a, 8388608);
                        c.a((byte) -86, u.field_a, 4194304);
                        break L140;
                      } else {
                        break L141;
                      }
                    }
                  }
                  c.a((byte) -86, u.field_a, 16777215);
                  c.a((byte) -86, u.field_a, 8454016);
                  c.a((byte) -86, u.field_a, 4259648);
                  c.a((byte) -86, u.field_a, 32768);
                  c.a((byte) -86, u.field_a, 16384);
                  break L140;
                }
                ((ci) var9).b(0, 0, 0);
                k.field_f.a(param4 ^ 125);
                hb.field_n = var8 + -124;
                ug.field_b = -64 + param0;
                ((ci) var9).b(param0 - 64, var8 - 124);
                break L139;
              }
            }
            return param1;
          }
        } else {
          return 11;
        }
    }

    final static void a(boolean param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = Terraphoenix.field_V;
          if (param10 < 0) {
            break L0;
          } else {
            if (ob.field_h > param12) {
              L1: {
                if (param16 >= 0) {
                  break L1;
                } else {
                  if (0 <= param5) {
                    break L1;
                  } else {
                    if (0 <= param7) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (ob.field_i > param16) {
                  break L2;
                } else {
                  if (param5 < ob.field_i) {
                    break L2;
                  } else {
                    if (param7 >= ob.field_i) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param12 + param10;
                if (param4 == param12) {
                  L4: {
                    if (param10 == param12) {
                      var19 = 0;
                      var24 = 0;
                      var26 = param11;
                      var23 = 0;
                      var17_int = param16 << 16;
                      var31 = 0;
                      var28 = 0;
                      var30 = param13;
                      var18 = param5 << 16;
                      var32 = 0;
                      var22 = param9;
                      var25 = param15;
                      var29 = param6;
                      var21 = param14;
                      var20 = 0;
                      var27 = 0;
                      break L4;
                    } else {
                      var35 = param10 + -param4;
                      if (param5 <= param16) {
                        var29 = param13 << 16;
                        var21 = param9 << 16;
                        var18 = param16 << 16;
                        var31 = (param2 + -param13 << 16) / var35;
                        var28 = (param8 - param15 << 16) / var34;
                        var32 = (-param6 + param2 << 16) / var34;
                        var23 = (param1 - param9 << 16) / var35;
                        var26 = param15 << 16;
                        var17_int = param5 << 16;
                        var19 = (param7 + -param5 << 16) / var35;
                        var20 = (param7 + -param16 << 16) / var34;
                        var30 = param6 << 16;
                        var27 = (-param11 + param8 << 16) / var35;
                        var24 = (-param14 + param1 << 16) / var34;
                        var25 = param11 << 16;
                        var22 = param14 << 16;
                        break L4;
                      } else {
                        var25 = param15 << 16;
                        var27 = (param8 - param15 << 16) / var34;
                        var17_int = param16 << 16;
                        var20 = (param7 + -param5 << 16) / var35;
                        var29 = param6 << 16;
                        var32 = (-param13 + param2 << 16) / var35;
                        var23 = (-param14 + param1 << 16) / var34;
                        var21 = param14 << 16;
                        var31 = (param2 + -param6 << 16) / var34;
                        var24 = (param1 + -param9 << 16) / var35;
                        var30 = param13 << 16;
                        var28 = (-param11 + param8 << 16) / var35;
                        var18 = param5 << 16;
                        var26 = param11 << 16;
                        var22 = param9 << 16;
                        var19 = (-param16 + param7 << 16) / var34;
                        break L4;
                      }
                    }
                  }
                  var33 = 0;
                  if (param12 < 0) {
                    param12 = Math.min(-param12, param4 + -param12);
                    var17_int = var17_int + param12 * var19;
                    var22 = var22 + param12 * var24;
                    var30 = var30 + var32 * param12;
                    var25 = var25 + param12 * var27;
                    var21 = var21 + param12 * var23;
                    var26 = var26 + param12 * var28;
                    var29 = var29 + param12 * var31;
                    var18 = var18 + var20 * param12;
                    param12 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  L5: {
                    var30 = param6 << 16;
                    var29 = param6 << 16;
                    var18 = param16 << 16;
                    var17_int = param16 << 16;
                    var22 = param14 << 16;
                    var21 = param14 << 16;
                    var26 = param15 << 16;
                    var25 = param15 << 16;
                    var35 = -param12 + param4;
                    var20 = (param7 + -param16 << 16) / var34;
                    var19 = (-param16 + param5 << 16) / var35;
                    if (var19 >= var20) {
                      var33 = 1;
                      var27 = (param8 - param15 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var32 = (-param6 + param13 << 16) / var35;
                      var24 = (param9 + -param14 << 16) / var35;
                      var23 = (-param14 + param1 << 16) / var34;
                      var31 = (param2 - param6 << 16) / var34;
                      var28 = (param11 + -param15 << 16) / var35;
                      break L5;
                    } else {
                      var31 = (-param6 + param13 << 16) / var35;
                      var28 = (param8 - param15 << 16) / var34;
                      var24 = (param1 - param14 << 16) / var34;
                      var27 = (param11 + -param15 << 16) / var35;
                      var33 = 0;
                      var32 = (param2 - param6 << 16) / var34;
                      var23 = (-param14 + param9 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (0 > param12) {
                        if (0 > param4) {
                          param12 = -param12 + param4;
                          var26 = var26 + var28 * param12;
                          var18 = var18 + param12 * var20;
                          var22 = var22 + param12 * var24;
                          var17_int = var17_int + param12 * var19;
                          var21 = var21 + param12 * var23;
                          var29 = var29 + var31 * param12;
                          var25 = var25 + param12 * var27;
                          var30 = var30 + var32 * param12;
                          param12 = param4;
                          break L6;
                        } else {
                          param12 = -param12;
                          var17_int = var17_int + var19 * param12;
                          var26 = var26 + param12 * var28;
                          var30 = var30 + var32 * param12;
                          var18 = var18 + var20 * param12;
                          var22 = var22 + var24 * param12;
                          var29 = var29 + param12 * var31;
                          var21 = var21 + var23 * param12;
                          var25 = var25 + var27 * param12;
                          param12 = 0;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var36 = ob.field_d[param12];
                    L8: while (true) {
                      if (param4 <= param12) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (ob.field_i > var37) {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 != 0) {
                              L10: {
                                var39 = (var22 + -var21) / var38;
                                var40 = (var26 + -var25) / var38;
                                var41 = (var30 - var29) / var38;
                                if (var37 - -var38 >= ob.field_i) {
                                  var38 = -1 + (-var37 + ob.field_i);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                fl.a(var38 + var37, param3, var41, 6, var25 - var37 * var40, -(var37 * var39) + var21, -(var41 * var37) + var29, var40, var36, var39);
                                break L9;
                              } else {
                                fl.a(var38, param3, var41, 6, var25, var21, var29, var40, var37 + var36, var39);
                                break L9;
                              }
                            } else {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (var37 < ob.field_i) {
                                  fl.a(var38, param3, 0, 6, var25, var21, var29, 0, var37 - -var36, 0);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        param12++;
                        if (param12 < ob.field_h) {
                          var18 = var18 + var20;
                          var26 = var26 + var28;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var30 = var30 + var32;
                          var22 = var22 + var24;
                          var17_int = var17_int + var19;
                          var21 = var21 + var23;
                          var36 = var36 + l.field_k;
                          continue L8;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var36 = param10 + -param4;
                  if (var36 == 0) {
                    var19 = 0;
                    var31 = 0;
                    var24 = 0;
                    var20 = 0;
                    var23 = 0;
                    var32 = 0;
                    var27 = 0;
                    var28 = 0;
                    break L3;
                  } else {
                    L11: {
                      var37 = param7 << 16;
                      var38 = param1 << 16;
                      var39 = param8 << 16;
                      if (var33 == 0) {
                        var25 = param11 << 16;
                        var29 = param13 << 16;
                        var21 = param9 << 16;
                        var17_int = param5 << 16;
                        break L11;
                      } else {
                        var26 = param11 << 16;
                        var22 = param9 << 16;
                        var18 = param5 << 16;
                        var30 = param13 << 16;
                        break L11;
                      }
                    }
                    var40 = param2 << 16;
                    var23 = (-var21 + var38) / var36;
                    var20 = (-var18 + var37) / var36;
                    var27 = (var39 + -var25) / var36;
                    var28 = (-var26 + var39) / var36;
                    var24 = (var38 - var22) / var36;
                    var32 = (-var30 + var40) / var36;
                    var19 = (var37 - var17_int) / var36;
                    var31 = (var40 - var29) / var36;
                    break L3;
                  }
                }
              }
              L12: {
                if (param12 < 0) {
                  param12 = -param12;
                  var30 = var30 + param12 * var32;
                  var25 = var25 + param12 * var27;
                  var18 = var18 + var20 * param12;
                  var17_int = var17_int + var19 * param12;
                  var29 = var29 + var31 * param12;
                  var21 = var21 + param12 * var23;
                  var22 = var22 + param12 * var24;
                  var26 = var26 + param12 * var28;
                  param12 = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
              var35 = ob.field_d[param12];
              L13: while (true) {
                if (param10 <= param12) {
                  return;
                } else {
                  L14: {
                    var36 = var17_int >> 16;
                    if (ob.field_i <= var36) {
                      break L14;
                    } else {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (0 == var37) {
                        if (var36 < 0) {
                          break L14;
                        } else {
                          if (var36 >= ob.field_i) {
                            break L14;
                          } else {
                            fl.a(var37, param3, 0, 6, var25, var21, var29, 0, var36 - -var35, 0);
                            break L14;
                          }
                        }
                      } else {
                        L15: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (ob.field_i > var36 - -var37) {
                            break L15;
                          } else {
                            var37 = -1 + -var36 + ob.field_i;
                            break L15;
                          }
                        }
                        if (var36 < 0) {
                          fl.a(var36 + var37, param3, var40, 6, -(var39 * var36) + var25, var21 - var38 * var36, var29 - var40 * var36, var39, var35, var38);
                          break L14;
                        } else {
                          fl.a(var37, param3, var40, 6, var25, var21, var29, var39, var35 + var36, var38);
                          break L14;
                        }
                      }
                    }
                  }
                  param12++;
                  if (ob.field_h > param12) {
                    var17_int = var17_int + var19;
                    var25 = var25 + var27;
                    var29 = var29 + var31;
                    var26 = var26 + var28;
                    var30 = var30 + var32;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    var35 = var35 + l.field_k;
                    var18 = var18 + var20;
                    continue L13;
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0) {
        double stackIn_90_0 = 0.0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        double stackIn_91_0 = 0.0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        double stackIn_92_0 = 0.0;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        double stackIn_93_0 = 0.0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        double stackOut_89_0 = 0.0;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        double stackOut_90_0 = 0.0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        double stackOut_91_0 = 0.0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        double stackOut_92_0 = 0.0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        L0: {
          ((dl) this).field_e = 0;
          if (0 > ((dl) this).field_g) {
            break L0;
          } else {
            L1: {
              if (1 != nh.field_E[((dl) this).field_g]) {
                break L1;
              } else {
                ((dl) this).a(1, true, param0 ^ 106);
                break L1;
              }
            }
            L2: {
              if (nh.field_E[((dl) this).field_g] != 2) {
                break L2;
              } else {
                ((dl) this).a(1, false, -68);
                break L2;
              }
            }
            if (3 != nh.field_E[((dl) this).field_g]) {
              break L0;
            } else {
              ((dl) this).a(1, true, 110);
              ((dl) this).field_i = ((dl) this).field_i | 1;
              dl dupTemp$2 = ((dl) this).field_s.a(92, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A);
              dupTemp$2.field_i = dupTemp$2.field_i | 4;
              break L0;
            }
          }
        }
        L3: {
          if (0 > ((dl) this).field_k) {
            break L3;
          } else {
            L4: {
              if (nh.field_E[((dl) this).field_k] == 1) {
                ((dl) this).a(2, true, -71);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (nh.field_E[((dl) this).field_k] == 2) {
                ((dl) this).a(2, false, param0 ^ 89);
                break L5;
              } else {
                break L5;
              }
            }
            if (nh.field_E[((dl) this).field_k] == 3) {
              ((dl) this).a(2, true, 92);
              ((dl) this).field_i = ((dl) this).field_i | 2;
              dl dupTemp$3 = ((dl) this).field_s.a(111, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A);
              dupTemp$3.field_i = dupTemp$3.field_i | 8;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L6: {
          ((dl) this).field_v = param0;
          if (((dl) this).field_b != -1) {
            break L6;
          } else {
            ((dl) this).field_v = -1;
            break L6;
          }
        }
        L7: {
          if (((dl) this).field_b != 0) {
            break L7;
          } else {
            if (((dl) this).field_s.field_i.field_G.field_Bb == 11) {
              ((dl) this).field_b = 12;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (((dl) this).field_b != 1) {
            break L8;
          } else {
            if (((dl) this).field_s.field_i.field_G.field_Bb == 11) {
              ((dl) this).field_b = 13;
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: {
          if (((dl) this).field_b != 2) {
            break L9;
          } else {
            if (((dl) this).field_s.field_i.field_G.field_Bb != 11) {
              break L9;
            } else {
              ((dl) this).field_b = 13;
              break L9;
            }
          }
        }
        L10: {
          if (3 != ((dl) this).field_b) {
            break L10;
          } else {
            if (((dl) this).field_s.field_i.field_G.field_Bb != 11) {
              break L10;
            } else {
              ((dl) this).field_b = 1;
              break L10;
            }
          }
        }
        L11: {
          L12: {
            ((dl) this).field_d = false;
            if (4 == ((dl) this).field_b) {
              break L12;
            } else {
              if (((dl) this).field_b == 14) {
                break L12;
              } else {
                if (((dl) this).field_b != 15) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
          }
          ((dl) this).field_d = true;
          break L11;
        }
        L13: {
          if (((dl) this).field_j != 34) {
            break L13;
          } else {
            ((dl) this).field_d = true;
            break L13;
          }
        }
        L14: {
          if (((dl) this).field_c == null) {
            break L14;
          } else {
            if (((dl) this).field_c.field_d) {
              ((dl) this).field_d = true;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (((dl) this).field_C == null) {
            break L15;
          } else {
            if (7 == ((dl) this).field_j) {
              ((dl) this).field_C.field_j = -1;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (((dl) this).field_b == 5) {
            ((dl) this).field_d = false;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          if (null == ((dl) this).field_C) {
            if (((dl) this).field_v == -1) {
              break L17;
            } else {
              ((dl) this).field_C = new dl(((dl) this).field_A, ((dl) this).field_n, 1 + ((dl) this).field_r, ((dl) this).field_s);
              ((dl) this).field_C.field_c = (dl) this;
              ((dl) this).field_C.a(0);
              break L17;
            }
          } else {
            ((dl) this).field_C.field_c = (dl) this;
            ((dl) this).field_C.a(param0);
            break L17;
          }
        }
        L18: {
          if (((dl) this).field_c == null) {
            break L18;
          } else {
            if (((dl) this).field_c.field_j != 7) {
              break L18;
            } else {
              ((dl) this).field_j = -1;
              break L18;
            }
          }
        }
        L19: {
          if (((dl) this).field_j <= -1) {
            break L19;
          } else {
            if (nc.field_a[((dl) this).field_j] == 0) {
              break L19;
            } else {
              L20: {
                ((dl) this).field_v = nc.field_a[((dl) this).field_j];
                if (nc.field_a[((dl) this).field_j] != 5) {
                  break L20;
                } else {
                  ((dl) this).field_v = 0;
                  if (null != ((dl) this).field_C) {
                    ((dl) this).field_C.field_v = 5;
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              if (4 != nc.field_a[((dl) this).field_j]) {
                break L19;
              } else {
                ((dl) this).field_v = 4;
                if (null != ((dl) this).field_C) {
                  ((dl) this).field_C.field_v = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
            }
          }
        }
        L21: {
          L22: {
            ((dl) this).field_u = true;
            if (!((dl) this).field_s.b(((dl) this).field_A, ((dl) this).field_n, -127, 1 + ((dl) this).field_r)) {
              break L22;
            } else {
              if (!((dl) this).field_s.b(1 + ((dl) this).field_A, ((dl) this).field_n - -1, -101, 1 + ((dl) this).field_r)) {
                break L22;
              } else {
                if (!((dl) this).field_s.b(((dl) this).field_A - -2, 2 + ((dl) this).field_n, -99, 1 + ((dl) this).field_r)) {
                  break L22;
                } else {
                  if (!((dl) this).field_s.b(1 + ((dl) this).field_A, 2 + ((dl) this).field_n, -121, ((dl) this).field_r - -1)) {
                    break L22;
                  } else {
                    if (!((dl) this).field_s.b(((dl) this).field_A + 2, 1 + ((dl) this).field_n, -108, ((dl) this).field_r - -1)) {
                      break L22;
                    } else {
                      if (!((dl) this).field_s.b(1 + ((dl) this).field_A, ((dl) this).field_n, -115, ((dl) this).field_r + 1)) {
                        break L22;
                      } else {
                        if (((dl) this).field_s.b(((dl) this).field_A, 1 + ((dl) this).field_n, -96, 1 + ((dl) this).field_r)) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((dl) this).field_u = false;
          break L21;
        }
        L23: {
          L24: {
            ((dl) this).field_q = -1;
            ((dl) this).field_z = false;
            ((dl) this).field_a = false;
            if (((dl) this).field_s.field_i.field_G.field_db) {
              break L24;
            } else {
              if (((dl) this).field_s.field_i.field_G.field_Bb == 0) {
                break L24;
              } else {
                if (1 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                  break L24;
                } else {
                  if (((dl) this).field_s.field_i.field_G.field_Bb == 2) {
                    break L24;
                  } else {
                    if (3 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                      break L24;
                    } else {
                      if (((dl) this).field_s.field_i.field_G.field_Bb == 7) {
                        break L24;
                      } else {
                        if (9 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                          break L24;
                        } else {
                          if (11 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (-1 != ((dl) this).field_j) {
            break L23;
          } else {
            if (-1 == ((dl) this).field_b) {
              break L23;
            } else {
              if (((dl) this).field_d) {
                break L23;
              } else {
                L25: {
                  L26: {
                    stackOut_89_0 = Math.random() * 100.0;
                    stackOut_89_1 = -(((dl) this).field_r * 5);
                    stackOut_89_2 = 5;
                    stackIn_92_0 = stackOut_89_0;
                    stackIn_92_1 = stackOut_89_1;
                    stackIn_92_2 = stackOut_89_2;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    if (((dl) this).field_g != -1) {
                      break L26;
                    } else {
                      stackOut_90_0 = stackIn_90_0;
                      stackOut_90_1 = stackIn_90_1;
                      stackOut_90_2 = stackIn_90_2;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_92_1 = stackOut_90_1;
                      stackIn_92_2 = stackOut_90_2;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      stackIn_91_2 = stackOut_90_2;
                      if (((dl) this).field_k != -1) {
                        break L26;
                      } else {
                        stackOut_91_0 = stackIn_91_0;
                        stackOut_91_1 = stackIn_91_1;
                        stackOut_91_2 = stackIn_91_2;
                        stackOut_91_3 = 0;
                        stackIn_93_0 = stackOut_91_0;
                        stackIn_93_1 = stackOut_91_1;
                        stackIn_93_2 = stackOut_91_2;
                        stackIn_93_3 = stackOut_91_3;
                        break L25;
                      }
                    }
                  }
                  stackOut_92_0 = stackIn_92_0;
                  stackOut_92_1 = stackIn_92_1;
                  stackOut_92_2 = stackIn_92_2;
                  stackOut_92_3 = 20;
                  stackIn_93_0 = stackOut_92_0;
                  stackIn_93_1 = stackOut_92_1;
                  stackIn_93_2 = stackOut_92_2;
                  stackIn_93_3 = stackOut_92_3;
                  break L25;
                }
                if (stackIn_93_0 < (double)(stackIn_93_1 + (stackIn_93_2 - -stackIn_93_3))) {
                  ((dl) this).field_q = (int)(12.0 * Math.random());
                  break L23;
                } else {
                  break L23;
                }
              }
            }
          }
        }
        L27: {
          if (((dl) this).field_r != 0) {
            break L27;
          } else {
            if (((dl) this).field_v != -1) {
              break L27;
            } else {
              ((dl) this).field_j = -1;
              ((dl) this).field_b = 3;
              ((dl) this).field_v = 0;
              break L27;
            }
          }
        }
    }

    dl(int param0, int param1, int param2, dk param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              ((dl) this).field_B = false;
              ((dl) this).field_m = -1;
              ((dl) this).field_x = 1;
              ((dl) this).field_k = -1;
              ((dl) this).field_r = param2;
              ((dl) this).field_z = false;
              ((dl) this).field_u = false;
              ((dl) this).field_l = param2 * 100;
              ((dl) this).field_A = param0;
              ((dl) this).field_j = -1;
              ((dl) this).field_v = -1;
              ((dl) this).field_h = null;
              ((dl) this).field_c = null;
              ((dl) this).field_g = -1;
              ((dl) this).field_C = null;
              ((dl) this).field_n = param1;
              ((dl) this).field_b = -1;
              ((dl) this).field_i = 0;
              ((dl) this).field_e = 0;
              ((dl) this).field_s = param3;
              ((dl) this).field_a = false;
              if (((dl) this).field_r != 0) {
                break L1;
              } else {
                ((dl) this).field_b = 0;
                ((dl) this).field_v = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("dl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Base Score:";
        field_f = new int[8192];
    }
}
