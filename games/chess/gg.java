/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    private int field_x;
    static String field_l;
    static boolean field_n;
    private int field_u;
    static String field_e;
    private int field_r;
    private int field_w;
    private int field_h;
    private boolean field_c;
    static byte[][] field_y;
    private int field_i;
    private int field_o;
    private float field_d;
    static String field_a;
    private int field_s;
    private int field_t;
    static String field_q;
    static String field_z;
    private int field_v;
    private bm field_f;
    static String field_g;
    static String field_k;
    private int field_A;
    private int field_p;
    private int field_j;
    private int field_b;
    private int field_m;

    public static void c() {
        field_e = null;
        field_q = null;
        field_z = null;
        field_a = null;
        field_l = null;
        field_g = null;
        field_k = null;
        field_y = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        var2 = ((gg) this).field_p;
        var3 = ((gg) this).field_h;
        if (param0 != -21187) {
          this.d(47);
          if (!((gg) this).b(-1)) {
            ((gg) this).field_c = false;
            return;
          } else {
            if (((gg) this).field_o >= var3) {
              L0: {
                if (((gg) this).field_v <= var3) {
                  break L0;
                } else {
                  var3 = ((gg) this).field_v;
                  break L0;
                }
              }
              if (var2 <= ((gg) this).field_m) {
                L1: {
                  if (var2 >= ((gg) this).field_i) {
                    break L1;
                  } else {
                    var2 = ((gg) this).field_i;
                    break L1;
                  }
                }
                L2: {
                  if (((gg) this).field_d <= 0.0f) {
                    break L2;
                  } else {
                    var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((gg) this).field_d);
                      break L2;
                    } else {
                      if (var4 >= var2) {
                        break L2;
                      } else {
                        var2 = var4;
                        if (tm.field_c != var2) {
                          L3: {
                            ((gg) this).field_f.a(var3, var2, (byte) 91);
                            if (0 >= ((gg) this).field_p) {
                              break L3;
                            } else {
                              db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                              break L3;
                            }
                          }
                          return;
                        } else {
                          if (var3 == em.field_O) {
                            if (0 < ((gg) this).field_p) {
                              db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((gg) this).field_f.a(var3, var2, (byte) 91);
                            if (0 < ((gg) this).field_p) {
                              db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (tm.field_c != var2) {
                  ((gg) this).field_f.a(var3, var2, (byte) 91);
                  if (0 < ((gg) this).field_p) {
                    db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var3 == em.field_O) {
                    if (0 < ((gg) this).field_p) {
                      db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    if (0 < ((gg) this).field_p) {
                      db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  var2 = ((gg) this).field_m;
                  if (((gg) this).field_d <= 0.0f) {
                    break L4;
                  } else {
                    var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((gg) this).field_d);
                      break L4;
                    } else {
                      if (var4 >= var2) {
                        break L4;
                      } else {
                        var2 = var4;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (tm.field_c != var2) {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    break L5;
                  } else {
                    if (var3 == em.field_O) {
                      break L5;
                    } else {
                      ((gg) this).field_f.a(var3, var2, (byte) 91);
                      break L5;
                    }
                  }
                }
                if (0 < ((gg) this).field_p) {
                  db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L6: {
                var3 = ((gg) this).field_o;
                if (var2 <= ((gg) this).field_m) {
                  if (var2 >= ((gg) this).field_i) {
                    break L6;
                  } else {
                    var2 = ((gg) this).field_i;
                    break L6;
                  }
                } else {
                  var2 = ((gg) this).field_m;
                  break L6;
                }
              }
              if (((gg) this).field_d <= 0.0f) {
                L7: {
                  if (tm.field_c != var2) {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    break L7;
                  } else {
                    if (var3 == em.field_O) {
                      break L7;
                    } else {
                      ((gg) this).field_f.a(var3, var2, (byte) 91);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (0 >= ((gg) this).field_p) {
                    break L8;
                  } else {
                    db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                    break L8;
                  }
                }
                return;
              } else {
                L9: {
                  var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((gg) this).field_d);
                    break L9;
                  } else {
                    if (var4 >= var2) {
                      break L9;
                    } else {
                      var2 = var4;
                      break L9;
                    }
                  }
                }
                L10: {
                  if (tm.field_c != var2) {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    break L10;
                  } else {
                    if (var3 == em.field_O) {
                      break L10;
                    } else {
                      ((gg) this).field_f.a(var3, var2, (byte) 91);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (0 >= ((gg) this).field_p) {
                    break L11;
                  } else {
                    db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                    break L11;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (!((gg) this).b(-1)) {
            ((gg) this).field_c = false;
            return;
          } else {
            if (((gg) this).field_o >= var3) {
              L12: {
                if (((gg) this).field_v <= var3) {
                  break L12;
                } else {
                  var3 = ((gg) this).field_v;
                  break L12;
                }
              }
              if (var2 <= ((gg) this).field_m) {
                L13: {
                  if (var2 >= ((gg) this).field_i) {
                    break L13;
                  } else {
                    var2 = ((gg) this).field_i;
                    break L13;
                  }
                }
                L14: {
                  if (((gg) this).field_d <= 0.0f) {
                    break L14;
                  } else {
                    var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((gg) this).field_d);
                      break L14;
                    } else {
                      if (var4 >= var2) {
                        break L14;
                      } else {
                        L15: {
                          var2 = var4;
                          if (tm.field_c != var2) {
                            ((gg) this).field_f.a(var3, var2, (byte) 91);
                            break L15;
                          } else {
                            if (var3 == em.field_O) {
                              break L15;
                            } else {
                              ((gg) this).field_f.a(var3, var2, (byte) 91);
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (0 >= ((gg) this).field_p) {
                            break L16;
                          } else {
                            db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (tm.field_c != var2) {
                  L17: {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    if (0 >= ((gg) this).field_p) {
                      break L17;
                    } else {
                      db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                      break L17;
                    }
                  }
                  return;
                } else {
                  if (var3 == em.field_O) {
                    if (0 < ((gg) this).field_p) {
                      db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L18: {
                      ((gg) this).field_f.a(var3, var2, (byte) 91);
                      if (0 >= ((gg) this).field_p) {
                        break L18;
                      } else {
                        db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                        break L18;
                      }
                    }
                    return;
                  }
                }
              } else {
                L19: {
                  var2 = ((gg) this).field_m;
                  if (((gg) this).field_d <= 0.0f) {
                    break L19;
                  } else {
                    var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((gg) this).field_d);
                      break L19;
                    } else {
                      if (var4 >= var2) {
                        break L19;
                      } else {
                        var2 = var4;
                        break L19;
                      }
                    }
                  }
                }
                L20: {
                  if (tm.field_c != var2) {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    break L20;
                  } else {
                    if (var3 == em.field_O) {
                      break L20;
                    } else {
                      ((gg) this).field_f.a(var3, var2, (byte) 91);
                      break L20;
                    }
                  }
                }
                L21: {
                  if (0 >= ((gg) this).field_p) {
                    break L21;
                  } else {
                    db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                    break L21;
                  }
                }
                return;
              }
            } else {
              L22: {
                var3 = ((gg) this).field_o;
                if (var2 <= ((gg) this).field_m) {
                  if (var2 >= ((gg) this).field_i) {
                    break L22;
                  } else {
                    var2 = ((gg) this).field_i;
                    break L22;
                  }
                } else {
                  var2 = ((gg) this).field_m;
                  break L22;
                }
              }
              L23: {
                if (((gg) this).field_d <= 0.0f) {
                  break L23;
                } else {
                  var4 = (int)((float)var3 * ((gg) this).field_d + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((gg) this).field_d);
                    break L23;
                  } else {
                    if (var4 >= var2) {
                      break L23;
                    } else {
                      var2 = var4;
                      break L23;
                    }
                  }
                }
              }
              L24: {
                if (tm.field_c != var2) {
                  ((gg) this).field_f.a(var3, var2, (byte) 91);
                  break L24;
                } else {
                  if (var3 == em.field_O) {
                    break L24;
                  } else {
                    ((gg) this).field_f.a(var3, var2, (byte) 91);
                    break L24;
                  }
                }
              }
              L25: {
                if (0 >= ((gg) this).field_p) {
                  break L25;
                } else {
                  db.field_p = (-tm.field_c + ((gg) this).field_p) / 2;
                  break L25;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -25 % ((param1 - -8) / 63);
        ((gg) this).field_p = param0;
        ((gg) this).field_h = param2;
    }

    final void a(int param0) {
        if (null != rm.field_R) {
          return;
        } else {
          L0: {
            if (cl.field_d <= param0) {
              ((gg) this).field_c = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gg) this).field_c) {
            if (tm.field_c < ((gg) this).field_p) {
              db.field_p = (((gg) this).field_p - tm.field_c) / 2;
              if (tm.field_c == ((gg) this).field_r) {
                if (((gg) this).field_s == em.field_O) {
                  return;
                } else {
                  ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                  return;
                }
              } else {
                ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                return;
              }
            } else {
              if (0 >= ((gg) this).field_p) {
                if (tm.field_c == ((gg) this).field_r) {
                  if (((gg) this).field_s == em.field_O) {
                    return;
                  } else {
                    ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                    return;
                  }
                } else {
                  ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                  return;
                }
              } else {
                db.field_p = 0;
                if (tm.field_c == ((gg) this).field_r) {
                  if (((gg) this).field_s == em.field_O) {
                    return;
                  } else {
                    ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                    return;
                  }
                } else {
                  ((gg) this).field_f.a(((gg) this).field_s, ((gg) this).field_r, (byte) -9);
                  return;
                }
              }
            }
          } else {
            int fieldTemp$1 = ((gg) this).field_u - 1;
            ((gg) this).field_u = ((gg) this).field_u - 1;
            if (fieldTemp$1 <= 0) {
              ((gg) this).field_u = ((gg) this).field_b;
              if (((gg) this).field_j > jg.field_K) {
                ((gg) this).field_c = false;
                return;
              } else {
                this.d(-21187);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = -66 % ((param0 - -15) / 58);
        ((gg) this).field_f.a(((gg) this).field_A, ((gg) this).field_t, (byte) -100);
    }

    final a a(byte param0) {
        a var2 = null;
        ((gg) this).field_A = em.field_O;
        ((gg) this).field_t = tm.field_c;
        ((gg) this).field_f.a(((gg) this).field_x, ((gg) this).field_w, (byte) -101);
        if (param0 != 101) {
          return null;
        } else {
          L0: {
            hf.field_a = false;
            var2 = fn.a(0, ((gg) this).field_x, 0, 66, ((gg) this).field_w, oc.field_l);
            if (var2 == null) {
              ((gg) this).c((byte) -104);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        om var4_ref_om = null;
        Object var5 = null;
        int var6 = 0;
        uj var8 = null;
        nk var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              var9 = tk.field_h;
              if (param0 == 84) {
                break L1;
              } else {
                gg.b((byte) -2);
                break L1;
              }
            }
            L2: {
              var2 = var9.i(param0 ^ -46);
              if (var2 == 0) {
                var8 = (uj) (Object) vm.field_h.g(param0 ^ -18154);
                if (var8 != null) {
                  L3: {
                    var4 = var9.i(-89);
                    if (var4 != 0) {
                      var13 = new byte[var4];
                      var9.a(var4, (byte) 123, var13, 0);
                      break L3;
                    } else {
                      var5 = null;
                      break L3;
                    }
                  }
                  var9.field_l = var9.field_l + 4;
                  if (var9.e(-114)) {
                    var8.c(-2193);
                    break L2;
                  } else {
                    si.d(param0 ^ 65364);
                    return;
                  }
                } else {
                  si.d(65280);
                  return;
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.e((byte) -117);
                  var4_ref_om = (om) (Object) fg.field_c.g(-18110);
                  L4: while (true) {
                    L5: {
                      if (var4_ref_om == null) {
                        break L5;
                      } else {
                        if (var3 != var4_ref_om.field_k) {
                          var4_ref_om = (om) (Object) fg.field_c.a((byte) -125);
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var4_ref_om == null) {
                      si.d(65280);
                      return;
                    } else {
                      var4_ref_om.c(-2193);
                      break L2;
                    }
                  }
                } else {
                  fg.a((Throwable) null, (byte) -77, "A1: " + tm.b((byte) -124));
                  si.d(65280);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "gg.F(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 == -1) {
          if (((gg) this).field_j <= jg.field_K) {
            if (0 >= cl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((gg) this).field_h = 77;
          if (((gg) this).field_j <= jg.field_K) {
            if (0 >= cl.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private gg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The following settings need to be changed:  ";
        field_g = "Friends";
        field_z = "This entry doesn't match";
        field_k = "Press ESC for options";
        field_q = "Connection restored.";
        field_e = "To Customer Support";
    }
}
