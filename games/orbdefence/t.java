/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends di {
    private boolean field_o;
    private fj field_w;
    private fj field_l;
    private int field_n;
    static im field_q;
    private fj field_z;
    private int field_m;
    private lj field_t;
    private int[] field_y;
    static String field_k;
    private lj field_s;
    private boolean field_p;
    private int[] field_u;
    private int field_x;
    private int field_r;
    static hj field_j;
    private lj field_v;

    final static byte[] a(int param0, String param1) {
        if (param0 != 15136) {
            field_j = null;
        }
        return ak.field_y.a(param1, 1, "");
    }

    final static String a(int param0, String[] param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        var3 = param2.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = var6_int - -2;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!hm.a(-20625, param2.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param2.substring(var6_int + 2, var5);
              if (tk.a(10, (CharSequence) (Object) var7_ref)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param2.charAt(var5) == 62) {
                    var5++;
                    var8 = th.a(116, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param1[var8].length() - -var6_int - var5);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            L3: {
              var6 = new StringBuilder(var4);
              var5 = 0;
              var7 = 0;
              if (param0 == -415993727) {
                break L3;
              } else {
                field_k = null;
                break L3;
              }
            }
            L4: while (true) {
              var8 = param2.indexOf("<%", var5);
              if (0 <= var8) {
                var5 = var8 + 2;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      if (!hm.a(-20625, param2.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param2.substring(2 + var8, var5);
                  if (!tk.a(10, (CharSequence) (Object) var9)) {
                    continue L4;
                  } else {
                    if (var5 >= var3) {
                      continue L4;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = th.a(113, (CharSequence) (Object) var9);
                        StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param1[var10]);
                        var7 = var5;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param2.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
            field_j = null;
        }
        field_k = null;
        field_q = null;
    }

    final synchronized int c() {
        return 2;
    }

    final static hj[] a(String param0, ki param1, String param2, int param3) {
        int var4 = param1.a(param0, 0);
        if (param3 > -59) {
            field_q = null;
        }
        int var5 = param1.a(param2, 5187, var4);
        return ua.a(param1, var4, 91, var5);
    }

    final di d() {
        return null;
    }

    final di a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 0) {
            ((t) this).field_u = null;
        }
        ((t) this).field_n = param1;
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (-1 <= (((t) this).field_r ^ -1)) {
            break L0;
          } else {
            if (null == ((t) this).field_z) {
              break L0;
            } else {
              ((t) this).field_s.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((t) this).field_r <= -1048577) {
            break L1;
          } else {
            if (((t) this).field_l != null) {
              ((t) this).field_v.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-1 >= ((t) this).field_m) {
            break L2;
          } else {
            if (((t) this).field_w != null) {
              ((t) this).field_t.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (((t) this).field_p) {
            L4: {
              if (0 >= ((t) this).field_x) {
                break L4;
              } else {
                if (!((t) this).field_s.f(-75)) {
                  ((t) this).field_x = -((t) this).field_x;
                  ((t) this).field_p = false;
                  ((t) this).field_z = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (((t) this).field_x >= 0) {
              break L3;
            } else {
              if (!((t) this).field_v.f(-63)) {
                ((t) this).field_p = false;
                ((t) this).field_x = -((t) this).field_x;
                ((t) this).field_l = null;
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (-1 != (((t) this).field_x ^ -1)) {
            ((t) this).field_r = ((t) this).field_r + param0 * ((t) this).field_x;
            if (1048576 <= ((t) this).field_r) {
              ((t) this).field_r = 1048576;
              if (!((t) this).field_p) {
                ((t) this).field_x = 0;
                if (!((t) this).field_o) {
                  L6: {
                    if (null == ((t) this).field_l) {
                      break L6;
                    } else {
                      ((t) this).field_v.e(70);
                      break L6;
                    }
                  }
                  ((t) this).field_l = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            } else {
              if ((((t) this).field_r ^ -1) < -1) {
                break L5;
              } else {
                ((t) this).field_r = 0;
                if (!((t) this).field_p) {
                  ((t) this).field_x = 0;
                  if (!((t) this).field_o) {
                    L7: {
                      if (null != ((t) this).field_z) {
                        ((t) this).field_s.e(98);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((t) this).field_z = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
          } else {
            break L5;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        if ((((t) this).field_n ^ -1) >= -1) {
          ((t) this).c(param2);
          return;
        } else {
          L0: {
            if (!((t) this).field_p) {
              break L0;
            } else {
              L1: {
                if (0 >= ((t) this).field_x) {
                  break L1;
                } else {
                  if (!((t) this).field_s.f(-49)) {
                    ((t) this).field_x = -((t) this).field_x;
                    ((t) this).field_p = false;
                    ((t) this).field_z = null;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 <= ((t) this).field_x) {
                break L0;
              } else {
                if (((t) this).field_v.f(-98)) {
                  break L0;
                } else {
                  ((t) this).field_l = null;
                  ((t) this).field_p = false;
                  ((t) this).field_x = -((t) this).field_x;
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = ((t) this).field_n * (((t) this).field_r >> -1832225012) / 256;
            var5 = -var4 + ((t) this).field_n;
            if (((t) this).field_x == 0) {
              break L2;
            } else {
              ((t) this).field_r = ((t) this).field_r + param2 * ((t) this).field_x;
              if ((((t) this).field_r ^ -1) <= -1048577) {
                ((t) this).field_r = 1048576;
                if (((t) this).field_p) {
                  break L2;
                } else {
                  ((t) this).field_x = 0;
                  if (!((t) this).field_o) {
                    L3: {
                      if (((t) this).field_l != null) {
                        ((t) this).field_v.e(114);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((t) this).field_l = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                if (((t) this).field_r > 0) {
                  break L2;
                } else {
                  ((t) this).field_r = 0;
                  if (((t) this).field_p) {
                    break L2;
                  } else {
                    ((t) this).field_x = 0;
                    if (!((t) this).field_o) {
                      L4: {
                        if (((t) this).field_z != null) {
                          ((t) this).field_s.e(89);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((t) this).field_z = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (la.field_g) {
              stackOut_30_0 = param2 << -415993727;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            } else {
              stackOut_29_0 = param2;
              stackIn_31_0 = stackOut_29_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_31_0;
            if (256 > ((t) this).field_m) {
              L7: {
                if (((t) this).field_z != null) {
                  break L7;
                } else {
                  if (null != ((t) this).field_l) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              if ((var4 ^ -1) != -257) {
                if ((var5 ^ -1) != -257) {
                  L8: {
                    L9: {
                      if (null == ((t) this).field_y) {
                        break L9;
                      } else {
                        if (var6 <= ((t) this).field_y.length) {
                          mk.a(((t) this).field_y, 0, var6);
                          mk.a(((t) this).field_u, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((t) this).field_u = new int[var6];
                    ((t) this).field_y = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((t) this).field_s.b(((t) this).field_y, 0, param2);
                    ((t) this).field_v.b(((t) this).field_u, 0, param2);
                    if (!la.field_g) {
                      stackOut_47_0 = param1;
                      stackIn_48_0 = stackOut_47_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_46_0 = param1 << 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_48_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var6 <= var8) {
                      break L6;
                    } else {
                      param0[var7 + var8] = param0[var7 + var8] + (((t) this).field_u[var8] * var5 + ((t) this).field_y[var8] * var4 >> 1062620552);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((t) this).field_v.b(param0, param1, param2);
                  break L6;
                }
              } else {
                ((t) this).field_s.b(param0, param1, param2);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (((t) this).field_w == null) {
              break L12;
            } else {
              if (((t) this).field_m != 0) {
                L13: {
                  L14: {
                    if (((t) this).field_y == null) {
                      break L14;
                    } else {
                      if (((t) this).field_y.length < var6) {
                        break L14;
                      } else {
                        mk.a(((t) this).field_y, 0, var6);
                        break L13;
                      }
                    }
                  }
                  ((t) this).field_y = new int[var6];
                  ((t) this).field_u = new int[var6];
                  break L13;
                }
                L15: {
                  ((t) this).field_t.b(((t) this).field_y, 0, param2);
                  if (la.field_g) {
                    param1 = param1 << 1;
                    stackOut_60_0 = param1 << 1;
                    stackIn_61_0 = stackOut_60_0;
                    break L15;
                  } else {
                    stackOut_59_0 = param1;
                    stackIn_61_0 = stackOut_59_0;
                    break L15;
                  }
                }
                var7 = stackIn_61_0;
                var8 = ((t) this).field_m * ((t) this).field_n / 256;
                var9 = ((t) this).field_n - var8;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var10 + var7] = var8 * ((t) this).field_y[var10] + param0[var7 + var10] * var9 >> -185286200;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (!param2) {
            ul.d();
        } else {
            ul.d(0, 0, ul.field_f, ul.field_l, 0, 192);
        }
        m.a(param2, 0);
        if (!param1) {
            field_q = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Ice";
    }
}
