/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hk {
    private ll field_g;
    private byte[] field_z;
    static boolean field_s;
    private ke field_t;
    private byte[] field_f;
    private sk field_r;
    static String field_h;
    private sk field_k;
    static wf field_A;
    static je field_C;
    private int field_i;
    private th field_u;
    private int field_B;
    private dj field_m;
    private int field_j;
    static ah field_e;
    static float field_y;
    private t field_q;
    private je field_v;
    private boolean field_l;
    private je field_w;
    private int field_o;
    private boolean field_p;
    private long field_x;
    private boolean field_n;

    final void b(byte param0) {
        mc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        if (((bo) this).field_v == null) {
          return;
        } else {
          if (null == ((bo) this).a(0)) {
            return;
          } else {
            var2 = ((bo) this).field_w.c(false);
            var3 = 77 / ((param0 - 66) / 36);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var4 = (int)var2.field_c;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          if (-1 < (var4 ^ -1)) {
                            break L4;
                          } else {
                            if (((bo) this).field_q.field_i <= var4) {
                              break L4;
                            } else {
                              if (((bo) this).field_q.field_m[var4] == 0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var2.b(false);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (0 != ((bo) this).field_f[var4]) {
                          break L5;
                        } else {
                          ll discarded$2 = this.a(1, var4, 121);
                          break L5;
                        }
                      }
                      L6: {
                        if (-1 == ((bo) this).field_f[var4]) {
                          ll discarded$3 = this.a(2, var4, 120);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (1 != ((bo) this).field_f[var4]) {
                        break L2;
                      } else {
                        var2.b(false);
                        break L2;
                      }
                    }
                    var2 = ((bo) this).field_w.a((byte) -70);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void d(int param0) {
        if (!(null != ((bo) this).field_r)) {
            return;
        }
        ((bo) this).field_p = true;
        if (param0 != 5127) {
            field_C = null;
        }
        if (((bo) this).field_v == null) {
            ((bo) this).field_v = new je();
        }
    }

    final static void c(int param0, int param1) {
        fh.field_a = param0;
        uf.field_c = new int[param1];
        n.field_L = new fj[param0 * 15];
        pl.field_d = 0;
    }

    final int a(int param0, int param1) {
        ll var3 = null;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            t discarded$2 = ((bo) this).a(-82);
            break L0;
          }
        }
        var3 = (ll) (Object) ((bo) this).field_m.a((long)param0, (byte) -43);
        if (var3 != null) {
          return var3.a(false);
        } else {
          return 0;
        }
    }

    public static void c(int param0) {
        field_C = null;
        field_h = null;
        if (param0 != -251) {
            return;
        }
        field_A = null;
        field_e = null;
    }

    final void e(int param0) {
        int var2_int = 0;
        ll var2 = null;
        mc var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        byte stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_97_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        byte stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        L0: {
          L1: {
            var5 = TetraLink.field_J;
            if (((bo) this).field_v != null) {
              if (null != ((bo) this).a(0)) {
                L2: {
                  if (!((bo) this).field_l) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((bo) this).field_v.c(false);
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            L6: while (true) {
                              if (((bo) this).field_o >= ((bo) this).field_q.field_m.length) {
                                break L4;
                              } else {
                                stackOut_18_0 = -1;
                                stackOut_18_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                                stackIn_63_0 = stackOut_18_0;
                                stackIn_63_1 = stackOut_18_1;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                if (var5 != 0) {
                                  break L0;
                                } else {
                                  if (stackIn_19_0 == stackIn_19_1) {
                                    ((bo) this).field_o = ((bo) this).field_o + 1;
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_7_0 = ((bo) this).field_f[var4];
                            stackIn_97_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_97_0 >= ((bo) this).field_q.field_m.length) {
                                  break L4;
                                } else {
                                  stackOut_95_0 = -1;
                                  stackOut_95_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                                  stackIn_63_0 = stackOut_95_0;
                                  stackIn_63_1 = stackOut_95_1;
                                  stackIn_96_0 = stackOut_95_0;
                                  stackIn_96_1 = stackOut_95_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    stackOut_96_0 = stackIn_96_0;
                                    stackOut_96_1 = stackIn_96_1;
                                    stackIn_93_0 = stackOut_96_0;
                                    stackIn_93_1 = stackOut_96_1;
                                    if (stackIn_93_0 == stackIn_93_1) {
                                      ((bo) this).field_o = ((bo) this).field_o + 1;
                                      stackOut_99_0 = ((bo) this).field_o;
                                      stackIn_97_0 = stackOut_99_0;
                                      continue L7;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              L8: {
                                if (stackIn_8_0 == 0) {
                                  ll discarded$4 = this.a(1, var4, 123);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                L10: {
                                  if (((bo) this).field_f[var4] == 0) {
                                    break L10;
                                  } else {
                                    var3.b(false);
                                    if (var5 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L9;
                              }
                              var3 = ((bo) this).field_v.a((byte) -70);
                              continue L3;
                            }
                          }
                        }
                        L11: {
                          if (-251 > ((bo) this).field_t.field_d) {
                            break L11;
                          } else {
                            var2_int = 0;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (((bo) this).field_f[((bo) this).field_o] == 0) {
                            ll discarded$5 = this.a(1, ((bo) this).field_o, 124);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (((bo) this).field_f[((bo) this).field_o] == 0) {
                            var3 = new mc();
                            var3.field_c = (long)((bo) this).field_o;
                            var2_int = 0;
                            ((bo) this).field_v.a(var3, false);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        ((bo) this).field_o = ((bo) this).field_o + 1;
                        break L4;
                      }
                      L14: {
                        if (var2_int == 0) {
                          break L14;
                        } else {
                          ((bo) this).field_o = 0;
                          ((bo) this).field_l = false;
                          break L14;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L15: {
                  if (((bo) this).field_p) {
                    break L15;
                  } else {
                    ((bo) this).field_v = null;
                    break L15;
                  }
                }
                var2_int = 1;
                var3 = ((bo) this).field_v.c(false);
                L16: while (true) {
                  L17: {
                    L18: {
                      if (var3 == null) {
                        L19: while (true) {
                          if (((bo) this).field_q.field_m.length <= ((bo) this).field_o) {
                            break L17;
                          } else {
                            stackOut_48_0 = 0;
                            stackOut_48_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                            stackIn_63_0 = stackOut_48_0;
                            stackIn_63_1 = stackOut_48_1;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              if (stackIn_49_0 == stackIn_49_1) {
                                ((bo) this).field_o = ((bo) this).field_o + 1;
                                continue L19;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = (int)var3.field_c;
                        stackOut_38_0 = ((bo) this).field_f[var4];
                        stackOut_38_1 = 1;
                        stackIn_89_0 = stackOut_38_0;
                        stackIn_89_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var5 != 0) {
                          L20: while (true) {
                            if (stackIn_89_0 <= stackIn_89_1) {
                              break L17;
                            } else {
                              stackOut_87_0 = 0;
                              stackOut_87_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                              stackIn_63_0 = stackOut_87_0;
                              stackIn_63_1 = stackOut_87_1;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                stackOut_88_0 = stackIn_88_0;
                                stackOut_88_1 = stackIn_88_1;
                                stackIn_85_0 = stackOut_88_0;
                                stackIn_85_1 = stackOut_88_1;
                                if (stackIn_85_0 == stackIn_85_1) {
                                  ((bo) this).field_o = ((bo) this).field_o + 1;
                                  stackOut_91_0 = ((bo) this).field_q.field_m.length;
                                  stackOut_91_1 = ((bo) this).field_o;
                                  stackIn_89_0 = stackOut_91_0;
                                  stackIn_89_1 = stackOut_91_1;
                                  continue L20;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        } else {
                          L21: {
                            if (stackIn_39_0 == stackIn_39_1) {
                              break L21;
                            } else {
                              ll discarded$6 = this.a(2, var4, 125);
                              break L21;
                            }
                          }
                          L22: {
                            L23: {
                              if (-2 != (((bo) this).field_f[var4] ^ -1)) {
                                break L23;
                              } else {
                                var3.b(false);
                                if (var5 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            var2_int = 0;
                            break L22;
                          }
                          var3 = ((bo) this).field_v.a((byte) -70);
                          continue L16;
                        }
                      }
                    }
                    L24: {
                      if (!((bo) this).field_u.c(-7614)) {
                        break L24;
                      } else {
                        var2_int = 0;
                        if (var5 == 0) {
                          break L17;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if (((bo) this).field_f[((bo) this).field_o] != 1) {
                        ll discarded$7 = this.a(2, ((bo) this).field_o, 126);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (-2 == (((bo) this).field_f[((bo) this).field_o] ^ -1)) {
                        break L26;
                      } else {
                        var3 = new mc();
                        var3.field_c = (long)((bo) this).field_o;
                        ((bo) this).field_v.a(var3, false);
                        var2_int = 0;
                        break L26;
                      }
                    }
                    ((bo) this).field_o = ((bo) this).field_o + 1;
                    break L17;
                  }
                  if (var2_int == 0) {
                    break L1;
                  } else {
                    ((bo) this).field_p = false;
                    ((bo) this).field_o = 0;
                    break L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
          stackOut_62_0 = param0;
          stackOut_62_1 = 2;
          stackIn_63_0 = stackOut_62_0;
          stackIn_63_1 = stackOut_62_1;
          break L0;
        }
        L27: {
          if (stackIn_63_0 == stackIn_63_1) {
            break L27;
          } else {
            ((bo) this).field_v = null;
            break L27;
          }
        }
        if (((bo) this).field_n) {
          if (k.a(0) >= ((bo) this).field_x) {
            var2 = (ll) (Object) ((bo) this).field_m.b(44);
            L28: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L29: {
                    if (var2.field_v) {
                      break L29;
                    } else {
                      L30: {
                        if (!var2.field_B) {
                          break L30;
                        } else {
                          if (var2.field_D) {
                            var2.b(false);
                            if (var5 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      var2.field_B = true;
                      break L29;
                    }
                  }
                  var2 = (ll) (Object) ((bo) this).field_m.a(param0 + -3);
                  continue L28;
                } else {
                  return;
                }
              } else {
                ((bo) this).field_x = k.a(0) + 1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final byte[] b(int param0, int param1) {
        ll var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        L0: {
          var3 = this.a(0, param1, 121);
          if (param0 == 20396) {
            break L0;
          } else {
            var5 = null;
            bo.a(62, -68, (java.awt.Canvas) null, 86);
            break L0;
          }
        }
        if (var3 == null) {
          return null;
        } else {
          var4 = var3.c(true);
          var3.b(false);
          return var4;
        }
    }

    final t a(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = TetraLink.field_J;
        if (null == ((bo) this).field_q) {
          L0: {
            if (((bo) this).field_g != null) {
              break L0;
            } else {
              if (!((bo) this).field_u.b((byte) 119)) {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((bo) this).field_g.field_v) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                byte[] discarded$2 = ((bo) this).b(120, 16);
                break L1;
              }
            }
            L2: {
              var5 = ((bo) this).field_g.c(true);
              var2 = var5;
              if (((bo) this).field_g instanceof fd) {
                break L2;
              } else {
                if (var5 != null) {
                  ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
                  if (((bo) this).field_k != null) {
                    fd discarded$3 = ((bo) this).field_t.a(param0 + -116, ((bo) this).field_i, var5, ((bo) this).field_k);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L3: {
                        ((bo) this).field_g = null;
                        if (null != ((bo) this).field_r) {
                          ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return ((bo) this).field_q;
                    }
                  } else {
                    L4: {
                      ((bo) this).field_g = null;
                      if (null != ((bo) this).field_r) {
                        ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return ((bo) this).field_q;
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            if (var5 != null) {
              ((bo) this).field_q = new t(var5, ((bo) this).field_B, ((bo) this).field_z);
              if (((bo) this).field_j != ((bo) this).field_q.field_f) {
                throw new RuntimeException();
              } else {
                L5: {
                  ((bo) this).field_g = null;
                  if (null != ((bo) this).field_r) {
                    ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return ((bo) this).field_q;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return ((bo) this).field_q;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            pk.field_O.a(10, param0, param1, var4);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
        if (param3 != -2) {
            field_A = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        oi.field_a = param14;
        ko.field_u = param5;
        hh.a(param7, param11, param17, param18, -120);
        gj.a(param9, param6, param2, -20140);
        da.a(param15, param3, param8, -120, param13, param12);
        if (param4 != -1) {
            bo.c(-91);
        }
        b.a(param0, param1, (byte) -66);
        kb.a(param19, param16, param10, (byte) -118);
    }

    private final ll a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        Object stackIn_85_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        Object stackOut_84_0 = null;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        L0: {
          var10 = TetraLink.field_J;
          var4 = (Object) (Object) (ll) (Object) ((bo) this).field_m.a((long)param1, (byte) -43);
          if (var4 == null) {
            break L0;
          } else {
            if ((param0 ^ -1) != -1) {
              break L0;
            } else {
              if (((ll) var4).field_D) {
                break L0;
              } else {
                if (((ll) var4).field_v) {
                  ((ll) var4).b(false);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if ((param0 ^ -1) != -1) {
                if (1 == param0) {
                  if (((bo) this).field_r == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((bo) this).field_t.a(((bo) this).field_r, param1, 81);
                    break L2;
                  }
                } else {
                  L3: {
                    if (2 != param0) {
                      break L3;
                    } else {
                      if (((bo) this).field_r != null) {
                        if ((((bo) this).field_f[param1] ^ -1) == 0) {
                          if (!((bo) this).field_u.c(-7614)) {
                            var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, false);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            return null;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } else {
                L4: {
                  if (null == ((bo) this).field_r) {
                    break L4;
                  } else {
                    if (0 == (((bo) this).field_f[param1] ^ -1)) {
                      break L4;
                    } else {
                      var4 = (Object) (Object) ((bo) this).field_t.a((byte) -120, ((bo) this).field_r, param1);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (!((bo) this).field_u.b((byte) 119)) {
                  var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            ((bo) this).field_m.a((long)param1, -110, (mc) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (param2 > 117) {
          if (!((ll) var4).field_v) {
            var5 = ((ll) var4).c(true);
            if (var4 instanceof fd) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, -2 + var5.length);
                        var6_int = (int)co.field_r.getValue();
                        if ((((bo) this).field_q.field_u[param1] ^ -1) == (var6_int ^ -1)) {
                          L7: {
                            L8: {
                              if (((bo) this).field_q.field_e == null) {
                                break L8;
                              } else {
                                if (((bo) this).field_q.field_e[param1] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                  var8 = qb.a(var5, (byte) -89, var5.length - 2, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_69_0 = var7_ref_byte__[var9] ^ -1;
                                      stackOut_69_1 = var8[var9] ^ -1;
                                      stackIn_75_0 = stackOut_69_0;
                                      stackIn_75_1 = stackOut_69_1;
                                      stackIn_70_0 = stackOut_69_0;
                                      stackIn_70_1 = stackOut_69_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_70_0 != stackIn_70_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_74_0 = var5[var5.length - 1] & 255;
                            stackOut_74_1 = 65280 & var5[-2 + var5.length] << -1403728376;
                            stackIn_75_0 = stackOut_74_0;
                            stackIn_75_1 = stackOut_74_1;
                            break L7;
                          }
                          var7 = stackIn_75_0 + stackIn_75_1;
                          if (var7 != (65535 & ((bo) this).field_q.field_k[param1])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if ((((bo) this).field_f[param1] ^ -1) == -2) {
                                break L10;
                              } else {
                                L11: {
                                  if (((bo) this).field_f[param1] == 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((bo) this).field_f[param1] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (((ll) var4).field_D) {
                                break L12;
                              } else {
                                ((ll) var4).b(false);
                                break L12;
                              }
                            }
                            stackOut_84_0 = var4;
                            stackIn_85_0 = stackOut_84_0;
                            break L5;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (Exception) (Object) decompiledCaughtException;
                ((bo) this).field_f[param1] = (byte)-1;
                ((ll) var4).b(false);
                if (((ll) var4).field_D) {
                  if (!((bo) this).field_u.b((byte) 119)) {
                    var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                    ((bo) this).field_m.a((long)param1, -76, (mc) var4);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (ll) (Object) stackIn_85_0;
            } else {
              L13: {
                if (var5 == null) {
                  break L13;
                } else {
                  if (-3 > (var5.length ^ -1)) {
                    co.field_r.reset();
                    co.field_r.update(var5, 0, var5.length + -2);
                    var6_int = (int)co.field_r.getValue();
                    if ((((bo) this).field_q.field_u[param1] ^ -1) == (var6_int ^ -1)) {
                      L14: {
                        L15: {
                          L16: {
                            if (((bo) this).field_q.field_e == null) {
                              break L16;
                            } else {
                              if (null == ((bo) this).field_q.field_e[param1]) {
                                break L16;
                              } else {
                                var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                var8 = qb.a(var5, (byte) -89, -2 + var5.length, 0);
                                var9 = 0;
                                L17: while (true) {
                                  if (64 <= var9) {
                                    break L16;
                                  } else {
                                    stackOut_46_0 = var7_ref_byte__[var9];
                                    stackOut_46_1 = var8[var9];
                                    stackIn_53_0 = stackOut_46_0;
                                    stackIn_53_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L15;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L17;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ((bo) this).field_u.field_h = 0;
                          ((bo) this).field_u.field_d = 0;
                          var5[var5.length - 2] = (byte)(((bo) this).field_q.field_k[param1] >>> 929261416);
                          var5[var5.length - 1] = (byte)((bo) this).field_q.field_k[param1];
                          if (null != ((bo) this).field_r) {
                            fd discarded$1 = ((bo) this).field_t.a(-49, param1, var5, ((bo) this).field_r);
                            stackOut_52_0 = -2;
                            stackOut_52_1 = ((bo) this).field_f[param1] ^ -1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                        if (stackIn_53_0 != stackIn_53_1) {
                          ((bo) this).field_f[param1] = (byte) 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L18: {
                        if (((ll) var4).field_D) {
                          break L18;
                        } else {
                          ((ll) var4).b(false);
                          break L18;
                        }
                      }
                      return (ll) var4;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    break L13;
                  }
                }
              }
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    bo(int param0, sk param1, sk param2, th param3, ke param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((bo) this).field_m = new dj(16);
            ((bo) this).field_o = 0;
            ((bo) this).field_w = new je();
            ((bo) this).field_x = 0L;
            ((bo) this).field_i = param0;
            ((bo) this).field_r = param1;
            if (null == ((bo) this).field_r) {
              break L1;
            } else {
              ((bo) this).field_l = true;
              ((bo) this).field_v = new je();
              if (TetraLink.field_J == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((bo) this).field_l = false;
          break L0;
        }
        L2: {
          ((bo) this).field_z = param6;
          ((bo) this).field_B = param5;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((bo) this).field_n = stackIn_6_1 != 0;
          ((bo) this).field_j = param7;
          ((bo) this).field_t = param4;
          ((bo) this).field_k = param2;
          ((bo) this).field_u = param3;
          if (null == ((bo) this).field_k) {
            break L3;
          } else {
            ((bo) this).field_g = (ll) (Object) ((bo) this).field_t.a((byte) 111, ((bo) this).field_k, ((bo) this).field_i);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
