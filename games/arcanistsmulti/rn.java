/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rn extends ag {
    private boolean field_R;
    private int field_O;
    static kc field_S;
    private long field_P;
    private int field_N;
    private long field_Q;
    private boolean field_M;
    static kc field_L;
    private int field_H;
    static String field_K;
    private int field_J;

    private final int f(int param0) {
        int var2;
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (0 == this.field_N) {
          return this.field_N;
        }
        if (param0 != 1000) {
          return 12;
        }
        for (var2 = this.field_N - 1; var2 > 0; var2--) {
          if (this.field_g.charAt(-1 + var2) != 32) {
            continue;
          }
          break;
        }
        return var2;
    }

    final static void m(int param0) {
        int var1;
        if (!pe.field_Jb) {
          if (ce.field_i == null) {
            ce.field_i = tj.a(4, -21402);
          }
          if (ce.field_i.field_l) {
            ad.field_f = ko.a(ad.field_f, ce.field_i.field_i, true);
            ce.field_i = null;
            pe.field_Jb = true;
          }
        }
        if (param0 != 0) {
          return;
        }
        if (!jf.field_e) {
          if (0 == (1 & ne.field_g)) {
            var1 = wd.field_d;
            if (0 >= var1 &&
              qf.field_d >= 2) {
              System.out.println("No data to pull");
            }
          } else {
            if (2 <= qf.field_d) {
              System.out.println("Orb coins not availiable");
            }
          }
          jf.field_e = true;
        }
        if (!be.field_g) {
          if (null == ci.field_d) {
            ci.field_d = ld.a(6, false);
          }
          if (ci.field_d.field_k) {
            ec.a(ci.field_d.field_j, (byte) -49);
            ci.field_d = null;
            be.field_g = true;
          }
        }
        if (!la.field_a &&
          !ta.field_b) {
          he.field_e.b((byte) -84, 65);
          ta.field_b = true;
        }
        if (la.field_a) {
          kg.field_a = true;
        }
        if (pe.field_Jb &&
          be.field_g &&
          kg.field_a &&
          jf.field_e) {
          wm.g(0);
          qc.a(false);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        ac var5 = null;
        long var6 = 0L;
        if (param0 > -52) {
          return;
        }
        if (this.field_r != null &&
          param2 == 0) {
          this.field_r.a((qm) (this), 5592405, param1, param3, this.field_B);
          if (this.field_r instanceof ac) {
            var5 = (ac) ((Object) this.field_r);
            if (this.field_N != this.field_J) {
              var5.a(param3, (qm) (this), param1, 6600, this.field_N, this.field_J);
            }
            var6 = qj.b(-26572);
            if ((-this.field_Q + var6) % 1000L < 500L) {
              var5.a(79, param3, param1, this.field_N, (qm) (this));
            }
          }
        }
    }

    void l(int param0) {
        if (this.field_o instanceof bn) {
          ((bn) (this.field_o)).a(this, -20626);
        }
        if (param0 != -22706) {
          this.c(false);
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -10292) {
          return;
        }
        if (this.field_N != this.field_J) {
          var2 = this.field_J < this.field_N ? this.field_J : this.field_N;
          var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
          this.field_J = var2;
          this.field_N = var2;
          this.field_g = this.field_g.substring(0, var2) + this.field_g.substring(var3, this.field_g.length());
          this.l(-22706);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        ac var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.h((byte) -100);
          if (this.field_t == 1) {
            if (this.field_r instanceof ac) {
              var5 = (ac) ((Object) this.field_r);
              var6 = var5.b(param1, (qm) (this), me.field_I, an.field_g, param3, param2 ^ 2364);
              if (var6 != -1) {
                if (this.field_R &&
                  var6 < this.field_O &&
                  this.field_J < var6) {
                  var6 = this.field_O;
                }
                this.field_N = var6;
              }
            }
            this.field_Q = qj.b(-26572);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("rn.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        this.field_N = param1;
        if (!ri.field_b[param0]) {
          this.field_J = this.field_N;
        }
    }

    final void g(int param0) {
        int discarded$0 = 0;
        this.field_N = 0;
        if (param0 != 3545) {
          discarded$0 = this.f(39);
        }
        this.field_g = "";
        this.field_J = 0;
        this.l(-22706);
    }

    final static void i(byte param0) {
        int var2 = 0;
        ab var3 = null;
        cg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          dn.field_Db = false;
          om.field_x = null;
          wi.field_f = null;
          if (param0 >= -97) {
            var3 = (ab) null;
            rn.a(true, (ab) null);
          }
          if (null != gm.field_j) {
            gm.field_j.c(-124);
            gm.field_j = null;
          }
          bc.field_c = null;
          if (null != vh.field_a) {
            vh.field_a.c(99);
            vh.field_a = null;
          }
          nk.field_q = null;
          if (ph.field_a != null) {
            ph.field_a.c(10);
            ph.field_a = null;
          }
          kn.field_qb = null;
          if (null != bc.field_c) {
            var4 = (cg) (bc.field_c.f(102));
            while (var4 != null) {
              var4.a((byte) 88);
              var4 = (cg) (bc.field_c.a(-1));
            }
            bc.field_c = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rn.L(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        this.g((byte) 56);
        if (param0 < 107) {
          return;
        }
        this.j(-10292);
    }

    private final void h(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            if (param0 != -9711) {
              return;
            }
            this.j(-10292);
            this.a(var2, (byte) -34);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    rn(String param0, wc param1, int param2) {
        super(param0, param1);
        this.field_R = false;
        this.field_O = -1;
        this.field_P = 0L;
        try {
          this.field_r = io.field_n.field_l;
          this.field_H = param2;
          this.a(true, param0, false);
          this.field_M = true;
          this.field_Q = qj.b(-26572);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 1) {
          rn.m(-26);
        }
        field_L = null;
        field_K = null;
        field_S = null;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_73_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Q = qj.b(-26572);
          if (param2 != 60 &&
            param2 != 62) {
            if (param1 >= -120) {
              return false;
            }
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_N != this.field_J) {
                this.j(-10292);
              }
              if (-1 == this.field_H ||
                !(this.field_g.length() >= this.field_H)) {
                if (this.field_N >= this.field_g.length()) {
                  this.field_g = this.field_g + param2;
                  dupTemp$0 = this.field_g.length();
                  this.field_N = dupTemp$0;
                  this.field_J = dupTemp$0;
                } else {
                  this.field_g = this.field_g.substring(0, this.field_N) + param2 + this.field_g.substring(this.field_N, this.field_g.length());
                  this.field_N = this.field_N + 1;
                  this.field_J = this.field_N;
                }
                this.l(-22706);
              }
              return true;
            }
            if (param3 == 85) {
              if (this.field_N != this.field_J) {
                this.j(-10292);
                return true;
              }
              if (this.field_N <= 0) {
                return false;
              }
              this.field_J = -1 + this.field_N;
              this.j(-10292);
              return true;
            }
            if (param3 != 101) {
              if (param3 == 13) {
                this.g(3545);
                return true;
              }
              if (param3 != 96) {
                if (param3 == 97) {
                  if (this.field_N < this.field_g.length()) {
                    stackIn_73_1 = 81;
                    if (!ri.field_b[82]) {
                      stackIn_74_2 = 1 + this.field_N;
                    } else {
                      stackIn_74_2 = this.i(-9125);
                    }
                    this.a(stackIn_73_1, stackIn_74_2);
                    return true;
                  }
                } else {
                  if (param3 == 102) {
                    this.a(81, 0);
                    return true;
                  }
                  if (param3 == 103) {
                    this.a(81, this.field_g.length());
                    return true;
                  }
                  if (param3 == 84) {
                    this.c(false);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    param3 == 65) {
                    this.j((byte) 122);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    66 == param3) {
                    this.g((byte) 56);
                    return true;
                  }
                  if (ri.field_b[82] &&
                    67 == param3) {
                    this.h(-9711);
                    return true;
                  }
                }
              } else {
                if (this.field_N > 0) {
                  stackIn_45_1 = 81;
                  if (ri.field_b[82]) {
                    stackIn_46_2 = this.f(1000);
                  } else {
                    stackIn_46_2 = this.field_N - 1;
                  }
                  this.a(stackIn_45_1, stackIn_46_2);
                  return true;
                }
              }
            } else {
              if (this.field_J != this.field_N) {
                this.j(-10292);
                return true;
              }
              if (this.field_N < this.field_g.length()) {
                this.field_J = 1 + this.field_N;
                this.j(-10292);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_80_0 = var5;
          stackIn_80_1 = new StringBuilder().append("rn.N(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(byte param0) {
        kh var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ac var9;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (!this.field_M) {
          this.field_i = 0;
          this.field_h = 0;
          return;
        }
        if (!(this.field_r instanceof ac)) {
          return;
        }
        var9 = (ac) ((Object) this.field_r);
        var3 = var9.a((qm) (this), -46);
        var4 = var3.b((byte) 121);
        var5 = var9.a((qm) (this), (byte) 101);
        if (param0 > -38) {
          return;
        }
        var6 = var9.a(27184) >> 1;
        if (-var6 + var5 > var4) {
          this.field_i = 0;
          this.field_h = 0;
        } else {
          var7 = this.field_h + var3.a(this.field_N, 0);
          if (-var6 + var5 >= var7) {
            if (var7 < var6) {
              this.field_h = this.field_h + (-var7 + var6);
            }
          } else {
            this.field_h = this.field_h - (var7 + var6 - var5);
          }
          if (0 < this.field_h) {
            this.field_h = 0;
          } else {
            if (this.field_h < -var5 + var6) {
              this.field_h = var6 - var5;
            }
          }
        }
    }

    private final int i(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != -9125) {
          this.h(99);
        }
        var2 = this.field_g.length();
        if (var2 == this.field_N) {
          return this.field_N;
        }
        for (var3 = 1 + this.field_N; var3 < var2; var3++) {
          if (32 != this.field_g.charAt(var3 - 1)) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void c(boolean param0) {
        if (this.field_o instanceof bn) {
          ((bn) (this.field_o)).b(this, 117);
        }
        if (param0) {
          this.a((byte) -7, 102, 2, -128);
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 == null) {
            param1 = "";
          }
          this.field_g = param1;
          var4_int = param1.length();
          if (-1 != this.field_H &&
            var4_int > this.field_H) {
            this.field_g = this.field_g.substring(0, this.field_H);
          }
          dupTemp$1 = this.field_g.length();
          this.field_J = dupTemp$1;
          this.field_N = dupTemp$1;
          if (!param0) {
            this.l(-22706);
          }
          if (param2) {
            this.a(-16, 109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rn.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        if (this.field_H != -1) {
          var3_int = this.field_H - this.field_g.length();
          if (var3_int >= 0) {
            return;
          }
          param0 = param0.substring(0, var3_int);
        }
        if (this.field_N != this.field_g.length()) {
          this.field_g = this.field_g.substring(0, this.field_N) + param0 + this.field_g.substring(this.field_N, this.field_g.length());
        } else {
          this.field_g = this.field_g + param0;
        }
        this.field_N = this.field_N + param0.length();
        this.field_J = this.field_N;
        if (param1 >= -27) {
          return;
        }
        try {
          this.l(-22706);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "rn.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static vg a(boolean param0, ab param1) {
        int var7 = 0;
        vg stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param1.d(28089, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = hd.a(param1, (byte) 118) ? 1 : 0;
          var4 = hd.a(param1, (byte) 126) ? 1 : 0;
          if (!param0) {
            field_K = (String) null;
          }
          var5 = new vg();
          var5.field_f = (short)param1.d(28089, 16);
          var5.field_b = eo.a(param1, var5.field_b, 16, 16);
          var5.field_B = eo.a(param1, var5.field_B, 16, 16);
          var5.field_L = eo.a(param1, var5.field_L, 16, 16);
          var5.field_G = (short)param1.d(28089, 16);
          var5.field_U = eo.a(param1, var5.field_U, 16, 16);
          var5.field_T = eo.a(param1, var5.field_T, 16, 16);
          var5.field_O = eo.a(param1, var5.field_O, 16, 16);
          if (var3 != 0) {
            var5.field_A = (short)param1.d(28089, 16);
            var5.field_r = eo.a(param1, var5.field_r, 16, 16);
            var5.field_e = eo.a(param1, var5.field_e, 16, 16);
            var5.field_S = eo.a(param1, var5.field_S, 16, 16);
            var5.field_w = eo.a(param1, var5.field_w, 16, 16);
            var5.field_q = eo.a(param1, var5.field_q, 16, 16);
            var5.field_u = eo.a(param1, var5.field_u, 16, 16);
          }
          if (var4 != 0) {
            param1.d(28089, 16);
            var5.field_Q = eo.a(param1, var5.field_Q, 16, 16);
            var5.field_d = eo.a(param1, var5.field_d, 16, 16);
            var5.field_D = eo.a(param1, var5.field_D, 16, 16);
            var5.field_s = eo.a(param1, var5.field_s, 16, 16);
            var5.field_h = eo.a(param1, var5.field_h, 16, 16);
          }
          if (hd.a(param1, (byte) 126)) {
            var5.field_z = eo.a(param1, var5.field_z, 16, 16);
          }
          if (hd.a(param1, (byte) 120)) {
            var5.field_H = ub.a(3, param1, 16, var5.field_H);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_H.length; var7++) {
              if ((var5.field_H[var7] & 255) > var6) {
                var6 = var5.field_H[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_F = (byte)(1 + var6);
            } else {
              var5.field_H = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("rn.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        if (param0 != 56) {
          qm var3 = (qm) null;
          this.a(84, 58, (qm) null, 100, 126, 7, -93);
        }
        String var2 = this.k(param0 - 23972);
        if (var2.length() > 0) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.k(-23916))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final String k(int param0) {
        int var2 = this.field_J >= this.field_N ? this.field_N : this.field_J;
        if (param0 != -23916) {
          return (String) null;
        }
        int var3 = this.field_N <= this.field_J ? this.field_J : this.field_N;
        return this.field_g.substring(var2, var3);
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9_int = 0;
        long var9 = 0L;
        try {
          var8_int = 49 % ((param4 + 42) / 35);
          if (!super.a(param0, param1, param2, param3, -78, param5, param6)) {
            return false;
          }
          if (!(this.field_r instanceof ac)) {
            return false;
          }
          var9_int = ((ac) ((Object) this.field_r)).b(param6, (qm) (this), me.field_I, an.field_g, param3, 2454);
          stackIn_5_1 = 81;
          if (var9_int != -1) {
            stackIn_6_2 = var9_int;
          } else {
            stackIn_6_2 = 0;
          }
          this.a(stackIn_5_1, stackIn_6_2);
          var9 = qj.b(-26572);
          stackIn_9_1 = !(-this.field_P + var9 >= 250L);
          this.field_R = stackIn_9_1;
          if (this.field_R) {
            this.field_J = this.f(1000);
            this.field_N = this.i(-9125);
            if (this.field_N > 0 &&
              32 == this.field_g.charAt(-1 + this.field_N)) {
              this.field_N = this.field_N - 1;
            }
            this.field_O = this.field_N;
          }
          this.field_P = var9;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("rn.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_K = "WINNER - ";
    }
}
