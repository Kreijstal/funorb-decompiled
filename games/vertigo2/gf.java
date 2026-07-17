/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf implements Iterator {
    static boolean field_g;
    private li field_i;
    private el field_a;
    static sq field_f;
    private li field_c;
    private int field_b;
    static tj field_h;
    static volatile int field_e;
    static int field_d;

    public final void remove() {
        if (((gf) this).field_c == null) {
            throw new IllegalStateException();
        }
        ((gf) this).field_c.c(2);
        ((gf) this).field_c = null;
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var1 = (Object) (Object) kb.field_a;
        synchronized (var1) {
          L0: {
            if (ah.field_l == rq.field_B) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              de.field_f = wm.field_j[rq.field_B];
              ji.field_r = af.field_F[rq.field_B];
              rq.field_B = 127 & rq.field_B + 1;
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (((gf) this).field_a.field_f[((gf) this).field_b - 1] != ((gf) this).field_i) {
          return true;
        } else {
          L0: while (true) {
            if (((gf) this).field_b < ((gf) this).field_a.field_c) {
              int fieldTemp$2 = ((gf) this).field_b;
              ((gf) this).field_b = ((gf) this).field_b + 1;
              if (((gf) this).field_a.field_f[fieldTemp$2].field_c == ((gf) this).field_a.field_f[-1 + ((gf) this).field_b]) {
                ((gf) this).field_i = ((gf) this).field_a.field_f[-1 + ((gf) this).field_b];
                if (var2 == 0) {
                  continue L0;
                } else {
                  ((gf) this).field_i = ((gf) this).field_a.field_f[((gf) this).field_b + -1].field_c;
                  return true;
                }
              } else {
                ((gf) this).field_i = ((gf) this).field_a.field_f[((gf) this).field_b + -1].field_c;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    private final void a(int param0) {
        if (param0 >= -99) {
          this.a(-22);
          ((gf) this).field_i = ((gf) this).field_a.field_f[0].field_c;
          ((gf) this).field_b = 1;
          ((gf) this).field_c = null;
          return;
        } else {
          ((gf) this).field_i = ((gf) this).field_a.field_f[0].field_c;
          ((gf) this).field_b = 1;
          ((gf) this).field_c = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (qb.field_d == null) {
            return false;
        }
        if (null == qb.field_d.k(0)) {
            return false;
        }
        return true;
    }

    final static int b(int param0, int param1, int param2) {
        return -21;
    }

    public final Object next() {
        li var1 = null;
        int var2 = Vertigo2.field_L ? 1 : 0;
        if (!(((gf) this).field_i == ((gf) this).field_a.field_f[-1 + ((gf) this).field_b])) {
            var1 = ((gf) this).field_i;
            ((gf) this).field_i = var1.field_c;
            ((gf) this).field_c = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((gf) this).field_a.field_c <= ((gf) this).field_b) {
                return null;
            }
            int fieldTemp$0 = ((gf) this).field_b;
            ((gf) this).field_b = ((gf) this).field_b + 1;
            var1 = ((gf) this).field_a.field_f[fieldTemp$0].field_c;
            if (!(var1 == ((gf) this).field_a.field_f[-1 + ((gf) this).field_b])) {
                ((gf) this).field_c = var1;
                ((gf) this).field_i = var1.field_c;
                return (Object) (Object) var1;
            }
        } while (var2 == 0);
        return null;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        Object var17 = null;
        CharSequence var18 = null;
        L0: {
          var17 = null;
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param2 > 28) {
            break L0;
          } else {
            boolean discarded$8 = gf.a((byte) -67);
            break L0;
          }
        }
        L1: {
          var3 = 1;
          if (nb.field_z) {
            break L1;
          } else {
            if (null != gk.field_c) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (ui.field_g != 0) {
            break L2;
          } else {
            if (null == sj.field_d) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        L3: {
          if (ui.field_g != 2) {
            break L3;
          } else {
            if (dh.a((byte) 127)) {
              break L3;
            } else {
              var3 = 0;
              break L3;
            }
          }
        }
        if (de.field_f != 84) {
          if (de.field_f != 85) {
            var4 = ji.field_r;
            if (p.a(376, (char) var4)) {
              L4: {
                if (var3 == 0) {
                  break L4;
                } else {
                  if (fb.field_D.length() >= 80) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        StringBuilder discarded$9 = fb.field_D.append(var4);
                        var5 = 485;
                        var13 = qe.field_V;
                        var7 = var13;
                        var7 = var13;
                        var12 = jk.a(15709, var13);
                        var7 = var12;
                        var7 = var12;
                        var15 = var12;
                        var7 = var15;
                        var7 = var15;
                        if (ui.field_g != 2) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var18 = (CharSequence) (Object) ea.field_b;
                              var14 = Vertigo2.a(new String[1], di.field_B, -117);
                              var7 = var14;
                              var7 = var14;
                              var8 = Vertigo2.a(new String[1], af.field_L, 15);
                              var7 = var8;
                              var7 = var8;
                              var9 = cg.field_f.c(var14);
                              var10 = cg.field_f.c(var8);
                              if (var10 >= var9) {
                                break L8;
                              } else {
                                var5 = var5 - var9;
                                if (var11 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var5 = var5 - var10;
                            break L7;
                          }
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7 = "";
                      if (ui.field_g == 0) {
                        L9: {
                          if (gd.field_j != null) {
                            break L9;
                          } else {
                            if (fq.field_i) {
                              var7 = "[" + fb.field_A + "] ";
                              break L9;
                            } else {
                              L10: {
                                if (gd.field_j == null) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (!ar.field_t) {
                                      var7 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -112) + "] ";
                                      if (var11 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      if (null != v.field_a) {
                                        break L11;
                                      } else {
                                        L12: {
                                          var7 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -112) + "] ";
                                          if (var11 == 0) {
                                            break L12;
                                          } else {
                                            var7 = "[" + v.field_a + "] ";
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var16 = var7 + var15 + ": ";
                                          var7 = var16;
                                          var7 = var16;
                                          var5 = var5 - cg.field_f.c(var16);
                                          if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                            StringBuilder discarded$10 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        return true;
                                      }
                                    }
                                  }
                                  var7 = "[" + v.field_a + "] ";
                                  break L10;
                                }
                              }
                              L14: {
                                var16 = var7 + var15 + ": ";
                                var7 = var16;
                                var7 = var16;
                                var5 = var5 - cg.field_f.c(var16);
                                if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                  StringBuilder discarded$11 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              return true;
                            }
                          }
                        }
                        L15: {
                          if (gd.field_j == null) {
                            break L15;
                          } else {
                            L16: {
                              if (!ar.field_t) {
                                var7 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -112) + "] ";
                                if (var11 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              } else {
                                if (null != v.field_a) {
                                  break L16;
                                } else {
                                  L17: {
                                    var7 = "[" + Vertigo2.a(new String[1], ie.field_Rb, -112) + "] ";
                                    if (var11 == 0) {
                                      break L17;
                                    } else {
                                      var7 = "[" + v.field_a + "] ";
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    var16 = var7 + var15 + ": ";
                                    var7 = var16;
                                    var7 = var16;
                                    var5 = var5 - cg.field_f.c(var16);
                                    if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                      StringBuilder discarded$12 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  return true;
                                }
                              }
                            }
                            var7 = "[" + v.field_a + "] ";
                            break L15;
                          }
                        }
                        var16 = var7 + var15 + ": ";
                        var5 = var5 - cg.field_f.c(var16);
                        break L5;
                      } else {
                        L19: {
                          var16 = var7 + var15 + ": ";
                          var7 = var16;
                          var7 = var16;
                          var5 = var5 - cg.field_f.c(var16);
                          if (cg.field_f.c(fb.field_D.toString()) > var5) {
                            StringBuilder discarded$13 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return true;
                      }
                    }
                    if (cg.field_f.c(fb.field_D.toString()) > var5) {
                      StringBuilder discarded$14 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                      break L4;
                    } else {
                      return true;
                    }
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            if (var3 != 0) {
              if (0 < fb.field_D.length()) {
                StringBuilder discarded$15 = w.a(true, ' ', fb.field_D.length() + -1, fb.field_D);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          L20: {
            L21: {
              if (var3 != 0) {
                break L21;
              } else {
                if (ui.field_g == 0) {
                  break L20;
                } else {
                  fb.h(0);
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
            }
            if (0 >= fb.field_D.length()) {
              fb.h(0);
              break L20;
            } else {
              L22: {
                var4_ref_String = fb.field_D.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                if (!wn.a(var4_ref_String, 0)) {
                  break L22;
                } else {
                  dh.a((byte) -123, pd.field_b, 2, (String) null, 0, (String) null);
                  dh.a((byte) -7, ch.field_f, 2, (String) null, 0, (String) null);
                  if (var11 == 0) {
                    fb.h(0);
                    break L20;
                  } else {
                    break L22;
                  }
                }
              }
              L23: {
                var5 = ui.field_g;
                if (var5 != 0) {
                  break L23;
                } else {
                  if (gd.field_j != null) {
                    var5 = 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
              }
              if (ab.a(0, var5) != 2) {
                tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                fb.h(0);
                break L20;
              } else {
                cf.a(var5, 1, param0, (byte) 118);
                tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                fb.h(0);
                return true;
              }
            }
          }
          return true;
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 >= -11) {
            field_e = -67;
            field_f = null;
            return;
        }
        field_f = null;
    }

    gf(el param0) {
        ((gf) this).field_c = null;
        try {
            ((gf) this).field_a = param0;
            this.a(-120);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "gf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_f = new sq();
        field_e = 0;
        field_h = new tj();
        field_d = -1;
    }
}
