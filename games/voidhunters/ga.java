/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends fnb {
    private pfa field_f;
    private int field_n;
    private gnb field_u;
    private qp field_t;
    private fo field_l;
    private int field_p;
    private fo field_j;
    static llb field_s;
    private byte[] field_k;
    private int field_w;
    private ona field_g;
    private byte[] field_d;
    private jtb field_r;
    private boolean field_o;
    private ij field_v;
    private ij field_i;
    private int field_h;
    private boolean field_q;
    private long field_e;
    private boolean field_m;

    final qp a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        if (((ga) this).field_t != null) {
          return ((ga) this).field_t;
        } else {
          L0: {
            if (null == ((ga) this).field_r) {
              if (!((ga) this).field_g.d(126)) {
                ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 ^ -30, ((ga) this).field_p, (byte) 0, 255);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((ga) this).field_r.field_n) {
            if (param0 == 9) {
              L1: {
                var5 = ((ga) this).field_r.a(param0 ^ -97);
                var2 = var5;
                if (!(((ga) this).field_r instanceof jma)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((ga) this).field_t = new qp(var5, ((ga) this).field_n, ((ga) this).field_k);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((ga) this).field_g.a((byte) -25);
                      ((ga) this).field_t = null;
                      if (((ga) this).field_g.d(param0 ^ 89)) {
                        ((ga) this).field_r = null;
                        break L3;
                      } else {
                        ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 + -30, ((ga) this).field_p, (byte) 0, 255);
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (null != ((ga) this).field_j) {
                    jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_j, var5, (byte) 92, ((ga) this).field_p);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((ga) this).field_t = new qp(var5, ((ga) this).field_n, ((ga) this).field_k);
                        if (((ga) this).field_t.field_e == ((ga) this).field_w) {
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((ga) this).field_t = null;
                      if (((ga) this).field_g.d(121)) {
                        ((ga) this).field_r = null;
                        break L5;
                      } else {
                        ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, -21, ((ga) this).field_p, (byte) 0, 255);
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                ((ga) this).field_r = null;
                if (null != ((ga) this).field_l) {
                  ((ga) this).field_d = new byte[((ga) this).field_t.field_l];
                  break L6;
                } else {
                  break L6;
                }
              }
              return ((ga) this).field_t;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, boolean param1) {
        jtb var3 = (jtb) (Object) ((ga) this).field_u.a((long)param0, 122);
        if (!(var3 == null)) {
            return var3.e((byte) -4);
        }
        if (param1) {
            ga.c((byte) 114);
        }
        return 0;
    }

    final void b(int param0) {
        int var2_int = 0;
        jtb var2 = null;
        ksa var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = VoidHunters.field_G;
              if (((ga) this).field_i == null) {
                break L2;
              } else {
                if (((ga) this).a((byte) 9) != null) {
                  if (!((ga) this).field_o) {
                    if (!((ga) this).field_q) {
                      ((ga) this).field_i = null;
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((ga) this).field_i.d(0);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (((ga) this).field_h >= ((ga) this).field_t.field_j.length) {
                                break L5;
                              } else {
                                L6: {
                                  if (((ga) this).field_t.field_j[((ga) this).field_h] == 0) {
                                    break L6;
                                  } else {
                                    if (!((ga) this).field_g.b((byte) 32)) {
                                      L7: {
                                        if (((ga) this).field_d[((ga) this).field_h] != 1) {
                                          jtb discarded$4 = this.a(2, -26489, ((ga) this).field_h);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      if (1 != ((ga) this).field_d[((ga) this).field_h]) {
                                        var3 = new ksa();
                                        var3.field_b = (long)((ga) this).field_h;
                                        ((ga) this).field_i.b(-10258, var3);
                                        var2_int = 0;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      var2_int = 0;
                                      break L5;
                                    }
                                  }
                                }
                                ((ga) this).field_h = ((ga) this).field_h + 1;
                                continue L4;
                              }
                            }
                            if (var2_int != 0) {
                              ((ga) this).field_h = 0;
                              ((ga) this).field_q = false;
                              break L2;
                            } else {
                              L8: {
                                if (param0 <= -27) {
                                  break L8;
                                } else {
                                  ((ga) this).b((byte) -14);
                                  break L8;
                                }
                              }
                              if (!((ga) this).field_m) {
                                break L0;
                              } else {
                                if (((ga) this).field_e <= wt.a(false)) {
                                  var2 = (jtb) (Object) ((ga) this).field_u.c((byte) 48);
                                  L9: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (var2.field_n) {
                                          break L10;
                                        } else {
                                          if (var2.field_k) {
                                            if (var2.field_l) {
                                              var2.b(-3846);
                                              break L10;
                                            } else {
                                              throw new RuntimeException();
                                            }
                                          } else {
                                            var2.field_k = true;
                                            break L10;
                                          }
                                        }
                                      }
                                      var2 = (jtb) (Object) ((ga) this).field_u.b(-91);
                                      continue L9;
                                    }
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L11: {
                            var4 = (int)var3.field_b;
                            if (((ga) this).field_d[var4] != 1) {
                              jtb discarded$5 = this.a(2, -26489, var4);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (((ga) this).field_d[var4] != 1) {
                              var2_int = 0;
                              break L12;
                            } else {
                              var3.b(-3846);
                              break L12;
                            }
                          }
                          var3 = ((ga) this).field_i.a((byte) 121);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = ((ga) this).field_i.d(0);
                    L13: while (true) {
                      if (var3 == null) {
                        L14: while (true) {
                          L15: {
                            if (((ga) this).field_t.field_j.length <= ((ga) this).field_h) {
                              break L15;
                            } else {
                              L16: {
                                if (0 == ((ga) this).field_t.field_j[((ga) this).field_h]) {
                                  break L16;
                                } else {
                                  if (((ga) this).field_f.field_e < 250) {
                                    L17: {
                                      if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                        jtb discarded$6 = this.a(1, -26489, ((ga) this).field_h);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                      var3 = new ksa();
                                      var3.field_b = (long)((ga) this).field_h;
                                      var2_int = 0;
                                      ((ga) this).field_i.b(-10258, var3);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    var2_int = 0;
                                    break L15;
                                  }
                                }
                              }
                              ((ga) this).field_h = ((ga) this).field_h + 1;
                              continue L14;
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            ((ga) this).field_o = false;
                            ((ga) this).field_h = 0;
                            break L2;
                          }
                        }
                      } else {
                        L18: {
                          var4 = (int)var3.field_b;
                          if (((ga) this).field_d[var4] == 0) {
                            jtb discarded$7 = this.a(1, -26489, var4);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (((ga) this).field_d[var4] != 0) {
                            var3.b(-3846);
                            break L19;
                          } else {
                            var2_int = 0;
                            break L19;
                          }
                        }
                        var3 = ((ga) this).field_i.a((byte) 80);
                        continue L13;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (param0 <= -27) {
                break L20;
              } else {
                ((ga) this).b((byte) -14);
                break L20;
              }
            }
            if (!((ga) this).field_m) {
              break L0;
            } else {
              if (((ga) this).field_e <= wt.a(false)) {
                var2 = (jtb) (Object) ((ga) this).field_u.c((byte) 48);
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (var2.field_n) {
                        break L22;
                      } else {
                        if (var2.field_k) {
                          if (var2.field_l) {
                            var2.b(-3846);
                            break L22;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_k = true;
                          break L22;
                        }
                      }
                    }
                    var2 = (jtb) (Object) ((ga) this).field_u.b(-91);
                    continue L21;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          ((ga) this).field_e = wt.a(false) + 1000L;
          break L0;
        }
    }

    final void b(byte param0) {
        if (param0 > -9) {
            return;
        }
        if (null == ((ga) this).field_l) {
            return;
        }
        ((ga) this).field_q = true;
        if (((ga) this).field_i == null) {
            ((ga) this).field_i = new ij();
        }
    }

    final byte[] a(int param0, int param1) {
        jtb var3 = this.a(0, -26489, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.a(-95);
        if (param0 <= 112) {
            return null;
        }
        var3.b(-3846);
        return var4;
    }

    final void c(int param0) {
        ksa var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (((ga) this).field_i != null) {
          if (((ga) this).a((byte) 9) != null) {
            var2 = ((ga) this).field_v.d(param0);
            L0: while (true) {
              if (var2 == null) {
                return;
              } else {
                L1: {
                  L2: {
                    var3 = (int)var2.field_b;
                    if (0 > var3) {
                      break L2;
                    } else {
                      if (var3 >= ((ga) this).field_t.field_l) {
                        break L2;
                      } else {
                        if (((ga) this).field_t.field_j[var3] == 0) {
                          break L2;
                        } else {
                          L3: {
                            if (((ga) this).field_d[var3] == 0) {
                              jtb discarded$2 = this.a(1, -26489, var3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            if (((ga) this).field_d[var3] == -1) {
                              jtb discarded$3 = this.a(2, -26489, var3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (((ga) this).field_d[var3] != 1) {
                            break L1;
                          } else {
                            var2.b(-3846);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  var2.b(param0 + -3846);
                  break L1;
                }
                var2 = ((ga) this).field_v.a((byte) 10);
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        int var1 = 110 % ((param0 - -65) / 33);
        field_s = null;
    }

    private final jtb a(int param0, int param1, int param2) {
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
        Object stackIn_89_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_88_0 = null;
        L0: {
          var10 = VoidHunters.field_G;
          var4 = (Object) (Object) (jtb) (Object) ((ga) this).field_u.a((long)param2, 100);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((jtb) var4).field_l) {
                break L0;
              } else {
                if (!((jtb) var4).field_n) {
                  break L0;
                } else {
                  ((jtb) var4).b(-3846);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (param0 != 0) {
                if (param0 != 1) {
                  if (param0 == 2) {
                    if (((ga) this).field_l == null) {
                      throw new RuntimeException();
                    } else {
                      if (((ga) this).field_d[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((ga) this).field_g.b((byte) 32)) {
                          var4 = (Object) (Object) ((ga) this).field_g.a(false, -21, param2, (byte) 2, ((ga) this).field_p);
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
                  if (((ga) this).field_l == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((ga) this).field_f.a((byte) 121, ((ga) this).field_l, param2);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (null == ((ga) this).field_l) {
                    break L3;
                  } else {
                    if (((ga) this).field_d[param2] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((ga) this).field_f.a(param2, ((ga) this).field_l, (byte) 104);
                      break L2;
                    }
                  }
                }
                if (!((ga) this).field_g.d(104)) {
                  var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -119);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((jtb) var4).field_n) {
          var5 = ((jtb) var4).a(77);
          if (var4 instanceof jma) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      gkb.field_p.reset();
                      gkb.field_p.update(var5, 0, var5.length - 2);
                      var6_int = (int)gkb.field_p.getValue();
                      if (((ga) this).field_t.field_d[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((ga) this).field_t.field_c == null) {
                            break L6;
                          } else {
                            if (((ga) this).field_t.field_c[param2] != null) {
                              var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                              var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (64 <= var11) {
                                  break L6;
                                } else {
                                  if (var7_ref_byte__[var11] != var8[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7 = ((255 & var5[-2 + var5.length]) << 8) + (255 & var5[-1 + var5.length]);
                        if (var7 != (65535 & ((ga) this).field_t.field_h[param2])) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((ga) this).field_d[param2] == 1) {
                              break L8;
                            } else {
                              L9: {
                                if (((ga) this).field_d[param2] != 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((ga) this).field_d[param2] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (((jtb) var4).field_l) {
                              break L10;
                            } else {
                              ((jtb) var4).b(-3846);
                              break L10;
                            }
                          }
                          stackOut_88_0 = var4;
                          stackIn_89_0 = stackOut_88_0;
                          break L4;
                        }
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
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((ga) this).field_d[param2] = (byte) -1;
              ((jtb) var4).b(-3846);
              if (((jtb) var4).field_l) {
                if (!((ga) this).field_g.d(92)) {
                  var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                  ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -127);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (jtb) (Object) stackIn_89_0;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 < var5.length) {
                      gkb.field_p.reset();
                      gkb.field_p.update(var5, 0, var5.length - 2);
                      var6_int = (int)gkb.field_p.getValue();
                      if (((ga) this).field_t.field_d[param2] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L13: {
                          if (((ga) this).field_t.field_c == null) {
                            break L13;
                          } else {
                            if (((ga) this).field_t.field_c[param2] != null) {
                              var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                              var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var8[var9] == var7_ref_byte__[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        ((ga) this).field_g.field_g = 0;
                        ((ga) this).field_g.field_k = 0;
                        break L11;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L15: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((ga) this).field_g.a((byte) -25);
                ((jtb) var4).b(-3846);
                if (((jtb) var4).field_l) {
                  if (!((ga) this).field_g.d(54)) {
                    var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                    ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -118);
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            L16: {
              var5[var5.length + -2] = (byte)(((ga) this).field_t.field_h[param2] >>> 8);
              var5[-1 + var5.length] = (byte)((ga) this).field_t.field_h[param2];
              if (null == ((ga) this).field_l) {
                break L16;
              } else {
                jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_l, var5, (byte) 111, param2);
                if (((ga) this).field_d[param2] == 1) {
                  break L16;
                } else {
                  ((ga) this).field_d[param2] = (byte) 1;
                  break L16;
                }
              }
            }
            L17: {
              if (((jtb) var4).field_l) {
                break L17;
              } else {
                ((jtb) var4).b(-3846);
                break L17;
              }
            }
            return (jtb) var4;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (!li.field_i) {
            dma.e(param2, param3, param5, param4, param6, param0);
        } else {
            if (ne.field_v) {
                og.field_r.a(param5, (byte) 120, param6 | param0 << 24, param4, param3, param2);
            }
        }
        field_s = null;
    }

    ga(int param0, fo param1, fo param2, ona param3, pfa param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ga) this).field_u = new gnb(16);
        ((ga) this).field_h = 0;
        ((ga) this).field_v = new ij();
        ((ga) this).field_e = 0L;
        try {
          L0: {
            L1: {
              ((ga) this).field_p = param0;
              ((ga) this).field_l = param1;
              if (null == ((ga) this).field_l) {
                ((ga) this).field_o = false;
                break L1;
              } else {
                ((ga) this).field_o = true;
                ((ga) this).field_i = new ij();
                break L1;
              }
            }
            L2: {
              ((ga) this).field_j = param2;
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
              ((ga) this).field_m = stackIn_7_1 != 0;
              ((ga) this).field_f = param4;
              ((ga) this).field_g = param3;
              ((ga) this).field_k = param6;
              ((ga) this).field_w = param7;
              ((ga) this).field_n = param5;
              if (((ga) this).field_j == null) {
                break L3;
              } else {
                ((ga) this).field_r = (jtb) (Object) ((ga) this).field_f.a(((ga) this).field_p, ((ga) this).field_j, (byte) -65);
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
            stackOut_10_1 = new StringBuilder().append("ga.<init>(").append(param0).append(',');
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
