/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class cd extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_g;
    static dd field_b;
    boolean field_i;
    public static boolean field_e;
    public static int field_j;
    public static int field_d;
    public static int field_a;
    public static int field_c;
    public static boolean field_f;
    public static int field_h;

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != cb.field_t) {
          return null;
        }
        if (sd.field_j != null &&
          this != sd.field_j) {
          return sd.field_j.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void a(int param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (cb.field_t != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != sd.field_j &&
            this != sd.field_j) {
            stackIn_10_0 = sd.field_j.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "cd.getAppletContext()");
        }
    }

    private final void a(boolean param0, byte param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (o.field_l) {
              return;
            }
            o.field_l = true;
          }
          if (sd.field_j != null) {
            sd.field_j.destroy();
          }
          try {
            this.b((byte) -61);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ol.field_e) {
            try {
              ol.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
              ol.field_e.getParent().remove((java.awt.Component) ((Object) ol.field_e));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != fg.field_q) {
            try {
              fg.field_q.a((byte) 125);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(-1);
          if (param1 < 71) {
            this.run();
          }
          if (null != cb.field_t) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "cd.EA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void d(int param0);

    final static int a(ll param0, bh param1, int param2, int param3) {
        int stackIn_14_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_37_0Lifetime1;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (null != param0 &&
            param0.field_p != null &&
            null != param1 &&
            param1.field_o == param0.field_k) {
            var4_int = param1.field_p.length;
            var5 = param0.field_p[param3].length / var4_int;
            var6 = param2;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var6 >= var5))) {
              stackIn_40_0 = $cfr$lcmp(param1.field_k, param0.field_u[param3][var6]);
              if (var8 == 0) {
                if (stackIn_40_0 == 0 &&
                  ng.a(param0.field_i[param3][var6], (byte) 7)) {
                  var7 = 0;
                  while (true) {
                    if (var4_int > var7) {
                      stackIn_37_0 = param0.field_p[param3][var7 + var4_int * var6];
                      if (stackIn_37_0 != param1.field_p[var7]) {
                        break;
                      }
                      var7++;
                      continue;
                    }
                    stackIn_37_0Lifetime1 = var6;
                    return stackIn_37_0Lifetime1;
                  }
                }
                var6++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_40_0 = -1;
            }
            return stackIn_40_0;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("cd.V(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sd.field_g = true;
          j.field_e = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("cd.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            field_b = (dd) null;
          }
          field_b = null;
          field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "cd.BA(" + param0 + ')');
        }
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        int var3 = 0;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if (null != ol.field_e) {
            ol.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
            ol.field_e.getParent().setBackground(java.awt.Color.black);
            ol.field_e.getParent().remove((java.awt.Component) ((Object) ol.field_e));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ug.field_b != null) {
            var2 = ug.field_b;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (cb.field_t != null) {
              var2 = cb.field_t;
              if (var5 != 0) {
                if (sd.field_j != null) {
                  var2 = sd.field_j;
                  var2 = pf.field_c;
                } else {
                  var2 = pf.field_c;
                }
              }
            } else {
              if (sd.field_j != null) {
                var2 = sd.field_j;
                if (var5 != 0) {
                  var2 = pf.field_c;
                }
              } else {
                var2 = pf.field_c;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ol.field_e = (java.awt.Canvas) ((Object) new ld((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ol.field_e));
          ol.field_e.setSize(ki.field_a, gm.field_nb);
          var3 = 81 % ((param0 - 53) / 56);
          ol.field_e.setVisible(true);
          if (var2 == cb.field_t) {
            var4 = cb.field_t.getInsets();
            ol.field_e.setLocation(va.field_u + var4.left, rg.field_p + var4.top);
            if (var5 != 0) {
              ol.field_e.setLocation(va.field_u, rg.field_p);
            }
          } else {
            ol.field_e.setLocation(va.field_u, rg.field_p);
          }
          ol.field_e.addFocusListener((java.awt.event.FocusListener) (this));
          ol.field_e.requestFocus();
          ha.field_k = true;
          sd.field_g = true;
          j.field_e = true;
          h.field_h = false;
          cg.field_z = lj.a((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (var2), "cd.AA(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
          ce dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          od var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = fleas.field_A ? 1 : 0;
          try {
            try {
              if (null != pf.field_c) {
                qk.field_a = qk.field_a + 1;
                if (qk.field_a >= 3) {
                  this.a(param6 ^ -6472, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              rc.field_a = param3;
              if (param6 != 3) {
                this.a(-29, 46, -49, 56, (String) null, -7, 122);
              }
              gm.field_nb = param2;
              di.field_c = param2;
              rg.field_p = 0;
              ki.field_a = param0;
              o.field_m = param0;
              va.field_u = 0;
              pf.field_c = this;
              tb.field_d = rl.a((byte) -61);
              dupTemp$0 = new ce(param5, param4, param1, true);
              fg.field_q = dupTemp$0;
              fg.field_i = dupTemp$0;
              var8 = fg.field_q.a(param6 ^ 4535, (Runnable) (this), 1);
              while (true) {
                if (var8.field_b == 0) {
                  vh.a(10L, param6 ^ 67);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ud.a((String) null, var8_ref, param6 ^ 3);
              this.a(param6 - 6472, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("cd.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sd.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("cd.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        try {
          kb.field_r = param2;
          rf.field_a = param1;
          if (param0 != -25343) {
            cd.c(true);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "cd.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public abstract void init();

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_i) {
              return;
            }
            if (param0 != -6469) {
              this.run();
            }
            this.field_i = true;
            System.out.println("error_game_" + param1);
            try {
              eb.a("loggedout", rl.a((byte) -80), -250);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("cd.FA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          if (param0 != -11) {
            field_g = (String) null;
          }
          var2_long = lj.a((byte) -113);
          var4 = bh.field_q[qj.field_K];
          bh.field_q[qj.field_K] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            ak.field_c = (32000 + (var6_int >> 1)) / var6_int;
          }
          qj.field_K = 31 & 1 + qj.field_K;
          fieldTemp$1 = qc.field_b;
          qc.field_b = qc.field_b + 1;
          if (50 < fieldTemp$1) {
            qc.field_b = qc.field_b - 50;
            j.field_e = true;
            ol.field_e.setSize(ki.field_a, gm.field_nb);
            ol.field_e.setVisible(true);
            if (cb.field_t != null &&
              null == ug.field_b) {
              var6 = cb.field_t.getInsets();
              ol.field_e.setLocation(va.field_u + var6.left, rg.field_p + var6.top);
              if (fleas.field_A) {
                ol.field_e.setLocation(va.field_u, rg.field_p);
              }
            } else {
              ol.field_e.setLocation(va.field_u, rg.field_p);
            }
          }
          this.d(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "cd.S(" + param0 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("cd.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var4), "cd.U(" + param0 + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_80_0 = 0;
          int stackIn_80_1 = 0;
          int stackIn_101_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var1_int = 0;
          String var2 = null;
          int var2_int = 0;
          java.lang.reflect.Method var2_ref = null;
          int var3 = 0;
          Throwable var3_ref_Throwable = null;
          String var4 = null;
          int var5 = 0;
          var5 = fleas.field_A ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != ce.field_r) {
                var1 = ce.field_r.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ce.field_n;
                  if (var2.equals("1.1") ||
                    var2.startsWith("1.1.") ||
                    var2.equals("1.2") ||
                    var2.startsWith("1.2.") ||
                    var2.equals("1.3") ||
                    var2.startsWith("1.3.") ||
                    var2.equals("1.4") ||
                    var2.startsWith("1.4.") ||
                    var2.equals("1.5") ||
                    var2.startsWith("1.5.") ||
                    var2.equals("1.6.0")) {
                    this.a(-6469, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = em.a((byte) -99, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_68_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ii.a(12969, (CharSequence) ((Object) var4)) &&
                        !(pl.a((CharSequence) ((Object) var4), -9816) >= 10)) {
                        this.a(-6469, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (ce.field_n != null))) {
                stackIn_68_0 = ce.field_n.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (ce.field_n.length() > var1_int) {
                    var3 = ce.field_n.charAt(var1_int);
                    stackIn_80_0 = 48;
                    stackIn_80_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_80_0 <= stackIn_80_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = 10 * var2_int - (48 - var3);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_80_0 = -6;
                    stackIn_80_1 = ~var2_int;
                  }
                  if (stackIn_80_0 < stackIn_80_1) {
                    break;
                  }
                  tj.field_d = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = pf.field_c;
                if (sd.field_j != null) {
                  var1 = sd.field_j;
                }
                var2_ref = ce.field_b;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ea.a(8216);
                this.c(116);
                gi.field_b = kb.a((java.awt.Component) ((Object) ol.field_e), ki.field_a, gm.field_nb, 1024);
                this.a((byte) -14);
                l.field_b = wf.c(0);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != dh.field_a) {
                    stackIn_101_0 = $cfr$lcmp(dh.field_a, lj.a((byte) -93));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_101_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    w.field_r = l.field_b.b(0, na.field_f);
                    stackIn_101_0 = 0;
                  }
                  var3 = stackIn_101_0;
                  do {
                    if (!(w.field_r > var3)) {
                      this.b(-11);
                      aj.a((byte) -60, ol.field_e, fg.field_q);
                      break;
                    }
                    this.a(false);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ud.a((String) null, (Throwable) (var1), 0);
              this.a(-6469, "crash");
            }
            this.a(true, (byte) 95);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw pf.a((Throwable) (var1), "cd.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(boolean param0);

    abstract void b(byte param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pf.field_c == this &&
            !o.field_l) {
            dh.field_a = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "cd.start()");
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (cb.field_t != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (sd.field_j != null &&
            sd.field_j != this) {
            stackIn_8_0 = sd.field_j.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("cd.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != cb.field_t) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != sd.field_j &&
            this != sd.field_j) {
            stackIn_10_0 = sd.field_j.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "cd.getDocumentBase()");
        }
    }

    abstract void a(byte param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (pf.field_c == this &&
            !o.field_l) {
            j.field_e = true;
            if (tj.field_d &&
              1000L < lj.a((byte) -109) - cg.field_z) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (o.field_m > var2.width) {
                  return;
                }
                if (var2.height < di.field_c) {
                  return;
                }
              }
              h.field_h = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("cd.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = lj.a((byte) -88);
          if (param0) {
            this.windowActivated((java.awt.event.WindowEvent) null);
          }
          var4 = ub.field_c[r.field_l];
          ub.field_c[r.field_l] = var2_long;
          r.field_l = 31 & 1 + r.field_l;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          var6 = this;
          synchronized (var6) {
            ha.field_k = sd.field_g;
          }
          this.d(21434);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "cd.DA(" + param0 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pf.field_c == this &&
            !o.field_l) {
            dh.field_a = lj.a((byte) -20);
            vh.a(5000L, -112);
            fg.field_i = null;
            this.a(false, (byte) 122);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "cd.destroy()");
        }
    }

    final boolean b(boolean param0) {
        return true;
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("cd.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sd.field_j = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("cd.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected cd() {
        this.field_i = false;
    }

    final static void a(String param0, fa param1, pi param2, int param3, int param4) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.length() > var7)))) {
            var8 = param0.charAt(var7);
            stackIn_24_0 = var8;
            stackIn_24_1 = 60;
            if (var9 == 0) {
              if (stackIn_24_0 == stackIn_24_1) {
                var6 = (var5_int >> 8) - (-param2.field_d[0] - param1.b(param0.substring(0, var7)));
              }
              if (-1 != var6) {
                param2.field_d[var7] = var6;
              } else {
                if (32 == var8) {
                  var5_int = var5_int + param4;
                }
                param2.field_d[var7] = (var5_int >> 8) + (param2.field_d[0] + param1.b(param0.substring(0, 1 + var7)) - param1.a((char) var8));
              }
              if (62 == var8) {
                var6 = -1;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_24_0 = param3;
            stackIn_24_1 = 30988;
          }
          if (stackIn_24_0 != stackIn_24_1) {
            cd.provideLoaderApplet((java.applet.Applet) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("cd.T(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void stop() {
        if (pf.field_c != this ||
          o.field_l) {
          return;
        }
        try {
          dh.field_a = lj.a((byte) -35) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "cd.stop()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
