/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wd {
    static String field_z;
    private lb field_y;
    private kh field_g;
    private byte[] field_x;
    private int field_i;
    private tg field_v;
    static il field_q;
    private byte[] field_m;
    private n field_s;
    private ik field_j;
    private ik field_u;
    private int field_t;
    private int field_l;
    private gb field_k;
    private boolean field_h;
    private int field_w;
    private vd field_n;
    private boolean field_p;
    private vd field_A;
    private long field_o;
    private boolean field_r;

    final void f(int param0) {
        if (param0 <= 49) {
            ((de) this).field_n = null;
        }
        if (((de) this).field_j == null) {
            return;
        }
        ((de) this).field_h = true;
        if (((de) this).field_A == null) {
            ((de) this).field_A = new vd();
        }
    }

    final void a(boolean param0) {
        gi var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            int discarded$4 = ((de) this).a(-70, 35);
            break L0;
          }
        }
        if (((de) this).field_A != null) {
          if (((de) this).a((byte) -101) == null) {
            return;
          } else {
            var2 = ((de) this).field_n.h(-11151);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_g;
                  if (var3 < 0) {
                    break L2;
                  } else {
                    if (var3 >= ((de) this).field_g.field_m) {
                      break L2;
                    } else {
                      if (0 == ((de) this).field_g.field_k[var3]) {
                        break L2;
                      } else {
                        L3: {
                          if (((de) this).field_m[var3] == 0) {
                            lb discarded$5 = this.a(65, var3, 1);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (((de) this).field_m[var3] == -1) {
                            lb discarded$6 = this.a(65, var3, 2);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (((de) this).field_m[var3] == 1) {
                            var2.a(-16175);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2 = ((de) this).field_n.e(0);
                        continue L1;
                      }
                    }
                  }
                }
                var2.a(-16175);
                var2 = ((de) this).field_n.e(0);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void d() {
        field_z = null;
        field_q = null;
    }

    final int a(int param0, int param1) {
        lb var3 = (lb) (Object) ((de) this).field_v.a(true, (long)param0);
        if (param1 != -1) {
            return 94;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.g(-58);
    }

    final static boolean a(char param0) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 48) {
                break L2;
              } else {
                if (param0 <= 57) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param0) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L1;
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L0;
        }
        return stackIn_11_0 != 0;
    }

    final byte[] b(int param0, int param1) {
        if (param1 != 60) {
            return null;
        }
        lb var3 = this.a(65, param0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.i(13095);
        var3.a(-16175);
        return var4;
    }

    final void c(int param0) {
        int var2_int = 0;
        lb var2 = null;
        gi var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (null == ((de) this).field_A) {
            break L0;
          } else {
            if (((de) this).a((byte) -57) != null) {
              if (!((de) this).field_p) {
                if (((de) this).field_h) {
                  var2_int = 1;
                  var3 = ((de) this).field_A.h(-11151);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (((de) this).field_g.field_k.length <= ((de) this).field_w) {
                            break L3;
                          } else {
                            L4: {
                              if (((de) this).field_g.field_k[((de) this).field_w] == 0) {
                                break L4;
                              } else {
                                if (!((de) this).field_k.c(20)) {
                                  L5: {
                                    if (((de) this).field_m[((de) this).field_w] != 1) {
                                      lb discarded$4 = this.a(65, ((de) this).field_w, 2);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (1 != ((de) this).field_m[((de) this).field_w]) {
                                    var3 = new gi();
                                    var3.field_g = (long)((de) this).field_w;
                                    var2_int = 0;
                                    ((de) this).field_A.a(var3, 255);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L3;
                                }
                              }
                            }
                            ((de) this).field_w = ((de) this).field_w + 1;
                            continue L2;
                          }
                        }
                        if (var2_int != 0) {
                          ((de) this).field_w = 0;
                          ((de) this).field_h = false;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_g;
                        if (-2 == ((de) this).field_m[var4]) {
                          break L6;
                        } else {
                          lb discarded$5 = this.a(65, var4, 2);
                          break L6;
                        }
                      }
                      L7: {
                        if (-2 == ((de) this).field_m[var4]) {
                          var3.a(-16175);
                          break L7;
                        } else {
                          var2_int = 0;
                          break L7;
                        }
                      }
                      var3 = ((de) this).field_A.e(0);
                      continue L1;
                    }
                  }
                } else {
                  ((de) this).field_A = null;
                  break L0;
                }
              } else {
                var2_int = 1;
                var3 = ((de) this).field_A.h(param0 ^ -11248);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (((de) this).field_w >= ((de) this).field_g.field_k.length) {
                          break L10;
                        } else {
                          L11: {
                            if (((de) this).field_g.field_k[((de) this).field_w] == 0) {
                              break L11;
                            } else {
                              if (-251 >= ((de) this).field_s.field_e) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L12: {
                                  if (-1 == ((de) this).field_m[((de) this).field_w]) {
                                    lb discarded$6 = this.a(65, ((de) this).field_w, 1);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (((de) this).field_m[((de) this).field_w] == 0) {
                                  var3 = new gi();
                                  var3.field_g = (long)((de) this).field_w;
                                  var2_int = 0;
                                  ((de) this).field_A.a(var3, 255);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          ((de) this).field_w = ((de) this).field_w + 1;
                          continue L9;
                        }
                      }
                      if (var2_int != 0) {
                        ((de) this).field_p = false;
                        ((de) this).field_w = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_g;
                      if (((de) this).field_m[var4] != 0) {
                        break L13;
                      } else {
                        lb discarded$7 = this.a(65, var4, 1);
                        break L13;
                      }
                    }
                    L14: {
                      if (((de) this).field_m[var4] == 0) {
                        var2_int = 0;
                        break L14;
                      } else {
                        var3.a(-16175);
                        break L14;
                      }
                    }
                    var3 = ((de) this).field_A.e(param0 + -97);
                    continue L8;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
        if (param0 == 97) {
          L15: {
            if (!((de) this).field_r) {
              break L15;
            } else {
              if (((de) this).field_o <= la.a(false)) {
                var2 = (lb) (Object) ((de) this).field_v.b(-1);
                L16: while (true) {
                  if (var2 == null) {
                    ((de) this).field_o = la.a(false) + 1000L;
                    break L15;
                  } else {
                    L17: {
                      if (var2.field_u) {
                        break L17;
                      } else {
                        if (var2.field_E) {
                          if (var2.field_y) {
                            var2.a(-16175);
                            break L17;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_E = true;
                          break L17;
                        }
                      }
                    }
                    var2 = (lb) (Object) ((de) this).field_v.a((byte) -114);
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final lb a(int param0, int param1, int param2) {
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
        Object stackIn_87_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_86_0 = null;
        L0: {
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var4 = (Object) (Object) (lb) (Object) ((de) this).field_v.a(true, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (param2 != 0) {
              break L0;
            } else {
              if (((lb) var4).field_y) {
                break L0;
              } else {
                if (!((lb) var4).field_u) {
                  break L0;
                } else {
                  ((lb) var4).a(-16175);
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
              if (param2 == 0) {
                L3: {
                  if (null == ((de) this).field_j) {
                    break L3;
                  } else {
                    if (((de) this).field_m[param1] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((de) this).field_s.a(6, param1, ((de) this).field_j);
                      break L2;
                    }
                  }
                }
                if (!((de) this).field_k.a(true)) {
                  var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (param2 != 1) {
                  if (param2 == 2) {
                    if (null != ((de) this).field_j) {
                      if (((de) this).field_m[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((de) this).field_k.c(20)) {
                          var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, false);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (null != ((de) this).field_j) {
                    var4 = (Object) (Object) ((de) this).field_s.a(((de) this).field_j, param1, 7);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((de) this).field_v.a((gi) var4, (long)param1, -1);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((lb) var4).field_u) {
          var5 = ((lb) var4).i(13095);
          if (var4 instanceof bi) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length > 2) {
                      ta.field_b.reset();
                      ta.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ta.field_b.getValue();
                      if (var6_int != ((de) this).field_g.field_j[param1]) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((de) this).field_g.field_q == null) {
                            break L6;
                          } else {
                            if (null != ((de) this).field_g.field_q[param1]) {
                              var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                              var8 = b.a(0, 90, var5, -2 + var5.length);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var7_ref_byte__[var11] == var8[var11]) {
                                    var11++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7 = (var5[var5.length - 1] & 255) + ((var5[var5.length + -2] & 255) << 8);
                        if (var7 == (((de) this).field_g.field_l[param1] & 65535)) {
                          L8: {
                            if (((de) this).field_m[param1] != 1) {
                              L9: {
                                if (((de) this).field_m[param1] == 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((de) this).field_m[param1] = (byte) 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L10: {
                            if (!((lb) var4).field_y) {
                              ((lb) var4).a(-16175);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          stackOut_86_0 = var4;
                          stackIn_87_0 = stackOut_86_0;
                          break L4;
                        } else {
                          throw new RuntimeException();
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
              L11: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((de) this).field_m[param1] = (byte) -1;
                ((lb) var4).a(-16175);
                if (((lb) var4).field_y) {
                  if (!((de) this).field_k.a(true)) {
                    var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                    ((de) this).field_v.a((gi) var4, (long)param1, -1);
                    break L11;
                  } else {
                    return null;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (lb) (Object) stackIn_87_0;
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var5.length) {
                      ta.field_b.reset();
                      ta.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ta.field_b.getValue();
                      if (((de) this).field_g.field_j[param1] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (null == ((de) this).field_g.field_q) {
                            break L14;
                          } else {
                            if (((de) this).field_g.field_q[param1] != null) {
                              var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                              var8 = b.a(0, 56, var5, var5.length - 2);
                              var9 = 0;
                              L15: while (true) {
                                if (64 <= var9) {
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
                        ((de) this).field_k.field_c = 0;
                        ((de) this).field_k.field_h = 0;
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
              L16: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((de) this).field_k.b((byte) 122);
                ((lb) var4).a(-16175);
                if (((lb) var4).field_y) {
                  if (!((de) this).field_k.a(true)) {
                    var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                    ((de) this).field_v.a((gi) var4, (long)param1, -1);
                    break L16;
                  } else {
                    return null;
                  }
                } else {
                  break L16;
                }
              }
              return null;
            }
            L17: {
              var5[var5.length + -2] = (byte)(((de) this).field_g.field_l[param1] >>> 8);
              var5[var5.length - 1] = (byte)((de) this).field_g.field_l[param1];
              if (((de) this).field_j != null) {
                bi discarded$1 = ((de) this).field_s.a(param1, ((de) this).field_j, var5, -127);
                if (((de) this).field_m[param1] == 1) {
                  break L17;
                } else {
                  ((de) this).field_m[param1] = (byte) 1;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (((lb) var4).field_y) {
                break L18;
              } else {
                ((lb) var4).a(-16175);
                break L18;
              }
            }
            return (lb) var4;
          }
        } else {
          return null;
        }
    }

    final kh a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 <= -36) {
            break L0;
          } else {
            kh discarded$2 = ((de) this).a((byte) 56);
            break L0;
          }
        }
        if (null != ((de) this).field_g) {
          return ((de) this).field_g;
        } else {
          L1: {
            if (null == ((de) this).field_y) {
              if (!((de) this).field_k.a(true)) {
                ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((de) this).field_y.field_u) {
            L2: {
              var5 = ((de) this).field_y.i(13095);
              var2 = var5;
              if (((de) this).field_y instanceof bi) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((de) this).field_g = new kh(var5, ((de) this).field_l, ((de) this).field_x);
                      if (((de) this).field_t != ((de) this).field_g.field_t) {
                        throw new RuntimeException();
                      } else {
                        break L3;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((de) this).field_g = null;
                    if (!((de) this).field_k.a(true)) {
                      ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                      break L4;
                    } else {
                      ((de) this).field_y = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      ((de) this).field_g = new kh(var5, ((de) this).field_l, ((de) this).field_x);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((de) this).field_k.b((byte) 122);
                    ((de) this).field_g = null;
                    if (!((de) this).field_k.a(true)) {
                      ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                      break L6;
                    } else {
                      ((de) this).field_y = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (((de) this).field_u != null) {
                  bi discarded$3 = ((de) this).field_s.a(((de) this).field_i, ((de) this).field_u, var5, 49);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              if (null != ((de) this).field_j) {
                ((de) this).field_m = new byte[((de) this).field_g.field_m];
                break L7;
              } else {
                break L7;
              }
            }
            ((de) this).field_y = null;
            return ((de) this).field_g;
          } else {
            return null;
          }
        }
    }

    final static void e(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (pj.field_G != null) {
            var1 = (Object) (Object) pj.field_G;
            synchronized (var1) {
              L1: {
                pj.field_G = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 <= -83) {
            break L2;
          } else {
            de.e(56);
            break L2;
          }
        }
    }

    de(int param0, ik param1, ik param2, gb param3, n param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((de) this).field_v = new tg(16);
        ((de) this).field_w = 0;
        ((de) this).field_n = new vd();
        ((de) this).field_o = 0L;
        try {
          L0: {
            L1: {
              ((de) this).field_j = param1;
              ((de) this).field_i = param0;
              if (null == ((de) this).field_j) {
                ((de) this).field_p = false;
                break L1;
              } else {
                ((de) this).field_p = true;
                ((de) this).field_A = new vd();
                break L1;
              }
            }
            L2: {
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
              ((de) this).field_r = stackIn_7_1 != 0;
              ((de) this).field_t = param7;
              ((de) this).field_k = param3;
              ((de) this).field_x = param6;
              ((de) this).field_s = param4;
              ((de) this).field_l = param5;
              ((de) this).field_u = param2;
              if (null == ((de) this).field_u) {
                break L3;
              } else {
                ((de) this).field_y = (lb) (Object) ((de) this).field_s.a(6, ((de) this).field_i, ((de) this).field_u);
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
            stackOut_10_1 = new StringBuilder().append("de.<init>(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
