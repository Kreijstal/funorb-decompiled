/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class th extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static rb field_d;
    static int field_c;
    public static boolean field_i;
    public static int field_f;
    public static boolean field_j;
    public static boolean field_e;
    public static boolean field_h;
    public static int field_g;
    public static boolean field_a;

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ic.field_d) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (oj.field_f != null &&
            oj.field_f != this) {
            stackIn_10_0 = oj.field_f.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("th.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract void f(int param0);

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          ka dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          bk var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = StarCannon.field_A;
          try {
            try {
              if (null != ic.field_b) {
                pd.field_c = pd.field_c + 1;
                if (pd.field_c < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", false);
                return;
              }
              k.field_a = 0;
              ac.field_f = param2;
              lf.field_ab = 0;
              eh.field_n = param5;
              cg.field_b = param5;
              ic.field_b = this;
              ef.field_d = param4;
              ig.field_i = param4;
              ek.field_b = ll.b(125);
              if (param0 <= 125) {
                this.paint((java.awt.Graphics) null);
              }
              dupTemp$0 = new ka(param3, param1, param6, true);
              nb.field_e = dupTemp$0;
              kg.field_d = dupTemp$0;
              var8 = nb.field_e.a(1, 105, (Runnable) (this));
              while (true) {
                if (var8.field_b == 0) {
                  uc.a(-125, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              hc.a(var8_ref, (String) null, (byte) 126);
              this.a("crash", false);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("th.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nf.field_k = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("th.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(int param0);

    final void a(String param0, boolean param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param0);
            try {
              mb.a(ll.b(104), "loggedout", true);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            if (param1) {
              th.c(81);
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
            stackIn_16_1 = new StringBuilder().append("th.F(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

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
          var5 = StarCannon.field_A;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (ka.field_l != null) {
                var1 = ka.field_l.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ka.field_o;
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
                    this.a("wrongjava", false);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_64_0 = wc.a(48, var2.charAt(var3));
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
                      if (ba.a(6, (CharSequence) ((Object) var4)) &&
                        !(pd.a((CharSequence) ((Object) var4), 10) >= 10)) {
                        this.a("wrongjava", false);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != ka.field_o))) {
                stackIn_64_0 = ka.field_o.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < ka.field_o.length()) {
                    var3 = ka.field_o.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_79_0 <= stackIn_79_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var2_int = 10 * var2_int + var3 - 48;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = 5;
                    stackIn_79_1 = var2_int;
                  }
                  if (stackIn_79_0 > stackIn_79_1) {
                    break;
                  }
                  fi.field_b = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ic.field_b;
                if (oj.field_f != null) {
                  var1 = oj.field_f;
                }
                var2_ref = ka.field_p;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                mi.e((byte) -6);
                this.e(-121);
                hg.field_y = mf.a(eh.field_n, (java.awt.Component) ((Object) kj.field_E), ef.field_d, -21880);
                this.f(-108);
                p.field_d = qb.a(true);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != ci.field_b) {
                    stackIn_98_0 = $cfr$lcmp(~dd.b(72), ~ci.field_b);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_98_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    sg.field_k = p.field_d.a(fd.field_c, 109);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(sg.field_k > var3)) {
                      this.b((byte) -99);
                      ea.a(kj.field_E, -90, nb.field_e);
                      break;
                    }
                    this.a((byte) 85);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              hc.a((Throwable) (var1), (String) null, (byte) 118);
              this.a("crash", false);
            }
            this.a(22865, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw sd.a((Throwable) (var1), "th.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(byte param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (ic.field_b == this &&
            !kd.field_E) {
            v.field_b = true;
            if (fi.field_b &&
              -nh.field_b + dd.b(82) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < cg.field_b) {
                  return;
                }
                if (var2.height < ig.field_i) {
                  return;
                }
              }
              jj.field_E = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("th.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          if (param0 != 22865) {
            return;
          }
          var3_ref = this;
          synchronized (var3_ref) {
            if (kd.field_E) {
              return;
            }
            kd.field_E = true;
          }
          if (oj.field_f != null) {
            oj.field_f.destroy();
          }
          try {
            this.a(-25109);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (kj.field_E != null) {
            try {
              kj.field_E.removeFocusListener((java.awt.event.FocusListener) (this));
              kj.field_E.getParent().remove((java.awt.Component) ((Object) kj.field_E));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (nb.field_e != null) {
            try {
              nb.field_e.b(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c((byte) -127);
          if (null != ic.field_d) {
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
          throw sd.a((Throwable) ((Object) runtimeException), "th.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("th.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ic.field_d) {
          return null;
        }
        if (null != oj.field_f &&
          this != oj.field_f) {
          return oj.field_f.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public static void c(int param0) {
        try {
          field_d = null;
          if (param0 != 1719) {
            field_c = -109;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "th.H(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        java.awt.Insets var6 = null;
        try {
          if (param0 != -99) {
            this.b(-40);
          }
          var2_long = dd.b(param0 + 160);
          var4 = jb.field_j[kg.field_b];
          jb.field_j[kg.field_b] = var2_long;
          kg.field_b = 31 & kg.field_b + 1;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          fieldTemp$1 = ue.field_f;
          ue.field_f = ue.field_f + 1;
          if (fieldTemp$1 > 50) {
            ue.field_f = ue.field_f - 50;
            v.field_b = true;
            kj.field_E.setSize(eh.field_n, ef.field_d);
            kj.field_E.setVisible(true);
            if (ic.field_d != null &&
              null == sg.field_i) {
              var6 = ic.field_d.getInsets();
              kj.field_E.setLocation(k.field_a + var6.left, lf.field_ab + var6.top);
              if (StarCannon.field_A != 0) {
                kj.field_E.setLocation(k.field_a, lf.field_ab);
              }
            } else {
              kj.field_E.setLocation(k.field_a, lf.field_ab);
            }
          }
          this.d((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "th.M(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (this != ic.field_b ||
          kd.field_E) {
          return;
        }
        try {
          ci.field_b = 0L;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "th.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nf.field_k = true;
          v.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("th.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3_ref_java_awt_Insets = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          if (kj.field_E != null) {
            kj.field_E.removeFocusListener((java.awt.event.FocusListener) (this));
            kj.field_E.getParent().setBackground(java.awt.Color.black);
            kj.field_E.getParent().remove((java.awt.Component) ((Object) kj.field_E));
          }
          boolean decompiledFrameRemainder0 = true;
          if (sg.field_i != null) {
            var2 = sg.field_i;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != ic.field_d) {
              var2 = ic.field_d;
              if (var4 != 0) {
                if (null != oj.field_f) {
                  var2 = oj.field_f;
                  var2 = ic.field_b;
                } else {
                  var2 = ic.field_b;
                }
              }
            } else {
              if (null != oj.field_f) {
                var2 = oj.field_f;
                if (var4 != 0) {
                  var2 = ic.field_b;
                }
              } else {
                var2 = ic.field_b;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          kj.field_E = (java.awt.Canvas) ((Object) new hi((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) kj.field_E));
          kj.field_E.setSize(eh.field_n, ef.field_d);
          kj.field_E.setVisible(true);
          if (ic.field_d == var2) {
            var3_ref_java_awt_Insets = ic.field_d.getInsets();
            kj.field_E.setLocation(k.field_a + var3_ref_java_awt_Insets.left, var3_ref_java_awt_Insets.top + lf.field_ab);
            if (var4 != 0) {
              kj.field_E.setLocation(k.field_a, lf.field_ab);
            }
          } else {
            kj.field_E.setLocation(k.field_a, lf.field_ab);
          }
          kj.field_E.addFocusListener((java.awt.event.FocusListener) (this));
          kj.field_E.requestFocus();
          nf.field_k = true;
          dl.field_d = true;
          v.field_b = true;
          jj.field_E = false;
          var3 = -95 / ((param0 + 36) / 45);
          nh.field_b = dd.b(63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (var2), "th.L(" + param0 + ')');
        }
    }

    abstract void c(byte param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ic.field_d != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != oj.field_f &&
            oj.field_f != this) {
            stackIn_8_0 = oj.field_f.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "th.getAppletContext()");
        }
    }

    final boolean d(int param0) {
        return true;
    }

    abstract void a(int param0);

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
          stackIn_5_1 = new StringBuilder().append("th.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ic.field_d) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (oj.field_f != null &&
            this != oj.field_f) {
            stackIn_8_0 = oj.field_f.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "th.getDocumentBase()");
        }
    }

    public final void destroy() {
        if (ic.field_b != this ||
          kd.field_E) {
          return;
        }
        try {
          ci.field_b = dd.b(100);
          uc.a(-118, 5000L);
          kg.field_d = null;
          this.a(22865, false);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "th.destroy()");
        }
    }

    public final void stop() {
        if (this != ic.field_b ||
          kd.field_E) {
          return;
        }
        try {
          ci.field_b = dd.b(111) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "th.stop()");
        }
    }

    protected th() {
        this.field_b = false;
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = dd.b(56);
          if (param0 <= 40) {
            this.b(29);
          }
          var4 = vd.field_g[jj.field_D];
          vd.field_g[jj.field_D] = var2_long;
          jj.field_D = 31 & 1 + jj.field_D;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          var6 = this;
          synchronized (var6) {
            dl.field_d = nf.field_k;
          }
          this.b(320);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "th.D(" + param0 + ')');
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oj.field_f = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("th.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
