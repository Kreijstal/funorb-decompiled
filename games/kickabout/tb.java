/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends bi {
    static int field_s;
    static ff field_t;
    private bh field_x;
    static int field_v;
    static String field_r;
    static ut[] field_q;
    static nu field_w;
    static String field_u;

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ui var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ui var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_46_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_81_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_80_0 = 0;
            L0: {
              var16 = Kickabout.field_G;
              if (null == ((tb) this).field_x) {
                break L0;
              } else {
                L1: {
                  var2_long = nj.a(-70);
                  var4 = (int)(-((tb) this).field_p + var2_long);
                  ((tb) this).field_p = var2_long;
                  if (-201 <= (var4 ^ -1)) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((tb) this).field_f = ((tb) this).field_f + var4;
                if (((tb) this).field_f > 30000) {
                  try {
                    L2: {
                      ((tb) this).field_x.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((tb) this).field_x = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null != ((tb) this).field_x) {
              try {
                L4: {
                  ((tb) this).field_x.b((byte) -113);
                  var2_ref = (ui) (Object) ((tb) this).field_h.a(-116);
                  var3_int = -71 % ((param0 - 30) / 37);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ui) (Object) ((tb) this).field_c.a(-117);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (100 <= var2_int) {
                                break L8;
                              } else {
                                var3_int = ((tb) this).field_x.a((byte) 63);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L9: {
                                      ((tb) this).field_f = 0;
                                      var4 = 0;
                                      if (null != ((tb) this).field_k) {
                                        if (0 != ((tb) this).field_k.field_u) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if ((var4 ^ -1) >= -1) {
                                        L11: {
                                          var5 = ((tb) this).field_k.field_v.field_f.length - ((tb) this).field_k.field_x;
                                          var6 = -((tb) this).field_k.field_u + 512;
                                          if (var5 - ((tb) this).field_k.field_v.field_n >= var6) {
                                            break L11;
                                          } else {
                                            var6 = -((tb) this).field_k.field_v.field_n + var5;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var3_int >= var6) {
                                            break L12;
                                          } else {
                                            var6 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((tb) this).field_x.a(((tb) this).field_k.field_v.field_f, var6, ((tb) this).field_k.field_v.field_n, -4847);
                                          if (0 == ((tb) this).field_g) {
                                            break L13;
                                          } else {
                                            var17 = 0;
                                            var7 = var17;
                                            L14: while (true) {
                                              if (var6 <= var17) {
                                                break L13;
                                              } else {
                                                ((tb) this).field_k.field_v.field_f[((tb) this).field_k.field_v.field_n + var17] = (byte)ek.b((int) ((tb) this).field_k.field_v.field_f[((tb) this).field_k.field_v.field_n + var17], (int) ((tb) this).field_g);
                                                var17++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((tb) this).field_k.field_v.field_n = ((tb) this).field_k.field_v.field_n + var6;
                                        ((tb) this).field_k.field_u = ((tb) this).field_k.field_u + var6;
                                        if (((tb) this).field_k.field_v.field_n == var5) {
                                          ((tb) this).field_k.f(50);
                                          ((tb) this).field_k.field_p = false;
                                          ((tb) this).field_k = null;
                                          break L10;
                                        } else {
                                          if ((((tb) this).field_k.field_u ^ -1) != -513) {
                                            break L10;
                                          } else {
                                            ((tb) this).field_k.field_u = 0;
                                            break L10;
                                          }
                                        }
                                      } else {
                                        L15: {
                                          var5 = -((tb) this).field_n.field_n + var4;
                                          if (var3_int >= var5) {
                                            break L15;
                                          } else {
                                            var5 = var3_int;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((tb) this).field_x.a(((tb) this).field_n.field_f, var5, ((tb) this).field_n.field_n, -4847);
                                          if (-1 == (((tb) this).field_g ^ -1)) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var6 >= var5) {
                                                break L16;
                                              } else {
                                                ((tb) this).field_n.field_f[((tb) this).field_n.field_n - -var6] = (byte)ek.b((int) ((tb) this).field_n.field_f[((tb) this).field_n.field_n + var6], (int) ((tb) this).field_g);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        ((tb) this).field_n.field_n = ((tb) this).field_n.field_n + var5;
                                        if (((tb) this).field_n.field_n >= var4) {
                                          if (((tb) this).field_k == null) {
                                            L18: {
                                              ((tb) this).field_n.field_n = 0;
                                              var6 = ((tb) this).field_n.h((byte) -128);
                                              var7 = ((tb) this).field_n.k(4);
                                              var8 = ((tb) this).field_n.h((byte) -117);
                                              var9 = ((tb) this).field_n.k(4);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_45_0 = 0;
                                                stackIn_46_0 = stackOut_45_0;
                                                break L18;
                                              } else {
                                                stackOut_44_0 = 1;
                                                stackIn_46_0 = stackOut_44_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_46_0;
                                              var12 = ((long)var6 << -753062048) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ui) (Object) ((tb) this).field_j.a(-127);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if ((var12 ^ -1L) == (var14_ref.field_l ^ -1L)) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (ui) (Object) ((tb) this).field_j.b(0);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ui) (Object) ((tb) this).field_b.a(-115);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if ((var12 ^ -1L) != (var14_ref.field_l ^ -1L)) {
                                                      var14_ref = (ui) (Object) ((tb) this).field_b.b(0);
                                                      continue L21;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L22: {
                                                if (-1 != (var10 ^ -1)) {
                                                  stackOut_60_0 = 9;
                                                  stackIn_61_0 = stackOut_60_0;
                                                  break L22;
                                                } else {
                                                  stackOut_59_0 = 5;
                                                  stackIn_61_0 = stackOut_59_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_61_0;
                                              ((tb) this).field_k = var14_ref;
                                              ((tb) this).field_k.field_v = new iw(var15 + var9 + ((tb) this).field_k.field_x);
                                              ((tb) this).field_k.field_v.a(110, var10);
                                              ((tb) this).field_k.field_v.b(-125, var9);
                                              ((tb) this).field_k.field_u = 10;
                                              ((tb) this).field_n.field_n = 0;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (-1 != ((tb) this).field_k.field_u) {
                                              throw new IOException();
                                            } else {
                                              if (0 == ((tb) this).field_n.field_f[0]) {
                                                ((tb) this).field_k.field_u = 1;
                                                ((tb) this).field_n.field_n = 0;
                                                break L10;
                                              } else {
                                                ((tb) this).field_k = null;
                                                break L10;
                                              }
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            stackOut_80_0 = 1;
                            stackIn_81_0 = stackOut_80_0;
                            break L4;
                          }
                        } else {
                          ((tb) this).field_d.field_n = 0;
                          ((tb) this).field_d.a(116, 0);
                          ((tb) this).field_d.b((byte) 18, var2_ref.field_l);
                          ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                          ((tb) this).field_j.a(127, (am) (Object) var2_ref);
                          var2_ref = (ui) (Object) ((tb) this).field_c.b(0);
                          continue L6;
                        }
                      }
                    } else {
                      ((tb) this).field_d.field_n = 0;
                      ((tb) this).field_d.a(107, 1);
                      ((tb) this).field_d.b((byte) 83, var2_ref.field_l);
                      ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                      ((tb) this).field_b.a(127, (am) (Object) var2_ref);
                      var2_ref = (ui) (Object) ((tb) this).field_h.b(0);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((tb) this).field_x.a(1);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  ((tb) this).field_o = ((tb) this).field_o + 1;
                  ((tb) this).field_l = -2;
                  ((tb) this).field_x = null;
                  if (((tb) this).e(0) != 0) {
                    break L25;
                  } else {
                    if (-1 != (((tb) this).b(-21) ^ -1)) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_81_0 != 0;
            } else {
              if (0 != ((tb) this).e(0)) {
                return false;
              } else {
                if (0 == ((tb) this).b(-21)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        jb var5 = null;
        int var3 = Kickabout.field_G;
        if (param0 != 126) {
            Object var4 = null;
            tb.a(5, (sj) null);
        }
        if (-29 == (param1 ^ -1)) {
            if (!(su.field_c == null)) {
                su.field_c.e(19910);
            }
            var5 = (jb) (Object) np.field_Jb.g(24009);
            while (var5 != null) {
                var5.c((byte) -109);
                var5 = (jb) (Object) np.field_Jb.c(33);
            }
        }
        np.field_Jb.a((gn) (Object) new i(param1), 3);
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((tb) this).field_x) {
              try {
                L0: {
                  ((tb) this).field_d.field_n = param0;
                  ((tb) this).field_d.a(param0 ^ 122, 6);
                  ((tb) this).field_d.a(3, (byte) 126);
                  ((tb) this).field_d.g(param0 + -1207444472, 0);
                  ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      ((tb) this).field_x.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((tb) this).field_o = ((tb) this).field_o + 1;
                  ((tb) this).field_l = -2;
                  ((tb) this).field_x = null;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ui var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var6 = Kickabout.field_G;
              if (((tb) this).field_x == null) {
                break L0;
              } else {
                try {
                  L1: {
                    ((tb) this).field_x.a(param1 ^ 21);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var4 = (Exception) (Object) decompiledCaughtException;
                    break L2;
                  }
                }
                ((tb) this).field_x = null;
                break L0;
              }
            }
            L3: {
              ((tb) this).field_x = (bh) param0;
              this.g(0);
              if (param1 == 20) {
                break L3;
              } else {
                ((tb) this).b((byte) 19);
                break L3;
              }
            }
            this.a(param2, false);
            ((tb) this).field_k = null;
            ((tb) this).field_n.field_n = 0;
            L4: while (true) {
              var4_ref2 = (ui) (Object) ((tb) this).field_b.b((byte) 105);
              if (var4_ref2 == null) {
                L5: while (true) {
                  var4_ref2 = (ui) (Object) ((tb) this).field_j.b((byte) 118);
                  if (var4_ref2 == null) {
                    L6: {
                      if (((tb) this).field_g == 0) {
                        break L6;
                      } else {
                        try {
                          L7: {
                            ((tb) this).field_d.field_n = 0;
                            ((tb) this).field_d.a(123, 4);
                            ((tb) this).field_d.a(103, (int) ((tb) this).field_g);
                            ((tb) this).field_d.b(param1 ^ -50, 0);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                            break L7;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L8: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L9: {
                                ((tb) this).field_x.a(1);
                                break L9;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L10: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L10;
                              }
                            }
                            ((tb) this).field_l = -2;
                            ((tb) this).field_o = ((tb) this).field_o + 1;
                            ((tb) this).field_x = null;
                            break L8;
                          }
                        }
                        break L6;
                      }
                    }
                    ((tb) this).field_f = 0;
                    ((tb) this).field_p = nj.a(-119);
                    return;
                  } else {
                    ((tb) this).field_c.a(127, (am) (Object) var4_ref2);
                    continue L5;
                  }
                }
              } else {
                ((tb) this).field_h.a(127, (am) (Object) var4_ref2);
                continue L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
            ((tb) this).field_x.a(1);
        } catch (Exception exception) {
        }
        ((tb) this).field_x = null;
        ((tb) this).field_o = ((tb) this).field_o + 1;
        ((tb) this).field_l = -1;
        int var2 = -89 % ((57 - param0) / 33);
        ((tb) this).field_g = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, sj param1) {
        ll.field_n = wa.a((byte) 126, "basic", param1, "display_name_changed");
        ei.field_d = new al(0L, lh.field_D, le.field_a, qt.field_k);
        nq.field_F = new al(0L, lh.field_D, md.field_j, pb.field_D);
        kk.field_R = new hd(0L, (hd) null);
        du.field_f = new hd(0L, dw.field_e);
        du.field_f.field_A = 1;
        pj.field_E = new hd(0L, dn.field_zb, oh.field_h);
        ph.field_f = new hd(0L, pq.field_P, vg.field_Vb);
        hj.field_h = new hd(0L, ul.field_c);
        kk.field_R.a((byte) -109, du.field_f);
        kk.field_R.a((byte) -122, pj.field_E);
        kk.field_R.a((byte) -108, ph.field_f);
        kk.field_R.a((byte) -124, (hd) (Object) ei.field_d);
        kk.field_R.a((byte) -108, hj.field_h);
        ei.field_d.field_Cb.field_zb.a(dw.field_e, (byte) 87);
        if (param0 >= -59) {
            Object var4 = null;
            tb.a(-39, (sj) null);
        }
        ei.field_d.field_Cb.field_zb.field_p = 1;
        hd var6 = ei.field_d.field_Cb.field_zb;
        hd var7 = var6;
        var7.field_A = 1;
        nq.field_F.field_Cb.field_zb.a(dw.field_e, (byte) -128);
        hd var3 = nq.field_F.field_Cb.field_zb;
        nq.field_F.field_Cb.field_zb.field_p = 1;
        var3.field_A = 1;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            iw stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            iw stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            iw stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            iw stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            iw stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            iw stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (null == ((tb) this).field_x) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((tb) this).field_d.field_n = 0;
                    stackOut_3_0 = ((tb) this).field_d;
                    stackOut_3_1 = 105;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param0) {
                      stackOut_5_0 = (iw) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (iw) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((iw) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                  ((tb) this).field_d.b((byte) 89, 0L);
                  ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((tb) this).field_x.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((tb) this).field_l = -2;
                  ((tb) this).field_o = ((tb) this).field_o + 1;
                  ((tb) this).field_x = null;
                  break L2;
                }
              }
              L5: {
                if (!param1) {
                  break L5;
                } else {
                  this.a(true, true);
                  break L5;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_q = null;
        field_u = null;
        if (param0 >= -89) {
            Object var2 = null;
            boolean discarded$0 = tb.a((String) null, -77);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2 = -16 % ((param1 - -16) / 36);
        if (!(null != vl.field_e)) {
            return false;
        }
        return (param0.toLowerCase().indexOf(vl.field_e.toLowerCase()) ^ -1) <= -1 ? true : false;
    }

    final void b(byte param0) {
        if (param0 != 109) {
            field_w = null;
        }
        if (((tb) this).field_x != null) {
            ((tb) this).field_x.a(param0 ^ 108);
        }
    }

    public tb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 1;
        field_t = new ff(4, 1, 1, 1);
        field_r = "Names cannot start or end with space or underscore";
        field_u = "Accept invitation to <%0>'s game";
    }
}
