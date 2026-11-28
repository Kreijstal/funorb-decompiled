/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static String field_e;
    static String field_a;
    IntrusiveNode sentinel;
    static String field_d;
    private IntrusiveNode iterationCursor;
    static int[] field_b;
    static int field_f;
    static he[] field_g;

    final void addFirst(int param0, IntrusiveNode param1) {
        try {
          if (param1.previous != null) {
            param1.unlink(-16175);
          }
          if (param0 < 16) {
            field_b = (int[]) null;
          }
          param1.previous = this.sentinel;
          param1.next = this.sentinel.next;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "vd.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void clear(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (this.sentinel != var2) {
            var2.unlink(-16175);
            continue;
          }
          break;
        }
        if (param0 != 255) {
          field_d = (String) null;
        }
        this.iterationCursor = null;
        return;
    }

    final static String f(int param0) {
        int var1 = 35 % ((param0 - 40) / 41);
        if (TextHotspotBounds.field_q == hg.field_ub) {
          return ue.field_d;
        }
        if (lc.field_h == hg.field_ub) {
          return NetworkArchiveRequest.field_I;
        }
        if (!ib.field_f.a(false)) {
          return NetworkArchiveRequest.field_I;
        }
        return qf.field_c;
    }

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 != -11151) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addLast((IntrusiveNode) null, 53);
        }
        this.iterationCursor = var2.next;
        return var2;
    }

    public static void clearStaticReferences(boolean param0) {
        field_b = null;
        if (!param0) {
          field_b = (int[]) null;
        }
        field_g = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final IntrusiveNode removeLast(byte param0) {
        int var3 = 63 / ((-55 - param0) / 48);
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(-16175);
        return var2;
    }

    final IntrusiveNode nextForward(int param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 != 0) {
          IntrusiveNode var3 = (IntrusiveNode) null;
          this.addLast((IntrusiveNode) null, 20);
        }
        this.iterationCursor = var2.next;
        return var2;
    }

    final IntrusiveNode removeFirst(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel == var2) {
          return null;
        }
        var2.unlink(-16175);
        if (param0 != 180479896) {
          this.sentinel = (IntrusiveNode) null;
        }
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        DequeWidgetContainer.field_E = param1;
        if (param2) {
          field_a = (String) null;
        }
        b.field_h = param0;
        a.field_i = param3;
    }

    final void addLast(IntrusiveNode param0, int param1) {
        try {
          if (param1 != 255) {
            IntrusiveDeque.b((byte) 99);
          }
          if (null != param0.previous) {
            param0.unlink(-16175);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "vd.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean isEmpty(int param0) {
        if (param0 != 30430) {
          field_d = (String) null;
        }
        return this.sentinel.next == this.sentinel ? true : false;
    }

    final IntrusiveNode beginBackward(int param0) {
        if (param0 != 2850) {
          field_g = (he[]) null;
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.previous;
        return var2;
    }

    final static RgbSprite[] b(byte param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        RgbSprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var1 = new RgbSprite[ModalDialog.field_M];
        if (param0 != -22) {
          field_g = (he[]) null;
        }
        for (var2 = 0; ModalDialog.field_M > var2; var2++) {
          var3 = RichTextWidget.field_J[var2] * gf.field_o[var2];
          var21 = a.field_e[var2];
          if (!ModalDialog.field_O[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = MouseInput.field_a[rk.a(255, (int) var21[var6])];
            }
            var1[var2] = new RgbSprite(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], RichTextWidget.field_J[var2], var22);
          } else {
            var15 = ll.field_o[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = GameAppletShell.a(rk.a(255, (int) var15[var7]) << 24, MouseInput.field_a[rk.a((int) var21[var7], 255)]);
            }
            var1[var2] = (RgbSprite) ((Object) new ArgbSprite(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], RichTextWidget.field_J[var2], var17));
          }
        }
        Bzip2State.a((byte) -21);
        return var1;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    final IntrusiveNode nextBackward(int param0) {
        int var2 = -110 % ((param0 + 42) / 40);
        IntrusiveNode var3 = this.iterationCursor;
        if (this.sentinel == var3) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var3.previous;
        return var3;
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, boolean param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4_int = param1.length();
          param1.setLength(param2);
          if (param3) {
            field_a = (String) null;
          }
          for (var5 = var4_int; param2 > var5; var5++) {
            param1.setCharAt(var5, param0);
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("vd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = "Names cannot start or end with space or underscore";
        field_d = "Create";
        field_b = new int[1];
        field_f = 66;
    }
}
