/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class ch extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int field_b;
    boolean field_a;
    static int[] field_d;
    public static boolean field_h;
    public static boolean field_e;
    public static boolean field_i;
    public static boolean field_c;
    public static boolean field_f;
    public static int field_g;
    public static boolean field_j;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sg.field_a != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
            } else {
              if (null != kg.field_m) {
                if (this != kg.field_m) {
                  stackIn_10_0 = kg.field_m.getDocumentBase();
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackIn_12_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ch.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kg.field_m = param0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);

          stackIn_5_1 = new StringBuilder().append("ch.provideLoaderApplet(");

          if (param0 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);

          stackIn_5_1 = new StringBuilder().append("ch.windowClosing(");

          if (param0 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (ad.field_p) {
              return;
            } else {
              ad.field_p = true;
            }
          }
          if (null != kg.field_m) {
            kg.field_m.destroy();
          }
          try {
            this.c(1);
            if (param0 != 14) {
              this.a(-33);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (f.field_kb != null) {
            try {
              f.field_kb.removeFocusListener((java.awt.event.FocusListener) (this));
              f.field_kb.getParent().remove((java.awt.Component) ((Object) f.field_kb));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ka.field_i != null) {
            try {
              ka.field_i.a((byte) 13);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b((byte) -64);
          if (null != sg.field_a) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "ch.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.paint(param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);

          stackIn_5_1 = new StringBuilder().append("ch.update(");

          if (param0 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_d = null;
            int var1_int = 30 % ((30 - param0) / 52);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ch.E(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wc.field_g = true;
          dl.field_c = true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);

          stackIn_5_1 = new StringBuilder().append("ch.focusGained(");

          if (param0 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              if (!this.field_a) {
                this.field_a = true;
                System.out.println("error_game_" + param1);
                if (param0 != 79) {
                  ch.c((byte) -125);
                }
                try {
                  wk.a((byte) -6, k.c(115), "loggedout");
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
                decompiledRegionSelector0 = 1;
              } else {
                decompiledRegionSelector0 = 0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_15_0 = (RuntimeException) (var3_ref2);

              stackIn_15_1 = new StringBuilder().append("ch.A(").append(param0).append(',');

              if (param1 == null) {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                stackIn_16_2 = "null";
              } else {
                stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                stackIn_16_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_78_0 = 0;
            int stackIn_78_1 = 0;
            int stackIn_94_0 = 0;
            int stackIn_99_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (d.field_o != null) {
                                /* Inlined CFG state: 4. */
                                {
                                    var1 = d.field_o.toLowerCase();
                                    if (-1 != ((String) (var1)).indexOf("sun")) {
                                        statePc = 8;
                                    } else {
                                        statePc = 5;
                                    }
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 2. */
                                {
                                    statePc = 61;
                                    continue stateLoop;
                                }
                            }
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((((String) (var1)).indexOf("apple") ^ -1) == 0) {
                                statePc = 61;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 6. */
                                {
                                    statePc = 8;
                                    continue stateLoop;
                                }
                            }
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = d.field_t;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 41;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 10. */
                                {
                                    /* Sequential CFG blocks: 10, 12. */
                                    {
                                    }
                                    {
                                        if (var2.equals("1.2")) {
                                            statePc = 41;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 13. */
                                            {
                                                /* Sequential CFG blocks: 13, 15. */
                                                {
                                                }
                                                {
                                                    if (var2.startsWith("1.2.")) {
                                                        statePc = 41;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 16. */
                                                        {
                                                            /* Sequential CFG blocks: 16, 18. */
                                                            {
                                                            }
                                                            {
                                                                if (var2.equals("1.3")) {
                                                                    statePc = 41;
                                                                    continue stateLoop;
                                                                } else {
                                                                    /* Inlined CFG state: 19. */
                                                                    {
                                                                        /* Sequential CFG blocks: 19, 21. */
                                                                        {
                                                                        }
                                                                        {
                                                                            if (var2.startsWith("1.3.")) {
                                                                                statePc = 41;
                                                                            } else {
                                                                                statePc = 22;
                                                                            }
                                                                            continue stateLoop;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            /* Sequential CFG blocks: 22, 24. */
                            {
                            }
                            {
                                if (var2.equals("1.4")) {
                                    statePc = 41;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 25. */
                                    {
                                        /* Sequential CFG blocks: 25, 27. */
                                        {
                                        }
                                        {
                                            if (var2.startsWith("1.4.")) {
                                                statePc = 41;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 28. */
                                                {
                                                    /* Sequential CFG blocks: 28, 30. */
                                                    {
                                                    }
                                                    {
                                                        if (var2.equals("1.5")) {
                                                            statePc = 41;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 31. */
                                                            {
                                                                /* Sequential CFG blocks: 31, 33. */
                                                                {
                                                                }
                                                                {
                                                                    if (var2.startsWith("1.5.")) {
                                                                        statePc = 41;
                                                                        continue stateLoop;
                                                                    } else {
                                                                        /* Inlined CFG state: 34. */
                                                                        {
                                                                            /* Sequential CFG blocks: 34, 36. */
                                                                            {
                                                                            }
                                                                            {
                                                                                if (var2.equals("1.6.0")) {
                                                                                    statePc = 41;
                                                                                } else {
                                                                                    statePc = 37;
                                                                                }
                                                                                continue stateLoop;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            /* Sequential CFG blocks: 37, 39. */
                            {
                            }
                            {
                                statePc = 42;
                                continue stateLoop;
                            }
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a((byte) 79, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 61;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 43. */
                                {
                                    /* Sequential CFG blocks: 43, 45. */
                                    {
                                    }
                                    {
                                        var3 = 6;
                                        statePc = 46;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var2.length() <= var3) {
                                statePc = 54;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 47. */
                                {
                                    stackIn_66_0 = rc.a(-58, var2.charAt(var3));
                                    stackIn_48_0 = stackIn_66_0;
                                    if (var5 != 0) {
                                        statePc = 66;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 48. */
                                        {
                                            if (!stackIn_48_0) {
                                                statePc = 54;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 49. */
                                                {
                                                    /* Sequential CFG blocks: 49, 51. */
                                                    {
                                                    }
                                                    {
                                                        var3++;
                                                        if (var5 == 0) {
                                                            statePc = 46;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 52. */
                                                            {
                                                                statePc = 54;
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!f.b((byte) -115, (CharSequence) ((Object) var4))) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (ol.a(false, (CharSequence) ((Object) var4)) < 10) {
                                /* Inlined CFG state: 60. */
                                {
                                    this.a((byte) 79, "wrongjava");
                                    if (var5 == 0) {
                                        statePc = 107;
                                    } else {
                                        statePc = 61;
                                    }
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 56. */
                                {
                                    /* Sequential CFG blocks: 56, 58. */
                                    {
                                    }
                                    {
                                        statePc = 61;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (d.field_t == null) {
                                statePc = 81;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 62. */
                                {
                                    /* Sequential CFG blocks: 62, 64. */
                                    {
                                    }
                                    {
                                        stackIn_66_0 = d.field_t.startsWith("1.");
                                        statePc = 66;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!stackIn_66_0) {
                                statePc = 81;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 67. */
                                {
                                    var1_int = 2;
                                    var2_int = 0;
                                    statePc = 68;
                                    continue stateLoop;
                                }
                            }
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((d.field_t.length() ^ -1) >= (var1_int ^ -1)) {
                                statePc = 77;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 69. */
                                {
                                    var3 = d.field_t.charAt(var1_int);
                                    stackIn_78_0 = var3;
                                    stackIn_70_0 = stackIn_78_0;
                                    stackIn_78_1 = 48;
                                    stackIn_70_1 = stackIn_78_1;
                                    if (var5 != 0) {
                                        statePc = 78;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 70. */
                                        {
                                            if (stackIn_70_0 < stackIn_70_1) {
                                                statePc = 77;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 71. */
                                                {
                                                    /* Sequential CFG blocks: 71, 73. */
                                                    {
                                                    }
                                                    {
                                                        if (-58 > (var3 ^ -1)) {
                                                            statePc = 77;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 74. */
                                                            {
                                                                /* Sequential CFG blocks: 74, 76. */
                                                                {
                                                                }
                                                                {
                                                                    var2_int = 10 * var2_int - 48 - -var3;
                                                                    var1_int++;
                                                                    if (var5 == 0) {
                                                                        statePc = 68;
                                                                    } else {
                                                                        statePc = 77;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = var2_int ^ -1;
                            stackIn_78_1 = -6;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (stackIn_78_0 > stackIn_78_1) {
                                statePc = 81;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 79. */
                                {
                                    oe.field_S = true;
                                    statePc = 81;
                                    continue stateLoop;
                                }
                            }
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var1 = qa.field_d;
                            if (null != kg.field_m) {
                                /* Inlined CFG state: 84. */
                                {
                                    var1 = kg.field_m;
                                    statePc = 85;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 82. */
                                {
                                    statePc = 85;
                                    continue stateLoop;
                                }
                            }
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_ref = d.field_v;
                            if (null != var2_ref) {
                                statePc = 88;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            oc.a(75);
                            this.b(true);
                            sh.field_y = fk.a(false, (java.awt.Component) ((Object) f.field_kb), ok.field_c, kh.field_d);
                            this.b(117);
                            eg.field_p = ba.a(5000);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (0L == ka.field_a) {
                                statePc = 97;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 93. */
                                {
                                    stackIn_99_0 = ((ka.field_a ^ -1L) < (oa.a(-12520) ^ -1L) ? -1 : ((ka.field_a ^ -1L) == (oa.a(-12520) ^ -1L) ? 0 : 1));
                                    stackIn_94_0 = stackIn_99_0;
                                    if (var5 != 0) {
                                        statePc = 99;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 94. */
                                        {
                                            if (stackIn_94_0 >= 0) {
                                                statePc = 107;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 95. */
                                                {
                                                    statePc = 97;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            nf.field_w = eg.field_p.a((byte) -6, oj.field_c);
                            stackIn_99_0 = 0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var3 = stackIn_99_0;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (nf.field_w <= var3) {
                                statePc = 105;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 101. */
                                {
                                    this.a((byte) -10);
                                    var3++;
                                    if (var5 != 0) {
                                        statePc = 106;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 102. */
                                        {
                                            if (var5 == 0) {
                                                statePc = 100;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 103. */
                                                {
                                                    statePc = 105;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.d(32000);
                            wj.a(ka.field_i, (byte) 83, f.field_kb);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var5 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var1 = caughtException;
                            gi.a((Throwable) (var1), (String) null, (byte) 125);
                            this.a((byte) 79, "crash");
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            this.a((byte) 14, true);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var1 = caughtException;
                        throw t.a((Throwable) (var1), "ch.run()");
                    }
                    case 112: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sg.field_a == null) {
              if (kg.field_m != null) {
                if (this != kg.field_m) {
                  stackIn_8_0 = kg.field_m.getAppletContext();
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackIn_10_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ch.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void b(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          if (f.field_kb != null) {
            f.field_kb.removeFocusListener((java.awt.event.FocusListener) (this));
            f.field_kb.getParent().setBackground(java.awt.Color.black);
            f.field_kb.getParent().remove((java.awt.Component) ((Object) f.field_kb));
          }
          L2: {
            if (he.field_a == null) {
              if (null == sg.field_a) {
                if (kg.field_m != null) {
                  var2 = kg.field_m;
                  if (var4 == 0) {
                    break L2;
                  }
                }
                var2 = qa.field_d;
                if (var4 == 0) {
                  break L2;
                }
              }
              var2 = sg.field_a;
              if (var4 == 0) {
                break L2;
              }
            }
            var2 = he.field_a;
          }
          L6: {
            ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
            f.field_kb = (java.awt.Canvas) ((Object) new bh((java.awt.Component) (this)));
            ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) f.field_kb));
            f.field_kb.setSize(kh.field_d, ok.field_c);
            f.field_kb.setVisible(param0);
            if (sg.field_a != var2) {
              f.field_kb.setLocation(qa.field_b, hk.field_B);
              if (var4 == 0) {
                break L6;
              }
            }
            var3 = sg.field_a.getInsets();
            f.field_kb.setLocation(var3.left + qa.field_b, var3.top - -hk.field_B);
          }
          f.field_kb.addFocusListener((java.awt.event.FocusListener) (this));
          f.field_kb.requestFocus();
          lh.field_d = true;
          wc.field_g = true;
          dl.field_c = true;
          ab.field_a = false;
          Geoblox.field_D = oa.a(-12520);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (var2), "ch.H(" + param0 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this == qa.field_d) {
              if (!ad.field_p) {
                ka.field_a = 0L;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "ch.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2;
        sa var3;
        StringWriter var3_ref;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        if (param0 instanceof sa) {
          var3 = (sa) ((Object) param0);
          param0 = var3.field_a;
          var2 = var3.field_d + " | ";
        } else {
          var2 = "";
        }
        var3_ref = new StringWriter();
        if (param1 != 1) {
          field_b = 61;
        }
        var4 = new PrintWriter((Writer) ((Object) var3_ref));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        L2: while (true) {
          var8 = var6.readLine();
          if (null == var8) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            var9 = var8.indexOf('(');
            var10 = var8.indexOf(')', var9 + 1);
            if (-1 != var9) {
              var11 = var8.substring(0, var9);
            } else {
              var11 = var8;
            }
            var11 = var11.trim();
            var11 = var11.substring(var11.lastIndexOf(' ') + 1);
            var11 = var11.substring(1 + var11.lastIndexOf('\t'));
            var2 = var2 + var11;
            if (var9 != -1) {
              if (-1 != var10) {
                var12 = var8.indexOf(".java:", var9);
                if (var12 >= 0) {
                  var2 = var2 + var8.substring(var12 + 5, var10);
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean a(boolean param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != sg.field_a) {
          return null;
        } else {
          if (null != kg.field_m) {
            if (kg.field_m != this) {
              return kg.field_m.getCodeBase();
            }
          }
          return super.getCodeBase();
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wc.field_g = false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);

          stackIn_5_1 = new StringBuilder().append("ch.focusLost(");

          if (param0 == null) {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "null";
          } else {
            stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void b(int param0);

    private final void a(byte param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          if (param0 != -10) {
            field_b = -102;
          }
          var2_long = oa.a(param0 ^ 12526);
          var4 = tl.field_l[ij.field_cb];
          tl.field_l[ij.field_cb] = var2_long;
          ij.field_cb = 31 & 1 + ij.field_cb;
          if (var4 != 0L) {
            if (var2_long > var4) {
            }
          }
          var6 = this;
          synchronized (var6) {
            lh.field_d = wc.field_g;
          }
          this.c(false);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ch.L(" + param0 + ')');
        }
    }

    abstract void b(byte param0);

    public abstract void init();

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            if (qa.field_d == this) {
              if (!ad.field_p) {
                L2: {
                  dl.field_c = true;
                  if (oe.field_S) {
                    if ((-Geoblox.field_D + oa.a(-12520) ^ -1L) < -1001L) {
                      var2 = param0.getClipBounds();
                      if (null != var2) {
                        if ((var2.width ^ -1) > (qb.field_G ^ -1)) {
                          break L2;
                        } else {
                          if (sd.field_w > var2.height) {
                            break L2;
                          }
                        }
                      }
                      ab.field_a = true;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2_ref);

          stackIn_25_1 = new StringBuilder().append("ch.paint(");

          if (param0 == null) {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void destroy() {
        if (qa.field_d != this || ad.field_p) {
            return;
        }
        try {
            ka.field_a = oa.a(-12520);
            bc.a(0, 5000L);
            ml.field_s = null;
            this.a((byte) 14, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ch.destroy()");
        }
    }

    abstract void c(boolean param0);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            d dupTemp$0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            cb var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (qa.field_d != null) {
                                /* Inlined CFG state: 4. */
                                {
                                    wg.field_j = wg.field_j + 1;
                                    if ((wg.field_j ^ -1) > -4) {
                                        /* Inlined CFG state: 7. */
                                        {
                                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                                            statePc = 8;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 5. */
                                        {
                                            this.a((byte) 79, "alreadyloaded");
                                            statePc = 6;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            } else {
                                /* Inlined CFG state: 2. */
                                {
                                    /* Sequential CFG blocks: 2, 9. */
                                    {
                                    }
                                    {
                                        kk.field_t = param2;
                                        ok.field_c = param3;
                                        sd.field_w = param3;
                                        qa.field_b = 0;
                                        hk.field_B = 0;
                                        kh.field_d = param4;
                                        qb.field_G = param4;
                                        qa.field_d = (ch) (this);
                                        c.field_x = k.c(107);
                                        if (param1 == -14948) {
                                            /* Inlined CFG state: 11. */
                                            {
                                                dupTemp$0 = new d(param0, param5, param6, true);
                                                ka.field_i = dupTemp$0;
                                                ml.field_s = dupTemp$0;
                                                var8 = ka.field_i.a((Runnable) (this), 0, 1);
                                                statePc = 12;
                                                continue stateLoop;
                                            }
                                        } else {
                                            statePc = 10;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 8: {
                        return;
                    }
                    case 10: {
                        return;
                    }
                    case 12: {
                        try {
                            if (-1 != (var8.field_a ^ -1)) {
                                statePc = 17;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 13. */
                                {
                                    bc.a(0, 10L);
                                    if (var9 != 0) {
                                        statePc = 25;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 14. */
                                        {
                                            if (var9 == 0) {
                                                statePc = 12;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 15. */
                                                {
                                                    statePc = 17;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_ref = caughtException;
                            gi.a(var8_ref, (String) null, (byte) 125);
                            this.a((byte) 79, "crash");
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_23_0 = (RuntimeException) (var8_ref2);
                        stackIn_21_0 = stackIn_23_0;
                        stackIn_23_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_21_1 = stackIn_23_1;
                        if (param5 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_24_2 = "{...}";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_24_2 = "null";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param6 + ')');
                    }
                    case 25: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sg.field_a != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
            } else {
              if (kg.field_m != null) {
                if (this != kg.field_m) {
                  stackIn_10_0 = kg.field_m.getParameter(param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackIn_12_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var2);

          stackIn_16_1 = new StringBuilder().append("ch.getParameter(");

          if (param0 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          if (param0 != 32000) {
            this.windowActivated((java.awt.event.WindowEvent) null);
          }
          var2_long = oa.a(param0 + -44520);
          var4 = pb.field_p[fe.field_k];
          pb.field_p[fe.field_k] = var2_long;
          fe.field_k = 31 & fe.field_k + 1;
          if (0L != var4) {
            if (var4 < var2_long) {
              var6_int = (int)(-var4 + var2_long);
              ec.field_b = (32000 - -(var6_int >> 41624225)) / var6_int;
            }
          }
          L3: {
            fieldTemp$1 = rj.field_i;
            rj.field_i = rj.field_i + 1;
            if ((fieldTemp$1 ^ -1) < -51) {
              L4: {
                rj.field_i = rj.field_i - 50;
                dl.field_c = true;
                f.field_kb.setSize(kh.field_d, ok.field_c);
                f.field_kb.setVisible(true);
                if (sg.field_a != null) {
                  if (he.field_a == null) {
                    break L4;
                  }
                }
                f.field_kb.setLocation(qa.field_b, hk.field_B);
                if (Geoblox.field_C == 0) {
                  break L3;
                }
              }
              var6 = sg.field_a.getInsets();
              f.field_kb.setLocation(var6.left + qa.field_b, hk.field_B + var6.top);
            }
          }
          this.a(25853);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ch.F(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this == qa.field_d) {
              if (!ad.field_p) {
                ka.field_a = 4000L + oa.a(-12520);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "ch.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0);

    abstract void c(int param0);

    protected ch() {
        this.field_a = false;
    }

    static {
        field_b = 0;
        field_d = new int[1024];
    }
}
