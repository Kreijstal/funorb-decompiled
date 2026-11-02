/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vh field_f;
    private DualLinkNode field_d;
    private DualLinkNode field_g;
    static int field_i;
    static int[] field_e;
    private int field_a;
    private DualLinkNode[] field_c;
    private int field_h;
    static vh field_k;
    private long field_b;
    static String creatingyouraccount;

    final DualLinkNode a(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        DualLinkNode var2Lifetime1;
        DualLinkNode var3Lifetime1;
        if (param0 >= -52) {
          this.field_c = (DualLinkNode[]) null;
          if (this.field_d == null) {
            return null;
          }
          var2 = this.field_c[(int)(this.field_b & (long)(this.field_a - 1))];
          while (true) {
            if (this.field_d == var2) {
              this.field_d = null;
              return null;
            }
            if (~this.field_d.field_m != ~this.field_b) {
              this.field_d = this.field_d.field_q;
              continue;
            }
            break;
          }
          var3 = this.field_d;
          this.field_d = this.field_d.field_q;
          return var3;
        }
        if (this.field_d == null) {
          return null;
        }
        var2Lifetime1 = this.field_c[(int)(this.field_b & (long)(this.field_a - 1))];
        while (true) {
          if (this.field_d == var2Lifetime1) {
            this.field_d = null;
            return null;
          }
          if (~this.field_d.field_m != ~this.field_b) {
            this.field_d = this.field_d.field_q;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.field_d;
        this.field_d = this.field_d.field_q;
        return var3Lifetime1;
    }

    final DualLinkNode b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        DualLinkNode var3;
        DualLinkNode var4;
        DualLinkNode var7;
        if (0 >= this.field_h) {
          do {
            if (this.field_a <= this.field_h) {
              if (param0 >= 25) {
                return null;
              }
              this.field_h = -10;
              return null;
            }
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            var3 = this.field_c[fieldTemp$1].field_q;
          } while (this.field_c[-1 + this.field_h] == var3);
          this.field_g = var3.field_q;
          return var3;
        }
        if (this.field_g != this.field_c[this.field_h - 1]) {
          var7 = this.field_g;
          this.field_g = var7.field_q;
          return var7;
        }
        do {
          if (this.field_a <= this.field_h) {
            if (param0 >= 25) {
              return null;
            }
            this.field_h = -10;
            return null;
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_c[fieldTemp$0].field_q;
        } while (this.field_c[-1 + this.field_h] == var4);
        this.field_g = var4.field_q;
        return var4;
    }

    final DualLinkNode a(byte param0) {
        this.field_h = 0;
        if (param0 > -124) {
          this.field_d = (DualLinkNode) null;
          return this.b(103);
        }
        return this.b(103);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != -1) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(p.a((byte) 59, var2, param1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("tk.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_f = null;
        int var1 = -92 / ((-40 - param0) / 46);
        creatingyouraccount = null;
        field_e = null;
    }

    final void a(int param0, long param1, DualLinkNode param2) {
        DualLinkNode var5 = null;
        try {
          if (param2.field_n != null) {
            param2.a(false);
          }
          if (param0 != -6946) {
            java.applet.Applet var6 = (java.applet.Applet) null;
            tk.a(-18, (java.applet.Applet) null);
          }
          var5 = this.field_c[(int)(param1 & (long)(this.field_a - 1))];
          param2.field_n = var5.field_n;
          param2.field_q = var5;
          param2.field_n.field_q = param2;
          param2.field_m = param1;
          param2.field_q.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tk.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    tk(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_h = 0;
        this.field_c = new DualLinkNode[param0];
        this.field_a = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.field_n = var3;
          var3.field_q = var3;
        }
    }

    final DualLinkNode a(long param0, boolean param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        this.field_b = param0;
        if (!param1) {
          var4 = this.field_c[(int)((long)(-1 + this.field_a) & param0)];
          this.field_d = var4.field_q;
          while (true) {
            if (var4 == this.field_d) {
              this.field_d = null;
              return null;
            }
            if (~param0 != ~this.field_d.field_m) {
              this.field_d = this.field_d.field_q;
              continue;
            }
            break;
          }
          var5 = this.field_d;
          this.field_d = this.field_d.field_q;
          return var5;
        }
        this.a((byte) -118);
        var4Lifetime1 = this.field_c[(int)((long)(-1 + this.field_a) & param0)];
        this.field_d = var4Lifetime1.field_q;
        while (true) {
          if (var4Lifetime1 == this.field_d) {
            this.field_d = null;
            return null;
          }
          if (~param0 != ~this.field_d.field_m) {
            this.field_d = this.field_d.field_q;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_d;
        this.field_d = this.field_d.field_q;
        return var5Lifetime1;
    }

    static {
        creatingyouraccount = "Creating your account";
    }
}
