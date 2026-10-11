/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ck extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_e;
    static String field_f;
    boolean field_g;
    public static int field_a;
    public static boolean field_i;
    public static boolean field_j;
    public static int field_h;
    public static int field_d;
    public static int field_b;
    public static boolean field_c;

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (dd.field_H) {
              return;
            }
            dd.field_H = true;
          }
          if (null != ov.field_f) {
            ov.field_f.destroy();
          }
          try {
            this.d(76);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (param0 != 0) {
            this.d(-15);
          }
          if (dca.field_y != null) {
            try {
              dca.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
              dca.field_y.getParent().remove((java.awt.Component) ((Object) dca.field_y));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != ju.field_r) {
            try {
              ju.field_r.a(94);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b(84);
          if (null != fda.field_j) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "ck.RA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void b(int param0);

    public final void run() {
        try {
          boolean stackIn_64_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
          int stackIn_98_0 = 0;
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
          var5 = BachelorFridge.field_y;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != ht.field_g) {
                var1 = ht.field_g.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ht.field_c;
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
                    this.a("wrongjava", (byte) -48);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_64_0 = ula.a(var2.charAt(var3), 48);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_64_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (vn.a((byte) 114, (CharSequence) ((Object) var4)) &&
                        !(pd.a((byte) 47, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a("wrongjava", (byte) -48);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != ht.field_c))) {
                stackIn_64_0 = ht.field_c.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < ht.field_c.length()) {
                    var3 = ht.field_c.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_79_0 <= stackIn_79_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = var3 - (48 - 10 * var2_int);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = -6;
                    stackIn_79_1 = ~var2_int;
                  }
                  if (stackIn_79_0 < stackIn_79_1) {
                    break;
                  }
                  bha.field_n = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = re.field_C;
                if (ov.field_f != null) {
                  var1 = ov.field_f;
                }
                var2_ref = ht.field_m;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                pr.a((byte) -21);
                this.a(50);
                hga.field_U = lp.a(dda.field_j, nn.field_b, (java.awt.Component) ((Object) dca.field_y), 29548);
                this.c((byte) 91);
                ena.field_m = us.a(-4127);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != am.field_K) {
                    stackIn_98_0 = $cfr$lcmp(am.field_K, f.b((byte) 73));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_98_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ea.field_f = ena.field_m.a((byte) 109, fe.field_h);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(ea.field_f > var3)) {
                      this.c(-2100834399);
                      he.a(ju.field_r, false, dca.field_y);
                      break;
                    }
                    this.f(-84);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              cv.a(1, (String) null, (Throwable) (var1));
              this.a("crash", (byte) -48);
            }
            this.a(0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw pe.a((Throwable) (var1), "ck.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(String param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        try {
          ht dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          eh var9 = null;
          int var10 = 0;
          var10 = BachelorFridge.field_y;
          try {
            try {
              if (re.field_C != null) {
                pe.field_k = pe.field_k + 1;
                if (pe.field_k < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", (byte) -48);
                return;
              }
              dda.field_j = param4;
              kb.field_h = param4;
              qw.field_d = 0;
              wk.field_g = 0;
              ej.field_p = param1;
              nn.field_b = param6;
              tha.field_q = param6;
              re.field_C = this;
              jia.field_m = nia.d(-31768);
              var8_int = -118 / ((35 - param3) / 54);
              dupTemp$0 = new ht(param2, param0, param5, true);
              ju.field_r = dupTemp$0;
              v.field_d = dupTemp$0;
              var9 = ju.field_r.a((Runnable) (this), 2, 1);
              while (true) {
                if (var9.field_f == 0) {
                  gda.a(false, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              cv.a(1, (String) null, var8);
              this.a("crash", (byte) -48);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("ck.UA(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void stop() {
        if (re.field_C != this ||
          dd.field_H) {
          return;
        }
        try {
          am.field_K = f.b((byte) 73) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ck.stop()");
        }
    }

    abstract void b(byte param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fda.field_j != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != ov.field_f &&
            this != ov.field_f) {
            stackIn_10_0 = ov.field_f.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ck.getDocumentBase()");
        }
    }

    final boolean d(byte param0) {
        return true;
    }

    final void a(String param0, byte param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_g) {
              return;
            }
            this.field_g = true;
            if (param1 != -48) {
              return;
            }
            System.out.println("error_game_" + param0);
            try {
              ac.a(nia.d(param1 ^ 31800), "loggedout", (byte) 64);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("ck.TA(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(int param0);

    abstract void a(byte param0);

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fda.field_j != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (ov.field_f != null &&
            this != ov.field_f) {
            stackIn_12_0 = ov.field_f.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ck.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != -12132) {
          return;
        }
        try {
          field_e = null;
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ck.SA(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == re.field_C &&
            !dd.field_H) {
            nf.field_K = true;
            if (bha.field_n &&
              -gd.field_l + f.b((byte) 73) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < kb.field_h) {
                  return;
                }
                if (tha.field_q > var2.height) {
                  return;
                }
              }
              daa.field_vb = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ck.paint(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = f.b((byte) 73);
          var4 = baa.field_C[laa.field_j];
          baa.field_C[laa.field_j] = var2_long;
          laa.field_j = 1 + laa.field_j & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            if (param0 > -47) {
              this.stop();
            }
            kt.field_i = ub.field_l;
          }
          this.b((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "ck.PA(" + param0 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fda.field_j != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != ov.field_f &&
            this != ov.field_f) {
            stackIn_10_0 = ov.field_f.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ck.getAppletContext()");
        }
    }

    final synchronized void a(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          if (dca.field_y != null) {
            dca.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
            dca.field_y.getParent().setBackground(java.awt.Color.black);
            dca.field_y.getParent().remove((java.awt.Component) ((Object) dca.field_y));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ve.field_n != null) {
            var2 = ve.field_n;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (fda.field_j == null) {
              if (null != ov.field_f) {
                var2 = ov.field_f;
                if (var4 != 0) {
                  var2 = re.field_C;
                  var2 = fda.field_j;
                }
              } else {
                var2 = re.field_C;
                if (var4 != 0) {
                  var2 = fda.field_j;
                }
              }
            } else {
              var2 = fda.field_j;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          dca.field_y = (java.awt.Canvas) ((Object) new hr((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) dca.field_y));
          dca.field_y.setSize(dda.field_j, nn.field_b);
          dca.field_y.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == fda.field_j);
          if (!decompiledSharedTail0) {
            dca.field_y.setLocation(qw.field_d, wk.field_g);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = fda.field_j.getInsets();
            dca.field_y.setLocation(var3.left + qw.field_d, var3.top + wk.field_g);
          }
          dca.field_y.addFocusListener((java.awt.event.FocusListener) (this));
          dca.field_y.requestFocus();
          if (param0 < 2) {
            field_e = (String) null;
          }
          ub.field_l = true;
          kt.field_i = true;
          nf.field_K = true;
          daa.field_vb = false;
          gd.field_l = f.b((byte) 73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (var2), "ck.VA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ub.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ck.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("ck.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ov.field_f = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ck.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void destroy() {
        if (re.field_C != this ||
          dd.field_H) {
          return;
        }
        try {
          am.field_K = f.b((byte) 73);
          gda.a(false, 5000L);
          v.field_d = null;
          this.a(0, false);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ck.destroy()");
        }
    }

    public final void start() {
        if (re.field_C != this ||
          dd.field_H) {
          return;
        }
        try {
          am.field_K = 0L;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ck.start()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    abstract void c(byte param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (fda.field_j != null) {
          return null;
        }
        if (ov.field_f != null &&
          this != ov.field_f) {
          return ov.field_f.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ub.field_l = true;
          nf.field_K = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ck.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void c(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = f.b((byte) 73);
          var4 = ta.field_d[ega.field_a];
          ta.field_d[ega.field_a] = var2_long;
          ega.field_a = 31 & 1 + ega.field_a;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            pr.field_i = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = jc.field_v;
          jc.field_v = jc.field_v + 1;
          if (fieldTemp$1 > 50) {
            nf.field_K = true;
            jc.field_v = jc.field_v - 50;
            dca.field_y.setSize(dda.field_j, nn.field_b);
            dca.field_y.setVisible(true);
            if (fda.field_j != null &&
              ve.field_n == null) {
              var6 = fda.field_j.getInsets();
              dca.field_y.setLocation(var6.left + qw.field_d, wk.field_g + var6.top);
              if (BachelorFridge.field_y != 0) {
                dca.field_y.setLocation(qw.field_d, wk.field_g);
              }
            } else {
              dca.field_y.setLocation(qw.field_d, wk.field_g);
            }
          }
          this.a((byte) 32);
          if (param0 != -2100834399) {
            this.windowDeactivated((java.awt.event.WindowEvent) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "ck.OA(" + param0 + ')');
        }
    }

    protected ck() {
        this.field_g = false;
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
          stackIn_5_1 = new StringBuilder().append("ck.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_e = "to return to the normal view.";
        field_f = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
