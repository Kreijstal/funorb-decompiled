/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends uk {
    static int[] field_p;
    private um field_n;
    private int field_l;
    private byte[] field_v;
    private jm field_i;
    private wc field_x;
    private int field_B;
    private byte[] field_r;
    static int field_m;
    private ae field_j;
    private um field_q;
    static ji field_s;
    static bd field_y;
    private int field_g;
    private ej field_h;
    private dh field_t;
    private vl field_w;
    private int field_A;
    private boolean field_z;
    private boolean field_o;
    private vl field_u;
    private long field_k;
    private boolean field_f;

    final int b(int param0, int param1) {
        ae var3 = (ae) (Object) ((rb) this).field_i.a(false, (long)param1);
        int var4 = 5 / ((33 - param0) / 52);
        if (var3 == null) {
            return 0;
        }
        return var3.d(-94);
    }

    private final ae a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_88_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_87_0 = null;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          var4 = (Object) (Object) (ae) (Object) ((rb) this).field_i.a(false, (long)param0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((ae) var4).field_w) {
                break L0;
              } else {
                if (!((ae) var4).field_v) {
                  break L0;
                } else {
                  ((ae) var4).b(-37);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if (param1 == 0) {
                L3: {
                  if (((rb) this).field_q == null) {
                    break L3;
                  } else {
                    if (((rb) this).field_r[param0] != -1) {
                      var4 = (Object) (Object) ((rb) this).field_t.a(((rb) this).field_q, param0, -27337);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((rb) this).field_h.a(20)) {
                  var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 != param1) {
                  if (param1 == 2) {
                    if (((rb) this).field_q == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 != ((rb) this).field_r[param0]) {
                        throw new RuntimeException();
                      } else {
                        if (!((rb) this).field_h.b(5)) {
                          var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, false);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (((rb) this).field_q != null) {
                    var4 = (Object) (Object) ((rb) this).field_t.a(((rb) this).field_q, (byte) -127, param0);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((rb) this).field_i.a(-97, (long)param0, (am) var4);
            break L1;
          }
        }
        if (!((ae) var4).field_v) {
          var5 = ((ae) var4).c((byte) 127);
          if (var4 instanceof rh) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      td.field_a.reset();
                      td.field_a.update(var5, 0, var5.length + -2);
                      var6_int = (int)td.field_a.getValue();
                      if (var6_int == ((rb) this).field_x.field_v[param0]) {
                        L6: {
                          if (null == ((rb) this).field_x.field_w) {
                            break L6;
                          } else {
                            if (((rb) this).field_x.field_w[param0] == null) {
                              break L6;
                            } else {
                              var7_ref_byte__ = ((rb) this).field_x.field_w[param0];
                              var8 = ld.a(var5, 0, 125, -2 + var5.length);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] != var7_ref_byte__[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7 = (255 & var5[var5.length + -1]) + ((255 & var5[-2 + var5.length]) << 8);
                        if ((65535 & ((rb) this).field_x.field_i[param0]) != var7) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((rb) this).field_r[param0] == -2) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 != ((rb) this).field_r[param0]) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((rb) this).field_r[param0] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (((ae) var4).field_w) {
                              break L10;
                            } else {
                              ((ae) var4).b(-116);
                              break L10;
                            }
                          }
                          stackOut_87_0 = var4;
                          stackIn_88_0 = stackOut_87_0;
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L11: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((rb) this).field_r[param0] = (byte) -1;
                ((ae) var4).b(113);
                if (((ae) var4).field_w) {
                  if (!((rb) this).field_h.a(20)) {
                    var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                    ((rb) this).field_i.a(-114, (long)param0, (am) var4);
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (ae) (Object) stackIn_88_0;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var5.length) {
                      td.field_a.reset();
                      td.field_a.update(var5, 0, var5.length + -2);
                      var6_int = (int)td.field_a.getValue();
                      if (((rb) this).field_x.field_v[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (((rb) this).field_x.field_w == null) {
                            break L14;
                          } else {
                            if (null != ((rb) this).field_x.field_w[param0]) {
                              var7_ref_byte__ = ((rb) this).field_x.field_w[param0];
                              var8 = ld.a(var5, 0, 104, var5.length + -2);
                              var9 = 0;
                              L15: while (true) {
                                if (var9 >= 64) {
                                  break L14;
                                } else {
                                  if (var7_ref_byte__[var9] == var8[var9]) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((rb) this).field_h.field_k = 0;
                        ((rb) this).field_h.field_e = 0;
                        break L12;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              ((rb) this).field_h.c(194);
              ((ae) var4).b(-9);
              if (((ae) var4).field_w) {
                L16: {
                  if (!((rb) this).field_h.a(20)) {
                    var4 = (Object) (Object) ((rb) this).field_h.a((byte) 2, ((rb) this).field_g, param0, -18986, true);
                    ((rb) this).field_i.a(-106, (long)param0, (am) var4);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L17: {
              var5[-2 + var5.length] = (byte)(((rb) this).field_x.field_i[param0] >>> 8);
              var5[var5.length + -1] = (byte)((rb) this).field_x.field_i[param0];
              if (null != ((rb) this).field_q) {
                rh discarded$1 = ((rb) this).field_t.a(((rb) this).field_q, -4, var5, param0);
                if (((rb) this).field_r[param0] == 1) {
                  break L17;
                } else {
                  ((rb) this).field_r[param0] = (byte) 1;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (!((ae) var4).field_w) {
                ((ae) var4).b(26);
                break L18;
              } else {
                break L18;
              }
            }
            return (ae) var4;
          }
        } else {
          return null;
        }
    }

    final static void e() {
        vc.field_i[93] = 43;
        vc.field_i[47] = 73;
        vc.field_i[222] = 58;
        vc.field_i[192] = 28;
        vc.field_i[520] = 59;
        vc.field_i[92] = 74;
        vc.field_i[44] = 71;
        vc.field_i[91] = 42;
        vc.field_i[45] = 26;
        vc.field_i[61] = 27;
        vc.field_i[46] = 72;
        vc.field_i[59] = 57;
    }

    final byte[] a(byte param0, int param1) {
        ae var3 = this.a(param1, 0, false);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c((byte) 127);
        var3.b(-76);
        if (param0 != -50) {
            int discarded$0 = ((rb) this).b(-104, 72);
        }
        return var4;
    }

    final void f(int param0) {
        int var2_int = 0;
        ae var2 = null;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = HostileSpawn.field_I ? 1 : 0;
              if (null != ((rb) this).field_w) {
                if (((rb) this).c(3) != null) {
                  if (((rb) this).field_o) {
                    var2_int = 1;
                    var3 = ((rb) this).field_w.g(-81);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (((rb) this).field_A >= ((rb) this).field_x.field_o.length) {
                              break L5;
                            } else {
                              L6: {
                                if (((rb) this).field_x.field_o[((rb) this).field_A] == 0) {
                                  break L6;
                                } else {
                                  if (((rb) this).field_t.field_e >= 250) {
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    L7: {
                                      if (0 != ((rb) this).field_r[((rb) this).field_A]) {
                                        break L7;
                                      } else {
                                        ae discarded$4 = this.a(((rb) this).field_A, 1, false);
                                        break L7;
                                      }
                                    }
                                    if (((rb) this).field_r[((rb) this).field_A] != 0) {
                                      break L6;
                                    } else {
                                      var3 = new am();
                                      var3.field_c = (long)((rb) this).field_A;
                                      var2_int = 0;
                                      ((rb) this).field_w.a(var3, 90);
                                      break L6;
                                    }
                                  }
                                }
                              }
                              ((rb) this).field_A = ((rb) this).field_A + 1;
                              continue L4;
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            ((rb) this).field_A = 0;
                            ((rb) this).field_o = false;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_c;
                          if (((rb) this).field_r[var4] != 0) {
                            break L8;
                          } else {
                            ae discarded$5 = this.a(var4, 1, false);
                            break L8;
                          }
                        }
                        L9: {
                          if (((rb) this).field_r[var4] == 0) {
                            var2_int = 0;
                            break L9;
                          } else {
                            var3.b(126);
                            break L9;
                          }
                        }
                        var3 = ((rb) this).field_w.a(12684);
                        continue L3;
                      }
                    }
                  } else {
                    if (((rb) this).field_z) {
                      var2_int = 1;
                      var3 = ((rb) this).field_w.g(-100);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (((rb) this).field_A >= ((rb) this).field_x.field_o.length) {
                                break L12;
                              } else {
                                if (((rb) this).field_x.field_o[((rb) this).field_A] != 0) {
                                  if (!((rb) this).field_h.b(param0 ^ -6)) {
                                    L13: {
                                      if (1 != ((rb) this).field_r[((rb) this).field_A]) {
                                        ae discarded$6 = this.a(((rb) this).field_A, 2, false);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (((rb) this).field_r[((rb) this).field_A] == 1) {
                                        break L14;
                                      } else {
                                        var3 = new am();
                                        var3.field_c = (long)((rb) this).field_A;
                                        ((rb) this).field_w.a(var3, 81);
                                        var2_int = 0;
                                        break L14;
                                      }
                                    }
                                    ((rb) this).field_A = ((rb) this).field_A + 1;
                                    continue L11;
                                  } else {
                                    var2_int = 0;
                                    break L12;
                                  }
                                } else {
                                  ((rb) this).field_A = ((rb) this).field_A + 1;
                                  continue L11;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              ((rb) this).field_A = 0;
                              ((rb) this).field_z = false;
                              break L2;
                            } else {
                              L15: {
                                if (param0 == -1) {
                                  break L15;
                                } else {
                                  field_p = null;
                                  break L15;
                                }
                              }
                              if (!((rb) this).field_f) {
                                break L0;
                              } else {
                                if (((rb) this).field_k > hn.a((byte) 80)) {
                                  break L0;
                                } else {
                                  var2 = (ae) (Object) ((rb) this).field_i.a(-93);
                                  L16: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L17: {
                                        if (var2.field_v) {
                                          break L17;
                                        } else {
                                          if (!var2.field_t) {
                                            var2.field_t = true;
                                            break L17;
                                          } else {
                                            if (!var2.field_w) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.b(20);
                                              break L17;
                                            }
                                          }
                                        }
                                      }
                                      var2 = (ae) (Object) ((rb) this).field_i.b(param0);
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            var4 = (int)var3.field_c;
                            if (1 == ((rb) this).field_r[var4]) {
                              break L18;
                            } else {
                              ae discarded$7 = this.a(var4, 2, false);
                              break L18;
                            }
                          }
                          L19: {
                            if (((rb) this).field_r[var4] != 1) {
                              var2_int = 0;
                              break L19;
                            } else {
                              var3.b(-124);
                              break L19;
                            }
                          }
                          var3 = ((rb) this).field_w.a(param0 + 12685);
                          continue L10;
                        }
                      }
                    } else {
                      ((rb) this).field_w = null;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                break L2;
              }
            }
            L20: {
              if (param0 == -1) {
                break L20;
              } else {
                field_p = null;
                break L20;
              }
            }
            if (!((rb) this).field_f) {
              break L0;
            } else {
              if (((rb) this).field_k > hn.a((byte) 80)) {
                break L0;
              } else {
                var2 = (ae) (Object) ((rb) this).field_i.a(-93);
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (var2.field_v) {
                        break L22;
                      } else {
                        if (!var2.field_t) {
                          var2.field_t = true;
                          break L22;
                        } else {
                          if (!var2.field_w) {
                            throw new RuntimeException();
                          } else {
                            var2.b(20);
                            break L22;
                          }
                        }
                      }
                    }
                    var2 = (ae) (Object) ((rb) this).field_i.b(param0);
                    continue L21;
                  }
                }
              }
            }
          }
          ((rb) this).field_k = 1000L + hn.a((byte) 80);
          break L0;
        }
    }

    final wc c(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (((rb) this).field_x != null) {
          return ((rb) this).field_x;
        } else {
          L0: {
            if (null != ((rb) this).field_j) {
              break L0;
            } else {
              if (!((rb) this).field_h.a(param0 ^ 23)) {
                ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((rb) this).field_j.field_v) {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                wc discarded$2 = ((rb) this).c(-109);
                break L1;
              }
            }
            L2: {
              var5 = ((rb) this).field_j.c((byte) 127);
              var2 = var5;
              if (!(((rb) this).field_j instanceof rh)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((rb) this).field_x = new wc(var5, ((rb) this).field_l, ((rb) this).field_v);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((rb) this).field_h.c(194);
                    ((rb) this).field_x = null;
                    if (((rb) this).field_h.a(20)) {
                      ((rb) this).field_j = null;
                      break L4;
                    } else {
                      ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                      break L4;
                    }
                  }
                  return null;
                }
                if (((rb) this).field_n != null) {
                  rh discarded$3 = ((rb) this).field_t.a(((rb) this).field_n, -4, var5, ((rb) this).field_g);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      ((rb) this).field_x = new wc(var5, ((rb) this).field_l, ((rb) this).field_v);
                      if (((rb) this).field_B != ((rb) this).field_x.field_n) {
                        throw new RuntimeException();
                      } else {
                        break L5;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((rb) this).field_x = null;
                    if (!((rb) this).field_h.a(20)) {
                      ((rb) this).field_j = (ae) (Object) ((rb) this).field_h.a((byte) 0, 255, ((rb) this).field_g, -18986, true);
                      break L6;
                    } else {
                      ((rb) this).field_j = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              ((rb) this).field_j = null;
              if (((rb) this).field_q != null) {
                ((rb) this).field_r = new byte[((rb) this).field_x.field_c];
                break L7;
              } else {
                break L7;
              }
            }
            return ((rb) this).field_x;
          } else {
            return null;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 20) {
            field_y = null;
        }
        if (((rb) this).field_w == null) {
            return;
        }
        if (!(null != ((rb) this).c(3))) {
            return;
        }
        am var2 = ((rb) this).field_u.g(-6);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (var3 < 0) {
                var2.b(113);
            } else {
                if (var3 >= ((rb) this).field_x.field_c) {
                    var2.b(113);
                } else {
                    if (((rb) this).field_x.field_o[var3] == -1) {
                        var2.b(113);
                    } else {
                        if (!(-1 != ((rb) this).field_r[var3])) {
                            ae discarded$0 = this.a(var3, 1, false);
                        }
                        if (-1 == ((rb) this).field_r[var3]) {
                            ae discarded$1 = this.a(var3, 2, false);
                        }
                        if (1 == ((rb) this).field_r[var3]) {
                            var2.b(-79);
                        }
                    }
                }
            }
            var2 = ((rb) this).field_u.a(12684);
        }
    }

    public static void a() {
        field_s = null;
        field_p = null;
        field_y = null;
    }

    final void a(byte param0) {
        if (!(((rb) this).field_q != null)) {
            return;
        }
        if (param0 != -50) {
            ((rb) this).field_r = null;
        }
        ((rb) this).field_z = true;
        if (!(null != ((rb) this).field_w)) {
            ((rb) this).field_w = new vl();
        }
    }

    rb(int param0, um param1, um param2, ej param3, dh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((rb) this).field_i = new jm(16);
        ((rb) this).field_A = 0;
        ((rb) this).field_u = new vl();
        ((rb) this).field_k = 0L;
        try {
          L0: {
            L1: {
              ((rb) this).field_g = param0;
              ((rb) this).field_q = param1;
              if (null == ((rb) this).field_q) {
                ((rb) this).field_o = false;
                break L1;
              } else {
                ((rb) this).field_o = true;
                ((rb) this).field_w = new vl();
                break L1;
              }
            }
            L2: {
              ((rb) this).field_l = param5;
              ((rb) this).field_v = param6;
              ((rb) this).field_t = param4;
              ((rb) this).field_B = param7;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((rb) this).field_f = stackIn_7_1 != 0;
              ((rb) this).field_h = param3;
              ((rb) this).field_n = param2;
              if (null == ((rb) this).field_n) {
                break L3;
              } else {
                ((rb) this).field_j = (ae) (Object) ((rb) this).field_t.a(((rb) this).field_n, ((rb) this).field_g, -27337);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("rb.<init>(").append(param0).append(44);
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[8192];
        field_m = 0;
    }
}
