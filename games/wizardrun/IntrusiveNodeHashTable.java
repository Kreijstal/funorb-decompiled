/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveNodeHashTable {
    static AsyncRequest field_h;
    private int field_g;
    private IntrusiveNode field_e;
    static String field_b;
    private int field_a;
    private IntrusiveNode[] field_d;
    private IntrusiveNode field_f;
    static Sprite field_c;

    final IntrusiveNode next(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var8;
        IntrusiveNode var9;
        var3 = wizardrun.field_H;
        if (0 >= this.field_g) {
          if (param0 != 1) {
            return (IntrusiveNode) null;
          }
          do {
            if (this.field_g >= this.field_a) {
              return null;
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            var4 = this.field_d[fieldTemp$0].next;
            var9 = var4;
          } while (var4 == this.field_d[-1 + this.field_g]);
          this.field_e = var9.next;
          return var9;
        }
        if (this.field_e != this.field_d[this.field_g - 1]) {
          var8 = this.field_e;
          this.field_e = var8.next;
          return var8;
        }
        if (param0 != 1) {
          return (IntrusiveNode) null;
        }
        do {
          if (this.field_g >= this.field_a) {
            return null;
          }
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
          var4 = this.field_d[fieldTemp$1].next;
          var5 = var4;
        } while (var4 == this.field_d[-1 + this.field_g]);
        this.field_e = var5.next;
        return var5;
    }

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = wizardrun.field_H;
        var4 = this.field_d[(int)((long)(this.field_a - param0) & param1)];
        this.field_f = var4.next;
        while (true) {
          if (this.field_f == var4) {
            this.field_f = null;
            return null;
          }
          if (this.field_f.key != param1) {
            this.field_f = this.field_f.next;
            continue;
          }
          break;
        }
        var5 = this.field_f;
        this.field_f = this.field_f.next;
        return var5;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != 1) {
          IntrusiveNodeHashTable.a((byte) -30);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int c(int param0) {
        DialogLayer.field_L.serviceProviders((byte) -84);
        if (!ii.field_f.service((byte) 0)) {
          return DiskCacheWorker.pollJs5Connection(-18067);
        }
        if (param0 == 14326) {
          return 0;
        }
        field_c = (Sprite) null;
        return 0;
    }

    final static void loadEndingFrame(ResourceArchive param0, byte param1) {
        Sprite var2 = null;
        int var4 = 0;
        int var5 = 0;
        try {
          int var3 = -63 % ((param1 + 44) / 42);
          var2 = new Sprite(param0.getNamedFile(104, "", "final_frame.jpg"), (java.awt.Component) ((Object) wizardrun.field_G));
          var4 = var2.width;
          var5 = var2.height;
          GameMenu.d(-31782);
          TextLayout.field_a = new Sprite(var4, var5 * 3 / 4);
          TextLayout.field_a.bindAsRasterTarget();
          var2.drawWithOffsets(0, 0);
          ee.field_q = new Sprite(var4, -TextLayout.field_a.height + var5);
          ee.field_q.bindAsRasterTarget();
          var2.drawWithOffsets(0, -TextLayout.field_a.height);
          ee.field_q.offsetY = TextLayout.field_a.height;
          UsernameLoginCredentials.b(4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ab.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 >= -13) {
          IntrusiveNodeHashTable.releaseStatics(-73);
          return DialogLayer.field_L.ensureMasterIndex((byte) -17);
        }
        return DialogLayer.field_L.ensureMasterIndex((byte) -17);
    }

    final IntrusiveNode first(byte param0) {
        this.field_g = 0;
        int var2 = -80 / ((-5 - param0) / 33);
        return this.next(1);
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_g = 0;
        this.field_a = param0;
        this.field_d = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final void put(IntrusiveNode param0, int param1, long param2) {
        if (null != param0.previous) {
          param0.unlink(false);
        }
        IntrusiveNode var5 = this.field_d[(int)((long)(this.field_a - 1) & param2)];
        if (param1 >= -1) {
          return;
        }
        try {
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ab.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 == -69) {
          EditableTextWidget.field_R = new String[8];
          EditableTextWidget.field_R[7] = lj.field_e;
          EditableTextWidget.field_R[1] = MidiNote.field_o;
          EditableTextWidget.field_R[3] = DualLinkNodeHashTable.field_a;
          EditableTextWidget.field_R[4] = mh.field_lb;
          EditableTextWidget.field_R[2] = EmailValidationError.field_b;
          EditableTextWidget.field_R[0] = ProgressQuery.field_l;
          EditableTextWidget.field_R[6] = AgeValidator.field_k;
          EditableTextWidget.field_R[5] = WrappedTextLayout.field_m;
          return;
        }
        field_h = (AsyncRequest) null;
        EditableTextWidget.field_R = new String[8];
        EditableTextWidget.field_R[7] = lj.field_e;
        EditableTextWidget.field_R[1] = MidiNote.field_o;
        EditableTextWidget.field_R[3] = DualLinkNodeHashTable.field_a;
        EditableTextWidget.field_R[4] = mh.field_lb;
        EditableTextWidget.field_R[2] = EmailValidationError.field_b;
        EditableTextWidget.field_R[0] = ProgressQuery.field_l;
        EditableTextWidget.field_R[6] = AgeValidator.field_k;
        EditableTextWidget.field_R[5] = WrappedTextLayout.field_m;
    }

    static {
        field_b = "This is the last level before the first boss.";
    }
}
