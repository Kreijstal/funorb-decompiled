/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    private long field_a;
    static int field_j;
    private long field_e;
    private int field_g;
    static ResourceArchive field_d;
    private long field_i;
    private long field_o;
    private sn field_q;
    private byte[] field_n;
    private long field_l;
    private byte[] field_p;
    static String field_c;
    private long field_f;
    static int field_b;
    static String[] field_m;
    private int field_h;
    static ResourceArchive field_k;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = SteelSentinels.obfuscationControl;
        try {
          try {
            if (param2 + param3 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param2 + param3));
            }
            if (-1L != this.field_a &&
              this.field_l >= this.field_a &&
              (long)param2 + this.field_l <= (long)this.field_h + this.field_a) {
              ii.a(this.field_p, (int)(-this.field_a + this.field_l), param1, param3, param2);
              this.field_l = this.field_l + (long)param2;
              return;
            }
            var5_long = this.field_l;
            var7 = param3;
            var8 = param2;
            if (this.field_l >= this.field_i &&
              ((long)this.field_g + this.field_i) > this.field_l) {
              var9_int = (int)((long)this.field_g - this.field_l + this.field_i);
              if (var9_int > param2) {
                var9_int = param2;
              }
              ii.a(this.field_n, (int)(this.field_l - this.field_i), param1, param3, var9_int);
              param3 = param3 + var9_int;
              this.field_l = this.field_l + (long)var9_int;
              param2 = param2 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param2 > this.field_n.length) {
              this.field_q.a(this.field_l, -1);
              this.field_e = this.field_l;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_q.a(param1, param3, param2, false);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 - var9_intLifetime1;
                param3 = param3 + var9_intLifetime1;
                this.field_l = this.field_l + (long)var9_intLifetime1;
                this.field_e = this.field_e + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.b(-84);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_g < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_g;
              }
              ii.a(this.field_n, 0, param1, param3, var9_intLifetime1Lifetime1);
              param3 = param3 + var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              this.field_l = this.field_l + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_l < this.field_a &&
                param2 > 0) {
                var9_intLifetime2 = param3 + (int)(-this.field_l + this.field_a);
                if (param3 + param2 < var9_intLifetime2) {
                  var9_intLifetime2 = param2 + param3;
                }
                while (param3 < var9_intLifetime2) {
                  incrementValue$0 = param3;
                  param3++;
                  param1[incrementValue$0] = (byte) 0;
                  param2--;
                  this.field_l = this.field_l + 1L;
                }
              }
              var9 = -1L;
              if (this.field_a >= var5_long &&
                this.field_a < (long)var8 + var5_long) {
                var9 = this.field_a;
              } else {
                if (var5_long >= this.field_a &&
                  this.field_a + (long)this.field_h > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if ((long)this.field_h + this.field_a > var5_long &&
                (this.field_a + (long)this.field_h) <= ((long)var8 + var5_long)) {
                var11 = (long)this.field_h + this.field_a;
              } else {
                if (var5_long + (long)var8 > this.field_a &&
                  (this.field_a + (long)this.field_h) >= (var5_long + (long)var8)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (-1L < var9 &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                ii.a(this.field_p, (int)(var9 - this.field_a), param1, var7 + (int)(-var5_long + var9), var13);
                if (this.field_l < var11) {
                  param2 = (int)((long)param2 - (-this.field_l + var11));
                  this.field_l = var11;
                }
              }
            }
            if (param0 != 115) {
              this.field_o = -101L;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
          if (param2 <= 0) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var5_ref;
          stackIn_64_1 = new StringBuilder().append("rj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        java.applet.Applet var8;
        var7 = SteelSentinels.obfuscationControl;
        if (this.field_a != -1L) {
          if (~this.field_a != ~this.field_e) {
            this.field_q.a(this.field_a, -1);
            this.field_e = this.field_a;
          }
          this.field_q.a(this.field_h, 1, this.field_p, 0);
          this.field_e = this.field_e + (long)this.field_h;
          if (this.field_f < this.field_e) {
            this.field_f = this.field_e;
          }
          var2 = -1L;
          if (this.field_i <= this.field_a &&
            this.field_a < ((long)this.field_g + this.field_i)) {
            var2 = this.field_a;
          } else {
            if (this.field_a <= this.field_i &&
              this.field_i < (this.field_a + (long)this.field_h)) {
              var2 = this.field_i;
            }
          }
          var4 = -1L;
          if ((long)this.field_h + this.field_a > this.field_i &&
            (long)this.field_h + this.field_a <= (long)this.field_g + this.field_i) {
            var4 = this.field_a + (long)this.field_h;
          } else {
            if (this.field_i + (long)this.field_g > this.field_a &&
              this.field_a + (long)this.field_h >= (long)this.field_g + this.field_i) {
              var4 = (long)this.field_g + this.field_i;
            }
          }
          if (-1L < var2 &&
            var2 < var4) {
            var6 = (int)(var4 - var2);
            ii.a(this.field_p, (int)(-this.field_a + var2), this.field_n, (int)(-this.field_i + var2), var6);
          }
          this.field_h = 0;
          this.field_a = -1L;
        }
        if (param0 >= -43) {
          var8 = (java.applet.Applet) null;
          rj.a((String) null, (java.applet.Applet) null, (byte) -111);
        }
    }

    final long a(byte param0) {
        int var2 = -54 / ((param0 - 45) / 43);
        return this.field_o;
    }

    final static void d(int param0) {
        String[] array$0 = null;
        int stackIn_18_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_296_0 = 0;
        SceneWidget stackIn_333_0 = null;
        int stackIn_350_0 = 0;
        int stackIn_350_1 = 0;
        boolean stackIn_351_2 = false;
        int stackIn_376_0 = 0;
        Object stackIn_436_0;
        int stackIn_436_1;
        String[] stackIn_436_2;
        String[] stackIn_436_3;
        int stackIn_436_4;
        String stackIn_437_5;
        int stackIn_456_0 = 0;
        SceneWidget stackIn_493_0 = null;
        SceneWidget stackIn_493_1 = null;
        String stackIn_493_2 = null;
        SceneWidget stackIn_494_0 = null;
        SceneWidget stackIn_494_1 = null;
        Object stackIn_494_3 = null;
        SceneWidget stackIn_496_0 = null;
        RgbSprite[] stackIn_496_1 = null;
        int stackIn_496_2 = 0;
        int stackIn_497_3;
        SceneWidget stackIn_554_0;
        int stackIn_554_1;
        int stackIn_554_2;
        int stackIn_554_3;
        int stackIn_555_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        PartInstruction var5_ref_qd = null;
        int var6 = 0;
        PartInstruction var6_ref_qd = null;
        int var7_int = 0;
        SceneWidget var7 = null;
        PartInstruction var8 = null;
        int var8_int = 0;
        SceneWidget var8_ref = null;
        SceneWidget var9 = null;
        int var10_int = 0;
        SceneWidget var10 = null;
        int var11_int = 0;
        SceneWidget var11 = null;
        int var12_int = 0;
        SceneWidget var12 = null;
        int var13 = 0;
        ArticulatedPart var13_ref_nk = null;
        int var14_int = 0;
        Object var14 = null;
        Object var15 = null;
        int var16_int = 0;
        SceneWidget var16 = null;
        int[] var16_array = null;
        int var17 = 0;
        Object var17_ref = null;
        int var18 = 0;
        int[] var18_ref_int__ = null;
        Object var19_ref = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20_int = 0;
        SceneWidget var20 = null;
        int var21_int = 0;
        SceneWidget var21 = null;
        lb var23 = null;
        int var25 = 0;
        int var26_int = 0;
        SceneWidget var26 = null;
        Object var27_ref = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int var32 = 0;
        PartInstruction var34 = null;
        ArticulatedPart var35 = null;
        PartInstruction var36 = null;
        kg var37 = null;
        kg var38 = null;
        SceneWidget var39 = null;
        SceneWidget var40 = null;
        SceneWidget var41 = null;
        SceneWidget var42 = null;
        SceneWidget var43 = null;
        Object var44 = null;
        NodeIterator var45 = null;
        SceneWidget var46 = null;
        SceneWidget var47 = null;
        SceneWidget var48 = null;
        SceneWidget var49 = null;
        NodeIterator var50 = null;
        SceneWidget var51 = null;
        SceneWidget var52 = null;
        SceneWidget var53 = null;
        SceneWidget var54 = null;
        SceneWidget var55 = null;
        SceneWidget var56 = null;
        SceneWidget var57 = null;
        SceneWidget var58 = null;
        kg var60 = null;
        SceneWidget var61 = null;
        SceneWidget var62 = null;
        SceneWidget var63 = null;
        SceneWidget var64 = null;
        kg var65 = null;
        SceneWidget var66 = null;
        kg var67 = null;
        int[] var69 = null;
        int[] var73 = null;
        int[][] var74 = null;
        Object var75 = null;
        Object var76 = null;
        Object var77 = null;
        CharSequence var78 = null;
        CharSequence var79 = null;
        CharSequence var80 = null;
        var75 = null;
        var76 = null;
        var77 = null;
        var32 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 0;
          var2 = 0;
          if (ti.field_B == null) {
            if (ij.field_Y >= 0) {
              var2 = 16;
            }
          } else {
            var2 = 100;
          }
          if (null != bl.field_c) {
            if (bl.field_c.field_Rb <= oh.field_f) {
              if (var2 + bl.field_c.field_Rb + bl.field_c.field_zb > oh.field_f) {
                if (bl.field_c.field_cb <= pi.field_c) {
                  stackIn_18_0 = (bl.field_c.field_Lb + bl.field_c.field_cb <= pi.field_c) ? 0 : 1;
                } else {
                  stackIn_18_0 = 0;
                }
              } else {
                stackIn_18_0 = 0;
              }
            } else {
              stackIn_18_0 = 0;
            }
          } else {
            stackIn_18_0 = 0;
          }
          var3 = stackIn_18_0;
          if (var3 != 0 ||
            sn.field_l) {
            kf.field_s = true;
          }
          sn.field_l = var3 != 0;
          if (kk.field_a != null) {
            if (oh.field_f >= kk.field_a.field_Rb) {
              if (kk.field_a.field_zb + kk.field_a.field_Rb > oh.field_f) {
                if (kk.field_a.field_cb <= pi.field_c) {
                  stackIn_34_0 = (kk.field_a.field_Lb + kk.field_a.field_cb <= pi.field_c) ? 0 : 1;
                } else {
                  stackIn_34_0 = 0;
                }
              } else {
                stackIn_34_0 = 0;
              }
            } else {
              stackIn_34_0 = 0;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var4 = stackIn_34_0;
          if (var4 != 0 ||
            nl.field_X) {
            GameApplet.field_l = true;
          }
          if (dc.field_g >= 0) {
            kf.field_s = true;
            GameApplet.field_l = true;
          }
          nl.field_X = var4 != 0;
          if (qa.field_M != 0 &&
            57 != qa.field_M) {
            GameApplet.field_l = true;
          }
          if (fg.field_Ob != 1) {
            qa.field_M = Math.max(qa.field_M - 6, 0);
          } else {
            qa.field_M = Math.min(qa.field_M + 6, 57);
          }
          if (qa.field_M != 0 &&
            qa.field_M != 57) {
            GameApplet.field_l = true;
          }
          if (null != hl.field_v && (null == kh.field_v ||
            kh.field_v.componentId != hl.field_v.componentId)) {
            var5 = uc.field_b[0];
            var73 = nl.a(var5, (byte) 123);
            for (var7_int = 0; var7_int < dn.field_bc.length; var7_int++) {
              dn.field_bc[var7_int] = -1;
            }
            kh.field_v = SentinelDesigner.a(var73, (byte) -50, dn.field_bc);
          }
          if (-2 == pa.field_e &&
            lb.field_gc == 1 &&
            he.a((byte) 127)) {
            for (var5 = 0; var5 < di.field_c.length; var5++) {
              di.field_c[var5] = dn.field_bc[var5];
            }
          }
          boolean decompiledFrameRemainder3 = true;
          if (pa.field_e >= 0 &&
            he.a((byte) 123)) {
            if (lb.field_gc == 2) {
              if (ij.field_Y < 0) {
                di.field_c[pa.field_e] = -1;
              } else {
                GameApplet.field_l = true;
                ij.field_Y = -1;
              }
            } else {
              if ((lb.field_gc == 1)) {
                var5 = di.field_c[pa.field_e];
                di.field_c[pa.field_e] = ij.field_Y;
                if (fg.field_Ob != 0) {
                  fg.field_Ob = 0;
                  var1_int = 1;
                  kf.field_s = true;
                  GameApplet.field_l = true;
                }
                if (0 <= ij.field_Y) {
                  ij.field_Y = -1;
                } else {
                  ij.field_Y = var5;
                }
              }
            }
            decompiledFrameRemainder3 = false;
          }
          else {
            if (lj.field_h != null) {
              if (lb.field_gc == 1 &&
                fc.field_e[81] &&
                he.a((byte) 118)) {
                var34 = lj.field_h;
                var6 = kh.field_v.a((byte) 2, var34);
                if ((!(var6 < 0)) && ((null == var34.attachedPart ||
                  var6 != var34.attachedPart.componentId))) {
                  if (null != var34.attachedPart &&
                    83 == var34.attachedPart.componentId) {
                    var1_int = 1;
                  }
                  var34.attachedPart = new ArticulatedPart(NodeDeque.a(var6, (byte) 67));
                  var7_int = ub.a(125, var6);
                  if (var7_int >= 0) {
                    var8 = hl.field_v.c(0, lj.field_h.field_r);
                    if (var8 != null) {
                      var8.attachedPart = new ArticulatedPart(NodeDeque.a(var7_int, (byte) 67));
                    }
                  }
                  if (var6 == 83) {
                    var1_int = 1;
                  }
                  CombatWorld.c(param0 - 6996144, 25);
                }
                decompiledFrameRemainder3 = false;
              }
              else {
                if (lb.field_gc == 2 &&
                  he.a((byte) 126)) {
                  if (ti.field_B != null) {
                    ti.field_B = null;
                    f.field_A = null;
                  } else {
                    var35 = lj.field_h.attachedPart;
                    if (var35 != null && (var35.field_Q == 4 ||
                      var35.field_Q == 2048)) {
                      var6_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                      if (var6_ref_qd != null) {
                        var6_ref_qd.attachedPart = null;
                      }
                    }
                    lj.field_h.attachedPart = null;
                    if (((var35 != null)) &&
                      ((var35.componentId == 83))) {
                      var1_int = 1;
                    }
                  }
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (lb.field_gc == 1 &&
                    he.a((byte) 126)) {
                    if ((fg.field_Ob & 16) != 0 &&
                      ti.field_B != null) {
                      if (!((ti.field_B.field_Q & lj.field_h.field_q) <= 0)) {
                        if (ti.field_B.componentId == 83) {
                          var1_int = 1;
                        }
                        lj.field_h.attachedPart = new ArticulatedPart(ti.field_B);
                        CombatWorld.c(-2483, 25);
                      }
                      decompiledFrameRemainder3 = false;
                    }
                    else {
                      if (null == lj.field_h.attachedPart) {
                        if (null != ti.field_B &&
                          (ti.field_B.field_Q & lj.field_h.field_q) > 0) {
                          lj.field_h.attachedPart = ti.field_B;
                          if (ti.field_B.componentId == 83) {
                            var1_int = 1;
                          }
                          CombatWorld.c(-2483, 25);
                          if (null != f.field_A) {
                            var5_ref_qd = hl.field_v.c(param0 ^ 6993661, lj.field_h.field_r);
                            if (var5_ref_qd != null) {
                              var5_ref_qd.attachedPart = f.field_A;
                            }
                          }
                          ti.field_B = null;
                          f.field_A = null;
                        }
                      } else {
                        if (ti.field_B != null &&
                          0 < (ti.field_B.field_Q & lj.field_h.field_q)) {
                          lj.field_h.attachedPart = ti.field_B;
                          if (ti.field_B.componentId == 83) {
                            var1_int = 1;
                          }
                          CombatWorld.c(-2483, 25);
                          if (null != f.field_A) {
                            var5_ref_qd = hl.field_v.c(0, lj.field_h.field_r);
                            if (var5_ref_qd != null) {
                              var5_ref_qd.attachedPart = f.field_A;
                            }
                          }
                          f.field_A = null;
                          ti.field_B = null;
                        } else {
                          if (null == ti.field_B) {
                            ti.field_B = lj.field_h.attachedPart;
                            f.field_A = null;
                            if (4 == ti.field_B.field_Q ||
                              ti.field_B.field_Q == 2048) {
                              var36 = hl.field_v.c(0, lj.field_h.field_r);
                              if (var36 != null) {
                                f.field_A = var36.attachedPart;
                                var36.attachedPart = null;
                              } else {
                                f.field_A = null;
                              }
                            }
                            if (null != lj.field_h.attachedPart &&
                              lj.field_h.attachedPart.componentId == 83) {
                              var1_int = 1;
                            }
                            if (ti.field_B == null) {
                              f.field_A = null;
                              ti.field_B = null;
                            }
                            lj.field_h.attachedPart = null;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameRemainder1 = true;
          if (gd.field_jb != null) {
            if (null != bi.field_f &&
              null != bi.field_f.field_Ub) {
              stackIn_163_0 = bi.field_f.field_Ub.field_eb;
            } else {
              stackIn_163_0 = -2147483648;
            }
            var5 = stackIn_163_0;
            if (null != vd.field_a &&
              vd.field_a.field_Ub != null) {
              stackIn_168_0 = vd.field_a.field_Ub.field_eb;
            } else {
              stackIn_168_0 = -2147483648;
            }
            var6 = stackIn_168_0;
            gd.field_jb.a((byte) -107, true);
            if (null != bi.field_f &&
              bi.field_f.field_Ub != null) {
              stackIn_173_0 = bi.field_f.field_Ub.field_eb;
            } else {
              stackIn_173_0 = -2147483648;
            }
            var7_int = stackIn_173_0;
            if (var5 != var7_int) {
              kf.field_s = true;
            }
            if (null != vd.field_a &&
              null != vd.field_a.field_Ub) {
              stackIn_179_0 = vd.field_a.field_Ub.field_eb;
            } else {
              stackIn_179_0 = -2147483648;
            }
            var8_int = stackIn_179_0;
            if (var8_int != var6) {
              GameApplet.field_l = true;
            }
            var37 = bi.field_f;
            if (var37 != null) {
              if (null != var37.field_Ub) {
                stackIn_185_0 = var37.field_Ub.field_eb;
              } else {
                stackIn_185_0 = -2147483648;
              }
              var10_int = stackIn_185_0;
              var37.a((byte) 96, jj.field_d * 32, 128, false, 32);
              if (null == var37.field_Ub) {
                stackIn_188_0 = -2147483648;
              } else {
                stackIn_188_0 = var37.field_Ub.field_eb;
              }
              var11_int = stackIn_188_0;
              if (var10_int != var11_int) {
                kf.field_s = true;
              }
              var12_int = -1;
              if (fg.field_Ob == 0) {
                var12_int = 3;
              } else {
                if ((fg.field_Ob & 1) != 0) {
                  var12_int = 0;
                } else {
                  if ((fg.field_Ob & 2) != 0) {
                    var12_int = 1;
                  } else {
                    if (0 != (fg.field_Ob & 16)) {
                      var12_int = 2;
                    }
                  }
                }
              }
              if (var12_int >= 0) {
                va.field_k[var12_int] = var37.field_Ub.field_eb;
              }
            }
            var38 = vd.field_a;
            if (var38 != null) {
              if (var38.field_Ub != null) {
                stackIn_205_0 = var38.field_Ub.field_eb;
              } else {
                stackIn_205_0 = -2147483648;
              }
              var11_int = stackIn_205_0;
              var38.a((byte) 96, 32 * jj.field_d, 128, false, 32);
              if (null != var38.field_Ub) {
                stackIn_208_0 = var38.field_Ub.field_eb;
              } else {
                stackIn_208_0 = -2147483648;
              }
              var12_int = stackIn_208_0;
              if (var11_int != var12_int) {
                GameApplet.field_l = true;
              }
            }
            if (lb.field_gc == 1) {
              var11_int = fg.field_Ob;
              var39 = wc.field_h[0];
              var48 = var39;
              var48 = var39;
              if (var39 != null &&
                var39.field_kb) {
                fg.field_Ob = 1;
                var1_int = 1;
              }
              var40 = wc.field_h[1];
              var48 = var40;
              var48 = var40;
              if (var40 != null &&
                var40.field_kb) {
                fg.field_Ob = 2062;
                var1_int = 1;
              }
              var41 = wc.field_h[2];
              var48 = var41;
              var48 = var41;
              if (var41 != null &&
                var41.field_kb) {
                fg.field_Ob = 1008;
                var1_int = 1;
              }
              var42 = wc.field_h[3];
              var48 = var42;
              var48 = var42;
              if (var42 != null &&
                var42.field_kb) {
                var1_int = 1;
                fg.field_Ob = 0;
              }
              if (var11_int != fg.field_Ob) {
                if (var37 != null) {
                  var13 = -1;
                  if (0 != (var11_int & 1)) {
                    var13 = 0;
                  }
                  if ((2 & var11_int) != 0) {
                    var13 = 1;
                  }
                  if ((16 & var11_int) != 0) {
                    var13 = 2;
                  }
                  if (var11_int == 0) {
                    var13 = 3;
                  }
                  if (0 <= var13) {
                    va.field_k[var13] = var37.field_Ub.field_eb;
                  }
                }
                f.field_A = null;
                ij.field_Y = -1;
                ti.field_B = null;
                CombatWorld.c(-2483, 95);
              }
            }
            t.field_h = -1;
            df.field_K = false;
            f.field_y = null;
            var11 = rh.field_u;
            if (var11 != null) {
              if (fg.field_Ob == 0) {
                for (var12_int = 0; var12_int < 35; var12_int++) {
                  var48 = cj.field_a[var12_int];
                  if (var48 != null &&
                    var48.field_kb) {
                    var49 = var48.a("engineer", false);
                    if (var49 != null &&
                      var49.field_kb) {
                      df.field_K = true;
                    }
                    if (lb.field_gc == 1 &&
                      df.field_K &&
                      he.a((byte) 121)) {
                      var15 = null;
                      if (!t.a(fe.field_D, var12_int, -20370)) {
                        if (ad.a(var12_int, ArticulatedPart.f((byte) -96), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                          if (qf.field_h[var12_int] > li.field_v) {
                            var15 = BattleTerrain.field_g;
                            ln.field_c = b.field_q[2];
                          }
                        } else {
                          var15 = ha.field_R;
                          ln.field_c = b.field_q[2];
                          var16_int = nm.a(param0 ^ 6985420, var12_int);
                          if (var16_int >= 0 &&
                            !t.a(fe.field_D, var16_int, -20370)) {
                            var15 = oc.field_e;
                            var15 = db.a((String) (var15), -65, new String[]{field_m[var16_int], field_m[var12_int]});
                          }
                          var17 = var12_int;
                          switch (var17) {
                            case 26:
                              var15 = b.field_i;
                              break;
                            case 23:
                              var15 = k.field_Eb;
                              break;
                            case 27:
                              var15 = DualNode.field_t;
                              break;
                            case 25:
                              var15 = rd.field_c;
                              break;
                            default:
                              break;
                          }
                        }
                      } else {
                        ln.field_c = b.field_q[0];
                        var15 = va.field_i;
                      }
                      if (var15 == null &&
                        !ni.b(param0 - 6993613)) {
                        sn.field_q = var12_int;
                        f.field_v = qf.field_h[var12_int];
                        CombatWorld.c(-2483, 95);
                      }
                      if (var15 != null) {
                        array$0 = new String[1];
                        stackIn_436_0 = var15;
                        stackIn_436_1 = param0 ^ -6993616;
                        stackIn_436_2 = array$0;
                        stackIn_436_3 = array$0;
                        stackIn_436_4 = 0;
                        if (var12_int == 34) {
                          stackIn_437_5 = "GODULE";
                        } else {
                          stackIn_437_5 = field_m[var12_int];
                        }
                        stackIn_436_3[stackIn_436_4] = stackIn_437_5;
                        km.field_a = db.a((String) (stackIn_436_0), stackIn_436_1, stackIn_436_2);
                      }
                    } else {
                      if (1 == lb.field_gc &&
                        uc.a(var12_int, -3958) &&
                        he.a((byte) 127)) {
                        ij.field_Y = var12_int;
                        ti.field_B = null;
                        f.field_A = null;
                        CombatWorld.c(-2483, 100);
                      }
                    }
                    t.field_h = var12_int;
                    if (null == f.field_y) {
                      var50 = new NodeIterator(var48.field_M);
                      var16 = (SceneWidget) (var50.b(2));
                      while (var16 != null) {
                        if (var16.field_kb &&
                          var16.field_S != null &&
                          var16.field_S.startsWith("<img=") &&
                          7 == var16.field_S.length()) {
                          f.field_y = var16;
                          break;
                        }
                        var16 = (SceneWidget) (var50.d(2));
                      }
                    }
                  }
                }
              } else {
                var12_int = 0;
                var13_ref_nk = (ArticulatedPart) (ao.field_H.first(13058));
                while (var13_ref_nk != null) {
                  var14 = null;
                  if (0 <= var13_ref_nk.componentId &&
                    var13_ref_nk.componentId < cj.field_a.length &&
                    0 != (fg.field_Ob & var13_ref_nk.field_Q)) {
                    var14 = cj.field_a[var13_ref_nk.componentId];
                  }
                  if (var14 != null &&
                    ((SceneWidget) (var14)).field_kb) {
                    var43 = ((SceneWidget) (var14)).a("engineer", false);
                    if (var43 != null &&
                      var43.field_kb) {
                      df.field_K = true;
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (1 == lb.field_gc &&
                      df.field_K &&
                      he.a((byte) 117)) {
                      var16_int = 0;
                      if (1 == var13_ref_nk.field_Q) {
                        var17_ref = ki.b(var13_ref_nk.componentId, (byte) -85);
                        var18_ref_int__ = ne.a(var13_ref_nk.componentId, (byte) 28);
                        var69 = (int[]) var17_ref;
                        var44 = var69;
                        var19_ref = var44;
                        for (var20_int = 0; var69.length > var20_int; var20_int++) {
                          var21_int = var69[var20_int];
                          if (!t.a(fe.field_D, var21_int, param0 - 7014031)) {
                            var16_int = var16_int + qf.field_h[var21_int];
                          }
                        }
                        var19_ref_int__ = var18_ref_int__;
                        for (var20_int = 0; var20_int < var19_ref_int__.length; var20_int++) {
                          var21_int = var19_ref_int__[var20_int];
                          if (!t.a(rn.field_D, var21_int, param0 - 7014031)) {
                            var16_int = var16_int + sj.field_v[var21_int];
                          }
                        }
                      } else {
                        var16_int = sj.field_v[var13_ref_nk.componentId];
                      }
                      var17_ref = null;
                      if (t.a(rn.field_D, var13_ref_nk.componentId, -20370)) {
                        var17_ref = qi.field_e;
                        ln.field_c = b.field_q[0];
                      } else {
                        if (var16_int > li.field_v) {
                          ln.field_c = b.field_q[2];
                          var17_ref = bj.field_a;
                        }
                      }
                      if (var17_ref == null &&
                        !ni.b(88)) {
                        f.field_v = var16_int;
                        sn.field_q = var13_ref_nk.componentId + 128;
                        CombatWorld.c(-2483, 95);
                      }
                      if ((var17_ref != null)) {
                        km.field_a = db.a((String) (var17_ref), param0 - 6993681, new String[]{t.field_e[var13_ref_nk.componentId]});
                      }
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      if (lb.field_gc == 1 &&
                        mm.a(-16242, var13_ref_nk)) {
                        if ((var13_ref_nk.field_Q != 1) &&
                          (decompiledFrameRemainder2 = !(!he.a((byte) 116)))) {
                          decompiledFrameRemainder2 = !(!hl.field_v.f(var13_ref_nk.field_Q, -1));
                        }
                        if (decompiledFrameRemainder2) {
                          if (var13_ref_nk.field_Q == 1 &&
                            var13_ref_nk.componentId != 55 &&
                            (4 & dm.field_a) == 0 &&
                            !he.a((byte) 120)) {
                            stackIn_296_0 = (var13_ref_nk.componentId == 57) ? 6 : 10;
                            if (stackIn_296_0 > fm.field_f[0]) {
                              km.field_a = dj.field_i;
                              dm.field_a = dm.field_a | 4;
                              if (!(ni.b(param0 - 6993572))) {
                                um.f((byte) 3);
                              }
                              decompiledFrameRemainder2 = false;
                            }
                          }
                          if (decompiledFrameRemainder2) {
                            if (var13_ref_nk.field_Q == 1) {
                              CombatWorld.c(-2483, 99);
                              di.field_c = new int[8];
                              qh.field_Wb = true;
                              for (var16_int = 0; var16_int < 8; var16_int++) {
                                di.field_c[var16_int] = -1;
                              }
                              var12_int = 1;
                              var16_array = nl.a(var13_ref_nk.componentId, (byte) 123);
                              if (var16_array != null) {
                                uc.field_b = var16_array;
                              } else {
                                var12_int = 0;
                                hl.field_v = new ArticulatedPart(var13_ref_nk);
                              }
                              ij.field_Y = -1;
                              ti.field_B = null;
                            } else {
                              CombatWorld.c(param0 ^ -6995792, 100);
                              t.field_h = var13_ref_nk.componentId;
                              ti.field_B = new ArticulatedPart(var13_ref_nk);
                              f.field_A = null;
                              var16_int = ub.a(119, var13_ref_nk.componentId);
                              if (var16_int >= 0) {
                                f.field_A = new ArticulatedPart(NodeDeque.a(var16_int, (byte) 67));
                              }
                              ij.field_Y = -1;
                            }
                          }
                        }
                      }
                    }
                    t.field_h = var13_ref_nk.componentId;
                    if (null != f.field_y) {
                      var13_ref_nk = (ArticulatedPart) (ao.field_H.next((byte) -27));
                      continue;
                    }
                    var45 = new NodeIterator(((SceneWidget) (var14)).field_M);
                    var17_ref = (SceneWidget) (var45.b(2));
                    while (var17_ref != null) {
                      if (((SceneWidget) (var17_ref)).field_kb &&
                        null != ((SceneWidget) (var17_ref)).field_S && (((SceneWidget) (var17_ref)).field_S.startsWith("<img=6>") ||
                        ((SceneWidget) (var17_ref)).field_S.startsWith("<img=2>") ||
                        ((SceneWidget) (var17_ref)).field_S.startsWith("<img=3>") ||
                        ((SceneWidget) (var17_ref)).field_S.length() == 7 &&
                        ((SceneWidget) (var17_ref)).field_S.startsWith("<img="))) {
                        f.field_y = (SceneWidget) (var17_ref);
                        break;
                      }
                      var17_ref = (SceneWidget) (var45.d(2));
                    }
                  }
                  var13_ref_nk = (ArticulatedPart) (ao.field_H.next((byte) -27));
                }
                if (fg.field_Ob == 1) {
                  for (var13 = 0; ue.field_c.length > var13; var13++) {
                    var14_int = var13 + 101;
                    if (null == ue.field_c[var13]) {
                      stackIn_333_0 = null;
                    } else {
                      stackIn_333_0 = cj.field_a[var14_int];
                    }
                    var46 = stackIn_333_0;
                    var15 = var46;
                    if (var15 != null &&
                      var46.field_kb &&
                      lb.field_gc == 1) {
                      var47 = ((SceneWidget) (var15)).a("bin", false);
                      if (var47 != null &&
                        var47.field_kb) {
                        ue.field_c[var13] = null;
                        for (var17 = var13; ue.field_c.length - 1 > var17; var17++) {
                          ue.field_c[var17] = ue.field_c[1 + var17];
                          ue.field_g[var17] = ue.field_g[1 + var17];
                        }
                        ue.field_c[ue.field_c.length - 1] = null;
                        ue.field_g[ue.field_c.length - 1] = null;
                        var1_int = 1;
                      } else {
                        var17 = 0;
                        if (!ArticulatedPart.f((byte) -46)) {
                          var18 = 0;
                          while (!(var18 >= ue.field_c[var13].length)) {
                            stackIn_350_0 = ue.field_c[var13][var18];
                            stackIn_350_1 = -109;
                            stackIn_351_2 = !(var18 < -8 + ue.field_c[var13].length);
                            if (!oc.a(stackIn_350_0, stackIn_350_1, stackIn_351_2)) {
                              var18++;
                              continue;
                            }
                            var17 = 1;
                            break;
                          }
                        }
                        if (var17 == 0) {
                          CombatWorld.c(-2483, 99);
                          di.field_c = new int[8];
                          var12_int = 1;
                          for (var18 = 0; var18 < 8; var18++) {
                            di.field_c[var18] = -1;
                          }
                          var18_ref_int__ = ue.field_c[var13];
                          ij.field_Y = -1;
                          if (var18_ref_int__ != null) {
                            uc.field_b = var18_ref_int__;
                          }
                          ti.field_B = null;
                        }
                      }
                    }
                  }
                }
                if (var12_int != 0) {
                  hl.field_v = SentinelDesigner.a(uc.field_b, (byte) -53, di.field_c);
                  hl.field_v.b(6993661, 113);
                } else {
                  if (lb.field_gc == 2 &&
                    he.a((byte) 126)) {
                    ij.field_Y = -1;
                    ti.field_B = null;
                    f.field_A = null;
                  }
                  if (ti.field_B != null) {
                    stackIn_376_0 = ti.field_B.componentId;
                  } else {
                    stackIn_376_0 = -1;
                  }
                  var5 = stackIn_376_0;
                  if (var5 < 0 &&
                    ij.field_Y >= 0) {
                    var5 = ij.field_Y;
                  }
                  if (param0 != 6993661) {
                    field_j = -1;
                  }
                  if (var5 != fl.field_a) {
                    GameApplet.field_l = true;
                    fl.field_a = var5;
                    ad.field_h = true;
                    kf.field_s = true;
                  }
                  if (var1_int != 0 &&
                    gd.field_jb != null) {
                    vn.d(-95);
                  }
                  decompiledFrameRemainder0 = (gd.field_jb == null);
                  if (decompiledFrameRemainder0) {
                    for (var6 = 0; var6 < jg.field_h.length; var6++) {
                      jg.field_h[var6] = null;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder1) && (decompiledFrameRemainder0) && (lb.field_gc == 2 &&
              he.a((byte) 126))) {
              ij.field_Y = -1;
              ti.field_B = null;
              f.field_A = null;
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (ti.field_B != null) {
              stackIn_456_0 = ti.field_B.componentId;
            } else {
              stackIn_456_0 = -1;
            }
            var5 = stackIn_456_0;
            if (var5 < 0 &&
              ij.field_Y >= 0) {
              var5 = ij.field_Y;
            }
            if (param0 != 6993661) {
              field_j = -1;
            }
            if (var5 != fl.field_a) {
              GameApplet.field_l = true;
              fl.field_a = var5;
              ad.field_h = true;
              kf.field_s = true;
            }
            if (var1_int != 0 &&
              gd.field_jb != null) {
              vn.d(-95);
            }
            decompiledFrameRemainder0 = (gd.field_jb == null);
            if (decompiledFrameRemainder0) {
              for (var6 = 0; var6 < jg.field_h.length; var6++) {
                jg.field_h[var6] = null;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var6 = jj.field_e.field_z;
            jj.field_e.d();
            SoftwareRaster.a(0, 0, var6, var6, 0);
            var7_int = NodeDeque.a((byte) 105, uc.field_b[0]);
            if (var7_int < 0 ||
              !(si.field_E.length > var7_int)) {
              var7_int = 0;
            }
            si.field_E[var7_int].c(0, 0, 4 * var6, 4 * var6);
            sb.field_bb.b((byte) 122);
            var6 = hj.field_w;
            hj.field_w = 4096;
            var7 = new SceneWidget();
            var7.field_I = wd.field_a;
            var7.field_Kb = 1;
            var7.field_nb = 16777215;
            var7.field_L = (BitmapFont) ((Object) fk.field_d);
            var7.field_Fb = 1;
            var8_ref = new SceneWidget("", var7);
            var8_ref.field_I = km.field_e;
            kh.field_s = new SceneWidget("", var7);
            kh.field_s.field_Kb = 0;
            kh.field_s.field_Fb = 0;
            kh.field_s.field_ub = 4;
            kh.field_s.field_I = null;
            kh.field_s.field_nb = 16777215;
            kh.field_s.field_Ib = 17;
            var9 = new SceneWidget("", var7);
            var9.field_I = vh.field_b;
            dg.field_g = new SceneWidget("", var7);
            dg.field_g.field_I = ng.field_p;
            dg.field_g.field_Ab = ResourceArchive.field_b;
            var10 = new SceneWidget("", var7);
            var10.field_Ab = ta.field_c;
            var10.field_nb = 16777215;
            var10.field_I = wc.field_k;
            var10.field_V = 192;
            var11 = new SceneWidget("", var7);
            var11.field_V = 192;
            var11.field_I = ta.field_c;
            var11.field_nb = 16777215;
            var12 = new SceneWidget("", var7);
            var12.field_Ab = ta.field_c;
            var12.field_I = wc.field_k;
            var51 = new SceneWidget("", var7);
            var51.field_I = bm.field_Y;
            var14 = new SceneWidget("", var7);
            ((SceneWidget) (var14)).field_I = sb.field_X;
            ((SceneWidget) (var14)).field_Ab = oe.field_f;
            ei.field_n = new SceneWidget("", var7);
            ei.field_n.field_I = co.field_d;
            sb.field_Y = new SceneWidget("", var7);
            sb.field_Y.field_I = be.field_f;
            dd.field_b = new SceneWidget("", var7);
            dd.field_b.field_I = lj.field_b;
            dd.field_b.field_Kb = 0;
            var53 = new SceneWidget("", var7);
            var53.field_I = nn.field_a;
            var62 = new SceneWidget("", var7);
            var62.field_L = (BitmapFont) ((Object) fk.field_d);
            var62.field_ub = 4;
            var62.field_I = pa.field_g;
            var62.field_Fb = 0;
            var62.field_Ib = 15;
            var62.field_Kb = 1;
            var62.field_nb = 0;
            gd.field_jb = new SceneWidget();
            gd.field_jb.a(0, 0, 480, 0, 640);
            var17 = am.field_d.length;
            var18 = 204 / var17;
            var19 = 10;
            for (var20_int = 0; var17 > var20_int; var20_int++) {
              var21_int = 0;
              if (var20_int == 0 &&
                fg.field_Ob == 1) {
                var21_int = 1;
              }
              if (1 == var20_int &&
                (fg.field_Ob & 2) > 0) {
                var21_int = 1;
              }
              if (2 == var20_int &&
                0 < (16 & fg.field_Ob)) {
                var21_int = 1;
              }
              if (var20_int == 3 &&
                fg.field_Ob == 0) {
                var21_int = 1;
              }
              stackIn_493_0 = null;
              stackIn_493_1 = null;
              stackIn_493_2 = am.field_d[var20_int];
              if (var21_int != 0) {
                stackIn_494_0 = null;
                stackIn_494_1 = null;
                stackIn_494_3 = var51;
              } else {
                stackIn_494_0 = null;
                stackIn_494_1 = null;
                stackIn_494_3 = var14;
              }
              var52 = new SceneWidget(stackIn_493_2, (SceneWidget) (stackIn_494_3));
              wc.field_h[var20_int] = var52;
              stackIn_496_0 = var52;
              stackIn_496_1 = da.field_e;
              stackIn_496_2 = var20_int;
              if (var21_int != 0) {
                stackIn_497_3 = 0;
              } else {
                stackIn_497_3 = 4;
              }
              stackIn_496_0.field_Pb = stackIn_496_1[stackIn_496_2 + stackIn_497_3];
              var52.a(param0 ^ 6993661, 59, 25, var19, var18);
              gd.field_jb.a(var52, 126);
              vb.field_a[var20_int] = var52;
              var19 = var19 + var18;
            }
            bl.field_c = new SceneWidget("Listselectpane", var53);
            bl.field_c.a(0, 84, 349, 10, 204);
            gd.field_jb.a(bl.field_c, 118);
            bi.field_d = 15;
            pf.field_n = 4;
            bg.field_y = 4;
            var54 = new SceneWidget();
            var54.field_db = sj.field_x[1];
            var54.field_Pb = sj.field_x[0];
            var20 = new SceneWidget();
            var20.field_db = ah.field_Zb[1];
            var20.field_Pb = ah.field_Zb[0];
            var21 = new SceneWidget();
            var21.field_I = qi.field_a;
            var55 = new SceneWidget();
            var55.field_I = jn.field_f;
            var23 = new lb("", var54, var20, var21, var55);
            var56 = new SceneWidget("Dataview", (SceneWidget) null);
            rh.field_u = var56;
            for (var25 = 0; var25 < cj.field_a.length; var25++) {
              cj.field_a[var25] = null;
            }
            var25 = bl.field_c.field_zb + (-(2 * pf.field_n) - bi.field_d) - bg.field_y;
            qa.field_O = var25;
            var26_int = -2;
            if (fg.field_Ob != 0) {
              var26_int = te.a(var56, var26_int, true, -1);
            } else {
              var26_int = pi.a((byte) -46, var56, var26_int, true);
            }
            var27_ref = null;
            if (1 != fg.field_Ob) {
              if (!he.a((byte) 124)) {
                var27_ref = ai.field_v;
              } else {
                if ((2 & fg.field_Ob) != 0) {
                  var27_ref = li.field_E;
                } else {
                  if ((fg.field_Ob & 16) != 0) {
                    var27_ref = re.field_hb;
                  } else {
                    if (fg.field_Ob == 0) {
                      var27_ref = bg.field_D;
                    }
                  }
                }
              }
            } else {
              var27_ref = kc.field_u;
            }
            if (var27_ref != null) {
              var57 = new SceneWidget(-1L, kh.field_s);
              var29 = fk.field_d.a((String) (var27_ref), -(2 * var57.field_ub) + var25 - var57.field_qb * 2, kh.field_s.field_Ib);
              var58 = new SceneWidget(-1L, (SceneWidget) null);
              var26_int += 2;
              var56.a(var58, 127);
              var58.a(0, var26_int, var29, 0, var25);
              var57.field_S = (String) (var27_ref);
              var57.a(0, 0, var29, 0, var25 - 2 * var57.field_qb);
              var58.a(var57, 125);
              var26_int = var26_int + var29;
              var26_int -= 2;
              var26_int += 8;
            }
            hb.field_d = var26_int;
            if (fg.field_Ob == 0) {
              var26_int = pi.a((byte) -70, var56, var26_int, false);
            } else {
              var26_int = te.a(var56, var26_int, false, -1);
            }
            var28 = 0;
            if (1 == fg.field_Ob) {
              var74 = ue.field_c;
              for (var30 = 0; var74.length > var30; var30++) {
                var31 = var74[var30];
                if (var31 != null) {
                  var28++;
                }
              }
              if (var28 > 0) {
                var26_int = si.a(var56, true, var26_int + 4);
              }
            }
            if (var27_ref != null) {
              var26_int += 2;
            }
            var56.a(0, 0, var26_int, 0, 0);
            var78 = (CharSequence) ((Object) "Scrollingview");
            var60 = new kg(ke.a(var78, (byte) -48), var56, (SceneWidget) null, var23);
            bi.field_f = var60;
            var60.a(bl.field_c.field_zb - 2 * pf.field_n, -2048, bi.field_d, bl.field_c.field_Lb - pf.field_n * 2, bg.field_y, pf.field_n, pf.field_n);
            bl.field_c.a(var60, 124);
            var30 = -1;
            if (fg.field_Ob == 0) {
              var30 = 3;
            } else {
              if ((1 & fg.field_Ob) == 0) {
                if (0 != (16 & fg.field_Ob)) {
                  var30 = 2;
                } else {
                  if ((fg.field_Ob & 2) != 0) {
                    var30 = 1;
                  }
                }
              } else {
                var30 = 0;
              }
            }
            if (0 <= var30) {
              var60.field_Ub.field_eb = va.field_k[var30];
              var60.field_Sb.a(var60.field_Tb.field_Lb, -va.field_k[var30], var60.field_Ub.field_Lb, -1);
            }
            hj.field_w = var6;
            kk.field_a = new SceneWidget("Itempane", kh.field_s);
            kk.field_a.a(0, 64, 280, 518, 110);
            gd.field_jb.a(kk.field_a, param0 - 6993534);
            var61 = new SceneWidget(-1L, (SceneWidget) null);
            var61.field_I = tk.field_t;
            var61.a(0, 20, 257, 0, 110);
            kk.field_a.a(var61, 126);
            if (fg.field_Ob == 1) {
              kk.field_a.field_S = "";
            } else {
              if ((2 & fg.field_Ob) > 0) {
                var66 = new SceneWidget("", var62);
                var66.field_S = mc.field_b;
                var66.a(0, 0, 18, 0, 110);
                kk.field_a.a(var66, param0 ^ 6993543);
                var26 = new SceneWidget("DataListView", (SceneWidget) null);
                hm.field_a = var26;
                var27 = 4 + oc.a(4, var26);
                var26.field_I = tk.field_t;
                var26.a(0, 20, var27, 0, 110);
                if (var27 > 284) {
                  var80 = (CharSequence) ((Object) "Scrollingview2");
                  var67 = new kg(ke.a(var80, (byte) -48), var26, (SceneWidget) null, var23);
                  vd.field_a = var67;
                  var67.a(110, -2048, bi.field_d, 301, bg.field_y, 0, 21);
                  kk.field_a.a(var67, 119);
                } else {
                  var61.field_I = null;
                  kk.field_a.a(var26, 125);
                }
              } else {
                if ((fg.field_Ob & 16) <= 0) {
                  if (fg.field_Ob == 0) {
                    vb.a(kk.field_a, (byte) 19);
                  }
                } else {
                  var63 = new SceneWidget("", var62);
                  var63.field_S = kf.field_B;
                  var63.a(0, 0, 18, 0, 110);
                  kk.field_a.a(var63, 119);
                  var26_int = og.a(true);
                  var27 = 254;
                  kc.field_r = !(var27 >= var26_int);
                  var64 = new SceneWidget("DataListView", (SceneWidget) null);
                  if (!kc.field_r) {
                    var64.field_I = tk.field_t;
                  }
                  hm.field_a = var64;
                  var29 = ak.a(var64, 112);
                  GameApplet.field_l = true;
                  stackIn_554_0 = var64;
                  stackIn_554_1 = 0;
                  stackIn_554_2 = 20;
                  stackIn_554_3 = var29;
                  if (kc.field_r) {
                    stackIn_555_4 = bi.field_d / 2 + 2;
                  } else {
                    stackIn_555_4 = 0;
                  }
                  ((SceneWidget) (Object) stackIn_554_0).a(stackIn_554_1, stackIn_554_2, stackIn_554_3, stackIn_555_4, 110);
                  if (kc.field_r) {
                    var79 = (CharSequence) ((Object) "Scrollingview2");
                    var65 = new kg(ke.a(var79, (byte) -48), var64, (SceneWidget) null, var23);
                    vd.field_a = var65;
                    var65.a(107, -2048, bi.field_d, -2 + var27, bg.field_y, 0, 23);
                    kk.field_a.a(var65, 121);
                  } else {
                    var61.field_I = null;
                    kk.field_a.a(var64, 120);
                  }
                }
              }
            }
            if (fg.field_Ob == 1) {
              var61.field_I = null;
            }
          }
          on.b(param0 - 6993611);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rj.F(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a((byte) 115, param1, param1.length, 0);
          if (param0 >= -45) {
            rj.a(-54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("rj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        rm.field_g = param2;
        ig.field_e = param0;
        IntrusiveNode.field_e = param3;
        if (param4 != -89) {
          field_k = (ResourceArchive) null;
        }
        IntKeyLookup.field_d = param1;
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          java.net.URL var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = ge.a(param2 ^ -47, var3, param1);
              if (param2 != -47) {
                return;
              }
              be.a(true, (byte) 26, var3.toString(), param1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("rj.J(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.obfuscationControl;
        this.field_g = 0;
        if (this.field_e != this.field_l) {
          this.field_q.a(this.field_l, -1);
          this.field_e = this.field_l;
        }
        if (param0 != -84) {
          return;
        }
        this.field_i = this.field_l;
        while (this.field_g < this.field_n.length) {
          var2 = -this.field_g + this.field_n.length;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_q.a(this.field_n, this.field_g, var2, false);
          if (var3 == -1) {
            break;
          }
          this.field_e = this.field_e + (long)var3;
          this.field_g = this.field_g + var3;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_l = param1;
        if (param0 > -88) {
          this.field_i = 68L;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          try {
            if (this.field_o < this.field_l + (long)param1) {
              this.field_o = (long)param1 + this.field_l;
            }
            if (this.field_a != -1L) {
              if (this.field_l >= this.field_a) {
                if (this.field_l > (this.field_a + (long)this.field_h)) {
                  this.b((byte) -104);
                }
              } else {
                this.b((byte) -104);
              }
            }
            if (this.field_a != -1L &&
              (this.field_a + (long)this.field_p.length) < (this.field_l + (long)param1)) {
              var5_int = (int)((long)this.field_p.length - this.field_l + this.field_a);
              ii.a(param3, param0, this.field_p, (int)(this.field_l - this.field_a), var5_int);
              param0 = param0 + var5_int;
              param1 = param1 - var5_int;
              this.field_l = this.field_l + (long)var5_int;
              this.field_h = this.field_p.length;
              this.b((byte) -118);
            }
            if (param1 > this.field_p.length) {
              if (~this.field_l != ~this.field_e) {
                this.field_q.a(this.field_l, -1);
                this.field_e = this.field_l;
              }
              this.field_q.a(param1, 1, param3, param0);
              this.field_e = this.field_e + (long)param1;
              if (this.field_e > this.field_f) {
                this.field_f = this.field_e;
              }
              var5_long = -1L;
              var7 = -1L;
              if (this.field_l >= this.field_i &&
                (long)this.field_g + this.field_i > this.field_l) {
                var5_long = this.field_l;
              } else {
                if (this.field_i >= this.field_l &&
                  ((long)param1 + this.field_l) > this.field_i) {
                  var5_long = this.field_i;
                }
              }
              if (this.field_l + (long)param1 > this.field_i &&
                (long)param1 + this.field_l <= (long)this.field_g + this.field_i) {
                var7 = (long)param1 + this.field_l;
              } else {
                if (((long)this.field_g + this.field_i) > this.field_l &&
                  (this.field_i + (long)this.field_g) <= ((long)param1 + this.field_l)) {
                  var7 = (long)this.field_g + this.field_i;
                }
              }
              if (var5_long > -1L &&
                var5_long < var7) {
                var9 = (int)(var7 - var5_long);
                ii.a(param3, (int)(var5_long + ((long)param0 - this.field_l)), this.field_n, (int)(var5_long - this.field_i), var9);
              }
              this.field_l = this.field_l + (long)param1;
              return;
            }
            if (param1 > 0) {
              if (this.field_a == -1L) {
                this.field_a = this.field_l;
              }
              ii.a(param3, param0, this.field_p, (int)(this.field_l - this.field_a), param1);
              this.field_l = this.field_l + (long)param1;
              if (-this.field_a + this.field_l > (long)this.field_h) {
                this.field_h = (int)(this.field_l - this.field_a);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
          if (param2 <= 17) {
            var11 = (java.applet.Applet) null;
            rj.a((String) null, (java.applet.Applet) null, (byte) -7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_57_0 = var5_ref;
          stackIn_57_1 = new StringBuilder().append("rj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    rj(sn param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = -1L;
        this.field_i = -1L;
        this.field_h = 0;
        try {
          this.field_q = param0;
          dupTemp$0 = param0.d(0);
          this.field_f = dupTemp$0;
          this.field_o = dupTemp$0;
          this.field_p = new byte[param2];
          this.field_n = new byte[param1];
          this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) throws IOException {
        if (param0 >= -122) {
          this.field_n = (byte[]) null;
        }
        this.b((byte) -97);
        this.field_q.a(true);
    }

    public static void a(int param0) {
        field_k = null;
        field_c = null;
        field_d = null;
        if (param0 != 83) {
          return;
        }
        field_m = null;
    }

    static {
        field_j = 0;
        field_c = "Send private message to <%0>";
        field_m = new String[]{"Light reactor", "Core reactor", "Dual reactor", "Heavy reactor", "Fusion reactor", "Light capacitor", "Base capacitor", "Heavy capacitor", "Ring capacitor", "Magnon capacitor", "Haze energy shield", "Electron energy shield", "Plasma energy shield", "Dragon energy shield", "Solar energy shield", "EMP bomb", "Targeter", "AMARDS", "Missile scrambler", "Repair system", "Experimental reactor", "Scanner", "Speed loader", "Coolant array", "Emergency displacement deployment", "High-energy amplifier", "Energised armour", "EMP hardening", "Gravity pods", "Aeruak stabilisers", "Walton mirage device", "Siege stabilisation system", "Reinforced armour", "Reactive armour"};
        field_b = 66;
    }
}
