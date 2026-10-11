/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends ob {
    static int field_r;
    private j field_q;

    final void e(int param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          try {
            this.field_q.b((byte) -118);
            if (param0 != 20406) {
              this.a(true, 38);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (Exception) (Object) decompiledCaughtException;
          }
          this.field_q = null;
          this.field_p = -1;
          this.field_j = this.field_j + 1;
          this.field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2_ref), "ap.J(" + param0 + ')');
        }
    }

    final void a(boolean param0, Object param1, boolean param2) {
        try {
          ng stackIn_30_0 = null;
          boolean stackIn_31_1 = false;
          RuntimeException stackIn_43_0 = null;
          StringBuilder stackIn_43_1 = null;
          String stackIn_44_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ld var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ld var4_refLifetime1;
          var6 = CrazyCrystals.field_B;
          try {
            if (null != this.field_q) {
              try {
                this.field_q.b((byte) -118);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (j) (param1);
            this.d((byte) -121);
            this.a(param0, 25);
            this.field_h = null;
            this.field_i.field_f = 0;
            if (param2) {
              return;
            }
            L4: while (true) {
              var4_ref = (ld) (this.field_f.d(-4425));
              if (var4_ref == null) {
                if (var6 == 0) {
                  break L4;
                }
              } else {
                this.field_m.a((byte) 122, var4_ref);
              }
              if (var6 == 0) {
                continue;
              }
              break;
            }
            L8: while (true) {
              var4_refLifetime1 = (ld) (this.field_a.d(-4425));
              if (var4_refLifetime1 == null) {
                if (var6 == 0) {
                  break L8;
                }
              } else {
                this.field_k.a((byte) 110, var4_refLifetime1);
              }
              if (var6 == 0) {
                continue;
              }
              break;
            }
            if (this.field_d != 0) {
              try {
                this.field_n.field_f = 0;
                this.field_n.a(true, 4);
                stackIn_30_0 = this.field_n;
                stackIn_31_1 = !(param2);
                ((ng) (Object) stackIn_30_0).a(stackIn_31_1, (int) this.field_d);
                this.field_n.a(0, -16384);
                this.field_q.a(0, 90, this.field_n.field_h, this.field_n.field_h.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.b((byte) -118);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_q = null;
                this.field_j = this.field_j + 1;
                this.field_p = -2;
              }
            }
            this.field_c = 0;
            this.field_e = lo.a((byte) -33);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_43_0 = var4_ref3;
            stackIn_43_1 = new StringBuilder().append("ap.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_44_2 = "null";
            } else {
              stackIn_44_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        try {
          int var3_int = 0;
          ng stackIn_5_0 = null;
          boolean stackIn_5_1 = false;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var3 = null;
          IOException var4 = null;
          Exception var5 = null;
          try {
            var3_int = -20 / ((param1 + 57) / 33);
            if (this.field_q == null) {
              return;
            }
            try {
              this.field_n.field_f = 0;
              stackIn_5_0 = this.field_n;
              stackIn_5_1 = true;
              if (param0) {
                stackIn_6_2 = 2;
              } else {
                stackIn_6_2 = 3;
              }
              ((ng) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_6_2);
              this.field_n.a(0L, false);
              this.field_q.a(0, 108, this.field_n.field_h, this.field_n.field_h.length);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_q.b((byte) -118);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = -2;
              this.field_j = this.field_j + 1;
              this.field_q = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            throw dn.a((Throwable) ((Object) var3), "ap.K(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          IOException var3 = null;
          Exception var4 = null;
          try {
            var2_int = -62 % ((19 - param0) / 51);
            if (null == this.field_q) {
              return;
            }
            try {
              this.field_n.field_f = 0;
              this.field_n.a(true, 6);
              this.field_n.a((byte) 104, 3);
              this.field_n.c(-161478600, 0);
              this.field_q.a(0, 124, this.field_n.field_h, this.field_n.field_h.length);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_q.b((byte) -118);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_j = this.field_j + 1;
              this.field_p = -2;
              this.field_q = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw dn.a((Throwable) ((Object) var2), "ap.L(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_22_0 = false;
        ce stackIn_67_0 = null;
        RuntimeException decompiledCaughtException = null;
        md var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        ce var5 = null;
        String var5_ref = null;
        String var6 = null;
        ce var6_ref = null;
        String var7 = null;
        ce var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = CrazyCrystals.field_B;
        try {
          if (param0) {
            ap.a(true);
          }
          var1 = kd.field_n;
          var2 = var1.h(255);
          if (0 == var2) {
            if (null == vl.field_d) {
              vl.field_d = new vp(128);
              hl.field_h = 0;
            }
            stackIn_14_0 = (var1.h(255) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.i(117);
            if (var3_int != 0) {
              var1.i(110);
            }
            stackIn_22_0 = !param0;
            var5 = fk.a(stackIn_22_0, var4_ref_String);
            var6 = var1.i(122);
            var7 = fe.a(60136, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (null == var5) {
              var5 = fk.a(true, var6);
              if (var5 != null) {
                vl.field_d.a(var5, (long)var7.hashCode(), (byte) 125);
              }
            }
            if (var5 == null) {
              var5 = new ce();
              vl.field_d.a(var5, (long)var7.hashCode(), (byte) 104);
              fieldTemp$0 = hl.field_h;
              hl.field_h = hl.field_h + 1;
              var5.field_db = fieldTemp$0;
              g.field_b.b(0, var5);
            }
            var5.field_fb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (1 == mh.field_h) {
                mh.field_h = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == mh.field_h) {
                mh.field_h = 1;
              }
              return;
            }
            if (4 != var2) {
              wp.a((Throwable) null, "F1: " + ug.a(-1815), 21862);
              jj.a(4);
              return;
            }
            mh.field_h = 1;
            var3 = var1.i(111);
            nh.field_z = ((String) (var3)).intern();
            var4 = var1.h(255);
            wl.a(7, var4);
            return;
          }
          if (null == me.field_f) {
            me.field_f = new vp(128);
            ob.field_g = 0;
          }
          var3Lifetime1 = var1.i(118);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.i(119);
          var5_ref = var1.i(123);
          var6_ref = rg.a(var4_ref_StringLifetime1, (byte) -3);
          if (null == var6_ref) {
            var6_ref = rg.a(var5_ref, (byte) -1);
            if (var6_ref != null) {
              me.field_f.a(var6_ref, (long)fe.a(60136, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), (byte) 92);
            }
          }
          if (var6_ref == null) {
            var6_ref = new ce();
            me.field_f.a(var6_ref, (long)fe.a(60136, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), (byte) 85);
            fieldTemp$1 = ob.field_g;
            ob.field_g = ob.field_g + 1;
            var6_ref.field_db = fieldTemp$1;
            df.field_b.b(0, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_cb = (String) (var3Lifetime1);
          var6_ref.field_fb = var4_ref_StringLifetime1;
          var6_ref.a(param0);
          var7_ref = (ce) (df.field_b.g(32073));
          L15: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7_ref != null) {
              stackIn_67_0 = var6_ref;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (ll.a(stackIn_67_0, 0, var7_ref))) {
                var7_ref = (ce) (df.field_b.a(false));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7_ref) {
                break L15;
              }
              stackIn_67_0 = var7_ref;
            }
            rf.a(stackIn_67_0, var6_ref, 47);
            if (var8 == 0) {
              return;
            }
            break;
          }
          df.field_b.b(0, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "ap.M(" + param0 + ')');
        }
    }

    final boolean b(byte param0) {
        try {
          int stackIn_95_0 = 0;
          int stackIn_116_0 = 0;
          int stackIn_120_0 = 0;
          int stackIn_137_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ld var2 = null;
          int var2_int = 0;
          IOException var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3_int = 0;
          Exception var3 = null;
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
          ld var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var5Lifetime1;
          int var6Lifetime1;
          int var7Lifetime1;
          int var6Lifetime1Lifetime1;
          var16 = CrazyCrystals.field_B;
          try {
            if (this.field_q != null) {
              var2_long = lo.a((byte) 95);
              var4 = (int)(-this.field_e + var2_long);
              if (var4 > 200) {
                var4 = 200;
              }
              this.field_e = var2_long;
              this.field_c = this.field_c + var4;
              if (this.field_c > 30000) {
                try {
                  this.field_q.b((byte) -118);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.field_q = null;
              }
            }
            if (null == this.field_q) {
              if (this.b(20) == 0 &&
                0 == this.d(20)) {
                return true;
              }
              return false;
            }
            try {
              this.field_q.a(-128);
              var2 = (ld) (this.field_m.b(120));
              L6: while (true) {
                if (null != var2) {
                  this.field_n.field_f = 0;
                  this.field_n.a(true, 1);
                  this.field_n.a(var2.field_k, false);
                  this.field_q.a(0, 106, this.field_n.field_h, this.field_n.field_h.length);
                  this.field_f.a((byte) 113, var2);
                  var2 = (ld) (this.field_m.a(127));
                  if (var16 != 0) {
                    break L6;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                var2 = (ld) (this.field_k.b(124));
                break;
              }
              while (var2 != null) {
                this.field_n.field_f = 0;
                this.field_n.a(true, 0);
                this.field_n.a(var2.field_k, false);
                this.field_q.a(0, 116, this.field_n.field_h, this.field_n.field_h.length);
                this.field_a.a((byte) 111, var2);
                var2 = (ld) (this.field_k.a(104));
                if (var16 == 0) {
                  continue;
                }
                break;
              }
              var2_int = 0;
              if (param0 < 60) {
                this.e(111);
              }
              L12: while (true) {
                if (var2_int < 100) {
                  var3_int = this.field_q.c(0);
                  stackIn_137_0 = ~var3_int;
                  if (var16 != 0) {
                    break L12;
                  }
                  if (stackIn_137_0 > -1) {
                    throw new IOException();
                  }
                  if (0 != var3_int) {
                    this.field_c = 0;
                    var4 = 0;
                    if (this.field_h != null) {
                      if (0 == this.field_h.field_t) {
                        var4 = 1;
                        if (var16 != 0) {
                          var4 = 10;
                        }
                      }
                    } else {
                      var4 = 10;
                    }
                    boolean decompiledFrameRemainder1 = true;
                    if (var4 <= 0) {
                      var5 = this.field_h.field_s.field_h.length - this.field_h.field_u;
                      var6 = -this.field_h.field_t + 512;
                      if (var6 > var5 - this.field_h.field_s.field_f) {
                        var6 = var5 - this.field_h.field_s.field_f;
                      }
                      if (var6 > var3_int) {
                        var6 = var3_int;
                      }
                      boolean decompiledFrameCompleted4 = true;
                      this.field_q.a(this.field_h.field_s.field_h, var6, 2034, this.field_h.field_s.field_f);
                      if (this.field_d != 0) {
                        var7 = 0;
                        while (var6 > var7) {
                          this.field_h.field_s.field_h[var7 + this.field_h.field_s.field_f] = (byte)oe.a((int) this.field_h.field_s.field_h[var7 + this.field_h.field_s.field_f], (int) this.field_d);
                          var7++;
                          if (var16 != 0) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted4) {
                        this.field_h.field_s.field_f = this.field_h.field_s.field_f + var6;
                        this.field_h.field_t = this.field_h.field_t + var6;
                      }
                      if (var5 == this.field_h.field_s.field_f) {
                        this.field_h.a(1);
                        this.field_h.field_n = false;
                        this.field_h = null;
                        decompiledFrameRemainder1 = (var16 != 0);
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder1 = (this.field_h.field_t == 512))) {
                        this.field_h.field_t = 0;
                      }
                    }
                    if ((decompiledFrameRemainder1) &&
                      (!(var4 <= 0) ||
                      var16 != 0)) {
                      var5Lifetime1 = var4 - this.field_i.field_f;
                      if (var5Lifetime1 > var3_int) {
                        var5Lifetime1 = var3_int;
                      }
                      boolean decompiledFrameCompleted3 = true;
                      this.field_q.a(this.field_i.field_h, var5Lifetime1, 2034, this.field_i.field_f);
                      if (this.field_d != 0) {
                        var6Lifetime1 = 0;
                        while (var5Lifetime1 > var6Lifetime1) {
                          this.field_i.field_h[this.field_i.field_f + var6Lifetime1] = (byte)oe.a((int) this.field_i.field_h[this.field_i.field_f + var6Lifetime1], (int) this.field_d);
                          var6Lifetime1++;
                          if (var16 != 0) {
                            decompiledFrameCompleted3 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted3) {
                        this.field_i.field_f = this.field_i.field_f + var5Lifetime1;
                      }
                      if (var4 <= this.field_i.field_f) {
                        if (null == this.field_h) {
                          this.field_i.field_f = 0;
                          var6Lifetime1Lifetime1 = this.field_i.h(255);
                          var7Lifetime1 = this.field_i.b((byte) 126);
                          var8 = this.field_i.h(255);
                          var9 = this.field_i.b((byte) 127);
                          var10 = 127 & var8;
                          stackIn_95_0 = ((var8 & 128) == 0) ? 0 : 1;
                          boolean decompiledFrameCompleted2 = true;
                          boolean decompiledFrameCompleted0 = true;
                          boolean decompiledFrameRemainder0 = true;
                          boolean decompiledFrameCompleted1 = true;
                          var11 = stackIn_95_0;
                          var12 = (long)var7Lifetime1 + ((long)var6Lifetime1Lifetime1 << 32);
                          var14 = null;
                          if (var11 != 0) {
                            var14_ref = (ld) (this.field_a.b(120));
                            while (var14_ref != null) {
                              stackIn_116_0 = $cfr$lcmp(~var14_ref.field_k, ~var12);
                              if (var16 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              if (stackIn_116_0 == 0) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              var14_ref = (ld) (this.field_a.a(93));
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameCompleted2) &&
                            (decompiledFrameCompleted1)) {
                            var14_ref = (ld) (this.field_f.b(114));
                            while (var14_ref != null) {
                              stackIn_116_0 = $cfr$lcmp(var14_ref.field_k, var12);
                              if (var16 != 0) {
                                decompiledFrameCompleted0 = false;
                                break;
                              }
                              if (stackIn_116_0 == 0) {
                                break;
                              }
                              var14_ref = (ld) (this.field_f.a(96));
                              if (var16 == 0) {
                                continue;
                              }
                              break;
                            }
                          }
                          if ((decompiledFrameCompleted2) &&
                            (decompiledFrameCompleted0)) {
                            if (var14_ref == null) {
                              throw new IOException();
                            }
                            stackIn_116_0 = -1;
                          }
                          stackIn_120_0 = (stackIn_116_0 == ~var10) ? 5 : 9;
                          var15 = stackIn_120_0;
                          this.field_h = var14_ref;
                          this.field_h.field_s = new ng(this.field_h.field_u + (var15 + var9));
                          this.field_h.field_s.a(true, var10);
                          this.field_h.field_s.a(var9, -16384);
                          this.field_h.field_t = 10;
                          this.field_i.field_f = 0;
                          decompiledFrameRemainder1 = (var16 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (0 == this.field_h.field_t) {
                            if (this.field_i.field_h[0] != -1) {
                              this.field_h = null;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              this.field_h.field_t = 1;
                              this.field_i.field_f = 0;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            throw new IOException();
                          }
                        }
                      }
                    }
                    var2_int++;
                    if (var16 == 0) {
                      continue;
                    }
                  }
                }
                stackIn_137_0 = 1;
                break;
              }
              return stackIn_137_0 != 0;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_q.b((byte) -118);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
              this.field_p = -2;
              this.field_j = this.field_j + 1;
              if (0 == this.b(20) &&
                0 == this.d(20)) {
                return true;
              }
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw dn.a((Throwable) ((Object) var2_ref2), "ap.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_q != null) {
            this.field_q.b((byte) -118);
          }
          var2_int = -61 / ((-61 - param0) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "ap.G(" + param0 + ')');
        }
    }

    public ap() {
    }

    static {
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
