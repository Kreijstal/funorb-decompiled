/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    IntrusiveNode sentinel;
    static String field_b;
    static int field_g;
    static long field_f;
    static java.math.BigInteger field_d;
    private IntrusiveNode iterationCursor;
    static int field_a;

    final IntrusiveNode removeFirst(byte param0) {
        if (param0 != 86) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 != this.sentinel) {
          var2.unlink(10);
          return var2;
        }
        return null;
    }

    final IntrusiveNode nextBackward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 < -13) {
          this.iterationCursor = var2.previous;
          return var2;
        }
        this.isEmpty(125);
        this.iterationCursor = var2.previous;
        return var2;
    }

    final IntrusiveNode nextForward(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 94) {
          field_f = 120L;
          var2 = this.iterationCursor;
          if (var2 == this.sentinel) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.next;
          return var2;
        }
        var2Lifetime1 = this.iterationCursor;
        if (var2Lifetime1 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.next;
        return var2Lifetime1;
    }

    final IntrusiveNode removeLast(int param0) {
        if (param0 != 0) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 != this.sentinel) {
          var2.unlink(10);
          return var2;
        }
        return null;
    }

    final IntrusiveNode beginForward(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (param0 != 96) {
          java.awt.Canvas var3 = (java.awt.Canvas) null;
          IntrusiveDeque.a((byte) 61, (java.awt.Canvas) null);
          if (var2 == this.sentinel) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.next;
          return var2;
        }
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.next;
        return var2;
    }

    public static void resetStaticState(byte param0) {
        field_b = null;
        if (param0 >= -105) {
          field_f = 59L;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final boolean isEmpty(int param0) {
        if (param0 == -1) {
          return this.sentinel == this.sentinel.previous ? true : false;
        }
        field_f = 105L;
        return this.sentinel == this.sentinel.previous ? true : false;
    }

    final void addFirst(IntrusiveNode param0, int param1) {
        try {
          if (param1 != -7044) {
            field_g = -70;
          }
          if (null != param0.next) {
            param0.unlink(param1 ^ -7050);
          }
          param0.previous = this.sentinel;
          param0.next = this.sentinel.next;
          param0.next.previous = param0;
          param0.previous.next = param0;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "nc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ob.detachKeyboardListeners(-1, (java.awt.Component) ((Object) param1));
          if (param0 != 86) {
            var3 = (java.awt.Canvas) null;
            IntrusiveDeque.a((java.awt.Canvas) null, 35, true);
          }
          sj.detachMouseListeners((java.awt.Component) ((Object) param1), -122);
          if (ah.field_d == null) {
            return;
          }
          ah.field_d.detach((java.awt.Component) ((Object) param1), -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void addLast(int param0, IntrusiveNode param1) {
        try {
          if (null != param1.next) {
            param1.unlink(10);
          }
          param1.previous = this.sentinel.previous;
          param1.next = this.sentinel;
          param1.next.previous = param1;
          if (param0 != -3024) {
            this.beginForward((byte) -25);
          }
          param1.previous.next = param1;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "nc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 51) {
          field_f = -72L;
          var2 = this.sentinel.previous;
          if (this.sentinel == var2) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel == var2Lifetime1) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    final static RasterBuffer a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          RasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (RasterBuffer) (var4.newInstance());
              if (param2 != -35) {
                field_b = (String) null;
              }
              var5.initialize(param3, param2 ^ -9354, param1, param0);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).initialize(param3, 9387, param1, param0);
              stackIn_5_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("nc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1 <= 26) {
            field_a = -33;
          }
          if (RichTextWidget.field_R < 10) {
            var3_int = 0;
            if (wa.field_b) {
              wa.field_b = false;
              var3_int = 1;
            }
            la.a(ak.a(true), DiskCacheWorker.field_e, 82, var3_int != 0, mc.a(-100));
            return;
          }
          if (!PasswordValidator.h(250)) {
            SoftwareRasterizer.clearRaster();
            EditableTextField.b(240, 320, 18);
            uf.a((byte) 99, 0, 0, param0);
            return;
          }
          if (fj.field_i != 0) {
            ih.a(20753, param0);
            return;
          }
          nh.a((byte) -101, false, param2);
          uf.a((byte) 99, 0, 0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("nc.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    final void clear(boolean param0) {
        IntrusiveNode var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        while (true) {
          var2 = this.sentinel.previous;
          if (var2 != this.sentinel) {
            var2.unlink(10);
            continue;
          }
          break;
        }
        if (!param0) {
          return;
        }
        this.iterationCursor = null;
        return;
    }

    static {
        field_g = 0;
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = new java.math.BigInteger("65537");
    }
}
