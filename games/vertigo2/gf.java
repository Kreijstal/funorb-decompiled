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
        if (this.field_c == null) {
            throw new IllegalStateException();
        }
        this.field_c.c(2);
        this.field_c = null;
    }

    final static boolean a(boolean param0) {
        int discarded$4 = 0;
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            discarded$4 = gf.b(16, 44, -77);
            break L0;
          }
        }
        var1 = kb.field_a;
        synchronized (var1) {
          L1: {
            if (ah.field_l == rq.field_B) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              de.field_f = wm.field_j[rq.field_B];
              ji.field_r = af.field_F[rq.field_B];
              rq.field_B = 127 & rq.field_B + 1;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    public final boolean hasNext() {
        int fieldTemp$2 = 0;
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (this.field_a.field_f[this.field_b - 1] != this.field_i) {
          return true;
        } else {
          L0: while (true) {
            if (this.field_b < this.field_a.field_c) {
              fieldTemp$2 = this.field_b;
              this.field_b = this.field_b + 1;
              if (this.field_a.field_f[fieldTemp$2].field_c != this.field_a.field_f[-1 + this.field_b]) {
                this.field_i = this.field_a.field_f[this.field_b + -1].field_c;
                return true;
              } else {
                this.field_i = this.field_a.field_f[-1 + this.field_b];
                continue L0;
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
          this.field_i = this.field_a.field_f[0].field_c;
          this.field_b = 1;
          this.field_c = null;
          return;
        } else {
          this.field_i = this.field_a.field_f[0].field_c;
          this.field_b = 1;
          this.field_c = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        boolean discarded$5 = false;
        if (param0 <= -41) {
          if (qb.field_d != null) {
            if (null == qb.field_d.k(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$5 = gf.a(false);
          if (qb.field_d != null) {
            if (null == qb.field_d.k(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 == -28631) {
          if (-2 == (param0 ^ -1)) {
            if (!ti.a(param1, false)) {
              return ni.field_b[param0];
            } else {
              return 29;
            }
          } else {
            return ni.field_b[param0];
          }
        } else {
          return -21;
        }
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        li var1 = null;
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (this.field_i != this.field_a.field_f[-1 + this.field_b]) {
          var1 = this.field_i;
          this.field_i = var1.field_c;
          this.field_c = var1;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_a.field_c > this.field_b) {
              fieldTemp$2 = this.field_b;
              this.field_b = this.field_b + 1;
              var1 = this.field_a.field_f[fieldTemp$2].field_c;
              if (var1 != this.field_a.field_f[-1 + this.field_b]) {
                this.field_c = var1;
                this.field_i = var1.field_c;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean discarded$11 = false;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
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
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        Object var39 = null;
        CharSequence var40 = null;
        L0: {
          var39 = null;
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param2 > 28) {
            break L0;
          } else {
            discarded$11 = gf.a((byte) -67);
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
          if (-3 != (ui.field_g ^ -1)) {
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
        if (-85 != (de.field_f ^ -1)) {
          if (de.field_f != 85) {
            var4 = ji.field_r;
            if (p.a(376, (char) var4)) {
              if (var3 != 0) {
                if (fb.field_D.length() < 80) {
                  L4: {
                    discarded$12 = fb.field_D.append((char) var4);
                    var5 = 485;
                    var17 = qe.field_V;
                    var16 = jk.a(15709, var17);
                    var19 = var16;
                    if (ui.field_g != 2) {
                      var7 = "";
                      if (ui.field_g == 0) {
                        L5: {
                          if (gd.field_j != null) {
                            break L5;
                          } else {
                            if (fq.field_i) {
                              var7 = "[" + fb.field_A + "] ";
                              break L5;
                            } else {
                              if (gd.field_j != null) {
                                if (ar.field_t) {
                                  if (null == v.field_a) {
                                    L6: {
                                      var29 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                                      var30 = var29 + var19 + ": ";
                                      var5 = var5 - cg.field_f.c(var30);
                                      if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                        discarded$13 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    return true;
                                  } else {
                                    L7: {
                                      var7 = "[" + v.field_a + "] ";
                                      var33 = var7 + var19 + ": ";
                                      var5 = var5 - cg.field_f.c(var33);
                                      if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                        discarded$14 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    return true;
                                  }
                                } else {
                                  L8: {
                                    var31 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                                    var32 = var31 + var19 + ": ";
                                    var5 = var5 - cg.field_f.c(var32);
                                    if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                      discarded$15 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  return true;
                                }
                              } else {
                                L9: {
                                  var33 = var7 + var19 + ": ";
                                  var5 = var5 - cg.field_f.c(var33);
                                  if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                    discarded$16 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                return true;
                              }
                            }
                          }
                        }
                        L10: {
                          if (gd.field_j == null) {
                            break L10;
                          } else {
                            if (ar.field_t) {
                              if (null != v.field_a) {
                                var7 = "[" + v.field_a + "] ";
                                break L10;
                              } else {
                                L11: {
                                  var34 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                                  var35 = var34 + var19 + ": ";
                                  var5 = var5 - cg.field_f.c(var35);
                                  if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                    discarded$17 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                return true;
                              }
                            } else {
                              L12: {
                                var36 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, -112) + "] ";
                                var37 = var36 + var19 + ": ";
                                var5 = var5 - cg.field_f.c(var37);
                                if (cg.field_f.c(fb.field_D.toString()) > var5) {
                                  discarded$18 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              return true;
                            }
                          }
                        }
                        var38 = var7 + var19 + ": ";
                        var5 = var5 - cg.field_f.c(var38);
                        break L4;
                      } else {
                        L13: {
                          var28 = var7 + var19 + ": ";
                          var5 = var5 - cg.field_f.c(var28);
                          if (cg.field_f.c(fb.field_D.toString()) > var5) {
                            discarded$19 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        return true;
                      }
                    } else {
                      var40 = (CharSequence) ((Object) ea.field_b);
                      var18 = Vertigo2.a(new String[]{vj.a(var40, (byte) 8)}, di.field_B, -117);
                      var8 = Vertigo2.a(new String[]{var16}, af.field_L, 15);
                      var9 = cg.field_f.c(var18);
                      var10 = cg.field_f.c(var8);
                      if (var10 >= var9) {
                        var5 = var5 - var10;
                        break L4;
                      } else {
                        var5 = var5 - var9;
                        break L4;
                      }
                    }
                  }
                  if (cg.field_f.c(fb.field_D.toString()) <= var5) {
                    return true;
                  } else {
                    discarded$20 = w.a(true, ' ', -1 + fb.field_D.length(), fb.field_D);
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (var3 != 0) {
              if (0 >= fb.field_D.length()) {
                return true;
              } else {
                discarded$21 = w.a(true, ' ', fb.field_D.length() + -1, fb.field_D);
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          L14: {
            if (var3 != 0) {
              if (0 >= fb.field_D.length()) {
                fb.h(0);
                break L14;
              } else {
                var4_ref_String = fb.field_D.toString();
                if (!wn.a(var4_ref_String, 0)) {
                  L15: {
                    var5 = ui.field_g;
                    if (-1 != (var5 ^ -1)) {
                      break L15;
                    } else {
                      if (gd.field_j != null) {
                        var5 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (ab.a(0, var5) != 2) {
                    tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                    fb.h(0);
                    break L14;
                  } else {
                    cf.a(var5, 1, param0, (byte) 118);
                    tf.a(ui.field_g, ea.field_b, -117, var4_ref_String, param1, -1);
                    fb.h(0);
                    break L14;
                  }
                } else {
                  var13 = (String) null;
                  var12 = (String) null;
                  dh.a((byte) -123, pd.field_b, 2, (String) null, 0, (String) null);
                  var15 = (String) null;
                  var14 = (String) null;
                  dh.a((byte) -7, ch.field_f, 2, (String) null, 0, (String) null);
                  fb.h(0);
                  break L14;
                }
              }
            } else {
              if (-1 == (ui.field_g ^ -1)) {
                break L14;
              } else {
                fb.h(0);
                break L14;
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
        this.field_c = null;
        try {
            this.field_a = param0;
            this.a(-120);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = false;
        field_f = new sq();
        field_e = 0;
        field_h = new tj();
        field_d = -1;
    }
}
