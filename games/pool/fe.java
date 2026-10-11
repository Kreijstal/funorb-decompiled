/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fe extends ei {
    static sj field_M;
    boolean field_G;
    private boolean field_F;
    static boolean field_J;
    static boolean[] field_H;
    static int[] field_L;
    boolean field_I;
    private boolean field_K;

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param3.getGraphics();
            sh.field_P.a(var4, param0, param1, -23820);
            var5 = 107 % ((-1 - param2) / 57);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 16) {
          return;
        }
        if (null != this.field_t &&
          this.field_t instanceof tb) {
          ((tb) (this.field_t)).a(true, param2, param3, this, param1);
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        vh stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        boolean stackIn_131_0 = false;
        int stackIn_150_0 = 0;
        vh stackIn_173_0 = null;
        boolean stackIn_174_1 = false;
        vh stackIn_178_0 = null;
        boolean stackIn_179_1 = false;
        vh stackIn_183_0 = null;
        boolean stackIn_184_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_75_0;
        boolean stackOut_130_0;
        vh var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        vh var6 = null;
        vh var7 = null;
        vh var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ko var17 = null;
        Object var18 = null;
        int var18_int = 0;
        im var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var23 = null;
        int stackIn_53_0Lifetime1;
        int stackIn_63_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = Pool.field_O;
        try {
          fr.$cfr$intArgs$a$e9dea5688aa5(-58, nj.field_b);
          if (null != em.field_L) {
            ok.field_ob.field_pb = true;
            kc.field_b.field_Db = 0;
            var5 = kc.field_b;
            var5.field_gb = 0;
            d.field_c.field_Db = 0;
            var6 = d.field_c;
            var6.field_gb = 0;
            gi.field_o.field_Db = 0;
            var7 = gi.field_o;
            var7.field_gb = 0;
            if (cj.e((byte) 85)) {
              ii.field_e.field_nb = rf.field_b.toUpperCase();
              var9 = (2 + uq.field_f.field_gb) / 2;
              kc.field_b.b(uq.field_f.field_Db - 40, 2147483647, 0, var9 - 2, 40);
              if (em.field_L.field_mc < em.field_L.field_Nb) {
                kc.field_b.field_nb = v.field_d.toUpperCase();
                kc.field_b.field_pb = true;
                if (var19 != 0) {
                  kc.field_b.field_nb = ro.field_p.toUpperCase();
                  kc.field_b.field_pb = false;
                }
              } else {
                kc.field_b.field_nb = ro.field_p.toUpperCase();
                kc.field_b.field_pb = false;
              }
              kc.field_b.field_F = mg.field_c.field_F;
              if (uf.field_jb > 0) {
                boolean decompiledSharedTail1 = (uf.field_jb != 1);
                if (!decompiledSharedTail1) {
                  var10_ref_String = lo.field_b;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = nr.a(new String[]{Integer.toString(uf.field_jb)}, -1, hq.field_f);
                }
                if ((va.field_V & 16) == 0 &&
                  !nr.field_bb) {
                  kc.field_b.field_F = mg.field_c.field_Gb;
                }
                kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref_String;
              }
              d.field_c.b(uq.field_f.field_Db - 40, 2147483647, var9, -var9 + uq.field_f.field_gb, 40);
              d.field_c.field_nb = ua.field_s.toUpperCase();
              var8 = d.field_c;
              stackIn_20_0 = d.field_c;
              stackIn_21_1 = (param0) && (fd.field_K == 0L);
              stackIn_20_0.field_pb = stackIn_21_1;
              var10 = 2;
              if (we.field_m != null) {
                if (null == dk.field_j) {
                  dk.field_j = new byte[dr.field_c];
                  gf.field_b = new boolean[dr.field_c];
                }
                var11 = 0;
                do {
                  if (!(var11 < dr.field_c)) {
                    var10 = 0;
                    break;
                  }
                  gf.field_b[var11] = false;
                  var11++;
                } while (var19 == 0);
                L17: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_67_0 = 0;
                    if (var19 != 0) {
                      break L17;
                    }
                    var12 = stackIn_67_0;
                    while (true) {
                      stackIn_36_0 = var12;
                      stackIn_36_1 = we.field_m.length;
                      if (stackIn_36_0 < stackIn_36_1) {
                        var23 = we.field_m[var12];
                        var21 = var23;
                        var20 = var21;
                        var13_ref_int__ = var20;
                        stackIn_63_0 = 0;
                        var14 = stackIn_63_0;
                        L24: while (true) {
                          if (var23.length > var14) {
                            var15 = var23[var14];
                            var16 = var20[1 + var14];
                            stackIn_53_0 = ~var15;
                            if (stackIn_53_0 == 0) {
                              if (0 == var10) {
                                stackIn_45_0 = em.field_L.field_Nb;
                              } else {
                                stackIn_45_0 = em.field_L.field_mc;
                              }
                              var17_int = stackIn_45_0;
                              if (~var17_int != ~var16) {
                                break L24;
                              }
                            } else {
                              if (var16 != (em.field_L.field_tc[var15] & 255)) {
                                break L24;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          stackIn_53_0Lifetime1 = 0;
                          var15 = stackIn_53_0Lifetime1;
                          while (var23.length > var15) {
                            var16 = var23[var15];
                            stackIn_36_0 = ~var16;
                            stackIn_36_1 = ~var14;
                            if (stackIn_36_0 < stackIn_36_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          gf.field_b[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_63_0Lifetime1 = var11;
                    if (stackIn_63_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_67_0 = ~hq.field_i;
                  break;
                }
                if (stackIn_67_0 <= -3 &&
                  vj.field_c[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                d.field_c.field_pb = false;
                decompiledFrameRemainder0 = !(!d.field_c.field_db);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (var13 < dr.field_c) {
                      stackOut_75_0 = gf.field_b[var13];
                      stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                      stackIn_76_0 = stackOut_75_0;
                      if (var19 == 0) {
                        if (stackIn_76_0) {
                          var22 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                          if (var11_ref == null) {
                            var11_ref = var22;
                          } else {
                            var11_ref = (String) (var11_ref) + ", " + var22;
                            var12 = 1;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_83_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_83_0 != ~var10) {
                    var13_ref_String = aj.field_Rb;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = ab.field_d + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = nr.a(new String[]{(String) (var11_ref)}, -1, me.field_u);
                    }
                  } else {
                    var13_ref_String = ah.field_g;
                    if (var12 == 0) {
                      var14_ref_String = nr.a(new String[]{(String) (var11_ref)}, -1, fm.field_J);
                      if (var19 != 0) {
                        var14_ref_String = ud.field_M + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = ud.field_M + (String) (var11_ref);
                    }
                  }
                  kk.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != dl.field_j ||
                null != ci.field_d ||
                w.field_j != null ||
                null != op.field_a)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(dr.field_c > var16)))) {
                  var17_int = em.field_L.field_tc[var16] & 255;
                  if (var19 == 0) {
                    if (dl.field_j != null &&
                      null != dl.field_j[var16] &&
                      dl.field_j[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (ci.field_d != null &&
                      null != ci.field_d[var16]) {
                      var18_int = ci.field_d[var16][var17_int];
                      if (var18_int > var13Lifetime1) {
                        var13Lifetime1 = var18_int;
                      }
                      if (var18_int != 0 &&
                        !rg.field_s) {
                        var11 = 1;
                      }
                    }
                    if (op.field_a != null &&
                      op.field_a[var16] != null) {
                      var15 = var15 | op.field_a[var16][var17_int];
                    }
                    if (null != w.field_j &&
                      w.field_j[var16] != null) {
                      var18_intLifetime1 = w.field_j[var16][var17_int];
                      if (var18_intLifetime1 > var14) {
                        var14 = var18_intLifetime1;
                      }
                      if (0 != var18_intLifetime1 &&
                        !rg.field_s) {
                        var11 = 1;
                      }
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = wo.field_f.field_Rb.field_T;
                var18_ref = (im) (var17.c((byte) 96));
                L54: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_130_0 = var18_ref.c(true);
                    stackIn_150_0 = stackOut_130_0 ? 1 : 0;
                    stackIn_131_0 = stackOut_130_0;
                    if (var19 != 0) {
                      break L54;
                    }
                    if (!stackIn_131_0 ||
                      var19 != 0) {
                      if (var11 != 0 &&
                        !var18_ref.field_Pb) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var13Lifetime1 > var18_ref.field_Rb) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var18_ref.field_Xb < var14) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (0 < (var15 & ~var18_ref.field_Nb)) {
                              var16 = 1;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var18_ref = (im) (var17.f((byte) -5));
                      continue;
                    }
                  }
                  stackIn_150_0 = hq.field_i;
                  break;
                }
                if (stackIn_150_0 >= 2 &&
                  vj.field_c[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  d.field_c.field_pb = false;
                  if (d.field_c.field_db) {
                    if (na.field_e.field_i.field_Mb != 0) {
                      kk.field_B = nr.a(new String[]{mm.field_l}, -1, t.field_c);
                      if (var19 != 0) {
                        kk.field_B = fn.field_Mb;
                      }
                    } else {
                      kk.field_B = fn.field_Mb;
                    }
                  }
                }
              }
              if (var19 != 0) {
                var9_ref_String = em.field_L.field_Ob;
                ii.field_e.field_nb = nr.a(new String[]{var9_ref_String}, -1, th.field_c).toUpperCase();
                gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
                gi.field_o.field_nb = nr.a(new String[]{var9_ref_String}, -1, uh.field_s);
                var8 = gi.field_o;
              }
            } else {
              var9_ref_String = em.field_L.field_Ob;
              ii.field_e.field_nb = nr.a(new String[]{var9_ref_String}, -1, th.field_c).toUpperCase();
              gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
              gi.field_o.field_nb = nr.a(new String[]{var9_ref_String}, -1, uh.field_s);
              var8 = gi.field_o;
            }
            if (fd.field_K != 0L) {
              var9 = (int)(-rl.a((byte) -94) + fd.field_K);
              var9 = (999 + var9) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.field_nb = nr.a(new String[]{Integer.toString(var9)}, -1, bl.field_v);
            }
            nd.field_c.field_nb = nr.a(new String[]{Integer.toString(em.field_L.field_mc), Integer.toString(em.field_L.field_Nb)}, -1, qa.field_o);
          }
          stackIn_173_0 = so.field_k;
          stackIn_174_1 = (param2) && (!param1) && (!nr.field_bb);
          ((vh) (Object) stackIn_173_0).a(stackIn_174_1, false);
          stackIn_178_0 = uq.field_f;
          stackIn_179_1 = (param2) && (!param1) && (!nr.field_bb);
          ((vh) (Object) stackIn_178_0).a(stackIn_179_1, false);
          var5_int = 92 / ((0 - param3) / 63);
          stackIn_183_0 = de.field_b;
          stackIn_184_1 = (param2) && (!param1) && (nr.field_bb);
          ((vh) (Object) stackIn_183_0).a(stackIn_184_1, false);
          na.field_e.field_i.c(true);
          if (null != em.field_L) {
            if (ok.field_ob.field_R != 0) {
              nf.a(em.field_L.g(20872), true, param4);
            }
            if (kc.field_b.field_R != 0) {
              nr.field_bb = true;
            }
            if (d.field_c.field_R != 0) {
              em.field_N = true;
            }
            if (ba.field_vb.field_R != 0) {
              nr.field_bb = false;
            }
            tl.a(param4, em.field_L, 0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5_ref), "fe.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -13671) {
            fe.a((int[]) null, 103, 77);
          }
          stackIn_5_0 = ((param0[param2 >> 5] & 1 << (param2 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fe.BA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != 99) {
          field_J = true;
        }
        if (this.field_K) {
          this.field_K = false;
          if (this.field_t != null &&
            this.field_t instanceof ik) {
            ((ik) (this.field_t)).a(param0 ^ 17634, this.field_K, (ei) (this));
          }
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_n != 0) {
            if (~cd.field_b == ~this.field_n) {
              return;
            }
            if (this.a(param2, param3, wn.field_i, -1, gg.field_f) &&
              cd.field_b == 0) {
              this.a(16, -param2 + wn.field_i, -param3 + gg.field_f, this.field_n);
            }
            this.a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("fe.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return false;
          }
          if (!this.d(73)) {
            return false;
          }
          if (param1 != 84 &&
            param1 != 83) {
            return false;
          }
          this.a(16, -1, -1, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        int var2 = 81 % ((param0 - 7) / 48);
        return this.field_K;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          if (this.field_I &&
            this.a(param1, param5, param6, -1, param4)) {
            this.a(param0, (byte) 122);
            this.field_n = param3;
            if (this.field_t != null &&
              this.field_t instanceof bn) {
              ((bn) (this.field_t)).a((byte) -123, param5, this, param1, param3, param6, param4);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("fe.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        boolean stackIn_8_0 = false;
        String stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        var5 = Pool.field_O;
        try {
          var3 = up.a(param0, param2, (byte) 117);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param2.length() > var4)))) {
            stackOut_7_0 = uc.a(param2.charAt(var4), (byte) -51);
            stackIn_14_0 = stackOut_7_0 ? 1 : 0;
            stackIn_8_0 = stackOut_7_0;
            if (var5 == 0) {
              if (!stackIn_8_0) {
                stackIn_11_0 = iq.field_g;
                return stackIn_11_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = param1;
          }
          if (stackIn_14_0 > 66) {
            return null;
          }
          fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fe.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
            if (this.field_G) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_I) {
              discarded$3 = param0.append(" disabled");
            }
          }
          if (param3 > 13) {
            stackIn_10_0 = (StringBuilder) (param0);
            return stackIn_10_0;
          }
          stackIn_8_0 = (StringBuilder) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.EA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_L = null;
        if (param0 != 72) {
          field_J = false;
        }
        field_H = null;
        field_M = null;
    }

    fe(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_I &&
            this.field_F) {
            param0.d((byte) 99);
            this.field_K = true;
            if (this.field_t != null &&
              this.field_t instanceof ik) {
              ((ik) (this.field_t)).a(17537, this.field_K, (ei) (this));
            }
            var3_int = 113 % ((param1 + 43) / 47);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fe.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    fe(String param0, fp param1, cc param2) {
        super(param0, param1, param2);
        this.field_I = true;
        this.field_F = true;
        this.field_K = false;
    }

    protected fe() {
        this.field_I = true;
        this.field_F = true;
        this.field_K = false;
        this.field_z = db.field_Sb.field_k;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
          if (null != this.field_t &&
            this.field_t instanceof bn) {
            ((bn) (this.field_t)).a(param3, this, param2, param0, -116, param1);
          }
          if (param4 <= 62) {
            this.a((ei) null, -88, true, 21, -27, 5, -59);
          }
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fe.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new boolean[64];
        field_L = new int[8192];
        field_J = true;
    }
}
